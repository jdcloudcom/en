# Construct MongoDB Shard Cluster

This document describes how to construct MongoDB shard cluster based on JD Cloud Virtual Machines.

## Configuration Information of MongoDB Shard Cluster

**System Version**

	Virtual Machines: centos 7.4
	Database: MongoDB 3.4

**Shard**

	3 shards, each being 3-node replica set:
	- shard1：10.0.0.1，10.0.0.2，10.0.0.3
	- shard2：10.0.0.4，10.0.0.5，10.0.0.6
	- shard3：10.0.0.7，10.0.0.8，10.0.0.9

	Host Configuration:
	- Specification: c.n2.large 
	- System Disk: 40GB
	- Data Disk: 1,000GB

**Config Server**

	Use 3-node Replica Set:
	- 10.0.0.10
	- 10.0.0.11
	- 10.0.0.12

	Host Configuration:
	- Specification: c.n2.large 
	- System Disk: 40GB

**Router**

	Use 3 mongos Services:
	- 10.0.0.13
	- 10.0.0.14
	- 10.0.0.15

	Host Configuration:
	- Specification: c.n2.large 
	- System Disk: 40GB

## I. Create VM instance and install MongoDB

**1. Create VM instance through Virtual Machines console**

- Shard separately attaches a data disk for data storage, and Config Server and Router only need a system disk.
- It is recommended to deploy all Virtual Machines in a same subnet for the convenience of installation and configuration. You may associate EIP at first.
- For creating VM instance, please refer to: [Create Linux Instance](https://docs.jdcloud.com/en/virtual-machines/create-linux-instance)
- For attaching data disk, please refer to: [Attach Data Disk](https://docs.jdcloud.com/en/virtual-machines/mount-datadisk)

**2. Install MongoDB**

The followings describe how to install MongoDB by yum. The Virtual Machines need to associate EIP.

1) Create a yum source file.

```
vi /etc/yum.repos.d/mongodb-org-3.4.repo
```
2) Add the below contents in the yum source file.

```
[mongodb-org-3.4]  
name=MongoDB Repository  
baseurl=https://repo.mongodb.org/yum/redhat/$releasever/mongodb-org/3.4/x86_64/  
gpgcheck=1  
enabled=1  
gpgkey=https://www.mongodb.org/static/pgp/server-3.4.asc
```

3) Execute installation.

```
yum -y install mongodb-org
```
**3. After completing installation for one set, create image in order to create by batch the remaining Virtual Machines with image.**

- For creating image, please refer to: [Create Private Image Based on Instance](https://docs.jdcloud.com/en/virtual-machines/create-private-image).


## II. Configure Shard

**1. Configure Shard1 replica set**

1) Select Virtual Machines 10.0.0.1, 10.0.0.2 and 10.0.0.3 and execute the below operations to create the required directory and file.
```
mkdir -p /jddata1/work/data
mkdir -p /jddata1/work/log
echo "1773301708" > /jddata1/work/keyfile
chmod 0600 /jddata1/work/keyfile
```
2) Modify configuration file

```
vi /etc/mongodb.conf
```
3) Add the below contents in the configuration file
```
port = 27017  
fork = true  
logappend = true  
dbpath = /jddata1/work/data  
logpath = /jddata1/work/log/mongod.log  
maxConns = 2000  
timeStampFormat = iso8601-local  
wiredTigerCacheSizeGB = 7  
replSet = mgset-63514045  
keyFile = /jddata1/work/keyfile  
auth = true  
shardsvr = true  
```

4) Start mongod
```
nohup mongod -f /etc/mongodb.conf &
```
5) Configure replica set

Log in 10.0.0.1; connect mongod with `mongo`.
```
use admin
rs.initiate({_id:"mgset-63514045", version:1, members:[{_id:0, host:"10.0.0.1:27017"}, {_id:1, host:"10.0.0.2:27017"},{_id:2, host:"10.0.0.3:27017"}]})  

```
At the end of execution, Shard1 replica set is configured. You may run `rs.status` to view the status of replica set.

**2. Configure Shard2 and Shard3 replica sets.**

Repeat the above steps to complete the configuration of Shard2 and Shard3. Note that **different Shards require different replSet parameters**.

## III. Configure Config Server

1. Execute the below operations to create the required directory and file.
```
mkdir -p /root/work/data
mkdir -p /root/work/log
echo "1773301708" > /root/work/keyfile
chmod 0600 /root/work/keyfile
```
2. Modify configuration file

```
vi /etc/mongodb.conf
```
3. Add the below contents in the configuration file
```
port = 27017  
fork = true  
logappend = true  
dbpath = /root/work/data  
logpath = /root/work/log/mongod.log  
maxConns = 400  
timeStampFormat = iso8601-local  
wiredTigerCacheSizeGB = 1  
replSet = mgset-73514045  
keyFile = /root/work/keyfile  
auth = true  
configsvr=true
```
4. Start mongod
```
nohup mongod -f /etc/mongodb.conf &
```
5. Configure replica set

Log in 10.0.0.10; connect mongod with `mongo`.
```
use admin
rs.initiate({_id:"mgset-73514045", version:1, members:[{_id:0, host:"10.0.0.10:27017"}, {_id:1, host:"10.0.0.11:27017"},{_id:2, host:"10.0.0.12:27017"}]}) 
```
At the end of execution, Shard1 replica set is configured. You may run `rs.status` to view the status of replica set.

## IV. Configure Router

Router service can configure 1 or more mongos.

**1. Configure the first mongos**

1) Execute the below operations to create the required directory and file.
```
mkdir -p /root/work/log
echo "1773301708" > /root/work/keyfile
chmod 0600 /root/work/keyfile
```
2) Modify configuration file

```
vi /etc/mongos.conf
```
3) Add the below contents in the configuration file
```
port = 27017
fork = true
logappend = true
logpath = /root/work/log/mongod.log
maxConns = 200
timeStampFormat = iso8601-local
keyFile = /root/work/keyfile
configdb=mgset-73514045/10.0.0.10:27017,10.0.0.11:27017,10.0.0.12:27017

```

4) Start mongos
```
nohup mongos -f /etc/mongos.conf &
```

5) Use `mongo` to connect mongos and create account
```
use admin
db.createUser(
{
     user: "root",
     pwd: "12345678",
     roles: [ { role: "root", db: "admin" } ]
   } 
)
```
6) Use new account to log in again
```
mongo --port 27017 -u root -p 12345678 --authenticationDatabase admin
```
7) Add shard
```
sh.addShard("mgset-63514045/100.0.0.1:27017")
sh.addShard("mgset-63514045/100.0.0.2:27017")
sh.addShard("mgset-63514045/100.0.0.3:27017")
sh.addShard("mgset-63514046/100.0.0.4:27017")
sh.addShard("mgset-63514046/100.0.0.5:27017")
sh.addShard("mgset-63514046/100.0.0.6:27017")
sh.addShard("mgset-63514047/100.0.0.7:27017")
sh.addShard("mgset-63514047/100.0.0.8:27017")
sh.addShard("mgset-63514047/100.0.0.9:27017")
```

**2. Connection Test**

1) Connect MongoDB

```
mongo --host 10.0.0.13 --port 27017 -u root -p 12345678 --authenticationDatabase admin
```
2) Test write data

Select a database to start shard and designate a shard policy for the set.
```
sh.enableSharding("mytest")
use mytest
db.mycol.ensureIndex({_id:1})
sh.shardCollection("mytest.mycol",{_id:1})
```

**3. Configure the other 2 mongos**

Configure the other two mongos.

**Note: **An account is created when the first mongos is configured, so it is not necessary to create an account again when the other mongos are configured.



**The MongoDB shard cluster has been constructed so far. For the purpose of security, please disassociate EIP of Virtual Machines in formal use.**

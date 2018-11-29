# FAQ

## Access to Column-oriented Storage products

Currently, the Column-oriented Storage provides two access modes including Intranet and public network.
Intranet access is secure and stable, suitable for production and use;
Public network access is suitable for development test access, mainly to meet the development test requirements.

### Use HBase Shell to Access
#### Operation Steps
1. Prepare the Virtual Machine
It is recommended to have a Virtual Machine on the same VPC network.

2. Install jdk
```
rpm -ivh jdk-8u171-linux-x64.rpm
```

3. Install hbase client
Get installation package 
```
hbase-1.3.1-bin.tar.gz
```
Decompress:
```
tar zxvf hbase-1.3.1-bin.tar.gz
```

4. Configure ZK address
Modify the conf/ base-sit.xml file to add the ZK address of the cluster
```
<configuration>
     <property>
         <name>hbase.zookeeper.quorum</name>
         <value>$ZK_IP1,$ZK_IP2,$ZK_IP3</value>
     </property>
</configuration>
```
In which, for $ZK_IP1, $ZK_IP2 and $ZK_IP3, the address in details of Column-oriented Storage can be viewed.

5. Configure JAVA_HOME 
Modify conf/hbase-env.sh
```
export JAVA_HOME=/usr/java/jdk1.8.0_171-amd64
```

6. Configure hosts
Log in the cluster host to get cluster host information and add to local hosts.

7. Access cluster
Access the cluster with the following commands
```
bin/hbase shell
```

### Access through API
#### Operation Steps
Currently, the hbase cluster in the Column-oriented Storage supports three API access methods, including Native Java API, Thrift API and REST API, respectively, it is recommended to use Native Java API.

1. Native Java API
For the most general and efficient access method, please refer to the demo file hbaseutil.java for usage.

2. Thrift API
Thrift API makes use of Thrift serialization technology to provide multiple language support, please refer to the demo file ThriftDemo.py for usage.

The following are the steps that python accesses the cluster through the Thrift API:

Install a dependence package:
```
tar zxvf pip-18.1.tar.gz
cd pip-18.1/
python setup.py install

unzip setuptools-40.6.2.zip
cd setuptools-40.6.2/
python setup.py install
```
If the test machine has the public network permission, install and use thrift hbase-thrift:
```
pip install thrift
pip install hbase-thrift
```

It is required to use an offline installation if there is no Internet permission:
```
tar zxvf thrift-0.11.0.tar.gz
cd thrift-0.11.0
python setup.py install

tar zxvf hbase-thrift-0.20.4.tar.gz
cd hbase-thrift-0.20.4
python setup.py install
```
Execute Demo
```
python ThriftDemo.py
```
3. REST API 
REST API removes language restrictions and supports HTTP API in REST styleto access the database. Please refer to demo file ThriftDemo.py for usage.


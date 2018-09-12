# Instructions

### Login Method
JMR cluster nodes support two types of user access, web interface login and SSH login.

-  Web interface login

1. After the JD MapReduce cluster is created, the Hadoop/Spark related services are started by default. You can directly access the WebUI of the Hadoop-related service through the browser through the associated public IP address plus the service port.
2. Assume that the cluster Master Web access address is as follows:
Public network IP: 116.196.66.247
Port: Use the corresponding port according to different applications
Common application access portal: HDFS 
Web Management: 116.196.66.247:50070 
(Currently only access ports 22 and 8080, need to access other ports, please go to the network ACL settings)
3. When JD MapReduce creates a cluster, it creates and binds a firewall to you by default. If there is a problem with access, please check
1) Whether the internal IP address and public IP address of the master node are correctly bound.
2) Whether the application service configuration such as Hadoop/Spark is modified. If it is modified, please use the modified port for access. 

-  SSH login 

1. JMR binds the public network IP address to the master node of the cluster. You can remotely log in to the server for system operations through SSH tools such as PuTTY.
2. Assume that the cluster Master SSH access address is as follows:
Public network IP: 116.196.66.247
Port: 22
Login account: root
Log in with the Telnet password you set when you created the cluster. 
3. When JD MapReduce creates a cluster, it creates and binds a firewall by default. If there is a problem with login, please check it.
1) Whether the internal IP address and public IP address of the master node are correctly bound. 
2) Whether the JD MapReduce default firewall policy has been modified, such as whether the corresponding port has been modified.

###  Common commands
1. Run the following command to switch users.
```
sudo su - hadoop
```
2. View the service process run by the node
```
[hadoop@OmkZafrH-Master1 ~]$ jps
9344 RunJar
6675 ApplicationHistoryServer
5028 QuorumPeerMain
5190 DFSZKFailoverController
4840 JournalNode
7386 HMaster
4765 Bootstrap
19757 Jps
8685 JobHistoryServer
9550 ResourceManager
5455 NameNode
10287 RunJar
```
3. View the software installation location and software directory
The software location is placed under the data0 file in the root directory by default.
```
[hadoop@OmkZafrH-Master1 ~]$ cd /data0/
[hadoop@OmkZafrH-Master1 data0]$ ll
total 56
drwxr-xr-x  9 hadoop hadoop  4096 Oct 31 18:07 apache-hive-2.1.1-bin
drwxr-xr-x  6 root   root    4096 Apr 10 17:42 bdos
drwxr-xr-x  3 root   root    4096 Apr 10 17:41 bfd
drwxr-xr-x  5 root   root    4096 Apr 10 17:43 hadoop
drwxrwxrwx 11 hadoop hadoop  4096 Apr 10 17:42 hadoop-2.7.4
drwxr-xr-x  7 hadoop hadoop  4096 Oct 31 12:21 hbase-1.2.6
drwx------  2 root   root   16384 Apr 10 17:39 lost+found
drwxr-xr-x  4 root   root    4096 Apr 10 17:41 var
drwxr-xr-x  3 root   root    4096 Apr 10 17:43 yarn
drwxr-xr-x  3 hadoop hadoop  4096 Apr 10 17:42 zookeeper
drwxr-xr-x 10 hadoop hadoop  4096 Mar 23  2017 zookeeper-3.4.10
```
4. View environment variables
```
[hadoop@OmkZafrH-Master1 data0]$ vi ~/.bashrc 
# .bashrc

# Source global definitions
if [ -f /etc/bashrc ]; then
        . /etc/bashrc
fi

# User specific aliases and functions

export HBASE_HOME=/data0/hbase-1.2.6
export PATH=$PATH:$HBASE_HOME/bin
export HBASE_HOME=/data0/hbase-1.2.6
export PATH=$PATH:$HBASE_HOME/bin
export HIVE_HOME=/data0/apache-hive-2.1.1-bin
export PATH=$PATH:$HIVE_HOME/bin
export HADOOP_HOME=/data0/hadoop-2.7.4
export PATH=$PATH:$HADOOP_HOME/bin
export HADOOP_LOG_DIR=/data0/var/log/hadoop
export HTTPFS_LOG=/data0/var/log/httpfs
export HADOOP_HOME=/data0/hadoop-2.7.4
export PATH=$PATH:$HADOOP_HOME/bin
export HADOOP_LOG_DIR=/data0/var/log/hadoop
export HTTPFS_LOG=/data0/var/log/httpfs
export ZOOKEEPER_HOME=/data0/zookeeper-3.4.10
export PATH=$PATH:$ZOOKEEPER_HOME/bin
export ZOO_LOG_DIR=/data0/var/log/zookeeper-3.4.10     
```


## Use HBase Shell to Access

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

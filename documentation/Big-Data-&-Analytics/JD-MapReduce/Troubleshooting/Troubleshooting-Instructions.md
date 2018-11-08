```
[hadoop@OmkZafrH-Master1 data0]$ vi ~/.bashrc
# .bashrc
==
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

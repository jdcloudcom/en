### How to interact with OSS

#### Preparatory Work

1. 	Enable Access Key.
2. 	Enable Object Storage Service Switch when creating JMR cluster.
3. 	Create Object Storage Service in the zone where JMR cluster locates.

#### Upload HDFS files to Object Storage Service

1. 	Login Master node of JMR cluster remotely
2. 	Switch terminal user to Hadoop user
3. 	Execute command
```
{hadoop_home}/bin/hadoop fs -cp hdfs:///{hdfs_directory}/{hdfs-file} s3a://{oss-bucket-name}/{oss-file}
Parameter Description:
    {hadoop_home}: Hadoop service root directory: /data0/hadoop-2.7.4 (JMR cluster version: JMR2.0.0)  
    {hdfs_directory}: HDFS File Directory Path
    {hdfs-file}: HDFS File Name
    {oss-bucket-name}: Name of Object Storage Service Space
    {oss-file}: Name of Object Storage Service File
```
#### Download Object Storage Service files to HDFS
1. 	Login Master node of JMR cluster remotely
2. 	Switch terminal users to Hadoop
3. 	Execute command
```
{hadoop_home}/bin/hadoop fs -cp s3a://{oss-bucket-name}/{oss-file} hdfs:///{hdfs_directory}/{hdfs-file}
Parameter Description:
    {hadoop_home}: Hadoop service root directory, refer to table 1
    {oss-bucket-name}: Name of Object Storage Service Space
    {oss-file}: Name of Object Storage Service File
    {hdfs_directory}: HDFS File Directory Path
    {hdfs-file}: HDFS File Name
```


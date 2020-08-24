# Spark reads/writes OSS data

This article introduces how to configure the Spark client to read and write the data in OSS.

## Dependent resources

### Maven

```
<dependencies>
  <dependency>
      <groupId>org.apache.hadoop</groupId>
      <artifactId>hadoop-aws</artifactId>
      <version>3.2.1</version>
  </dependency>
  <dependency>
      <groupId>com.amazonaws</groupId>
      <artifactId>aws-java-sdk-bundle</artifactId>
      <version>1.11.375</version>
  </dependency>
</dependencies>

```

## Configuration methods

1. Users can configure S3 authentication information in spark-shell. An example of using sc to configure S3 authentication information is as follows:

```
sc.hadoopConfiguration.set("fs.s3a.access.key","access_key")
sc.hadoopConfiguration.set("fs.s3a.secret.key","secret_key")
sc.hadoopConfiguration.set("fs.s3a.endpoint","endpoint")
sc.hadoopConfiguration.set("fs.s3a.impl","org.apache.hadoop.fs.s3a.S3AFileSystem")
```

* Description: **sc** in the code indicates the SparkContext object.

2. Users can configure S3 authentication information in Spark-default configuration file. Taking Spark3 as an example, an example of configuring S3 authentication information in {SPARK_HOME}/conf/spark-defaults.conf is as follows:

Spark s3a
```
spark.hadoop.fs.s3a.impl         org.apache.hadoop.fs.s3a.S3AFileSystem
spark.hadoop.fs.s3a.access.key     yourAccessKeyID
spark.hadoop.fs.s3a.secret.key      yourAccessKeySecret
spark.hadoop.fs.s3a.endpoint       s3.cn-north-1.jdcloud-oss.com.jdcloud-oss.com    
```
* The endpoint in the example is the endpoint in North China. If in other regional spaces, please refer to [OSS Access Domain and Region](https://docs.jdcloud.com/en/object-storage-service/oss-endpont-list) for replacement.

Spark
```
spark.eventLog.enabled       true
spark.eventLog.dir          s3a://YourBucketName/spark/
```

3. Users can configure S3 authentication information on the spark-shell command line. An example of using spark-shell to configure S3 authentication information is as follows:
```
spark-shell \
--conf spark.hadoop.fs.s3a.endpoint=http://s3.cn-north-1.jdcloud-oss.com \
--conf spark.hadoop.fs.s3a.access.key=yourAccessKeyID \
--conf spark.hadoop.fs.s3a.secret.key=yourAccessKeySecret \
--conf spark.hadoop.fs.s3a.path.style.access=true \
--conf spark.hadoop.fs.s3a.impl=org.apache.hadoop.fs.s3a.S3AFileSystem
```

## Operation example
### Read data
```
val rdd = sc.textFile("s3a://YourBucketName/spark-read/test-read")
rdd.collect().foreach(println)
```

### Write data
```
val rdd = sc.textFile("s3a://YourBucketName/spark-read/")
rdd.count
val wcData = rdd.flatMap(l => l.split(" ")).map(word => (word, 1)).reduceByKey(_ + _)
wcData.saveAsTextFile("s3a://YourBucketName/spark-write1/")
```

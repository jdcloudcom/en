This article introduces how to use [OSS select](../Object-Storage-Service/Operation-Guide/Manage-Object/Select-Object.md) in Spark to optimize data query. Currently OSS select is in beta.

# Introduce s3select dependent package

Enter the jars directory, and download the oss-select.jar dependent package

Download links:

[The jar package corresponding to scala 11 version](https://cn-north-1-chenxue198.s3.cn-north-1.jdcloud-oss.com/spark-select_2.11-2.1.jar)

[The jar package corresponding to scala 12 version](https://cn-north-1-chenxue198.s3.cn-north-1.jdcloud-oss.com/spark-select_2.12-2.1.jar)

For project source code, refer to the open source project [minio-SparkSelect](https://github.com/minio/spark-select)

# Examples

```
spark.sparkContext.hadoopConfiguration.set("fs.s3a.access.key", "")
spark.sparkContext.hadoopConfiguration.set("fs.s3a.secret.key", "")
spark.sparkContext.hadoopConfiguration.set("fs.s3a.endpoint", "")
spark.sparkContext.hadoopConfiguration.set("fs.s3a.impl", "org.apache.hadoop.fs.s3a.S3AFileSystem")
val schema = StructType(
 List(StructField("name", StringType, false),
 StructField("age", IntegerType, false)))

val df = spark.read.format("minioSelectCSV")//minioSelectJSON
  .schema(schema)
  .options(Map("quote" -> "\'", "header" -> "true", "delimiter" -> ","))
  .load("s3://bukcet/object")
df.select("*").show()
sql:

spark.sql("CREATE TEMPORARY VIEW MyView (age INT, name STRING) USING minioSelectCSV OPTIONS (path \"s3://bucket/object\")")
spark.sql("select * from MyView where age > 10").show()
```

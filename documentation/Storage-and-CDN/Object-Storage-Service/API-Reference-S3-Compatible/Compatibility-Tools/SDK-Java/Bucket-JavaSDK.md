
# Bucket

Bucket is the container of Object.

## Functional Operation of Bucket
* Create bucket: [Create bucket](Bucket-JavaSDK#user-content-1)
* List Bucket in the same region: [List Bucket ](Bucket-JavaSDK#user-content-2)
* List objects in Bucket: [ List Objects](Bucket-JavaSDK#user-content-3)
* Delete Bucket: [ Delete Bucket](Bucket-JavaSDK#user-content-4)

<div id="user-content-1"></div>

## Creating Bucket

```Java
String bucket_name = "<yourBucketName>";
try {
    // Create buckets.
    s3.createBucket(bucket_name);
    System.out.format("creat OSS bucket %s...",  bucket_name);
} catch (AmazonServiceException e) {
    // Catch exceptions.
    e.printStackTrace();
}
```

<div id="user-content-2"></div>
         

##  List Bucket in the same region



```Java
List<Bucket> buckets = s3.listBuckets();
System.out.println("Your jdcloud OSS buckets are:");
for (Bucket a : buckets) {
    System.out.println("* " + a.getName());
}
```

<div id="user-content-3"></div>

##  List Objects in Bucket

```Java
String bucket_name = "<your bucketname>";

System.out.format("Objects in OSS bucket %s:\n", bucket_name);
ListObjectsV2Result result = s3.listObjectsV2(bucket_name);
List<S3ObjectSummary> objects = result.getObjectSummaries();
for (S3ObjectSummary os: objects) {
    System.out.println("* " + os.getKey());
}

```

<div id="user-content-4"></div>

## Delete Bucket

```Java

String bucket_name = "<your bucketname>";

try {
    s3.deleteBucket(bucket_name);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}

```

# Management Object

## Delete Object

```Java
String bucket_name = "<your bucketname>";
String key = "<your keyname>";

try {
    s3.deleteObject(bucket_name, key);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```

## Copy\Move\Rename Object

```Java
String from_bucket = "<your source bucketname>";
String to_bucket = "<your destination bucket name>";
String object_key = "<your keyname>";
String object_key1 = "<your keyname>";

try {
    s3.copyObject(from_bucket, object_key, to_bucket, object_key1);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```
Note: You can move or rename Object by using copyObject and deleteObject in combination in such a way that the Object is copied to the new location (The same source Bucket and target Bucket can be used), and such Object is deleted from the original location.

## Objects Deletion in Batches

```Java
String bucket_name = "<your bucketname>";
String[] object_keys = {"keyname1","keyname2","..." };

try {
    DeleteObjectsRequest dor = new DeleteObjectsRequest(bucket_name)
        .withKeys(object_keys);
    s3.deleteObjects(dor);
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
}
```

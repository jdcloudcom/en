# Simple Upload

Stream upload and ordinary upload are called as simple upload. Stream upload use InputStream as the data source of Objects; file upload use local file as the data source of Objects. Apply multipart upload for each single file whose capacity is more than 5 G.

## Stream Upload

```
String bucket_name = "<your bucketname>";
String file_path = "<your path>";
String key = Paths.get(file_path).getFileName().toString();

//Obtain input streaming
InputStream inputStream = new FileInputStream(file_path);

ObjectMetadata objectMetadata = new ObjectMetadata();
objectMetadata.setContentType("<your contentType>");
objectMetadata.setContentLength(new File(file_path).length());

//File Upload Stream
try {
    s3.putObject(bucket_name, key, inputStream, objectMetadata);
    System.out.format("Uploading %s to OSS bucket %s...\n", key, bucket_name);
} catch (AmazonServiceException e) {
    e.printStackTrace();
}
```

## Ordinary Upload

```
String bucket_name = "<your bucketname>";
String file_path = "<your path>";
String key = Paths.get(file_path).getFileName().toString();

try {
    s3.putObject(bucket_name, key, new File(file_path));
    System.out.format("Uploading %s to OSS bucket %s...\n", key, bucket_name);
} catch (AmazonServiceException e) {
    e.printStackTrace();
} 
```

# Create Bucket

You can use JingdongStorageService.createBucket to create Bucket. The following codes demonstrate the method of creating a Bucket:

```
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endpoint = "oss.cn-north-1.jcloudcs.com";  
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey = "<yourAccessKey>";  
String SecretKey = "<yourSecretKey>";  
   
// Create JingdongStorageService instance  
Credential credential = new Credential(accessKey, secreteKey);  
// Configure files by default. The user can configure by himself/herself if any other configuration is needed. Such as:config.setMaxConnections(20);  
ClientConfig config = new ClientConfig();  
JingdongStorageService jss= new JingdongStorageService (credential, config);  
// Set Endpoint  
jss.setEndpoint(endpoint);  
       
// Create Bucket  
String bucketName = "<your-bucket-name>";  
jss.createBucket(bucketName);  
//Close jss  
jss.destroy();
```

Notification:

* See naming specification in “Basic Concepts” for the naming specification of Bucket.

* The name of Bucket is global unique, so you need to ensure the names of the Buckets are not duplicated with that of others.

* The permissions of the bucket created by the above codes is Private Read/Write (default permissions).

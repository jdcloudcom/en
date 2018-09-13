# List Bucket

You can use JingdongStorageService.listBuckets to list all Buckets under designated users, the following codes show how to list designated users’ Bucket lists by simple methods:
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
      
// List bucket  
List<Bucket> buckets = jss.listBucket();  
for (Bucket bucket : buckets) {  
    System.out.println(" - " + bucket.getName());  
}  
// Close jss  
jss.destroy();
```

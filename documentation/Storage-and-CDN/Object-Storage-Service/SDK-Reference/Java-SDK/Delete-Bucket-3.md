# Delete Bucket

You can use JingdongStorageService.deleteBucket to delete Bucket. The following codes demonstrate the method of deleting a Bucket:
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
      
// Delete bucket  
jss.deleteBucket("<bucketName>");  
// Close jss  
jss.destroy();
```
Notification:

* If the Bucket is not empty (i.e., there are files or multipart upload fragments in the Bucket), then the Bucket cannot be deleted;

* All the files in the Bucket must be deleted before the Bucket can be successfully deleted.

* The Identity and IAM permission must be deleted before the Bucket can be successfully deleted

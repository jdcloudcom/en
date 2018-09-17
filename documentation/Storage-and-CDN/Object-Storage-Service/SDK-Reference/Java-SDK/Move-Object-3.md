# Move Object

In the same region, Objects can be moved from one Bucket to another Bucket. Move down the same bucket is equivalent to renaming objects. This action will not modify metadata:
```
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey =  "<yourAccessKeyId>";  
String secreteKey = "<yourSecretKey>";       
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endPoint = "oss.cn-north-1.jcloudcs.com";  
String sourceBucketName = "< yourSourceBucketName >";//moveObject的源bucket  
String sourceKey = "<yourSourceKey>";//moveObject的源object key     
String destinationBucketName = "<yourDestinationBucketName>";//moveObject的目的bucket  
String destinationKey = "yourDestinationKey";//moveObject的目的object key  
//The configuration of ClientConfig is currently by default. If the user needs some other configurations, he/she may configure them by himself/herself, such as setting the time of connection time-out.  
ClientConfig config = new ClientConfig();  
  
//Build JingdongStorageService instance  
Credential credential = new Credential(accessKey, secreteKey);  
JingdongStorageService jss = new JingdongStorageService(credential,config);  
//Configure endPoint  
jss.setEndpoint(endPoint);    
  
//Create objectService instance  
ObjectService MoveObjectService = jss.bucket(destinationBucketName).object(destinationKey);  
//Move the sourceObject under sourceBucket to the destinationObject under destinationBucket, and return the etag and lastModified of the moved object  
MoveObjectResult moveObjectResult = MoveObjectService.moveFrom(sourceBucketName, sourceKey).move();  
System.out.println("LastModified : "+moveObjectResult.getLastModified());  
System.out.println("Etag : "+moveObjectResult.getEtag());  
    
//A group of HTTP connection pool inside the JingdongStorageService object is under maintenance. Other destroy methods shall be called to close the connection pool before using the object,  
//Please note that once the destroy method is called, the object cannot be used again, otherwise an exception will be thrown.  
jss.destroy();
```

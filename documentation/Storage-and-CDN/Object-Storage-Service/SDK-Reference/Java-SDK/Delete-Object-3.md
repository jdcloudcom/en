# Delete Object

Delete an existing Object:
```
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].    
String accessKey =  "<yourAccessKeyId>";    
String secreteKey = "<yourSecretKey>";         
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions    
String endPoint = "oss.cn-north-1.jcloudcs.com";    
String bucketName = "<yourBucketName>";    
String objectName = "<yourObjectName>";        
//The configuration of ClientConfig is currently by default. If the user needs some other configurations, he/she may configure them by himself/herself, such as setting the time of connection time-out.    
ClientConfig config = new ClientConfig();       
     
//Build JingdongStorageService instance    
Credential credential = new Credential(accessKey, secreteKey);    
JingdongStorageService jss = new JingdongStorageService(credential,config); 
//Configure endPoint    
jss.setEndpoint(endPoint);    
            
//Create objectService instance    
ObjectService objectService = jss.bucket(bucketName).object(objectName);    
//Delete object    
objectService.delete();            
    
//A group of HTTP connection pool inside the JingdongStorageService object is under maintenance. Other destroy methods shall be called to close the connection pool before using the object,    
//Please note that once the destroy method is called, the object cannot be used again, otherwise an exception will be thrown.    
jss.destroy();
```

# Simple Upload

Stream upload and local file upload are called as simple upload. Stream upload use InputStream as the data source of Objects; file upload use local file as the data source of Objects.

## Stream Upload
```
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey =  "<yourAccessKeyId>";  
String secreteKey = "<yourSecretKey>";       
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endPoint = "oss.cn-north-1.jcloudcs.com";  
File file = new File("<localFile>");   
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
//If low redundancy storage is used, then use this code  
//objectService.getBuilder().getHeaders().put(JssHeaders.X_JSS_STORAGE_CLASS, StorageClass.ReducedRedundancy.toString());  
  
//Obtain input streaming  
InputStream inputStream = new FileInputStream(file);  
//Obtain streaming length  
long contentLength = file.length();  
//Set the Content-type of the uploaded file as "text/html”. The function returns the Etag of the uploaded data, and the current value of Etad is MD5 of the uploaded data  
String md5 = objectService.entity(contentLength,inputStream).contentType("text/html").put();  
//If the uploaded file is to be encrypted, then use this code  
//String md5 = objectService.entity(contentLength,inputStream).contentType("text/html").put(true);  
System.out.println(md5);  
  
//A group of HTTP connection pool inside the JingdongStorageService object is under maintenance. Other destroy methods shall be called to close the connection pool before using the object,  
//Please note that once the destroy method is called, the object cannot be used again, otherwise an exception will be thrown.  
jss.destroy();
```

## Local File Upload
```
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey =  "<yourAccessKeyId>";  
String secreteKey = "<yourSecretKey>";       
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endPoint = "oss.cn-north-1.jcloudcs.com";  
File file = new File("<localFile>");   
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
//If low redundancy storage is used, then use this code  
//objectService.getBuilder().getHeaders().put(JssHeaders.X_JSS_STORAGE_CLASS, StorageClass.ReducedRedundancy.toString());  
 
//Set the Content-type of the uploaded file as "text/html”. The function returns the Etag of the uploaded data, and the current value of Etad is MD5 of the uploaded data  
String md5 = objectService.entity(file).contentType("text/html").put();  
//If the uploaded file is to be encrypted, then use this code  
//String md5 = objectService.entity(file).contentType("text/html").put(true);  
System.out.println(md5);  
 
//A group of HTTP connection pool inside the JingdongStorageService object is under maintenance. Other destroy methods shall be called to close the connection pool before using the object,  
//Please note that once the destroy method is called, the object cannot be used again, otherwise an exception will be thrown.  
jss.destroy();
```

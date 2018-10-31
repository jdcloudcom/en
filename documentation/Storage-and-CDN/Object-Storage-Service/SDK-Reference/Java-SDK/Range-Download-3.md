# Range Download

If the OSS file is relatively large and only one part of the data is required, it can use range download to download data of designated scope. If the designated range is 0 - 1000, then it will return the data from 0 to 1,000 bytes, including the 1,000 th, 1001 bytes data in total, i.e., [0,1000]. If the designated range is 1000 -, the nit will return the data without the first 1000 bytes and download the rest part:
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
//Obtain an object, return the data of the first 1000 bytes (including the 1000th), 1001 bytes data in total.  
StorageObject storageObject = objectService.range(0, 1000).get();  
//Obtain object, wherein the data returns without the first 1000 bytes and download the rest part to the local file ” localFile”  
//StorageObject storageObject = objectService.range(1000).get();  
//Download the file to the local files, as the example below, the specified object is downloaded to the "localFile"  
storageObject.toFile(new File("<localFile>"));    
 
//A group of HTTP connection pool inside the JingdongStorageService object is under maintenance. Other destroy methods shall be called to close the connection pool before using the object,  
//Please note that once the destroy method is called, the object cannot be used again, otherwise an exception will be thrown.  
jss.destroy();
```
Notification: if 64KB data need to be read from OSS stream, please use the following method to read with multiple times until 64KB data have been read or the file ended:
```
byte[] buf = new byte[1024];  
InputStream in = storageObject.getInputStream();  
for (int n = 0; n != -1; ) {  
    n = in.read(buf, 0, buf.length);  
}  
in.close();
```
Not in the following form:
```
byte[] buf = new byte[64 * 1024];  
InputStream in = storageObject.getInputStream();  
in.read(buf, 0, buf.length);  
in.close();
```
The reason is stream reading may not read all the data by a single time, see InputStream.read for detailed description.

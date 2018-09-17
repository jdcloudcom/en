# Simple Download

OSS Java SDK provides rich file download interfaces, users can download files from OSS via the following methods:

* Stream download

* Download to the local file

* Range download

Stream download, download to the local file are called as simple download.

## Stream download

When download large files, you may want to perform stream processing (process a part of content for one time) instead of all contents.
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
 
//Obtain an object  
StorageObject storageObject = objectService.get();  
// Read Object content  
System.out.println("Object content:");  
BufferedReader reader = new BufferedReader(new InputStreamReader(storageObject.getInputStream()));  
String tempString = null;  
// Read one row once, the file ends until null is read  
while ((tempString = reader.readLine()) != null) {  
    System.out.println(tempString);  
}  

reader.close();       
storageObject.close();  
 //A group of HTTP connection pool inside the JingdongStorageService object is under maintenance. Other destroy methods shall be called to close the connection pool before using the object,  
//Please note that once the destroy method is called, the object cannot be used again, otherwise an exception will be thrown.  
jss.destroy();
```
Notification:

* Acquired stream must be displayed as close, otherwise it will lead to resource disclosure.

* If 64KB data need to be read from OSS stream, please use the following method to read with multiple times until 64KB data have been read or the file ended:
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

## Download to the Local File

Download the contents of Object to the designated local file(s). If the designated local file do not exist, it will be created.
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

//Obtain an object  
StorageObject storageObject = objectService.get();  
//Download the file to the local files, as the example below, the specified object is downloaded to the "localFile"  
storageObject.toFile(new File("<localFile>"));  

 
//A group of HTTP connection pool inside the JingdongStorageService object is under maintenance. Other destroy methods shall be called to close the connection pool before using the object,  
//Please note that once the destroy method is called, the object cannot be used again, otherwise an exception will be thrown.  
jss.destroy();
```

# Quickstart

Please confirm the OSS basic concepts that you are already familiar with, such as Bucket, Object, Endpoint, AccessKeyId, AccessKeySecret, etc.

In this section, you will see how to quickly use Java SDK to complete normal actions, such as create Bucket, upload files, download files, etc.

##Initiate JingdongStorageService

Before sending any a HTTP request to the Object Storage Service, a JingdongStorageService instance must be created first:
```
//The accessKey to access JD Cloud  
String accessKey = "<yourAccessKeyId>";  
String secreteKey = "<yoursecretKeyId>";    
//Take cn-north-1 as an example for endpoint  
String endpoint = "oss.cn-north-1.jcloudcs.com";  
 
//Create JingdongStorageService instance  
JingdongStorageService jss= new JingdongStorageService(accessKey,secreteKey);  
jss.setEndpoint(endpoint);  
 
//Use Object Storage Service  
  
//Destruct JingdongStorageService instance  
jss.destroy();
```
Notification: see “Initialization” for more initialization contents of OSSClient.

## Create Bucket

Bucket is OSS global naming space, (being equivalent to the container of data), which can store several objects. The following codes demonstrate how to create a Bucket:
```
// Create Bucket  
String bucketName = "<your-bucket-name>";  
jss.createBucket(bucketName);
```
Notification:

See the naming specification in “Basic Concepts” for that of the Bucket.

See “Manage Bucket” for more information of creating Bucket.

## Put Object

The following codes demonstrate how to upload objects to OSS:
```
File file = new File("D:/test");
String bucketName =  "<your-bucket-name>";
String objectName =  "<your-object-name>";
ObjectService objectService = jss.bucket(bucketName).object(objectName);
//Obtain input streaming  
InputStream inputStream = new FileInputStream(file);  
//Obtain streaming length  
long contentLength = file.length();  
//Set the Content-type of the uploaded file as "text/html”. The function returns the Etag of the uploaded data  
String md5 = objectService.entity(contentLength,inputStream).contentType("text/html").put();
```
Notification:

Java SDK upload Object to OSS via InputStream.

See “Upload File” for more information of uploading Object.

## Get Object

The following codes demonstrate how to acquire the text contents of Object:
```
String bucketName =  "<your-bucket-name>";
String objectName =  "<your-object-name>";

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
```
Notification: see “Download File” for more information of downloading Object.

## List Objects

When a series of upload Object actions have been completed, it may need to view which Objects are contained under the Bucket. The following codes demonstrate how to list the Objects under the Bucket:
```
//Create BucketService instance  
BucketService bucketService = jss.bucket(bucketName);  
//List the files and folders under the bucket that satisfy the conditions  
ObjectListing objectList = bucketService.listObject();  
//List the object names under the specified conditions  
for (ObjectSummary objectSummary : objectList.getObjectSummaries()) {  
     System.out.println("objectName : "+objectSummary.getKey());  
 }
```

## Delete Object

The following code demonstrates how to delete the designated Objects:
```
String bucketName =  "<your-bucket-name>";
String objectName =  "<your-object-name>";
 
//Create objectService instance    
ObjectService objectService = jss.bucket(bucketName).object(objectName);    
//Delete object    
ObjectService.delete();
```

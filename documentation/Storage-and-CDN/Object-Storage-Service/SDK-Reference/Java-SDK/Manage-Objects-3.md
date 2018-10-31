# Manage Objects

In OSS, users can manage files (Objects) in the Bucket (Bucket) through a series of interfaces, such as ListObjects, DeleteObject, MoveOb, etc. The name of Object is also called as key or object key.

##List files in the Bucket

Acquire object list under the bucket, perform dictionary sorting for the returned results based on key. The previous 1000 data will be returned by default. If there are more data, objectList hasNext() returns true, otherwise returns false.

**List all objects**

List all Objects under Bucket:
```
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey =  "<yourAccessKeyId>";  
String secreteKey = "<yourSecretKey>";       
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endPoint = "oss.cn-north-1.jcloudcs.com";  
String bucketName = "<yourBucketName>";  
  
//The configuration of ClientConfig is currently by default. If the user needs some other configurations, he/she may configure them by himself/herself, such as setting the time of connection time-out.  
ClientConfig config = new ClientConfig();   
  
//Build JingdongStorageService instance  
Credential credential = new Credential(accessKey, secreteKey);  
JingdongStorageService jss = new JingdongStorageService(credential,config); 
//Configure endPoint  
jss.setEndpoint(endPoint);  
          
//Create BucketService instance  
BucketService bucketService = jss.bucket(bucketName);  
//List the files and folders under the bucket that satisfy the conditions  
ObjectListing objectList = bucketService.listObject();  
//List the object names under the specified conditions  
for (ObjectSummary objectSummary : objectList.getObjectSummaries()) {  
    System.out.println("objectName : "+objectSummary.getKey());  
}  

//A group of HTTP connection pool inside the JingdongStorageService object is under maintenance. Other destroy methods shall be called to close the connection pool before using the object,  
//Please note that once the destroy method is called, the object cannot be used again, otherwise an exception will be thrown.  
jss.destroy();
```

**Designate maximum return number**
```
//Create BucketService instance  
BucketService bucketService = jss.bucket(bucketName);  
//The specified maximum number of returns is 10  
bucketService.maxKeys(10);  
//List the files and folders under the bucket that satisfy the conditions  
ObjectListing objectList = bucketService.listObject();  
//List the object names under the specified conditions  
for (ObjectSummary objectSummary : objectList.getObjectSummaries()) {  
     System.out.println("objectName : "+objectSummary.getKey());  
}
```

**Return Objects with designated prefix(es)**

```
//Create BucketService instance  
BucketService bucketService = jss.bucket(bucketName);  
//Specifiy the prefix of returns  
bucketService.prefix("file");  
//List the files and folders under the bucket that satisfy the conditions  
ObjectListing objectList = bucketService.listObject();  
//List the object names under the specified conditions  
for (ObjectSummary objectSummary : objectList.getObjectSummaries()) {  
     System.out.println("objectName : "+objectSummary.getKey());  
}
```

**Return the objects after the designated Object**

```
//Create BucketService instance  
BucketService bucketService = jss.bucket(bucketName);  
//The Object information in dictionary order after returning "file", the result does not contain "file"  
bucketService.marker("file");  
//List the files and folders under the bucket that satisfy the conditions  
ObjectListing objectList = bucketService.listObject();  
//List the object names under the specified conditions  
for (ObjectSummary objectSummary : objectList.getObjectSummaries()) {  
     System.out.println("objectName : "+objectSummary.getKey());  
}
```

**Acquire all Objects by paging**

```
String marker = null;  
ObjectListing objectList = null;  
do {  
     System.out.println(".................page....................");  
      //Create BucketService instance  
     BucketService bucketService = jss.bucket(bucketName);  
     //The Object information in dictionary order after returning marker, the result does not contain marker  
    bucketService.marker(marker);  
    //The specified maximum number of returns is 5  
    bucketService.maxKeys(5);  
    //List the files and folders under the bucket that satisfy the conditions  
    objectList = bucketService.listObject();  
    //List the object names under the specified conditions  
    List<ObjectSummary> objectSummaries = objectList.getObjectSummaries();  
    for (ObjectSummary objectSummary : objectSummaries) {  
         System.out.println("objectName : "+objectSummary.getKey());  
    }  
    marker = objectSummaries.get(objectSummaries.size()-1).getKey();  
} while (objectList.isHasNext());
```

**Acquire all objects after the specific Object by paging**

Acquire all objects after the specific Object by paging, with the number of Objects being equal to the value of maxKeys per page.

```
//The Object information in dictionary order after obtaining "file” by paging, the result does not contain "file"  
String marker = "file";  
ObjectListing objectList = null;  
do {  
    System.out.println(".................page....................");  
    //Create BucketService instance  
    BucketService bucketService = jss.bucket(bucketName);  
    //The Object information in dictionary order after returning marker, the result does not contain marker  
    bucketService.marker(marker);  
    //The specified maximum number of returns is 5  
    bucketService.maxKeys(5);  
    //List the files and folders under the bucket that satisfy the conditions  
    objectList = bucketService.listObject();  
    //List the object names under the specified conditions  
    List<ObjectSummary> objectSummaries = objectList.getObjectSummaries();  
    for (ObjectSummary objectSummary : objectSummaries) {  
        System.out.println("objectName : "+objectSummary.getKey());  
    }  
    marker = objectSummaries.get(objectSummaries.size()-1).getKey();  
} while (objectList.isHasNext());
```

** Acquire all Objects with designated prefix(es)**

Acquire all Objects with designated prefix(es) by paging, with the number of Objects being equal to the value of maxKeys per page.

```
String marker = null;  
ObjectListing objectList = null;  
do {  
    System.out.println(".................page....................");  
    //Create BucketService instance  
    BucketService bucketService = jss.bucket(bucketName);  
    //Specify the object of the prefix of returns  
    bucketService.prefix("file");  
    //The Object information in dictionary order after returning marker, the result does not contain marker  
    bucketService.marker(marker);  
    //The specified maximum number of returns is 5  
    bucketService.maxKeys(5);  
    //List the files and folders under the bucket that satisfy the conditions  
    objectList = bucketService.listObject();  
    //List the object names under the specified conditions  
    List<ObjectSummary> objectSummaries = objectList.getObjectSummaries();  
    for (ObjectSummary objectSummary : objectSummaries) {  
        System.out.println("objectName : "+objectSummary.getKey());  
    }  
    marker = objectSummaries.get(objectSummaries.size()-1).getKey();  
} while (objectList.isHasNext());
```

## Simulate folder function

You can simulate the folder function by matching the parameters of Delimiter and Prefix. The combinative effects of Delimiter and Prefix are as follows:

If Prefix is set as a folder name, then the files (i.e., all files and subfolders (directory) being recursive under the folder) with the prefix of the name will be listed.

If Delimiter is set as “/”, the return value only list the files and subfolders (directory) under the folder. The sub-file names (directory) under the folder return the part at CommonPrefixes while recursive files and folders under the subfolder will not be displayed.

Notification: if there 4 files in the Bucket: oss.jpg, jingdong/file, jingdong/dir/file1, jingdong/dir/file2, “/” is used as the delimiter of the folders. The following example demonstrates how to simulate folder function.

**List all files in the Bucket**

When we need to acquire all files under the Bucket, we use the following codes:

```
//Create BucketService instance  
BucketService bucketService = jss.bucket(bucketName);  
//List the files and folders under the bucket that satisfy the conditions  
ObjectListing objectList = bucketService.listObject();  
//List the object names under the specified conditions  
System.out.println("objectName : ");  
for (ObjectSummary objectSummary : objectList.getObjectSummaries()) {  
    System.out.println(objectSummary.getKey());  
}  
//List the folders under the specified conditions  
System.out.println("\nCommonPrefixes : ");  
for (String commonPrefixes : objectList.getCommonPrefixes()) {  
    System.out.println(commonPrefixes);  
}
```
Output:

```
objectName :   
jingdong/dir/file1  
jingdong/dir/file2  
jingdong/file  
oss.jpg  
  
CommonPrefixes :
```

**List all files under the directory by recursion**

We can acquire all files under a directory (jingdong/) by setting Prefix parameter:

```
//Create BucketService instance  
BucketService bucketService = jss.bucket(bucketName);  
//Obtain all the files under "jingdong/"  
bucketService.prefix("jingdong/");  
//List the files and folders under the bucket that satisfy the conditions  
ObjectListing objectList = bucketService.listObject();  
//List the object names under the specified conditions  
System.out.println("objectName : ");  
for (ObjectSummary objectSummary : objectList.getObjectSummaries()) {  
    System.out.println(objectSummary.getKey());  
}  
//List the folders under the specified conditions  
System.out.println("\nCommonPrefixes : ");  
for (String commonPrefixes : objectList.getCommonPrefixes()) {  
    System.out.println(commonPrefixes);  
}
```

Output:

```
objectName :   
jingdong/dir/file1  
jingdong/dir/file2  
jingdong/file  
  
CommonPrefixes :
```

**List files and sub-directories under the directory**

In the case of combining Prefix and Delimiter, files and sub-directories under the directory (jingdong/) can be listed. It shall be noted that it only takes effect when HasCommonPrefix is true:

```
//Create BucketService instance  
BucketService bucketService = jss.bucket(bucketName);  
//List all the files and subdirectories under “jingdong/”. Please note that hasCommonPrefix must be true to take effect
bucketService.prefix("jingdong/").delimiter("/").hasCommonPrefix(true);  
//List the files and folders under the bucket that satisfy the conditions  
ObjectListing objectList = bucketService.listObject();  
//List the object names under the specified conditions  
System.out.println("objectName : ");  
for (ObjectSummary objectSummary : objectList.getObjectSummaries()) {  
     System.out.println(objectSummary.getKey());  
}  
//List the folders under the specified conditions  
System.out.println("\nCommonPrefixes : ");  
for (String commonPrefixes : objectList.getCommonPrefixes()) {  
    System.out.println(commonPrefixes);  
}
```

Output:

```
objectName :   
jingdong/file  
 
CommonPrefixes :   
jingdong/dir
```

Notification:

* In the returned results, the list of ObjectSummaries lists the files under the directory of jingdong.

* And the list of CommonPrefixs lists all subfolders under the directory of jingdong. It can be seen that two files of jingdong/dir/file1 and jingdong/dir/file2 are not listed for they belong to dir directory under jingdong folder.

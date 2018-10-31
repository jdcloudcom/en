# Initialization

JingdongStorageService (JSS) is the core class of Object Storage Service OSS, it provides a series of interfaces interacting with OSS for the callers, used for OSS resources such as manage, operate buckets and objects, etc. Use Java SDK to initiate OSS request, you need to use your AccessKey and SecretKey to initiate a JingdongStorageService instance and modify the default configuration items of ClientConfig according to the requirements.

## Determine Endpoint

Please read the part of “[Basic Concepts](../../API-Reference/Introduction/Basic-Concepts.md)-access domain name” to understand the concepts relevant to Endpoint.

## Configure key

A pair of valid Access Keys (including Access KeyId and Access KeySecretID) to perform signature verification for accessing JD Cloud OSS. They can be acquired through the following steps:

* [register JD Cloud accounts](https://uc.jdcloud.com/reg?returnUrl=http%3A%2F%2Fwww.jdcloud.com%2Findex)

* [Apply for AccessKey](https://uc.jdcloud.com/accesskey/index)

After acquiring the AccessKeyId and secretAccessKeyId, you can perform initialization as per the following steps.

## Create Jingdong Storage Service

Use domain name to create JingdongStorageService, with the relevant codes being as follows:
```
 //The accessKey to access JD Cloud  
String accessKey = "<yourAccessKeyId>";  
String secreteKey = "<yoursecretKeyId>";    
//Take cn-north-1 as an example for endpoint  
String endpoint = "oss.cn-north-1.jcloudcs.com";  
 
//Create JingdongStorageService instance  
JingdongStorageService jss=new JingdongStorageService(accessKey,secreteKey);
jss.setEndpoint(endpoint);  
  
//Use Object Storage Service  
  
//Destruct JingdongStorageService instance  
jss.destroy();
```
Notification:

1. Your project may contain several or only one JingdongStorageService;

2. JingdongStorageService may be used concurrently;

3. JingdongStorageService.destroy cannot be used any more later.

## Configure JingdongStorageService

If you need to modify some default configurations of JingdongStorageService, please pass the ClientConfig instance when constructing JingdongStorageService. ClientConfig is a configuration class, which can be used to configure broker, connecting time-out, maximum connections and other parameters. The parameters can be set by ClientConfig are shown as in the following table:

|Parameters|Description|Methods|
|MaxConnections|Maximum HTTP connections allowing to open. Default is 1024|ClientConfiguration.setMaxConnections|
|SocketTimeout|The time-out period for transmitting data by socket layer (unit: millisecond). Default is 50000 millisecond|ClientConfiguration.setSocketTimeout|
|ConnectionTimeout|The time-out period for setting connection (unit: millisecond). Default is 50000 millisecond|ClientConfiguration.setConnectionTimeout|
|MaxErrorRetry|Maximum number of retries after request failure. Default is 3|ClientConfiguration.setMaxErrorRetry|

## Use ClientConfiguration to set JingdongStorageService

Parameter codes are shown as below:
```
//The accessKey to access JD Cloud  
String accessKey =  "<yourAccessKeyId>";  
String secreteKey = "<yourSecretKey>";   
//Take cn-north-1 as an example for endpoint  
String endpoint = "oss.cn-north-1.jcloudcs.com";  
 
//Create ClientConfig instance  
ClientConfig clientConfig=new ClientConfig();  
//Set maximum connection number, 128 by default  
clientConfig.setMaxConnections(300);  
//Set the time of request time-out, 50s by default  
clientConfig.setSocketTimeout(15000);  
//Set the retry times of failed request, 3 times by default  
clientConfig.setMaxErrorRetry(6);  

//Create JingdongStorageService instance  
JingdongStorageService jss=new JingdongStorageService(accessKey,secreteKey);
jss.setEndpoint(endpoint);  
 
//Use Object Storage Service  
  
//Destruct JingdongStorageService instance  
jss.destroy();
```

# Generate presigned URL

Object Storage Service provides a kind of authentication method based on Query String, i.e., by perform Presigned action, generate a URL with authentication information for the Objects and send it to third party users to implement public access. When generating URL, you can designate URL expired time so as to restrict users from accessing with long time.

Generated URL accesses with the method of GET by default, thus, users can directly access relevant contents via a browser, the codes are as follows:
```
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endpoint = "oss.cn-north-1.jcloudcs.com";  
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey = "<your accessKey>";  
String secretKey = "<your secretKey>";  
String bucketName = "<your bucketName>";  
String key = “<you objectKey>”;  
       
// Create JingdongStorageService instance  
Credential credential = new Credential(accessKey, secreteKey);  
// Configure files by default. The user can configure by himself/herself if any other configuration is needed. Such as:config.setMaxConnections(20);  
ClientConfig config = new ClientConfig();  
JingdongStorageService jss= new JingdongStorageService (credential, config);  
// Set Endpoint  
jss.setEndpoint(endpoint);  
      
//Generate URL, and may access directly through the browser, and the expiration time is 1 hour  
URI signatureUrl = jss.bucket(bucketName).object(key)
                   .generatePresignedUrl(3600);  
// Print URL  
System.out.println(signatureUrl.toString());  
// Close jss  
jss.destroy();
```

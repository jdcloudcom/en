# Multipart upload

Large files can be cut for multipart upload. User can use multipart upload mode in the following (but not limited to) application scenarios:

* Need to support breakpoint upload.

* Upload files with the sizes exceed 900MB.

* The network conditions are poor, and the link with OSS servers often disconnects.

* The sizes of files to be uploaded cannot be determined before upload.

Multipart upload is divided into the following 3 steps:

* Initiate a multipart upload task (InitiateMultipartUpload)

* Perform multipart upload by serial or parallel manners (UploadPart)

* Complete multipart upload (CompleteMultipartUpload) or abort multipart upload (AbortMultipartUpload).

## Complete Multipart Upload step by step

### Initiate Multipart Upload

Before use multipart upload mode, a Multipart Upload event must be initiated first. The action will return an Upload ID created by OSS server, which is used for marking this Multipart Upload event. User can initiate relevant actions by this ID, such as terminate Multipart Upload, query Multipart Upload, etc. Call jss.bucket(bucketName).object(key).initiateMultipartUpload initiate a multipart upload event:
```
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endpoint = "oss.cn-north-1.jcloudcs.com";  
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey = "<yourAccessKey>";  
String SecretKey = "<yourSecretKey>";  
String bucketName = "<yourBucketName>";  
String key = "<yourObjcetkey>";  
// Create JingdongStorageService instance  
Credential credential = new Credential(accessKey, secreteKey);  
// Configure files by default. The user can configure by himself/herself if any other configuration is needed. Such as:config.setMaxConnections(20);  
ClientConfig config = new ClientConfig();  
JingdongStorageService jss= new JingdongStorageService (credential, config);  
// Set Endpoint  
jss.setEndpoint(endpoint);  
String storageClass =  StorageClass.ReducedRedundancy.toString();  
    
//If low redundancy storage is used, then use this code  
//jss.bucket(bucketName).object(key).getBuilder().getHeaders().put(JssHeaders.X_JSS_STORAGE_CLASS, StorageClass.ReducedRedundancy.toString());  
InitMultipartUploadResult initResult = jss.bucket(bucketName).object(key).initMultipartUpload();  
jss.destroy();
```
Notification:

* Use InitiateMultipartUploadRequest to designate the names of the files to be uploaded and the Bucket(s) they belong to;

* The return result of initiateMultipartUpload contains UploadId that is the unique identification distinguishing each multipart upload and will be used in the later actions.

###Upload multipart

After initiating a Multipart Upload, data to be uploaded can be parted according to designated Object name(s) and Upload ID(s). Each uploaded Part has a unique number to identify it - part number with the range of 1 - 10,000. If you use the same part number to upload new data, then the existing data of the part on the OSS will be replaced. Each part need not to be uploaded by order. They can even be uploaded from different processes or different machines, which OSS will sort and compose the large file based on the part number. Call jss.bucket(bucketName).object(key).uploadPart to upload parts:
```
List<UploadPartResult> uploadPartResults= new ArrayList<UploadPartResult>();  
InputStream inputStream = new FileInputStream(new File("<localFile>"));  
// Set multipart size  
Long partSize = 700*1024;  
// Set multipart number, ranging from 1~10000,  
int partNum = 1;  
// Set file offset, the offset of the first file is 0  
int fileOffset = 0;  
ByteStreams.skipFully(inputStream, fileOffset);  
  
UploadPartResult uploadPartResult = jss.bucket(bucketName).object(key).entity(partSize, inputStream).uploadPart(initResult.getUploadId(), partNum); 
uploadPartResults.add(uploadPartResult);
```

Notes:

* OSS will put the MD5 value of Part data received by the server ends in the Etag header for returning to the users.

* The range of Part number is 1 - 10,000. If it is out of the scope, 400 will be returned with the error code of TooManyParts.

* When uploading part every time, the stream shall be positioned to the location at the beginning of the upload block.

* Each time after uploading part, the return results of OSS is an UploadPartResult object. It is a combination containing Etag and PartNumber of the upload block,

* and it will be used in the subsequent multipart upload steps, so we need to save it. In general, we save these UploadPartResult objects in the List.

### Complete Multipart Upload

After completing multipart upload, Complete Multipart Upload needs to be called to complete the Multipart Upload of the entire file. When executing the action, all valid part lists (including part number and part ETAG) need to be provided; after OSS received submitted part lists, it will verify the validity of each part one by one. After all data Parts have passed the verification, OSS will compose these parts into a complete Object. Call jss.bucket(bucketName).object(key).completeMultipartUpload to complete multipart upload:
```
Collections.sort(uploadPartResults, new Comparator<UploadPartResult>() {  
    @Override  
    public int compare(UploadPartResult p1, UploadPartResult p2) {  
        return p1.getPartNumber() - p2.getPartNumber();  
    }  
});  
String eTag = jss.bucket(bucketName).object(key).completeMultipartUpload(initResult.getUploadId(), uploadPartResults);
```
Notes:

* uploadPartResults in the above codes is the list of saved uploadPartResult in the multipart upload, it shall be sorted ascendingly by the part number;

* Parts may not be continuous.

### Abort Multipart Upload Event

You can terminate corresponding Multipart Upload event according to Upload ID. When a Multipart Upload event is terminated, this Upload ID cannot be used for any actions and the uploaded data will be deleted. Call jss.bucket(bucketName).object(key).abortMultipartUpload to abort multipart upload event:
```
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endpoint = "s-bj.jcloud.com";  
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey = "<yourAccessKey>";  
String SecretKey = "<yourSecretKey>";  
String bucketName = "<your bucketName>";  
String key = "<your objcetkey>";  
 
// Create JingdongStorageService instance  
Credential credential = new Credential(accessKey, secreteKey);  
// Configure files by default. The user can configure by himself/herself if any other configuration is needed. Such as:config.setMaxConnections(20);  
ClientConfig config = new ClientConfig();  
JingdongStorageService jss= new JingdongStorageService (credential, config);
// Set Endpoint  
jss.setEndpoint(endpoint);  
 
// Cancel multipart upload, wherein the uploadId is from initiateMultipartUpload  
jss.bucket(bucketName).object(key).abortMultipartUpload("<uploadId>");  
jss.destroy();
```

## Acquire Uploaded Parts

List all successfully uploaded parts belong to the designated Upload ID. Note: if a substep upload event has been completed or aborted, its uploaded multiparts cannot be listed.
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
  
// Obtain uploaded multipart, wherein the initResult is from initiateMultipartUpload  
ListPartsResult partList = jss.bucket(bucketName).object(key).listParts(initResult.getUploadId());  
for (PartSummary part : partListing.getParts()) {  
 //Multipart number, specified when uploading  
    part.getPartNumber();  
    // Multipart data size  
    part.getSize();  
    // ETag of Part  
    part.getETag();  
    // Final modification and upload of Part  
    part.getLastModified();  
}  
// Close client  
jss.destroy();
```

## Acquire all multipart upload events in the Bucket

List all substep upload events in a Bucket space. Note: if a substep upload event has been completed or aborted, the event cannot be listed.
```
// Take cn-north-1 as an example for endpoint, and fill in according to actual situation for other regions  
String endpoint = "oss.cn-north-1.jcloudcs.com";  
//You can log in to the console of Object Storage Service with AccessKey and SecretKey to view it in [AccessKey Management].  
String accessKey = "<your accessKey>";  
String secretKey = "<your secretKey>";  
String bucketName = "<your bucketName>";  
      
// Create JingdongStorageService instance  
Credential credential = new Credential(accessKey, secreteKey);  
// Configure files by default. The user can configure by himself/herself if any other configuration is needed. Such as:config.setMaxConnections(20);  
ClientConfig config = new ClientConfig();  
JingdongStorageService jss= new JingdongStorageService (credential, config);
// Set Endpoint  
jss.setEndpoint(endpoint);  
// List the multipart upload events  
BucketService bucketService = jss.bucket(bucketName);  
//Add prefix matching  
//bucketService.prefix("<your perfix>");  
MultipartUploadListing multipartUploadListing = bucketService.listMultipartUploads();

for (Upload upload : multipartUploadListing.getUploads()) {  
        //Upload Id  
        upload.getUploadId();  
        //key  
        upload.getKey();  
        //date of initiate multipart ipload  
        upload.getInitiated();  
}  
// Close client  
jss.destroy();
```

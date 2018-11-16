# Multipart Upload

Large files can be cut for multipart upload. User can use multipart upload mode in the following (but not limited to) application scenarios:

- Breakpoint upload must be supported.

- Upload the file whose capacity is over 5 GB.

- The network condition is poor, and the link with the OSS server is often cut off.

- Before uploading files, the size of files to be uploaded cannot be determined.

Multipart upload is divided into the following 3 steps::

- Initiate a multipart upload task (InitiateMultipartUpload).

- Perform multipart upload in serial or parallel manner (UploadPart).

- Complete multipart upload (CompleteMultipartUpload) or undo multipart upload (AbortMultipartUpload).



## Full Example of Multipart Upload

```
// Initialized Multipart Upload
String bucket_name = "<your bucketname>";
String file_path = "<your loacl file>";
String key = Paths.get(file_path).getFileName().toString();
File file = new File(file_path);
long contentLength = file.length();
long partSize = 5 * 1024 * 1024; // configure the capacity of each multipart as 5 MB.
	    
try {                
// Create the Etag list of the object and retrieve the Etag of each multipart.
    List<PartETag> partETags = new ArrayList<PartETag>();
// Initialized Multipart Upload
    InitiateMultipartUploadRequest initRequest = new InitiateMultipartUploadRequest(bucket_name, key);
    InitiateMultipartUploadResult initResponse = s3.initiateMultipartUpload(initRequest);

// Upload Multipart
    long filePosition = 0;
    for (int i = 1; filePosition < contentLength; i++) {
        partSize = Math.min(partSize, (contentLength - filePosition));
        UploadPartRequest uploadRequest = new UploadPartRequest()
            .withBucketName(bucket_name)
            .withKey(key)
            .withUploadId(initResponse.getUploadId())
            .withPartNumber(i)
            .withFileOffset(filePosition)
            .withFile(file)
            .withPartSize(partSize);
// Upload multipart and add the retrieved Etag to the list.
        UploadPartResult uploadResult = s3.uploadPart(uploadRequest);
        partETags.add(uploadResult.getPartETag());
        filePosition += partSize;
    }

// Complete Multipart Upload
    CompleteMultipartUploadRequest compRequest = new CompleteMultipartUploadRequest(bucket_name, key,
    initResponse.getUploadId(), partETags);
    s3.completeMultipartUpload(compRequest);
}
catch(AmazonServiceException e) {
    e.printStackTrace();
}
catch(SdkClientException e) {
    e.printStackTrace();
}
```

## // Enumerate Multipart Upload

```
String bucket_name = "<your bucketname>";
	    
try {
    ListMultipartUploadsRequest allMultipartUploadsRequest = new ListMultipartUploadsRequest(bucket_name);
    MultipartUploadListing multipartUploadListing = s3.listMultipartUploads(allMultipartUploadsRequest);
    List<MultipartUpload> uploads = multipartUploadListing.getMultipartUploads();
	    	
    System.out.println(uploads.size() + " multipart upload(s) in progress.");
        for (MultipartUpload u : uploads) {
            System.out.println("Upload in progress: Key = \"" + u.getKey() + "\", id = " + u.getUploadId());
        }
}
catch(AmazonServiceException e) {
    e.printStackTrace();
}
catch(SdkClientException e) {
    e.printStackTrace();
}	
```

## Terminate Multipart Upload

```
String bucket_name = "<your bucketname>";
    
try {
// List all unfinished multipart upload.
    ListMultipartUploadsRequest allMultipartUploadsRequest = new ListMultipartUploadsRequest(bucket_name);
    MultipartUploadListing multipartUploadListing = s3.listMultipartUploads(allMultipartUploadsRequest);
    List<MultipartUpload> uploads = multipartUploadListing.getMultipartUploads();
    System.out.println("Before deletions, " + uploads.size() + " multipart uploads in progress.");
// Terminate Multipart Upload
    for (MultipartUpload u : uploads) {
        System.out.println("Upload in progress: Key = \"" + u.getKey() + "\", id = " + u.getUploadId());    
        s3.abortMultipartUpload(new AbortMultipartUploadRequest(bucket_name, u.getKey(), u.getUploadId()));
        System.out.println("Upload deleted: Key = \"" + u.getKey() + "\", id = " + u.getUploadId());
    }
// Verify all unfinished multipart upload and check whether it is terminated.
    multipartUploadListing = s3.listMultipartUploads(allMultipartUploadsRequest);
    uploads = multipartUploadListing.getMultipartUploads();
    System.out.println("After aborting uploads, " + uploads.size() + " multipart uploads in progress.");
}
catch(AmazonServiceException e) {
    e.printStackTrace();
}
catch(SdkClientException e) {
    e.printStackTrace();
}
```

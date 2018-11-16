# InitiateMultipartUpload

## MultipartUpload Introduction

In addition to uploading files to OSS through PUT Object interface, OSS also provides another upload mode: Multipart Upload. User may use Multipart Upload mode for uploading in the application scenarios including (but not limited to):

1. Supporting breakpoint upload is needed.

2. Large files (such as files with the size of 500MB) are to be uploaded.

3. The network conditions are poor, and the link with OSS server is often cut off.

Before uploading files, the size of files to be uploaded cannot be determined.

## InitiateMultipartUpload             

Description: Before data transmission in the Multipart Upload mode, the interface must be called to initialize a new Multipart Upload event. User carries out actions related to Multipart Upload via the UploadId, including uploading the Part belonging to Multipart Upload, combining all Parts, terminating Multipart Upload, and listing out all the uploaded Parts, etc.

**Request Syntax**

```
POST  /ObjectName?uploads HTTP/1.1
Host: BucketName.s.jcloud.com
x-jss-storage-class: STANDARD or REDUCED_REDUNDANCY       
Date: GMT  Date     
Authorization:  signatureValue#Please refer to "Identity and Access Management"     
```

**Request Parameter**

|Name|Description|
|-|-|
|x-jss-storage-class|Object storage type, the default value is "STANDARD" (standard storage)<br>Support "STANDARD" (standard storage) and "REDUCED_REDUNDANCY" (low frequency access type) storage types<br>Note: Currently "REDUCED_REDUNDANCY" (low frequency access type) is only supported by the machine room in North China<br>Type: character string<br>Default value: "STANDARD" (standard storage)|

**Request Header:**

|Name|Description|
|-|-|
|x-jss-server-side-encryption|Is the server encrypted when uploading each part of the Object is assigned<br>Type: boolean<br>Legal value: true, false|

**Response Elements**

|Name|Description|
|-|-|
|Bucket|Initialize the Bucket name of a Multipart Upload event. <br>Type: Character string|
|Key|Initialize the Object name of a Multipart Upload event. <br>Type: Character string|
|UploadId|Unique indicating ID of the Multipart Upload. <br>Type: Character string| 

Detail Analysis:

1.When the action computes and verifies the signature, "?uploads” is required to be added in CanonicalizedResource.

2.Initializing Multipart Upload request will not influence the existing object with the same name.

3.After the server receives the initialized Multipart Upload request, it will return a request body in json format. There are three elements in the request body: Bucket, Key and UploadID. Please record the UploadID therein for subsequent Multipart related actions.

4.When initializing Multipart Upload requests, if x-jss-server-side-encryption Header is set, when uploading each part, the server will encrypted each part automatically for storage.

**Request Example**
```
POST /multipart.data?uploads   HTTP/1.1
Host: oss-example.s-bj.jcloud.com
x-jss-storage-class:   STANDARD      
Date: Wed, 12 Jul 2017 07:45:27   GMT  
Authorization: jingdong qbS5QXpLORrvdrmb:wYoTTKpqU1mZu4Dy3IlTRbCUx0w=   
```

**Response Example**

```
HTTP/1.1 200 OK
Server: nginx
Date: Wed, 12 Jul 2017   07:45:27 GMT
Content-Type:   application/json;charset=UTF-8
Content-Length: 71
Connection: keep-alive
x-jss-request-id:   9891344770AD7F37
X-Trace: 200-1499845527038-0-0-18-46-46
 
{"Bucket":"youhe","Key":"multipart.data","UploadId":"9E417328F6B89F0B"}
```

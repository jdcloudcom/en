# Post object
## Application scenarios

 Post object refers to the user using the Post Object request in the OSS API to complete the file upload. It is very suitable to be embedded in the HTML web page to upload files. The more common application scenario is the website application. Take the social network site as an example:

|Non-Post object|Post object|
|-|-|
|1.The website user upload an image<br>2.The web server responds to the upload page<br>3.The image is uploaded to the web server<br>4. The web server uploads the image to OSS|1.The website user upload an image<br>2.Uploading the image to OSS

Benefits of Using Post object

+ From the perspective of process, the forwarding step is omitted, which can reduce the latency of uploading to OSS.

+ From the perspective of architecture, the original upload is subject to the web server. When the upload amount is too large, there will be a bottleneck on the web server, and the web server may need to be expanded. After using the form upload, the upload is sent directly from the client to OSS. When the upload amount is too large, the pressure is on OSS, and the quality of the service is guaranteed by OSS.

Upload Limit

1. Size Limit: When using the Post object, Object cannot exceed 5GB.

   Form data and boundaries (excluding the file content) must not exceed 20 KB.
   
2. Naming Limit

   + Use UTF-8 to encode

   + The length must be between 1-1022 bytes;

   + It cannot start with a slash (/) or a backslash (\)

 

Security and Authorization

In order to prevent a third party from uploading Objects to the developer's bucket without authorization, in addition to OSS providing access permission control at the Bucket level, you can also conduct flexible permission access configuration at the file and directory levels. For details, see Access Permission Settings.

To authorize upload to a third party, you can use the PostPolicy method; see [PostObject](../../API-Reference-S3-Compatible/Compatibility-API/Post-Object.md) for details.

 

Basic Steps of Using Form Upload

1.Create a Post Policy.

The Policy form field of the Post request is used to verify the validity of the request. For example, you can specify the prefix of the upload Object, specify the upload size, the URL that the client needs to jump to after the upload is successful, and the status code received by the client after the upload is successful. Policy is a character string in json format. For example, the following policy, the expiration time that a website user can upload is 2018-12-01T12:00:00.000Z, and the prefix of the file that can be uploaded must match "user/yuyu/", the name of the target bucket to be uploaded must be "myBucketName”.
```
 { "expiration": "2018-12-01T12:00:00.000Z",
  "conditions": [
    {"bucket": "myBucketName" },
    ["starts-with", "$key", "user/yuyu/"],
  ]
}
```
2.Encode Policy character string by using base64.

3.Use the OSS AccessKeySecret to sign the Policy encoded by using base64.

4.Build the upload HTML page.

5.Open the HTML page and select the file to upload.

Function Usage Reference

API：[PostObject](../../API-Reference-S3-Compatible/Compatibility-API/Post-Object-2.md)

Sample Demo

For the demo about direct posting object to OSS, please refer to  [PostObject-S3-SDK-Demo](https://downloads.s3.cn-north-1.jcloudcs.com/Demo/postObject_S3_SDK_JAVA_Demo.zip)


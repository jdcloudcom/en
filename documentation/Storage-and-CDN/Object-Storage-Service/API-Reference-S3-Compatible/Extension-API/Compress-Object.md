# Compress Object

## API Description

You can perform package download and other actions through compressing multiple Objects in Object Storage Service into one Object.

**Request**

1. Format
```
POST /path/to/zip/object?compress HTTP/1.1 
Host:bucket.s3.region.jcloudcs.com 
Authorization:<Authorization_String>
Content-Type:text/xml 
Content-Length:1024 
Content-MD5:Q2hlY2sgSW50ZWdyaXR5IQ== 
Cache-Control:max-age=300 
Content-Disposition:"attachment;filename=FileName.txt" 
Expires:Wed, 21 Oct 2015 07:28:00 GMT 
x-amz-notification-endpoint:http://example.com/on_compress_done 
x-amz-compress-type:zip
```
2.Header

|Name|Must|Description|
|-|-|-|
|Content-Type|Yes|Must be text/xml, representing that the format of configuration file is XML, the user cannot set Content-Type for generating compressed files, which can be set as application/zip, application/x-rar-compressed and so on based on the compression type|.
|Content-Length|Yes|Standard header|
|Content-MD5|No|Label header, if the user uploads the parameter, the server will verify|
|Cache-Control|No|Generate Cache-Control of compress object|
|Content-Disposition|No|Generate Content-Disposition of compress object|
|Expires|No|Generate Expires of compress object|
|x-amz-notification-endpoint|No|Generate callback address after completion of the task, the format is http://example.com/on_compress_done, if the user set the parameter, OSS will callback the URL through HTTP POST after completion of compression, please refer to the document related to callbacks below for the specific format of the request|
|x-amz-compress-type|No|Type of compression, zip format by default, it only supports zip now|

3.Query

|Name|Type|Must|Description|
|-|-|-|-|
|compress|Empty|Yes|Represent that the request is CompressObject request|

4.Elements(body)

|Name|Type|Must|Description|
|-|-|-|-|
|CompressRequest|Object|Yes|Root of request|
|+Component|Object Array|Yes|Generate file information of the compressed file|
|++Key|Character String|Yes|Generate complete file Key of the compressed file|
|++Alias|Character String|No|Name of the file in the compressed file is key by default, which may be used for modifying name or adjusting directory structure|

**Response**

Header

No Special Header

Elements

No Response Elements

Error

The function does not define special errors, and when there are errors during the use process, only authentication or Bucket related errors are returned.

## Callback

After completion of compress object generation task, if the user sets the callback address for task completion in the request (namely, x-amz-notification-endpoint parameter in the above text), OSS will notify the user requests of task processing through the callback interface provided by the callback user through the POST method.

Callback API

|Header|Description|
|-|-|
|x-amz-sns-message-type|must be Notification|
|x-amz-sns-raw-key|must be true|
|RequestID|RequestID|

**Successful Callback**
```
{
    "Records": [
        {
            "eventName": "ObjectCreated:Compress",
            "s3": {
                "s3SchemaVersion": "1.0",
                "bucket": {
                    "name": "bucket-name"
                },
                "object": {
                    "key": "object-key",
                    "size": 1024,
                    "eTag": "object eTag"
                }
            }
        }
    ]
}
```
Callback Failed
```
{
    "Records": [
        {
            "eventName": "Error:CompressFailed",
            "error": {
                "s3ErrorSchemaVersion": "1.0",
                "code": "NoSuchKey",
                "resourse": "/path/to/not/exist/object/key",
                "message": "The specified key does not exist.",
                "requestId": "AB2138B5D4C95193"
            },
            "s3": {
                "s3SchemaVersion": "1.0",
                "bucket": {
                    "name": "bucket-name"
                },
                "object": {
                    "key": "object-key",
                }
            }
        }
    ]
}
```
**Callback Assurance**

Each request, whether successful or unsuccessful, is called back, and will be called back at the first time when Object is generated and completed

The callback retries when the server is temporarily unavailable; the interval time between retries will be gradually increased, if the retry will not be successful in one day, such callback will be aborted

The order of the callbacks is not guaranteed, it is not related with the time initiating Compress request and the time of successful generation of CompressObject.

**Callback Security**

In phase I, the OSS callback mechanism does not include a validation mechanism; a malicious user may forge an OSS callback request to call back your callback service, it is suggested that you can add necessary validation information to the dynamically generated callback address to avoid from being maliciously call-backed.

Use Method

Dependent Package:
```
  <dependency>
  <groupId>com.amazonaws</groupId>
  <artifactId>aws-java-sdk-s3</artifactId>
  <version>1.11.136</version>
  </dependency>
```

## Reference Example

http://oss.cn-north-1.jcloudcs.com/downloads/compress-object-example.zip

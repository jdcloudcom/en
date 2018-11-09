# CompleteMultipartUpload

The action is used to complete Multipart Upload, combining all Parts it contains, and generating a new Object in the cloud storage.

When user initializes Multipart Upload and upload all relevant Parts, you may complete the whole Multipart Upload through the action. Upon receiving the request, the cloud storage will combine all uploaded Parts into one Object based on the order of each Part Number. You must guarantee that you provide the complete and effective Part list: all Parts are arranged in the ascending order of PartNumber, there shall be no unidentifiable Part, and there shall be no missing Part. Currently, the client and server shall interact in http body in json format. 

**Request Syntax**
```
POST   /ObjectName?uploadId= UploadId HTTP/1.1
Host: BucketName. s.jcloud.com
Content-Length: Size
Date: GMT   Date     
Authorization: signatureValue#Please refer to "Identity and Access Management"
 
{
      "Part": [
          {
              "PartNumber": PartNumber,
              "ETag": " ETag"
          },
 
. . . . . . ,
                                
          {
              "PartNumber": PartNumber,
              "ETag": " ETag"
          }
    ]
}
```

**Request Parameter**

|Name|Description|
|-|-|
|Part| saves the set of all the uploaded Part information. <br>Type: List|
|PartNumber|Part Number. <br>Type: int|
|Etag|ETag value returned by OSS after Part is successfully uploaded. <br>Type: Character String|

**Response Elements**

|Name|Description|
|-|-|
|Bucket|Bucket Name<br>Type: Character String|
|Key|Newly Created Object Name<br>Type: Character String|
|Etag|Compute the total MD5 after summarizing all of Part MD5<br>Type: Character String|

Detail Analysis:

1. In case of Complete Multipart Upload, check each Part number and Etag in the Partlist submitted by user. Thus, when uploading Part, in addition to record Part number, the client shall also record the ETag value returned by the server after each successful uploading of Part.

2. When OSS processes Complete Multipart Upload, it will be completed very quickly, but during the period, if the link between the client and OSS, OSS will still continue completing the request.

3. In the Part List submitted by user, Part number can be not continuous. For example, the first Part number is 1; the second Part number is 5.

4. After the request for OSS to process Complete Multipart Upload succeeds, the Upload ID will become invalid.

**Request Example**

```
POST   /multipart.data?uploadId=9FFFFF35C1535F7B HTTP/1.1
Host: oss-example.s-bj.jcloud.com
Content-Length: 187
Date: Wed, 12 Jul 2017   12:47:57 GMT  
Authorization: jingdong qbS5QXpLORrvdrmb:/Qq9QFSIEzaPPL5YgAkbHoXkTKc=
 
{
      "Part": [
          {
              "PartNumber": 1,
              "ETag": "9223eed2740a549634ac58688d33b614"
          },
          {
              "PartNumber": 2,
              "ETag": "aa286070fe65d16d39fb8997143ea564"
          },
          {
              "PartNumber": 3,
              "ETag": "3b586f704fcd6b714fde125aeffc3e74"
          }
    ]
}       
```

**Response Example**

```
HTTP/1.1 200 OK
Server: nginx
Date: Wed, 12 Jul 2017   12:47:58 GMT
Content-Type:   application/json;charset=UTF-8
Content-Length: 83
Connection: keep-alive
x-jss-request-id:   B7C62B29F77E2132
X-Trace:   200-1499863677959-0-0-20-58-58
 
{"Bucket":"youhe","Key":"multipart.data","ETag":"4e456c2fc34928a3e2fa202acf71870a"}
```

# UploadPart

Upload a Part to the specified Multipart Upload.

**Request Syntax**

```
PUT   /ObjectName?uploadId=UploadId&partNumber=PartNumber HTTP/1.1
Date: GMT Date
Authorization: jingdong   qbS5QXpLORrvdrmb:AdBNNN+uUP+qRcPJn5m4ezrbRwI=
Content-Length: size
Host: BucketName.s-bj.jcloud.com
```
Detail Analysis:

1. Before uploading Part, Initiate Multipart Upload action must be completed first, and then the identifier Upload Id, which uniquely identifies a Multipart Upload, will be obtained.

2. When uploading Part, the Upload Id of its relevant event shall be specified, if the specified Upload Id does not exist, 404 Not Found error will be returned, error code: NoSuchUpload; if Upload Id is not specified, i.e. Upload Id is blank, 400 Bad Request error will be returned, error code: InvalidArgument.

3. The range of Part Number is 1-10000, and if the Part Number is greater than 10000, 400 will be returned, error code: TooManyParts.

4. Part Number uniquely identifies a Part, and specifies the location of the Part in MultipartUpload. During Upload Part, if the same Part Number is used, the server will return uploading successful, to replace the original Part.

5. To guarantee the correctness of data transmission, server will return the actually stored MD5 value of the part after the Part is uploaded successfully, and put it in ETag field of response header for client verification.

**Request Example**

```
PUT  /multiSS?uploadId=9B2BF313C3E998E9&partNumber=1 HTTP/1.1
Date: Wed, 12 Jul 2017   09:22:16 GMT
Authorization: jingdong   qbS5QXpLORrvdrmb:AdBNNN+uUP+qRcPJn5m4ezrbRwI=
Content-Length: 3
Host: oss-test.s-bj.jcloud.com
Connection: Keep-Alive
```

**Response Example** 

```
HTTP/1.1 200 OK
Server: nginx
Date: Wed, 12 Jul 2017   09:39:01 GMT
Content-Length: 0
Connection: keep-alive
x-jss-request-id:   999D38C52D6C2B58
ETag:   "202cb962ac59075b964b07152d234b70"
```

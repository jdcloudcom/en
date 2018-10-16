# Delete Video Task

Description: delete task through video task id

Request Syntax:
```
DELETE deleteVideoTask&taskId= taskId
Host: oss.cn-north-1.jcloudcs.com
Date: date
Authorization: signatureValue#Please refer to Security Verification
```

Sample Request:
```
DELETE deleteVideoTask&taskId=78fbb093de19fc HTTP/1.1
Date: Tue, 15 Dec 2015 12:55:54 GMT
Authorization: jingdong 2sTXh1AoApNv5x8p:X/CQ6sMZWPFun1k9k3rUZL/Psgw=
Content-Length: 0
Host: oss.cn-north-1.jcloudcs.com
Connection: Keep-Alive
User-Agent: JFS-JCLOUD-SDK-JAVA/1.0.0 (Java 1.8.0_45; Vendor Oracle Corporation; Windows 7 6.1; HttpClient 4.2.1)
```

Sample Response:
```
HTTP/1.1 200 OK
x-jss-request-id: BBDC82A4C4B61A5F
Server: JSS/1.0
Content-Type: application/json;charset=UTF-8
Content-Length: 4
Date: Tue, 15 Dec 2015 13:08:06 GMT
true
```

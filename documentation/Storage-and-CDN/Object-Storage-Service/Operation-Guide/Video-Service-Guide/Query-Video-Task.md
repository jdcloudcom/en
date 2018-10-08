# Search video task

Description: search video task through task id

Request Grammar：
```
GET getVideoTask&taskId= taskId
Host: oss.cn-north-1.jcloudcs.com
Date: date
Authorization: signatureValue#Please refer to Security Verification
```

RequestExample:
```
GET getVideoTask&taskId=11311576e2ee46d3b11dd4672d8e13c4 HTTP/1.1
Date: Tue, 15 Dec 2015 12:43:24 GMT
Authorization: jingdong 2sTXh1AoApNv5x8p:AsYj3qfR2lhnwZT+5ZweZG0JgOs=
Host: oss.cn-north-1.jcloudcs.com
Connection: Keep-Alive
User-Agent: JFS-JCLOUD-SDK-JAVA/1.0.0 (Java 1.8.0_45; Vendor Oracle Corporation; Windows 7 6.1; HttpClient 4.2.1)
```

Request response:
```
HTTP/1.1 200 OK
x-jss-request-id: 99AC4715136F3038
Server: JSS/1.0
Content-Type: application/json;charset=UTF-8
Content-Length: 325
Date: Tue, 15 Dec 2015 13:09:03 GMT
{"taskId":"702d79de74494ec9ac47693e946093b7","status":1,"bucket":"jfs-m3","objectKey":"IVTT.mp4","options":"av/fmt/mp4/s/480/360/vb/440000/ab/48000/saveas/a2trOmFhYWEud212","updateTime":1450108357000,"taskOutputObjectList":[{"tId":1023,"objectKey":"IVT.mp4","bucket":"abc"},{"tId":1023,"objectKey":"ITT.mp4","bucket":"abc"}]}
```

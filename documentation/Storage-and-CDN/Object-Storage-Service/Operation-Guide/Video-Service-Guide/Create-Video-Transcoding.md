# Create video transcoding

Description: transcode the video file on JD Cloud OSS, and save the transcoded video as a new file.

Request Grammar:
```
PUT /bucket/object?pretreatmentStrategyV2&expires=<expires value>&policy=<policy string>  HTTP/1.1
Content-MD5: 
Content-Disposition: 
Host: oss.cn-north-1.jcloudcs.com
Date: date
```
Description:

expires: expiration time, standard HTTP Header

policy: transcoding strategy, JSON format, and policy relevant parameters are explained as follows:

"saveas": save as, that's, the location of the processed video file

persistentOps: a video transcoding rule triggered after a successful resource upload.

The currently supported video transcoding rules are as follows:

|video format_resolution_bit rate|
|-|
|video_mp4_1920x1080_1500kbps|
|video_mp4_1280x720_1000kbps|
|video_mp4_854x480_800kbps|
|video_mp4_640x480_500kbps|
|video_mp4_640x360_500kbps|
|video_mp4_480x360_440kbps|
|video_mp4_320x240_240kbps|
|video_flv_1280x720_1000kbps|
|video_flv_854x480_800kbps|
|video_flv_640x480_500kbps|
|video_flv_640x360_500kbps|
|video_flv_480x360_440kbps|
|video_flv_320x240_240kbps|
|video_hls_1920x1080_1500kbps|
|video_hls_1280x720_1000kbps|
|video_hls_854x480_800kbps|
|video_hls_640x480_500kbps|
|video_hls_640x360_500kbps|
|video_hls_480x360_440kbps|
|video_hls_320x240_240kbps|

Request Example:
```
PUT /bucket/object?pretreatmentStrategyV2&expires=3600&policy={"persistentOps":"video_mp4_480x360_440kbps","saveas":"kkk:aaaa.wmv","targetSaveas":"a2trOmFhYWEud212"} HTTP/1.1
   Date: Mon, 22 Feb 2016 03:35:32 GMT
   Authorization: jingdong   NcB3e3VUn45NtjV3:A0LcbZin1FhRnSH697Q0D+64t8E=
   Content-Length: 0
   Host: oss.cn-north-1.jcloudcs.com
   Connection: Keep-Alive
User-Agent: JSS-SDK-JAVA/1.2.0 (Java 1.8.0_45; Vendor Oracle Corporation; Windows 7 6.1; HttpClient 4.2.1)
```

Request response:
```
HTTP/1.1 200 OK
x-jss-request-id: 8CEF3204E1AD1C2D
Server: JSS/1.0
ETag: "a0eb630d0cab1a1240b2bae67410cdb7"
Content-Type: application/json;charset=UTF-8
Content-Length: 34
Date: Tue, 15 Dec 2015 13:10:50 GMT
{“taskId”: "0a354cca27994b398931b205bbf96985"}   
Wrong return information:
{"code":"NoSuchKey","message":" The specified file used for video transcoding does not exist, file name = Wildlifetest.wmv","resource":"/test-bucket13/Wildlifetest.wmv","requestId":"8764E879D8AEE8BF"}
```

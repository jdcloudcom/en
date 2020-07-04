# Access Log

Server access logs can be used for recording specific request of bucket, so as to conduct bill audit, access analysis, permission audit, etc.

## Use the Console to enable the log access function

1. Log in Console->Object Storage Service->Space Management->Enter a Bucket->Space Setting->Access Log

![访问日志](../../../../../image/Object-Storage-Service/OSS-176.png)

2. Click the **Edit** button and open the dialog box for accessing log configuration

![日志配置](../../../../../image/Object-Storage-Service/OSS-177.png)

3. Click **Enable**, enter target space and target prefix and click **OK**. Then, log access is enabled.

Detail description:

* Entered prefix cannot exceed 1,022 bytes, without any backslash (\) or double slashes (//)

* About billing: Requests will be produced every time when the log operation is enabled and logs are outputted to bucket via the Console and the billing will be made as per the requests. If any produced log file occupies the bucket, the billing will be made as per the billing rules of standard storage capacity.

* Modification of target bucket will be delayed as for time. If target bucket for log recording is changed from Bucket A to Bucket B, then some logs may still be transmitted to Bucket A in the next hour, while other logs will be transmitted to Bucket B.

* Best effort basis: For access to Log Service, all requests of bucket will be recorded and outputted on the best effort basis, but it cannot be guaranteed that each request is provided with a record.

* It is not suggested to set the target bucket as the source bucket, because the request for outputting logs itself will produce a log. If so, logs will be outputted infinitely.

## Log Format

Log files will be stored in the following position of the target bucket:

```
TargetPrefixYYYY-mm-DD-HH-MM-SS-UniqueString/
```

TargetPrefix is the target prefix assigned when the log access function is enabled.

YYYY, mm, DD, HH, MM and SS respectively produce year, month, day, hour, minute and second of logs. This time is a UTC time and Beijing time is +8 hour greater than the time.

The UniqueString field is used for avoidance of repetition and is meaningless.

A log example is as shown below:

```
916189066405 test-logging [05/Jun/2020:10:40:43 +0000] 103.226.192.8 916189066405 9E44C68D401D740D REST.POST.BUCKET testObject "POST / HTTP/1.0" 204 - - 1025 23 23 "-" "Apache-HttpClient/4.5 (Java/1.8.0_181)" - c3RhZzItcjItYXoxOjoxMC4yMjYuMjAxLjE4MA== - - - test-logging.s3.cn-north-1.jdcloud-oss.com -
```
For detailed annotation of each field, please refer to the table:

|Name|Example|Detailed Annotation|
|:-|:-|:-|
|User ID|916189066405|account ID of JD Cloud & AI|
|Space Name|test-logging|Space Description|
|Time|06/Feb/2019:00:00:38 +0800|Use UTC time and Beijing time is plus +8|
|Request IP|103.226.192.8|The First IP in the x-forwarded-for field of HTTP Request Header|
|Requster|916189066405|JD Cloud & AI account ID of requester|
|Request ID|9E44C68D401D740D|request ID, each request shall have a unique ID|
|Operation|REST.POST.BUCKET|Operation Type of This Request|
|key|test/object.txt|Requested File Name|
|Request URI|POST / HTTP/1.0|request URI in HTTP Request|
|HTTP Status Code|204|HTTP Status Code|
|Error Code|NoSuchBucket|Error Code of Object Storage Service|
|Response Size|243565|Total Response Size, Unit: Byte|
|File Size|243485|Size of Request File, Unit: Byte|
|Total Time|23|Period from the time the server receives the first byte to the time the last responding byte is sent. Unit: ms|
|Processing time|23|Period from the server receiving the first byte to the time the first responding byte is sent. Unit: ms|
|Referer|https://www.jdcloud.com/|Referer in HTTP Request Header|
|User-Agent|Apache-HttpClient/4.5 (Java/1.8.0_181)|User-Agent in HTTP Request|
|Signature Version|SigV4|aws Signature Version|
|Encryption Suite|ECDHE-RSA-AES128-GCM-SHA256|HTTP Encryption Method|
|Identity Verification Type|AuthHeader|Identity Verification Method|
|HOST|test-logging.s3.cn-north-1.jdcloud-oss.com|Request Domain|
|TLS Version|TLSv1.2|TLS Version|

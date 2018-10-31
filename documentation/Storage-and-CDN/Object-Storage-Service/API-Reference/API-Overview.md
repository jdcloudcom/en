# API Overview

## Service Actions
|API|Description|
|-|-|
|GetService|Get all Buckets under the account|

## Bucket Operations
|API|Description|
|-|-|
|Put Bucket|Create Bucket|
|Put Bucket Referer|Set anti-leech rules of Referer|
|Get Bucket Referer|View anti-leech chain rules of Referer|
|Delete Bucket| Delete Bucket|
|Get Bucket (List Object)|Get all information of Object in Bucket|

## Object Operations
|API|Description|
|-|-|
|PutObject|Upload object|
|GetObject|Get Object|
|DeleteObject|Delete Object|

## Multipart Upload Operations
|API|Description|
|-|-|
|Initiate Multipart Uploade|Initiate MultipartUpload Event|
|Upload Part|Upload File by Parts|
|Complete Multipart Upload|Complete Multipart Upload of Entire File|
|Abort Multipart Upload|Abort Multipart UploadAbort Multipart Upload Event|
|List Multipart Uploads|List All Multipart Upload Events in Execution|
|List Parts|List All Successfully Uploaded Parts under Assigned Upload ID|

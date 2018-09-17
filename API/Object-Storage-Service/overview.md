# Cloud Storage APIs


## Introduction
Cloud storage APIs, mainly Include query Bucket list, create Bucket, delete Bucket and query whether Bucket exists or not. For more APIs, see: https://www.jdcloud.com/help/detail/1901/isCatalog/1


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**deleteBucket**|DELETE|Delete a bucket</br>|
|**deleteImgProtected**|DELETE|Disable original image protection</br>|
|**getimgProtectedCondition**|GET|Obtain original image protection configuration of current bucket</br>|
|**headBucket**|HEAD|Query whether bucket exists or not</br>|
|**listBuckets**|GET|List all bucket of current user</br>|
|**moveObject**|PUT|moveobject</br>|
|**putBucket**|PUT|Create a bucket</br>|
|**putImgProtected**|PUT|Create original image protection</br>|
|**updateBucketMaxCount**|POST|Update bucket maximum</br>|

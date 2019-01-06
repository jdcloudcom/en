# Object Storage Service APIs


## Introduction
Object Storage Service APIs, mainly include query Bucket list, create Bucket, delete Bucket and query whether Bucket exists or not. Image Back-to-origin APIs, mainly include adding image back-to-origin configuration, obtaining image back-to-origin configuration and deleting image back-to-origin configuration. For more APIs, see: https://www.jdcloud.com/help/detail/1901/isCatalog/1


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**deleteBackSourceConfiguration**|DELETE|Delete Back-to-origin Configuration (ossopenapi)|
|**deleteBucket**|DELETE|Delete a bucket(oss)</br>|
|**getBackSourceConfiguration**|GET|Obtain Back-to-origin Configuration (ossopenapi)|
|**headBucket**|HEAD|Query whether bucket(oss) exists or not</br>|
|**listBuckets**|GET|List all bucket(oss) of current user</br>|
|**putBackSourceConfiguration**|PUT|Add and Modify Back-to-origin Configuration (ossopenapi)|
|**putBucket**|PUT|Create a bucket(oss)</br>|

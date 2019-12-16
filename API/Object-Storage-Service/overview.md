# Object Storage Service APIs


## Introduction
Object Storage Service APIs

Note: The following OpenAPIs do not support access by IAM sub-users. When access by sub-user is required, please use [Compatible S3 API](https://docs.jdcloud.com/en/object-storage-service/compatibility-api-overview).

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
|**getSingleBucketCapacity**|POST|Obtain designated bucket consumption data by type (ossopenapi)|

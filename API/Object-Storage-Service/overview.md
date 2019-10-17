# Object Storage Service APIs


## Introduction
Object Storage Service APIs

Note: OpneAPI APIs do not support IAM sub-users to access. When access via sub-user, please use [Compatible S3 API](https://docs.jdcloud.com/en/object-storage-service/compatibility-api-overview).

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

# Bucket Management

[Does bucket support renaming? ](Bucket-Management#user-content-1)

[Can bucket be deleted? ](Bucket-Management#user-content-2)

[Common reasons for failing to delete bucket](Bucket-Management#user-content-3)

[Can an object in bucket accidentally deleted be recovered? ](Bucket-Management#user-content-4)

[Error "The bucket you tried to delete has replication configuration configured." occurs when bucket is deleted through Console](Bucket-Management#user-content-5)

[How to search bucket storage and traffic? ](Bucket-Management#user-content-6)

------

<div id="user-content-1"></div>

#### Does bucket support renaming?

No. But you can transfer objects after creating a new bucket.

<div id="user-content-2"></div>

#### Can bucket be deleted?

Bucket can only be deleted when it is null.

<div id="user-content-3"></div>

#### Common reasons for failing to delete bucket

When the bucket cannot be deleted, please confirm if the bucket is null and pay attention to the followings:

- If there is a multipart upload task, the bucket cannot be deleted;
- If the bucket has incremental data synchronization rules, it cannot be deleted;
- If the bucket has image style, it cannot be deleted;
- It shows null but the actual resource is not null because of failure of obtaining resources in **Object Management** due to too many objects, time-out of accessing network and other reasons, so the bucket cannot be deleted. We recommend you use **Life Cycle Management** to delete the Object and multipart. Refer to [Life Cycle Management](https://docs.jdcloud.com/object-storage-service/lifecycle).

<div id="user-content-4"></div>

#### Can an object in bucket accidentally deleted be recovered?

Not supported now.

<div id="user-content-5"></div>

#### Error "The bucket you tried to delete has replication configuration configured." occurs when bucket is deleted through Console

If there are data synchronization rules, neither the source Bucket nor the target Bucket can be deleted. The incremental data synchronization must be disabled first. For details, refer to [Data Synchronization Setting](https://docs.jdcloud.com/object-storage-service/set-bucket-cross-region-replication-2).

<div id="user-content-6"></div>

#### How to search bucket usage data?

Through APIs: Refer to the document [Obtain designated bucket usage data according to type](https://docs.jdcloud.com/object-storage-service/api/getsinglebucketcapacity?content=API).

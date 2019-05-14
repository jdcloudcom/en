# Read and Write Permission ACL-based Permission Control
OSS provides IAM list (ACL) for permission control. ACL is the access permission granting Bucket access permission.
You can configure ACL when you create a Bucket in the console, and can modify the ACL at any time after you have created a Bucket. If you fail to specify the permission when creating a Bucket, the permission will be private read/write by default.
# Bucket ACL
Bucket ACL is the permission IAM at the Bucket level. Currently three access permissions are supported: public-read-write, public-read and private, with the following definitions:

|Permission Value|Chinese Name|Restriction of Permission to Visitor|
|:--|:---|:--------|
|public-read-write|Public Read/Write|Any person (including anonymous access) can carry out read/write/delete actions to the Object in the Bucket; all the costs incurred by these actions are borne by the Owner of the Bucket, please use the permission carefully.|
|public-read|Public Read and Private Write|Only the Owner of the Bucket or the authorized user can carry out write/delete actions to the Object stored therein; any person (including anonymous access) can carry out read action to the Object.|
|private|Private Read/Write|Only the Owner of the Bucket or the authorized user can carry out read/write/delete actions to the Object stored therein; other persons cannot access the Object in the Bucket without authorization.|

The permission setting and read method of Bucket ACL are as follows:

-   Console: [Set ACL when creating a Bucket](https://docs.jdcloud.com/en/object-storage-service/create-bucket-1),
[Modify Bucket ACL](../Manage-Bucket/Set-Bucket-Policy-2.md)

-   API：[PutBucketACL](../../API-Reference-S3-Compatible/Compatibility-API/Operations-On-Bucket/Put-Bukcet-acl-2.md)、
[GetBucketACL](https://docs.jdcloud.com/en/object-storage-service/get-bucket-acl-2)


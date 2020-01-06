# Object Lock

The function object lock can forbid file deletion and replacement, so as to guarantee data reliability, meet some industrial compliance requirements and realize the Write Once Read Many (WORM) mode.

## Customer Scenario

According to requirements of some industries, key data can be saved for a period and then deleted, such as the financial service, health care and government affairs department; to meet this scenario demand, OSS needs to support the WORM (object lock) mode, i.e., Write Once Read Many.

In addition to mandatory demands of special industry, the object lock function can also be used if there are demands for deleting and replacing some files for a period or permanently.

## Rule Restriction

Object lock can only be enabled when a space is created. The space created does not support enabling of object lock.

## Retention Period

During retention period, file can be protected from being replaced or deleted within a fixed period. The retention period supports the governance mode and the compliance mode.

Users with the permission s3:PutObjectRetention can enable and extend file retention period.

### Governance Mode

Under the governance mode, unless the user has special permission, users cannot replace or delete any file.

If any file needs to be replaced and deleted under the governance mode, users must have the s3:BypassGovernanceMode permission and carry the x-amz-bypass-governance-retention:true request head.

Details:

* Requests of OSS Console carry the x-amz-bypass-governance-retention:true request head by default. Operation on the Console by users with permissions can succeed.

* The file owner has the s3:BypassGovernanceMode and s3:PutObjectRetention permission by default.

* For users with the permissions of s3:PutObjectRetention and s3:BypassGovernanceMode, if the request contains the request head x-amz-bypass-governance-retention:true, retention period of governance mode can be shortened or disabled.

### Compliance Mode

Under the compliance mode, any user shall not replace or delete any file. Once the compliance mode is set, the retention mode cannot be modified to be the governance mode or deleted. Retention period of compliance mode cannot be shortened or disabled.

## Legal Hold

Legal hold of file can forbid users to delete or replace files, which is only in the enabled and disabled status without any period. In other words, once legal hold is enabled, the file can never be deleted.

Users with the s3:PutObjectLegalHold permission can freely enable and disable legal hold.

Details:

* Retention period and legal hold are not logically related, the two of which can coexist. Where anyone of the two is valid, the file shall not be deleted or replaced.

* The file owner has the s3:PutObjectLegalHold permission by default.

## Default Retention Period Policy of Space

The bucket supports enabling of default retention policy. The enabled and uploaded file will carry the default retention period of space by default.

Details:

* The default retention policy of space only supports retention period rather than legal hold.

* Modify default retention setting of space is only applicable for files modified and uploaded and is invalid for files which have been uploaded to the space before.

* If retention period rules are appointed when new files are uploaded, the rules appointed at the uploading time shall prevail.

## View object lock status

Users with the permission s3:GetObjectRetention can view file retention period and file retention mode.

Users with the s3:GetObjectLegalHold permission can view file legal hold status of file.

Users with the permission s3:GetBucketObjectLockConfiguration can view default space retention setting.

The owner has the above three permissions by default.

## Enable object lock function for Console

Log in Console->OSS->Space Management->Create Space->Advanced Setting

![开启对象锁定](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-170.png)

## Modify default retention setting of bucket via Console

1. Log in the Console->OSS->Space Management->Enter a bucket->Space Settings->Object Lock

![空间级别对象锁定](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-171.png)

2. Click **Edit** to log in the setting page.

![设置空间级别对象锁定](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-172.png)

3. Select the retention mode and appoint the retention period.

## Modify file object lock setting via Console

1. Log in the Console->OSS->Space Management->Enter a bucket->->Object Management->A File->More->Object Lock

![对象级别对象锁定](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-173.png)

2. Click **Object Lock** and enter the setting page.

![设置对象级别对象锁定](https://github.com/jdcloudcom/cn/blob/edit/image/Object-Storage-Service/OSS-174.png)

3. Select the retention mode and appoint the expiration date.

4. Select to enable or disable legal hold.

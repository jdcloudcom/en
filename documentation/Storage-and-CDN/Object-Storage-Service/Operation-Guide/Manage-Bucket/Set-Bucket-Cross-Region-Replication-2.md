# Incremental Data Synchronization Setting

Incremental Data Synchronization is to automatically and asynchronously replicate files cross different Buckets, which shall synchronize changes (excluding deletion actions) to objects in the source Bucket to the target Bucket. The Incremental Data Synchronization function can well meet the requirements of user data replication or provide the demands for Bucket cross-region disaster recovery. The objects in the target Bucket are exact backup copies of the objects in the source Bucket, which have the same object names, metadata and contents.

## Customer Scenario

Cooperative use of Incremental Data Synchronization and [Historical Data Synchronization](../../Operation-Guide/Manage-Bucket/Historical-Data-Synchronization-Setting.md) can implement the following requirements:

* Data replication: For business reasons, data need to be migrated from one space to another.

* Compliance requirement: A backup copy of data required by compliance requirement needs to be saved across a certain distance.

* Data backup and disaster tolerance: If you want to save or maintain a backup copy of all written data in the long-distance storage area, in case of damage caused to the storage area by catastrophes such as tsunamis or earthquakes, you can enable backup data of the long-distance off-site storage area.

* Minimize latency: Users are in two geographic locations. To minimize the latency in accessing objects, a backup copy of the object can be maintained in a storage area that is geographically closer to the user.


## The setup process in the console is as follows:


1.Login to the Console->OSS->Object Storage Service->Enter a Bucket->Space Settings->Incremental Data Synchronization

![增量数据同步](https://github.com/jdcloudcom/cn/blob/cn-oss-1/image/Object-Storage-Service/OSS-041.png)

2. Click **Enable** button to open the dialog box of incremental data synchronization configuration.

![配置增量数据同步](https://github.com/jdcloudcom/cn/blob/cn-oss-1/image/Object-Storage-Service/OSS-042.png)

3.Select the region the target Bucket is located and the Bucket name.

Detail Specification:

* Incremental Data Synchronization doesn’t currently support synchronizing data between buckets within the same region.

* The two storage spaces that enable incremental data synchronization cannot be synchronized with any other bucket at the same time.

4.Select Synchronization Objects

* Synchronize all files: Synchronize all files in the source Bucket to the target Bucket.

* Assign file name prefixes for synchronization: Synchronize files with the assigned prefixes in the source Bucket to the target Bucket.

   a. You can add at most 1000 prefixes. Each prefix can be at most 1022 bytes.

   b. File prefixes do not support overlapping prefixes, for example, test and test/01 are not allowed.

5. Change Storage Type or Not.

 * Check to change the storage type: the replicated file storage type can be changed, and standard storage, infrequent access storage, archival storage and reduced redundancy storage (not recommended) are supported.


6.Click the Confirm button to save the settings.

Detail Specification:

 * After the rules configuration is done, the Bucket synchronization task will be automatically and asynchronously performed. The time it takes for data to be replicated to the target Bucket depends on the data size, usually ranging from a few seconds to a few hours.

 * Since the source Bucket that enables incremental data synchronization and the target Buckets can operate independently, if the new file in the source Bucket has the same name as the file in the target Bucket, the file with the same name in the target Bucket will be replaced. Please operate carefully.

 * If there are data synchronization rules, neither the source Bucket nor the target Bucket can be deleted. The incremental data synchronization must be disabled first.

 * The condition for enabling incremental data synchronization is that the synchronization configuration with other Buckets of the two Buckets that are synchronized is not enabled, and the two Buckets cannot be synchronized by other Buckets. For example, if Bucket A is enabled for synchronization to Bucket B, then you can no longer enable synchronization to Bucket C for Bucket A unless you change the synchronization configuration of Bucket A to Bucket B to Bucket C. Similarly, if Bucket A is enabled for the synchronization to Bucket B, then it is not allowed to enable the synchronization of Bucket C to Bucket B at this time.

# Use Method of Multi-point Attached Cloud Disk
Multi-point attached cloud disk supports the attachment to multiple cloud instances. Generally a cloud disk can only be attached to one cloud instance, while a multi-point attached cloud disk may be attached to multiple cloud instances at the same time.

**What Is Multi-point Attachment**

Multi-point attached cloud disk supports several cloud instances concurrently read and write the accessed data block-level storage devices, with multiple attachment points, high concurrency, high reliability and other characteristics. A single multi-point attached disk may be concurrently attached to at most 16 cloud instances, and multi-point attachment only applies to data disks and does not support system disks.


**Benefits of Multi-point Attachment**

- Multiple instance sharing: A single multi-point attached cloud disk may be concurrently attached to at most 16 cloud instances.
- High reliability: Multi-point attached cloud disk supports snapshot function, and provides high-reliability data backup.
- Multi-application scenarios: Linux RHCS cluster system, Oracle RAC business, etc.

**Sharing Principles of Multi-point Attached Disk**

The essence of multi-point mounted disk refers to the same Cloud Disk Service mounted to several cloud instances for use. Each instance can be used for reading/writing data from/in any area of such cloud disk. If there is no mutually agreed rules for reading and writing data among these cloud instances, such as read and write order and meaning, unforeseeable errors will occur when these instances read and write data.

Multi-point attached disk itself has no cluster management capability, so you’re required to deploy the cluster system by yourself to manage the multi-point attached disk, such as Windows MSCS cluster, Linux RHCS cluster, CFS cluster, Oracle RAC application, etc., which are common in enterprise applications.

If during the use of multi-point attached disk, no management is done through the cluster system, the following problems will be caused:


- Inconsistency between Data Caused by Read and Write Conflicts<br>
When a multi-point attached disk is concurrently connected to two cloud instances, neither Cloud Instance A nor Cloud Instance B can sense the bucket that the other cloud instance has used, Cloud Instance A may reassign the space that Cloud Instance B has used on Cloud Disk Service, and therefore data error may occur due to space assignment conflicts caused thereby.

- Inconsistency between Data Caused by Data Cache<br>
There is a File on the multi-point attached disk, which is concurrently attached to two cloud instances, i.e. Cloud Instances A and B. The application on Cloud Instance A directly read the data of File from the cache. If the application on Cloud Instance B updates the File at this moment, the application on Cloud Instance A cannot sense that the data of File have been updated, and read the out-of-date data from the cache, so the user cannot view the latest File through Cloud Instance A.



# **Description of Cloud Disk Snapshot Capacity**

Cloud Disk Snapshot is used for backup of data on a cloud disk in order to restore the data on the cloud disk or copy the cloud disk in bulk. The data on Cloud Disk Snapshot records all the data on the cloud disk from the moment when the cloud disk is created.



## Incremental Snapshot

When creating a Cloud Disk Snapshot for the first time, full data will be backed up. Subsequently, each backup is an incremental backup.

See the diagram below taking a cloud disk as an example to detail this. At t1, the cloud disk contains 10GiB of data. At this point, if you take the first snapshot of the cloud disk, the 10 GiB of data on the disk will all be copied, forming Snapshot 1.

At t2, in the 10 GiB of data on the cloud disk, 2 GiB of data are modified. At this point, if you take a snapshot of the cloud disk, only the 2 GiB of data modified will be copied, and the other 8 GiB of data in the first snapshot will be referenced, forming Snapshot 2.

At t3, in addition to the existing 10 GiB of data on the cloud disk, an additional 1 GiB of data is increased. At this point, if you take a snapshot of the cloud disk, the additional 1GiB of data will be copied, and the 8GiB + 2 GiB of data in the previous snapshot will be referenced, forming Snapshot 3.

Consequently, at t3, the data volume on the cloud disk is 11 GiB, and the snapshot data volume is 13 GiB.

![increment](../../../../image/Elastic-Compute/CloudDisk/cloud-disk/increment.png)



## Delete Snapshot

Snapshot data is stored in the form of database block, and the minimum unit is 4MB. When deleting a snapshot, the reference relationship between the snapshot and the data will be deleted, and the data block that is no longer referenced by any snapshot will be deleted.

Still take the above scenario as an example, and assume that Snapshot 1 is to be deleted. Firstly, delete the reference relationship of Snapshot 1 towards the 10 GiB of data backed up for the first time, and then the unreferenced data will be cleared up. In the 10 GiB of data corresponding to Snapshot 1, there are 8 GiB of data that are still referenced by Snapshot 2 and Snapshot 3, and 2 GiB of data that are not referenced by any subsequent snapshots. For this reason, the 2 GiB of data shall be cleared up.

Consequently, after Snapshot 1 is deleted, the snapshot data volume turns from 13 GiB to 11 GiB.

![deletesnapshot](../../../../image/Elastic-Compute/CloudDisk/cloud-disk/deletesnapshot.png)

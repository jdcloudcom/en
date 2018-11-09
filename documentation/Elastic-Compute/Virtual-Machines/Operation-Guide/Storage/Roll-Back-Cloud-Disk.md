# Use Snapshot to Store Cloud Disk
After the cloud disk takes a snapshot, if there is a problem with the current system and you want the cloud disk data to be restored to a particular point in time, you can do so by restoring the cloud disk. For details, refer to [Restore Cloud Disk](http://docs.jdcloud.com/cn/cloud-disk-service/recover-clouddisk) on the cloud disk side.

## Operational Limits

* Only the source cloud disk that creates snapshots can be restored;
* The source cloud disk is not deleted;
* The source cloud disk needs to be detached. If the cloud disk is attached to the instance, please operate [Detach Cloud Disk](Detach-Cloud-Disk.md);
* After the cloud disk is restored, the data from the moment when the snapshot is created to the current time will be lost. Please operate with caution;
* If the cloud disk has been expanded after the snapshot is created, when the restored cloud disk is attached to an instance, you need to log in to the instance again to [Expand File System](http://docs.jdcloud.com/cn/cloud-disk-service/cloud-disk-expansion-overview).

## Related Reference
[Restore Cloud Disk](http://docs.jdcloud.com/cn/cloud-disk-service/recover-clouddisk)

[Detach Cloud Disk](Detach-Cloud-Disk.md)

[Expand File System](http://docs.jdcloud.com/cn/cloud-disk-service/cloud-disk-expansion-overview)


# Create Cloud Disk Snapshot

A snapshot can retain the state of data in the cloud disk at a particular point in time as a data backup.
## Usage Restrictions

* By default, the quota of snapshots of a single user in a single region is 15 and it can be increased by opening ticket;
* To ensure data integrity, please stop writing to the cloud disk before creating a snapshot to ensure the integrity of snapshot data;
* It is recommended that you detach the cloud disk before making a snapshot, re-attach the disk to the instance after creating a snapshot. Please refer to [Detach Cloud Disk](Detach-Cloud-Disk.md), [Attach Cloud Disk](Attach-Cloud-Disk.md);

## Operation Steps
Refer to the [Create Cloud Disk Snapshot](http://docs.jdcloud.com/cn/cloud-disk-service/create-clouddisk-snapshot) on the cloud disk side.
 	
 	Please note: The time required to create a snapshot as full snapshot for the first time depends on the capacity of the cloud disk. The larger the capacity of the cloud disk is, the longer it takes, so please be patient.
 	
 	
## Related Reference

[Detach Cloud Disk](Detach-Cloud-Disk.md)

[Attach Cloud Disk](Attach-Cloud-Disk.md)

[Create Cloud Disk Snapshot](http://docs.jdcloud.com/cn/cloud-disk-service/create-clouddisk-snapshot)
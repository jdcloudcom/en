# Create Cloud Disk

JD Cloud provides you with a variety of ways to create a cloud disk:

* Create a cloud disk when the instance is created. For details, please refer to [Create Instance](../Instance/Create-Instance.md);
* Separately [Create Cloud Disk]();
* [Create Disk from Snapshot](), namely, you can keep historical time point data of a certain cloud disk in the new disk.

Please note:

* By default, the quota for cloud disks in each region is 15, and it can be increased by open ticket;
* A single instance can support up to 8 cloud disks;
* Each SSD cloud disk supports a maximum capacity of 1000G; each premium Hdd cloud disk supports a maximum capacity of 3000G;
* If you need to create a cloud disk billed by configuration, you need to ensure that your balance plus available coupon is no less than RMB 50. Please recharge if the current balance is insufficient;
* The current instance does not support merging of multiple cloud disks. After the creation, each cloud disk is an independent entity, and it is impossible to merge the spaces of multiple cloud disks by formatting. It is recommended that you plan the number and capacity of disks in advance; if the cloud disk has been created, but you need to expand it, you can follow these steps:
	* For cloud disk under monthly package, capacity expansion can be realized by expanding the cloud disk;
	* You can create a cloud disk snapshot for the cloud disk billed by configuration, and then create a new disk from snapshot. Then, the old disk can be deleted.

## Related Reference
[Create Instance](../Instance/Create-Instance.md)

[Create Cloud Disk]()

[Create A Cloud Disk from Snapshot]()
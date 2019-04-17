# Cloud Disk Service Encryption (in Beta)

The encryption to the Cloud Disk Service refers to the encryption to the data of the Cloud Disk Service for the purpose of guaranteeing security of static data in the Cloud Disk Service and data transmission security between the Virtual Machine instance and the Cloud Disk Service.
JD Cloud is responsible for maintenance and management of the key pair used for encryption, while the user cannot obtain the key pair information. Encryption to the Cloud Disk Service by your customized key pair is not supported now.

## Create Encrypted Cloud Disk Service

You can create the Cloud Disk Service with encryption attribute via the methods below

* Before creating the instance, please select a Generation II and above instance type (the machine of the Generation I instance type does not support the attaching of the encrypted Cloud Disk Service). Please check the encryption option before creating a null data disk. For details, please refer to [Create Instance](../Instance/Create-Instance.md);
* In case of solely [Create Cloud Disk Service] (http://docs.jdcloud.com/cn/cloud-disk-service/create-cloud-disk), please check the encryption option;
* [Create Cloud Disk Service from Snapshot](http://docs.jdcloud.com/cn/cloud-disk-service/create-disk-by-snapshot), if the selected snapshot is encrypted, the created cloud disk is encrypted certainly.

		Note:
		* If the Cloud Disk Service is created from snapshot or the snapshot is created from the Cloud Disk Service, the encryption attribute will be automatically inherited and cannot be changed;
        * The encryption attribute of the existing Cloud Disk Service and snapshot cannot be changed;
        * The attaching of encrypted Cloud Disk Service is not supported by the Generation I instance type;
        * The instance attached with the encrypted Cloud Disk Service cannot be resized to the Generation I instance type;
        * The private image with the encrypted snapshot does not support sharing and cross-region replication now.



## Related References

[Create Instance](../Instance/Create-Instance.md)

[Create Cloud Disk Service](http://docs.jdcloud.com/cn/cloud-disk-service/create-cloud-disk)

[Create Cloud Disk Service from Snapshot](http://docs.jdcloud.com/cn/cloud-disk-service/create-disk-by-snapshot)
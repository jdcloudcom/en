# Cloud Disk Service API


## Introduction
The Cloud Disk Service API contains the CDS APIs and Snapshot APIs. It can provide functions such as creating Cloud Disk in batches, deleting a Cloud Disk, and making a Cloud Disk snapshot.


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createDisks**|POST|\-   Create one or more Cloud Disks that are paid by configuration or by service time.</br>\-   Disk type includes Premium Hdd Cloud Disk and SSD Cloud Disk.</br>\-   The billing method defaults to paying by configuration.</br>\-   After creation is completed, the status of the Cloud Disk is available.</br>\-   The optional parameter snapshot ID is used to create a new disk.</br>\-   In batch creation, the name of the Cloud Disk is: hard disk name \-number, such as myDisk\-1 and myDisk\-2.</br>\-   maxCount is the maximum effort, and it is not guaranteed that maxCount can be reached.</br>|
|**createSnapshot**|POST|\-   Create a snapshot for the specified Cloud Disk, and the status of the newly generated snapshot is creating.</br>\-   The quota for single\-user snapshots in the same region is 15.</br>\-   To ensure data integrity, please stop writing to the Cloud Disk before creating a snapshot to ensure the integrity of snapshot data.</br>\-   Before creating a snapshot, we suggest you uninstall the Cloud Disk and reattach the disk to the virtual machine after the snapshot is created.</br>\-   The life cycle of manual snapshots is independent from the Cloud Disk. Please delete unnecessary snapshots in time.</br>\-   The time demanded to create a snapshot depends on the capacity of the Cloud Disk. The larger the capacity is, the longer it will take.</br>|
|**deleteDisk**|DELETE|\-   Delete a Cloud Disk billed by configuration. The disk types include the Premium Hdd Cloud Disk and the SSD Cloud Disk.</br>\-   After the hard disk is deleted, the Cloud Disk snapshot can be retained.</br>\-   When the disk is released, the status of the Cloud Disk is to\-be\-attached (Available).</br>\-   If the disk of the specified ID does not exist, the request will be ignored.</br>|
|**deleteSnapshot**|DELETE|\-   Delete a single Cloud Disk snapshot: The snapshot status must be available or error status.</br>\-   The snapshot is independent from life cycle of the Cloud Disk. Deleting a snapshot does not have any effect on the Cloud Disk that created the snapshot.</br>\-   After the snapshot is deleted, it cannot be recovered. Please be cautious.</br>|
|**describeDisk**|GET|Query details of a Cloud Disk|
|**describeDisks**|GET|\-   filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR</br>|
|**describeSnapshot**|GET|Query Cloud Disk Snapshot Details|
|**describeSnapshots**|GET|Query the List of Cloud Disk Snapshots. Filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR|
|**extendDisk**|POST|\-   Expansion of the Cloud Disk requires it in available status.</br>\-   Capacity expansion is not allowed while the disk is creating a snapshot.</br>|
|**modifyDiskAttribute**|PATCH|Modify the name or description of the Cloud Disk, specify either|
|**modifySnpAttribute**|PATCH|Modify the Name or Description of the Snapshot|
|**restoreDisk**|POST|\-   Data recovery operations can only be executed on the source hard disk, from which the snapshot was taken.</br>\-   Snapshots can be used for data recovery operations only if the source hard disk is available.</br>\-   After the Cloud Disk is restored, the current data will be cleared. Please be cautious.</br>|

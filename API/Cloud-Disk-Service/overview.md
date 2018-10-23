# Cloud Disk Service APIs


## Introduction
The Cloud Disk Service APIs contain the CDS APIs and Snapshot APIs. It can provide functions such as creating cloud disks in batches, deleting a cloud disk, and making a cloud disk snapshot.


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createDisks**|POST|-   Create one or more Cloud Disks that are paid by configuration or by service time.</br>-   Disk type includes Premium Hdd Cloud Disk and SSD Cloud Disk.</br>-   The billing method defaults to paying by configuration.</br>-   After creation is completed, the status of the Cloud Disk is available.</br>-   The optional parameter snapshot ID is used to create a new disk.</br>-   In batch creation, the name of the Cloud Disk is: hard disk name -number, such as myDisk-1 and myDisk-2.</br>-   maxCount is the maximum effort, and it is not guaranteed that maxCount can be reached.</br>|
|**createSnapshot**|POST|-   Create a snapshot for the specified cloud disk, and the status of the newly generated snapshot is creating.</br>-   The quota for single-user snapshots in the same region is 15.</br>-   To ensure data integrity, please stop writing to the cloud disk before creating a snapshot to ensure the integrity of snapshot data.</br>-   Before creating a snapshot, we suggest you detach the cloud disk and reattach the disk to the virtual machine after the snapshot is created.</br>-   The life cycle of manual snapshots is independent from the cloud disk. Please delete unnecessary snapshots in time.</br>-   The time demanded to create a snapshot depends on the capacity of the cloud disk. The larger the capacity is, the longer it will take.</br>|
|**deleteDisk**|DELETE|-   Delete a cloud disk billed by configuration. The disk types include the Premium Hdd Cloud Disk and the SSD Cloud Disk.</br>-   After the hard disk is deleted, the cloud disk snapshot can be retained.</br>-   When the disk is released, the status of the cloud disk is to-be-attached (Available).</br>-   If the disk of the specified ID does not exist, the request will be ignored.</br>|
|**deleteSnapshot**|DELETE|-   Delete a single cloud disk snapshot: The snapshot status must be in available or error status.</br>-   The snapshot is independent from life cycle of the cloud disk. Deleting a snapshot does not have any effect on the cloud disk that created the snapshot.</br>-   After the snapshot is deleted, it cannot be recovered. Please be cautious.</br>|
|**describeDisk**|GET|Query details of a cloud disk|
|**describeDisks**|GET|-   filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR</br>|
|**describeSnapshot**|GET|Query cloud disk snapshot details|
|**describeSnapshots**|GET|Query the list of cloud disk snapshots. Filters, between multiple filter conditions is logic AND, and multiple values ​​inside each condition is logic OR|
|**extendDisk**|POST|-   Expansion of the cloud disk requires it in available status.</br>-   Capacity expansion is not allowed while the disk is creating a snapshot.</br>|
|**modifyDiskAttribute**|PATCH|Modify the name or description of the cloud disk, specify either|
|**modifySnpAttribute**|PATCH|Modify the name or description of the snapshot|
|**restoreDisk**|POST|-   Data recovery operations can only be executed on the source hard disk, from which the snapshot was taken.</br>-   Snapshots can be used for data recovery operations only if the source hard disk is available.</br>-   After the cloud disk is restored, the current data will be cleared. Please be cautious.</br>|

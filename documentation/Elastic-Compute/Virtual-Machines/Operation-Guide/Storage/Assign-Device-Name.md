# Device Name Assignment Rules

The disk will be recognized as a device of the instance by the system after it is attached to the instance. Different disks are distinguished according to the device name, and then partitioned, formatted and amounted to the instance(configure mount point for Linux，assign drive letter for Windows) to realize the correct configuration and use of disks in the system.

To manage the disks attached to the instance more conveniently, JD Cloud provides the display of the device name in multiple operations involving the disk at the console, but since different operating system kernels correspond to different storage device drivers, the disk will be recognized by the system in different device names after it is attached to the instance. Linux system and Windows system have different ways of naming for devices, but they have an indexing rule of the same order (see the table below). Therefore, during the operations at the console, the device names are uniformly displayed in the form of a Linux system and the display form of a Windows system can be calculated according to the mapping rules.

|Console display|Linux System Display|Windows System Display|
|:---|:---|:---|:---|
**Device Name of System Disk**|/dev/vda|/dev/vda|Disk 0|
**Device Name of Data Disk**|/dev/vdb - /dev/vdm|/dev/vdb - /dev/vdm|Disk 1-12|

Meanwhile, during the instance management, there are many operations that will affect the assignment and display of disk device names. To ensure that the instance created by using the whole machine image (the private image contains the snapshot information of data disk attached to the instance) has the same data disk attaching condition as the original instance, we strongly recommend that you ensure the continuity of device names in the system after the disk is attached. The following is a detailed explanation for the disk device name assignment of Linux system and drive letter assignment of Windows system under several different operation scenarios of data disk configuration when an instance is created.

## Background Knowledge

The device name that you see on the console is the name assigned by the system to ensure the attaching order. It is mainly used for the control of relative order when the disk is attached. In the case where there is no device name interruption in the system, it can be guaranteed that the device names displayed at the console are consistent with the real device names inside the instance. If the device names in the system are interrupted due to the detaching operation, there may be cases where the display at the console is inconsistent with that in the system.

In Linux systems, since all attachments need to be configured separately, the device name is the primary concern in disk operations. Each time when the Linux system is started, it will identify the device and assign the device name continuously according to the order in which the disk is attached. In case of a vacancy among device names in the system caused by disk detachment, the system will follow the relative order of original disks and cover the vacancy by forwarding to reassign a device name for it after the instance is restarted, which will cause the original attaching information to be invalid. If the original attaching configuration needs to remain unchanged, the attaching operation needs to be performed again in the system.

In Windows systems, the device name (disks 0- 8) is only used as the index before the system attaching disk. The drive (C-Z) is the real identifier of the disk in the system, and after the detachment is completed, the drive will not be changed during system restart. Therefore, for Windows systems, the drive assignment is the primary concern in disk operations. Windows system will add relevant records to the registry for completely attached disks (initialized, partitioned, and assigned drives), and relevant records and information during the process of creation of images and snapshots will be kept. Therefore, when the disk is attached to an instance, if the information of the instance registry matches the disk information, the system will try to assign the original drive; if the original drive is occupied, the system will remain offline and wait for the user to manually get online and assign the drive; if the information in the instance registry does not match the disk information, the system will directly assign an available drive according to the order. For all new disks or disks that are not completely attached, manual online operation and drive assignment are required.

## Detailed Description

* When an instance is created, for data disks created based on the preset data disk information in the private image, the specific name will be displayed at the device name, such as "/dev/vdb". These disks are collectively referred to as the **Default Disk** in the following description; for the remaining new data disks, whether they are empty disks or manually selected disks created based on snapshots, the "Automatically assigned device name" will be displayed at the device name. Those disks are collectively referred to as **New Disk** in the following description.
* In Windows system, if the disk is completely attached (or the source disk for snapshots used to create the disk is completely attached), including initialized, partitioned, and assigned drives, this type of disk is referred to as **Disk with Records** in the following description. Otherwise, it is called **Disk without Records**.
* Device Name "/dev/vdx" (x:ai) is hereinafter abbreviated as "vdx".

## Rules Details

### Linux System	

#### Image contains preset data disk information	

* Device Name Assignment	

	* Where the device names corresponding to all disks (including the system disk) in the image are continuous, and the default disk configuration is not partially deleted when the instance is created based on this image, the default disk will be assigned with a device name identical to the displayed device name; new disks based on this will be assigned sequentially by the system within the remaining available device names.
	* Where the device names corresponding to the disks in the image are not continuous, or when the instance is created based on the image, some default configurations are deleted, resulting in the discontinuity of device names of the final default disks :
		* If no new disk is added, the platform system will attach the default disks in the relative order of the currently displayed device names, and the instance will internally assign the device names from b to i uninterruptedly according to the attaching order.
		* If you add a new disk, the platform system first assigns the device name of the vacancy to the new disk. When no vacant device name can be used, available device names are assigned according to the order, and then all disks will be attached in the relative order of the device names. The instance will also internally assign the device names from b to m uninterruptedly according to the attaching order
* Example	

	The private image contains three data disk configuration information and the device names corresponding to snapshots B, C, and D are vdb, vdc, and vdd respectively. When an instance is created based on this image:
	
	* If no modification for default disks is made and a new disk is added, the device names of the four data disks finally created in the instance are respectively vdb (snapshot B), vdc (snapshot C), vdd (snapshot D) and vde (new disk).
	* If the default disk corresponding to vdb is deleted, disks corresponding to vdc and vdd are retained, and no other new disks are added, the device names of the two disks finally created in the instance are vdb (snapshot C) and vdc (snapshot D) respectively.
	* If the data disk configuration corresponding to vdb and vdc is deleted, disk corresponding to vdd is retained, and a new disk is added, the device names of the two disks finally created in the instance are vdb (new disk), vdc (snapshot) D) respectively.

#### Image does not contain preset data disk information

* Device Name Assignment	
	
	All added data disks are New Disks. The device names are continuously assigned by the system in the order of b-m, and the device names internally assigned by the instance are consistent with the device names assigned by the system
* Example	
	
	If four new disks are manually added, the device names of the four disks are respectively vdb, vdc, vdd, and vde in the order of adding and the device names internally assigned are consistent with the device names assigned by the system


### Windows System	

#### Image contains/does not contain preset data disk information	

* Drive Assignment
	
	When an instance is created based on an image, whether the default disk configuration is included or not, or whether the default disk configuration is deleted or not, as long as the default disk exists, it will be automatically online and assigned according to the original drive after creation. For the remaining new disk:
	
	* If it is a disk without records, you need to login to the instance to get online manually and assign a drive.
	* If it is a disk with records and there is attaching record in the instance registry, it will be automatically online and assigned with the original drive when the original drive in the record is not occupied; it will remain offline when the drive in the record is occupied, and the user needs to manually get it online and assign a drive to it in this case.
	* If it is a disk with records and there is no attaching record in the instance registry, it will be assigned with an available drive according to the order.

* Example
	
	The private image contains three data disk configuration information. The device names corresponding to snapshots d, e, and f are vdb, vdc, and vdd respectively and the drives are D, E and F respectively. When an instance is created based on this image:
	
	* If no modification for default disks is made, the drives of the three data disks that are finally created are D (snapshot d), E (snapshot e), and F (snapshot f).
	* If the default disk corresponding to vdb is deleted, and no other new disks are added, the drives of the two data disks finally created are respectively E (snapshot e) and F (snapshot f).
	* If the default disks corresponding to vdb and vdc are deleted, and a disk without records is added, the drive of the default disk is F (snapshot f), and the new disk needs to be manually online and assigned with a drive.
	* If the default disks corresponding to vdb and vdc are deleted, and a disk with records is added, the drive of the default disk is F (snapshot f). In this case, for the new disk:
		* If there is no attaching information in the instance registry, you need to manually get online and assign a drive.
		* If there is attaching information in the instance registry and the original drive is not F, it is automatically online and the original drive is assigned to it.
		* If there is attaching information in the instance registry and the original drive is F, it is automatically online and the drive D is assigned to it when the original drive is occupied.


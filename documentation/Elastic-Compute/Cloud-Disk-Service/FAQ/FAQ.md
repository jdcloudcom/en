# FAQ

**Q: How many Cloud Disk Service quota a single user?**

A: A single user can create 40 Cloud Disk Services and a single virtual machine can attach 8 Cloud Disk Services at most. If you need to increase the cloud disk quota, please log in the console [Open Ticket](https://ticket.jdcloud.com/myorder/form?cateId=1&questionId=162).

**Q: How much is the capacity of a single Cloud Disk Service?**

A: The range of storage space for an SSD Cloud Disk is 20GB-1000GB and the particle size is 10GB; the range of storage space for a Premium Hdd Cloud Disk is 20GB-3000GB and the particle size is 10GB.


**Q: How many backups can a Cloud Disk Service have?**

A: A single user can create 15 manual backups and the quantity of single hard disk backups is limited by the sum total of current backups.

**Q: What is the recovery operation rules of Cloud Disk Service?**

A: The recovery operation can be performed only when the Cloud Disk Service is in available status. Refer to Help Center for details [Recovery of Cloud Disk Service](https://www.jdcloud.com/help/detail/512/isCatalog/1) for details.

   
**Q: What is the deletion operation rules of Cloud Disk Service?**

A: Deletion action can be made to Cloud Disk Service in available status.

**Q: How to detach a Cloud Disk Service?**

A: For Linux virtual machine, a user needs to log in the virtual machine for umount action and then detach the Cloud Disk Service on console.

For windows virtual machine, a user needs to log in the Virtual Machines for off-line action of corresponding volume and then detach the Cloud Disk Service on console.

**Q: Can one Cloud Disk Service be mounted to several cloud instances?**

If the multi-point mounted attribute is selected for the Cloud Disk Service, simultaneous mounting of at most 16 cloud instances is supported.

**Q: Which business scenarios are suitable for the multi-point mounted disk?**

Multi-point mounted cloud disk, i.e. the shared block storage. It is specially designed for high-availability architecture of core business of enterprise-level customer and suitable for shared access scenarios of block storage, such as high-availability architecture of the Oracle RAC database which are usually used by the government, enterprise and the financial industry as well as high-availability architecture of the server’s high-availability cluster.


**Q: Can the multi-point mounted disk be used as the system disk?**

No. The multi-point mounted disk can be used as the data disk only.

**Q: How to use the multi-point mounted disk correctly?**

The multi-point mounted disk refers to the same Cloud Disk Service mounted to several cloud instances for use. Each instance can be used for reading/writing data from/in any area of such hard disk. If a conventional file system is used for management, the distribution conflict of disk space and data file inconsistence will be caused.
The correct usage of the shared block storage is to make central management to the block device via the cluster file system, such as GFS, GPFS and Linux RHCS cluster. In the Oracle RAC business scenario, ASM is used for central management of storage volume and file system.

**Q: How is the IO performance of JD Cloud Disk? How to select?**

A: JD Cloud Disk consists of SSD Cloud Disk and Premium Hdd Cloud Disk: the SSD Cloud Disk provides a maximum of 20000 random read-write IOPS and higher I/O performance and applies to application scenarios where high capacity and core and key business are required; the Premium Hdd Cloud Disk provides a maximum of 500 read-write IOPS and applies to application scenario where the data will not be frequently accessed or low I/O capacity is required.

**Q: How to attach a Cloud Disk Service to a Virtual Machines?**

A: **Take Centos operating system as an example, the procedures for attaching can refer to instructions as below:**

1) After attaching on the console, you can see a non-partitioned and unformatted disk in Virtual Machines. You can view the currently attached disk by the following command

fdisk -l

![faq_mount_001](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_001.png)


2) You can complete the partition by the following command /dev/vdb and please modify it to the disk to be partitioned

fdisk   /dev/vdb

![faq_mount_002](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_002.png)

After entering the command, enter n, p and 1 in turn, press enter key twice and then enter wq; complete and save it. After that, when viewing through fdisk -l once again, you can see the new partition /dev/vdb1

Note: if the hard disk capacity created is greater than 2T, do not partition it or refer to the following procedures to use parted partition:

![faq_mount_003](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_003.png)

![faq_mount_004](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_004.jpg)

3) Then you need to use the following command to format the partitioned hard disk

mkfs -t ext4 /dev/vdb1

![faq_mount_005](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_005.png)


4) Create the vdb1 catalog under mnt catalog and attach the disk to this catalog for convenience of management

mkdir -p /mnt/vdb1 && mount -t ext4 /dev/vdb1 /mnt/vdb1

5) View UUID of the disk

blkid /dev/vdb1

![faq_mount_006](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_006.png)

Write /etc/fstab file to realize automatic attachment of Cloud Disk Service

**Note: if the system is Centos 7 or higher, you must use nofail parameter when writing fstab.**

**Take Windows Server 2012 R2 standard version operating system for example, the procedures for loading can refer to instructions as below:**

Take Windows Server 2012 R2 standard version operating system for example, the procedures for partitioning, formatting and creating file system can refer to instructions as below:

1) After logging in Windows machine, right click the **Start** at bottom left corner and select **Disk Management** in the pop-up menu; select the disk partition form in the disk management window and then click **OK**;

![faq_mount_007](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_007.jpg)

2) Select the non-partitioned disk and right click **New Simple Volume**;

![faq_mount_008](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_008.jpg)

3) Click **Next** on the pop-up **New Simple Volume Wizard** window;

![faq_mount_009](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_009.png)

4) Assign the volume size;

![faq_mount_010](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_010.jpg)

5) Set disk drive number;

![faq_mount_011](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_011.jpg)


6) Format disk partition;

![faq_mount_012](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_012.jpg)

7) After confirming the selected configuration, click **Complete** button to finish the new volume wizard; or click "Last Step” to return to modify the selected setting.


![faq_mount_013](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_013.jpg)

8) After completing the above setting, you can view the new Cloud Disk Service in the **My Computer** page;

![faq_mount_014](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/faq_mount_014.png)






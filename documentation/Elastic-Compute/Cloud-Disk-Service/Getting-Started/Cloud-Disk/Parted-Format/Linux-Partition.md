# Linux partitioning, formatting and creating file system

<br>


## Manually complete partitioning, formatting and attaching of data disk

If you need to manually partition, format and create file system, we take Centos operating system for example as an instruction as below:

1. After attaching on the console, you can see a non-partitioned, formatted disk in Virtual Machines. You can view the disk partition information by the following command:

```
fdisk -l
```

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_001.png)

2. You can complete the partition by the following command /dev/vdb and please modify it to the device name to be partitioned

```
fdisk /dev/vdb

```

After entering the command, enter n, p and 1 in turn, press enter key twice and then enter wq; complete and save it. After that, when viewing through fdisk -l once again, you can see the new partition /dev/vdb1


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_002.png)

Note: If the hard disk capacity created is greater than 2T, do not partition it or refer to the below procedures to use parted partition:

1) Create partition table and select GPT format:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_003.png)

2) Create partition

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_004.jpg)

3) Run fdisk -l command again to confirm partition

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_005.jpg)

3. Then you need to use the following command to format the partitioned hard disk

```
mkfs -t ext4 /dev/vdb1
```
Warning: This command will format and delete vdb1 device disk. If there is any existing data in this disk, do not use this command.


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_006.png)


Note: This example created an ext4 formatted file system; you can also select to create other file systems. To guarantee the completeness and availability of data to the extent of file system, it is not recommended to use formats not providing jounral mechanism, such as ext2.

4. Create the vdb1 catalog under mnt catalog and attach the disk to this catalog for convenience of management


```
mkdir -p /mnt/vdb1 && mount -t ext4 /dev/vdb1 /mnt/vdb1
```

5. View UUID of the disk

```
blkid /dev/vdb1
```
6. Replace the following codes with searched UUID and attaching target location. Namely, once the /etc/fstab file is written, the Cloud Disk Service will be automatically attached when the Virtual Machines are started at next time

```
echo "UUID="Replace contents here with UUID searched in step 5"             /mnt/vdb1                 ext4    defaults,nofail        0 0" >> /etc/fstab
```
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/parted-format/parted_007.png)


**Note: If the system is Centos 7 or higher, you must use nofail parameter when writing fstab; if a private image is produced for current Virtual Machines, the new virtual machine created based on this private image will be unable to normally start.**


# File System Expansion (Linux)

After the Cloud Disk Console completes the expansion operation and attaches the Cloud Disk, it needs to log in Virtual Machines to expand the file system before continuous use. Refer to "[Cloud Disk Upgrade Capacity](https://docs.jdcloud.com/en/cloud-disk-service/disk-expand)" for expansion operation of Cloud Disk on the Console

Please refer to the document of "[Expansion File System (Multiple Partitions) (https://docs.jdcloud.com/en/cloud-disk-service/expand-file-system-multi-partition)" for partition if your Cloud Disk Service has partitions. Please follow the steps below for file system expansion if you create the file system directly on your Cloud Disk Service.

**Note: Please backup data before expansion and data backup can be made by creating snapshot of this Cloud Disk Service. Take measures to prevent data loss due to maloperation and other factors.**

Take CentOS operating system as an example, suppose that the original size of Cloud Disk Service to be expanded is 20GB, and it has been expanded to 50GB in the Console and remounted. File System expansion operations are as follows (root permission required). Before operation, please confirm cloud disk or file system for partition by executing `lsblk -f` first and then make corresponding expansion operation:

## Expansion of XFS File System

1. Use `df -h` command to verify the size of file system of volume to be expanded. As shown in figure below, the original size of /dev/vdc to be expanded is 20GB:

   ![expand_df](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/expand_df.PNG)

2. Enter `lsblk` command to check Device Name:

   `lsblk`

   ![lsblk](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/lsblk.PNG)

3. Use `xfs_growfs` command to expand the file system, such as the device is currently mounted on /mnt:

   `sudo xfs_growfs -d /mnt`

   ![growfs](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/growfs.PNG)

   

4. (Optional) After completion of execution, it may execute `df -h` command again to verify the size of expanded volume.

   ![df_aga](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/df_aga.PNG)

## Expansion of ext2, ext3 or ext4 file systems

1. After confirming that the Cloud Disk has been expanded in the Console and attached to the Virtual Machines, reboot Virtual Machines on the Console.

   ![vm_restart](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/vm_restart.png)

2. Log in Virtual Machines after reboot, enter `lsblk` command to check Device Name:

   `lsblk`

   ![lsblk_ext4](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/lsblk_ext4.PNG)

3. Use `e2fsck` command to check the file system:

   `e2fsck -f /dev/vde`

   ![e2fsck_ext4](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/e2fsck_ext4.PNG)

4. Use resize2fs command to expand the file system, such as expansion of the file system of /dev/vde device:

   `sudo resize2fs /dev/vde`

   ![resize2fs_ext4](../../../../../../image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/resize2fs_ext4.PNG)

5. After successful mount, run `df -h` command to verify whether mount is successful.



# File system expansion (multi partition)

<br>

## Cloud disk of Windows system multi partition expansion

Take Windows Server 2012 R2 standard version 64-bit for example, to expand the cloud disk attached to a VM from 20G to 40G.

1. Open Windows server manager to access the disk management page:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/expand_multipart_001.jpg)


2. Right click on the partition requiring expansion and then select extend volume and expand it as per the wizard.


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/expand_multipart_002.jpg)

**Cloud disk of Linux system multi partition expansion**

Take CentOS 7.2 64-bit for example, to expand the cloud disk attached to a VM from 40G to 50G.

**Note: Before the expansion action, please ensure the partition to be expanded is in detaching status. Refer to File System Expansion (Linux) for the execution procedures**.

1. Execute fdisk /dev/vdc (please replace vdc with the disk device name to be expanded). Delete the disk partition requiring expansion and then execute disk partition again.



![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/expand_multipart_003.jpg)


2. For assigned disk partition, execute e2fsck and resize2fs actions to complete the file system expansion:


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/expand_multipart_004.jpg)

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/expand_multipart_005.jpg)



	
	



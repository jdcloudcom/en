# Raw disk file system expansion (Linux)

<br>

If a hard disk has not been executed partition action, you can refer to the below method to directly expand the disk file system:

1. Complete cloud disk [Upgrade Capacity](https://www.jdcloud.com/help/detail/508/isCatalog/1) action on console;

2. Execute [Attach Cloud Disk](https://www.jdcloud.com/help/detail/505/isCatalog/1) and ensure cloud disk is in "attached” status;

3. Use fdisk -l to view the hard disk partition information;


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/epand_bare_001.jpg)

4. Use df -h to view attach information;



![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/epand_bare_002.jpg)


5. Execute umount action to cancel attach;




![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/epand_bare_003.jpg)

6. Execute e2fsck -f /dev/vdb to detect correctness of file system;




![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/epand_bare_004.jpg)


7. Execute resize2fs /dev/vdb to redefine size of file system;




![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/epand_bare_005.jpg)


8. Execute mount /dev/vdb /mnt to reattach disk and you can see the disk has been expanded.




![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/epand_bare_006.jpg)

	




	
	



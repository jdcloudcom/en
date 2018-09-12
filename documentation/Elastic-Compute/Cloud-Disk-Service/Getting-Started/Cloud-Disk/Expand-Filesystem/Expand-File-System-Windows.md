# File system expansion (Windows)

<br>

Take windows Server R2 2008 standard version for example, assume that there is a 320GB hard disk attaching to a virtual machine and now we need to expand it to 330GB. Specific procedures are as below:

1. Open Windows server manager to access the disk management page and find the disk requiring expansion action:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/windows_expand_001.jpg)

2. Right click the disk space requiring expansion action and select "Extend Volume” in the pop-up menu:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/windows_expand_002.jpg)


3. Select the newly added disk space in the pop-up extend volume wizard and then click “Next":

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/windows_expand_003.jpg)

4. Confirm the newly added disk space size and then click "Complete” button to finish the file system expansion action:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/windows_expand_004.jpg)

5. Return to Server Manager ->Disk Management page to confirm file system is expanded:


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/windows_expand_005.jpg)







	
	



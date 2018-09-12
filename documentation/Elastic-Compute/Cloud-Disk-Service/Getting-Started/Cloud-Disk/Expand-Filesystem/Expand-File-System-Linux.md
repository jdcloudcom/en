# File system expansion (Linux)

<br>

Take CentOS operating system for example, assume that there is a 42.9GB hard disk attaching to a machine and the partition is “/dev/vdb1”, file system format is “ext4”, attach location is “/home/test”; now we need to expand it to 53.7GB. Specific procedures are as below (need root authority):

**Note: Back up the data before expansion to prevent the data from losing due to misoperation and other factors**.

1. Detach the hard disk from the VM on the console and attach to the VM after completing the cloud disk expansion action.

2. View Environment

1) Use fdisk -l to view the hard disk partition information

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/linux_expand_001.png)

2) You can see the /dev/vdb disk capacity is 53.7GB and there is a partition /dev/vdb1; use fdisk -l /dev/vdb1 to view the partition capacity and you can see the /dev/vdb1 capacity is 42.9GB


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/linux_expand_002.png)

3) Use df -h to view the file system and you can see the attach point is /home/test with size of 40GB



![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/linux_expand_003.png)

3. Begin to expand partition /dev/vdb1

1) Detach file system

```
umount /home/test
```

2) Expand partition capacity. Here take fdisk for example or you may use parted for expansion. But you may not mix up these two commands together since it will lead to inconsistency of start sector.

```
fdisk /dev/vdb
```

Enter p, d, n, p and 1 in turn, enter press enter key twice and enter wq

p: Print out partition information

d: Delete partition

n: Create partition

p: Type of newly created partition is main partition

1: Partition number is 1

wq: Save and exit

**Note: Please ensure your actions are correct before saving; in case of any misoperation, you can enter q and exit without bringing the previous actions into effect.**


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/linux_expand_004.png)

3) View partition capacity after expansion

```
fdisk -l /dev/vdb1
```




![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/linux_expand_005.png)


The partition capacity has been expanded to 53.7GB. However, the file system is still the original size. The below two commands can make the file system extend to a size matching the partition.

4) Detect correctness of file system

```
e2fsck -f /dev/vdb1
```





![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/linux_expand_006.png)


5) Redefine size of file system

```
resize2fs /dev/vdb1
```



![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/linux_expand_007.png)

6) mount /dev/vdb1 /home/test to attach the expanded file system to attach point /home/test

7) View size of file system

```
df -h /dev/vdb1
```


![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/expand-filesystem/linux_expand_008.png)

You can see the file system has been extended.

	
	



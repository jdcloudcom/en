# Problems When Linux System Creates Cloud Disk with Snapshot



Use the cloud disk snapshot to purchase the created cloud disk. If the created disk space is set to be larger than the original disk space, the default space is the same as the original. The uuid is the same, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E9%80%9A%E8%BF%87%E5%BF%AB%E7%85%A7%E5%88%9B%E5%BB%BA%E4%BA%91%E7%A1%AC%E7%9B%98%E9%97%AE%E9%A2%9801.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E9%80%9A%E8%BF%87%E5%BF%AB%E7%85%A7%E5%88%9B%E5%BB%BA%E4%BA%91%E7%A1%AC%E7%9B%98%E9%97%AE%E9%A2%9802.png)

The new disk needs to be expanded into the space of created space. Take the new disk /dev/vdd as an example.

1. Detach New Cloud Disk

*umount /dev/vdd*

2. Repartition the Disk.

*fdisk /dev/vdd*

Type p d n p 1 in turn, press Enter twice, and wq


p: Print partition information

d: Delete the partition

n: New partition

p: Type of the new partition is the main partition

1: Partition number is 1

wq: save and exit

**Note: Please make sure that your operation is correct before saving. If you find that there is a mistake, you can type q to exit directly, and the previous operation will be invalid.**

3. Perform file expansion on the new disk. Execute:

*e2fsck -f /dev/vdd1*

*resize2fs /dev/vdd1*

After attaching mount /dev/vdd1, df -h to check the disk size is normal.

If your problem still can not solved, please submit open ticket to us.

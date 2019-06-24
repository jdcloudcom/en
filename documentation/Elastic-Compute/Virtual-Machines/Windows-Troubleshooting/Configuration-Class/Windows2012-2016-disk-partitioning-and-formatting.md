# Windows 2012 Disk Partition and Formatting
Note: Disk partitioning and formatting are high-risk behaviors, please operate with caution. The following operations are for newly purchased data disks. If it involves the processing of the original data disk, make sure to create a snapshot for the data disk of the Virtual Machines to avoid possible data loss.

**The data disk just purchased, by default, is not partitioned and formatted. You can refer to the following methods to initially configure it:**

1. Right click in the lower left corner and select Disk Management. Select MBR (Master Boot Record) and confirm.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9601.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9602.png)

2. Right-click **New Simple Volume** on the blank partition.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9603.png)

3. It comes to next step by default.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9604.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9605.png)

4. Select the drive of the data disk attach and it comes to next step by default.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9606.png)

5. Select NTFS as the file system and tick the box to perform quick format.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9607.png)

6. Click **Finish**, and the system will automatically form a new partition. The drive to which the data disk is attached is formatted.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9608.png)

If your problem still can not solved, please submit open ticket to us.

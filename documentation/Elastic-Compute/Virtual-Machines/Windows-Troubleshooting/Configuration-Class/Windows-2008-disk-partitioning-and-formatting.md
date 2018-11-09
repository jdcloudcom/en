# Windows 2008 Disk Partition and Formatting
Note: Disk partitioning and formatting are high-risk behaviors, please operate with caution. The following operations are for newly purchased data disks. If it involves the processing of the original data disk, make sure to create a snapshot for the data disk of the Virtual Machines to avoid possible data loss.



**The data disk just purchased, by default, is not partitioned and formatted. You can refer to the following methods to initially configure it:**

1. Click Server Manager in the lower left corner.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9601.png)

2. Select **Storage** - **Disk Management**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9602.png)

3. Right click the data disk (disk 1) and select Initialize Disk. Select MBR (Master Boot Record) and confirm.

Note: If the data disk displays "Offline" at this time, you need to right click "Online" on Disk 1 before subsequent operation.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9603.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9604.png)

4. Right click to **Create Simple Volume** on the blank partition.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9605.png)

5. Next by default.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9606.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9607.png)

6. Select the drive to which the data disk is attached, and click Next.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9608.png)

7. Select the file system as NTFS and tick to perform quick format.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9609.png)

8. Click **Finish**, and the system will automatically form a new partition. The drive to which the data disk is attached is formatted.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E7%A3%81%E7%9B%98%E5%88%86%E5%8C%BA%E5%92%8C%E6%A0%BC%E5%BC%8F%E5%8C%9610.png)

If your problem still can not solved, please submit open ticket to us.

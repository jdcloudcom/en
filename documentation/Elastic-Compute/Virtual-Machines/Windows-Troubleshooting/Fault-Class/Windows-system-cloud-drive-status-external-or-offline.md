# External or Offline Status of Windows System Cloud Disk
**Problem Phenomenon:**

It can be seen that the Cloud Disk is in external or offline status in [Disk Management] of the computer. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E4%BA%91%E7%A1%AC%E7%9B%98%E7%8A%B6%E6%80%81%E5%A4%96%E9%83%A8%E6%88%96%E8%84%B1%E6%9C%BA01.png)

**Solution:**

1. If the cloud disk is an external disk, right click the disk block to select import external disk, and then click **OK**. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E4%BA%91%E7%A1%AC%E7%9B%98%E7%8A%B6%E6%80%81%E5%A4%96%E9%83%A8%E6%88%96%E8%84%B1%E6%9C%BA02.png)

2. If the disk is in offline status, right click the disk block and select [Online]. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E4%BA%91%E7%A1%AC%E7%9B%98%E7%8A%B6%E6%80%81%E5%A4%96%E9%83%A8%E6%88%96%E8%84%B1%E6%9C%BA03.png)

Note: If **Online** is selected, it will prompt as follows:

The disk is offline since it has a signature collision with another online disk.

The problem indicates that Windows has an exception during the auto attach process. Take the disk offline then online. Windows attempts to regenerate the signature of the disk during the online process.



If your problem still can not solved, please submit open ticket to us.

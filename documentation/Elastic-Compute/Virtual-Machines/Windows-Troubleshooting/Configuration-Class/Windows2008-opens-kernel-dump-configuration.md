# Enable Kernel Dump in Windows 2008
Windows does not have Core Dump enabled by default. In some special cases, such as blue screen, stuck, hang, black screen, etc., Core Dump needs to be used to locate the root cause of the problem more quickly for targeted processing.



There are 2 ways to configure it, as mentioned in the official Microsoft KB:



How to generate a kernel or full memory dump file in Windows Server 2008 and Windows Server 2008 R2:

https://support.microsoft.com/zh-cn/kb/969028

Troubleshoot “blue screen” or Stop error problems before you contact：

https://support.microsoft.com/kb/3106831



We recommend that you use the manual configuration tool, and to prevent system startup failure and possible data loss caused by configuration problems, please make sure to create an image of the system disk and make a snapshot and backup of the data disk before performing the configuration.

**Manual Configuration (Applicable to All Versions of Windows Machines)**

1. Right click **Computer** and select **Properties**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/windows2008%E5%BC%80%E5%90%AF%E5%86%85%E6%A0%B8%E8%BD%AC%E5%82%A8%E9%85%8D%E7%BD%AE01.png)

2. Select **Advanced System Settings**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/windows2008%E5%BC%80%E5%90%AF%E5%86%85%E6%A0%B8%E8%BD%AC%E5%82%A8%E9%85%8D%E7%BD%AE02.png)

3. Successively choose **Advanced**, **Performance** and **Settings** in the System Properties.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/windows2008%E5%BC%80%E5%90%AF%E5%86%85%E6%A0%B8%E8%BD%AC%E5%82%A8%E9%85%8D%E7%BD%AE03.png)

4. Successively choose **Advanced**, **Virtual Memory** and **Change** in Performance option.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/windows2008%E5%BC%80%E5%90%AF%E5%86%85%E6%A0%B8%E8%BD%AC%E5%82%A8%E9%85%8D%E7%BD%AE04.png)

5. Select the custom size of paging files of all drives, which is recommended to set as "System Memory Size +1 MB", or the file size under the system management to achieve the optimized system allocation of paging files. Meanwhile, make sure that the system disk has enough free space to store paging files and the follow-up Dump files.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/windows2008%E5%BC%80%E5%90%AF%E5%86%85%E6%A0%B8%E8%BD%AC%E5%82%A8%E9%85%8D%E7%BD%AE05.png)

6. Select **System Properties** > **Advanced** > **Startup and Recovery** > **Settings**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/windows2008%E5%BC%80%E5%90%AF%E5%86%85%E6%A0%B8%E8%BD%AC%E5%82%A8%E9%85%8D%E7%BD%AE06.png)

7. Write debugging information and select the core memory dump. Dump files are saved at C:\MEMORY.DMP by default.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/windows2008%E5%BC%80%E5%90%AF%E5%86%85%E6%A0%B8%E8%BD%AC%E5%82%A8%E9%85%8D%E7%BD%AE07.png)

Note: If there is not enough space in disk C, it is recommended to place dump files in the another disk, such as D:\memory.dmp.



If your problem still can not solved, please submit open ticket to us.

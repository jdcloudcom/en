# Windows 2008 Server Manager Refreshing 0x80070422 Error 
**Problem Phenomenon:**

Windows Server Manager fails to refresh, and the error prompts as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E6%9C%8D%E5%8A%A1%E5%99%A8%E7%AE%A1%E7%90%86%E5%99%A8%E5%88%B7%E6%96%B0%E6%8A%A50x80070422%E9%94%99%E8%AF%AF01.png)

**Problem Causes:**

It is resulted from the disabled server of Windows Modules Installer.



**Solution:**

Login the server, click **Start** -> **Run** on the bottom left of the desktop, and enter services.msc to open the service.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E6%9C%8D%E5%8A%A1%E5%99%A8%E7%AE%A1%E7%90%86%E5%99%A8%E5%88%B7%E6%96%B0%E6%8A%A50x80070422%E9%94%99%E8%AF%AF02.png)

Find the Windows Modules Installer service and right click to select **Start**;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E6%9C%8D%E5%8A%A1%E5%99%A8%E7%AE%A1%E7%90%86%E5%99%A8%E5%88%B7%E6%96%B0%E6%8A%A50x80070422%E9%94%99%E8%AF%AF03.png)

Then open **Server Manager** again and it will be normal.



If your problem still can not solved, please submit open ticket to us.

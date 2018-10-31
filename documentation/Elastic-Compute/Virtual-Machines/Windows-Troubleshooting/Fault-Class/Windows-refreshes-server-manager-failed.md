# Windows Server Manager Failed to Refresh
**Problem Phenomenon:**

Windows 2008 Server Manager failed to refresh, an error of 0x80070442 prompts, as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E5%88%B7%E6%96%B0%E6%9C%8D%E5%8A%A1%E5%99%A8%E7%AE%A1%E7%90%86%E5%99%A8%E5%A4%B1%E8%B4%A501.png)

**Problem Causes:**

It is resulted from the disabled server of Windows Modules Installer.

 

**Solution:**

Login the server, click **Start** -> **Run** on the bottom left of the desktop, and enter services.msc to open the service.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E5%88%B7%E6%96%B0%E6%9C%8D%E5%8A%A1%E5%99%A8%E7%AE%A1%E7%90%86%E5%99%A8%E5%A4%B1%E8%B4%A502.png)

Find the Windows Modules Installer service and right click to select **Start**;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E5%88%B7%E6%96%B0%E6%9C%8D%E5%8A%A1%E5%99%A8%E7%AE%A1%E7%90%86%E5%99%A8%E5%A4%B1%E8%B4%A503.png)

Then open **Server Manager** again and it will be normal.

# FTP Error 451 Processing Method
**Error Description**

When uploading a folder or file with the FTP server built by Windows Server IIS, if the name of folders or files consists of both Chinese and English, the following error will prompt:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/FTP%E6%8A%A5Error%20code%20451%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9501.png)

**Processing Steps**

1. Click the red box in the taskbar at left bottom to launch **Server Manager**, click **Tool** in the upper right corner of the red box to select **IIS Manager**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/FTP%E6%8A%A5Error%20code%20451%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9502.png)

2. Select the FTP site by levels on the left side of **IIS Manager** on the website page and click **Advanced Settings** in the red box on the right.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/FTP%E6%8A%A5Error%20code%20451%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9503.png)

3. Change the status of "Allow UTF8" from "True" to "False" and click **OK**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/FTP%E6%8A%A5Error%20code%20451%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9504.png)

4. Click **Reboot** in the red box on the right to reboot the server, and thus the problem can be solved.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/FTP%E6%8A%A5Error%20code%20451%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9505.png)

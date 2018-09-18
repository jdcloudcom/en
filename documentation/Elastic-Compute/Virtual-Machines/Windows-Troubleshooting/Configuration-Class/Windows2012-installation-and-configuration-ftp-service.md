# Windows 2012 FTP Service Installation and Configuration
Note: The Windows configuration and instructions in this article have been tested on the Windows 2012 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.

**Installation**

1. Select **Server Manager** in the lower left corner. Click **Management** to add roles and functions.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A101.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A102.png)

2. It comes to next step by default. When selecting the role of server, tick **Web server (IIS)** and select **Add**, and then proceed to next step.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A103.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A104.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A105.png)

3. It comes to next step by default. When selecting the role of server, click **FTP Server** > **FTP Service** in role service and select **Next** to install.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A106.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A107.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A108.png)

**Configuration**

1. Select **Tool** > **Internet Information Services (IIS) Manager** in **Server Manager**.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A109.png)

2. Right click on the left column in the website and select **Add FTP Sites**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A110.png)

3. Set the FTP site name and the  physical path of FTP content directory.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A111.png)

4. Set the FTP default port as 21 and select [No SSL].
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A112.png)

5. Select **Basic** for authentication, set **Specific User** in **Access Allowed**, fill in the FTP username and add read/write access.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A113.png)

6. Click **Server Manager** and select **Computer Management** in **Tool**.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A114.png)

7. Right click **Users** in **Local Users and Groups** and select **New User**. Create an FTP user and set a password.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A115.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A116.png)

8. Right click on the FTP content directory and select **Properties**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A117.png)

9. Choose **Security** > **Edit** > **Add**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A118.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A119.png)

10. Select **Advanced** to search and then select **FTP User**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A120.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A121.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A122.png)

11. Add read/write access for the FTP user.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A123.png)

**Firewall Configuration**

1. Click **Start** in the left corner at the bottom and click **Control Panel**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A124.png)

2. Select Windows Firewall, Advanced Settings.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A125.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A126.png)

3. Select the **Inbound Rules** on the left and select **New Rule** on the right.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A127.png)

4. Select **Port**, enter the default port 21 of FTP service, select **Connection Allowed**, and enter the rule name to finish.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A128.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A129.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A130.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A131.png)

5. Select [Windows Firewall] in [Control Panel] to allow applications or functions to pass Windows firewall.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A132.png)

6. Select **Allow Other Applications** to browse.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A133.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A134.png)

7. Double click "C:\Windows\System32\svchost.exe" and select **Add**.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A135.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A136.png)

Then, the ftp service and firewall are configured.



If your problem still can not solved, please submit open ticket to us.


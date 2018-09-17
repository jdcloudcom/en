# Windows 2008 ftp Service Installation and Configuration
Note: The Windows configuration and instructions in this article have been tested on the Windows 2008 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.

**Installation**

1. Select **Server Manager** in the lower left corner. Click a role to add it.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A101.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A102.png)

2. Click Next by default and check the **Web Server (IIS)** in **Select Server Role**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A103.png)

3. Click Next by default and check the **FTP server** in the **Select Role Service**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A104.png)

4. Click Next by default and click **Install** until it is done.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A105.png)

**Configuration**

1. Select Server Manager, click the role in the left column, Web Server (IIS), and Internet Information Services (IIS) Manager. Right click the Hostname option in the middle column and select Add FTP Site.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A106.png)

2. Set the FTP site name and the physical path of the FTP content directory.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A107.png)

3. Set the FTP service port as the default port 21, and check none for ssl.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A108.png)

4. Chooce Basic in ID verification, specify the user, fill in the ftp account name, and grant read-write permission.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A109.png)

5. Choose Server Manager, Configuration, Local Users and Groups, and right click User to select New User.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A110.png)

6. Set the ftp user name and password.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A111.png)

7. Right click the ftp content directory and choose Properties.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A112.png)

8. Choose Security and Edit.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A113.png)

9. Choose Add.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A114.png)

10. Select **Advanced**, **Find It Now**, **Find ftp Account**, and select **OK**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A115.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A116.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A117.png)

11. Give the ftp account read-write permission.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A118.png)

**Firewall Configuration**

1. Click **Start** in the lower left corner and then click **Control Pane**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A119.png)

2. Double click windows Firewall and select Advanced Settings.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A120.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A121.png)

3. Select Inbound Rules in the left column and select New Rule in the right column.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A122.png)

4. Select **Port**, **Specific Local Port** and fill in 21.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A123.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A124.png)

5. Select **Allow Connection**, fill in the name, and complete it.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A125.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEftp%E6%9C%8D%E5%8A%A126.png)


Then, the ftp service and firewall are configured.

If your problem still can not solved, please submit open ticket to us.

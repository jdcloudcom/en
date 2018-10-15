# Windows Remote Connection without Authorization
The Windows server provides a free remote desktop management license for two users by default. If there are requirements for higher connection, users need to purchase and configure the corresponding certificate on Microsoft's official website.

**Problem Phenomenon:**

When the remote desktop client connects to the Windows instance, users still cannot connect to the remote system after entering a correct username and password, and the following error will appear:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E8%BF%9E%E6%8E%A5%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E6%8E%88%E6%9D%83%E8%AE%B8%E5%8F%AF%E8%AF%8101.png)

Login Windows VM through vnc function of console remote connection and open the RD authorization diagnostic program and the following error appears:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E8%BF%9E%E6%8E%A5%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E6%8E%88%E6%9D%83%E8%AE%B8%E5%8F%AF%E8%AF%8102.png)

**Problem Analysis:**


There are two potential reasons:

● Logged by Others

The account might be logged by others. Since the terminal service configuration RDP-Tcp restricts the access that each user can only have one session, other sessions cannot be established.



● The remote desktop session host role is installed.

It might be caused by the remote desktop session host roles installed in the system. The function is free for the first 120 days, and shall be paid after the free period. If renewal is not paid, the remote connection is unavailable.

The Windows server provides a free remote desktop management license for two users by default in normal condition. If there are higher  requirements for connectivity, the remote desktop session host server role shall be configured. Users can use more remote desktop management concurrency only after corresponding authorizations are purchased and configured.

On the other hand, the two default free connection authorizations will be canceled as well after the remote desktop session host role is configured. Therefore, when the relevant authorization is not properly configured, the remote desktop cannot be connected and the above errors will prompt.



**Solution: **

● Logged by Others

Each user can have more than one session by cancelling RDP-Tcp:

1. Login Windows VM via vnc function for console remote connection. Select **Start** > **Control Panel** > **Management Tool** > **Server Manager**.

2. Double-Click **Remote Desktop Session Host Configuration] on the [Remote Desktop Services] page.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E8%BF%9E%E6%8E%A5%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E6%8E%88%E6%9D%83%E8%AE%B8%E5%8F%AF%E8%AF%8103.png)

3. Set [No] in the option for limiting each user to have only one session in the pop-up window and reconnect.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E8%BF%9E%E6%8E%A5%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E6%8E%88%E6%9D%83%E8%AE%B8%E5%8F%AF%E8%AF%8104.png)

● The remote desktop session host role is installed.

There are two solutions for the failure of the remote desktop session host installation:

**Method 1**

Purchase and configure the appropriate certificate on Microsoft's website after configuring the remote desktop session host server. Please see the official Microsoft documents for related operations.



**Method 2**

Delete remote desktop session host role and use the two default free connection authorizations. See the following sections to configure different versions of the server:




**Windows 2012 System Operation Methods**

1. Login Windows VM via vnc function for console remote connection.

2. Select **Start** > **Control Panel** > **Management Tool** > **Server Manager**.

3. Select **Manage**> **Delete Role** in the upper right corner of the page.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E8%BF%9E%E6%8E%A5%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E6%8E%88%E6%9D%83%E8%AE%B8%E5%8F%AF%E8%AF%8105.png)

4. Click **Next** in the **Delete Functions and Roles** window, and then click **Next**.

5. In the third step of the wizard, uncheck remote desktop services, and remain default configurations for other options.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E8%BF%9E%E6%8E%A5%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E6%8E%88%E6%9D%83%E8%AE%B8%E5%8F%AF%E8%AF%8106.png)

6. Reboot the server after the above operations are completed.



**Windows 2008 System Operation Methods**

1. Login Windows VM via vnc function for console remote connection. Select **Start** > **Control Panel** > **Management Tool** > **Server Manager**.

2. Right click **Remote Desktop Services** and select **Delete Role Services** in the **Server Manager** window.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E8%BF%9E%E6%8E%A5%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E6%8E%88%E6%9D%83%E8%AE%B8%E5%8F%AF%E8%AF%8107.png)

3. Uncheck **Remote Desktop Session Host** in the pop-up window, and click **Next** until it is complete.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%BF%9C%E7%A8%8B%E8%BF%9E%E6%8E%A5%E6%8F%90%E7%A4%BA%E6%B2%A1%E6%9C%89%E6%8E%88%E6%9D%83%E8%AE%B8%E5%8F%AF%E8%AF%8108.png)

4. Reboot the server after the above operations are completed.



If your problem still can not solved, please submit open ticket to us.

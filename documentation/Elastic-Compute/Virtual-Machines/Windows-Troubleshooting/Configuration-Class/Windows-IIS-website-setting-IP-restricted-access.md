# Set IP to Limit Access to Windows IIS Website
If a website built with Windows IIS encounters a malicious IP attack, the website service may become abnormal. In this case, the IP restriction function in the security module of IIS can be used to prohibit malicious IP from accessing the website. The setting steps are as follows:

1. Click the Tools menu (red box) in the upper right corner of the server manager panel dashboard page, select IIS Manager, and start the IIS management interface.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20IIS%E7%BD%91%E7%AB%99%E8%AE%BE%E7%BD%AEIP%E9%99%90%E5%88%B6%E8%AE%BF%E9%97%AE01.png)

2. Select the website to be set step by step in the left sidebar, modify the grouping basis in the red box as the category, and select **IP address and domain restriction** in the security.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20IIS%E7%BD%91%E7%AB%99%E8%AE%BE%E7%BD%AEIP%E9%99%90%E5%88%B6%E8%AE%BF%E9%97%AE02.png)

Note: **IP address and domain restriction** function needs to be checked when IIS components are installed. If it is not checked, this function cannot be used. If the icon is not found in the security category, it indicates that the component is not installed in the system. Please follow the steps below to install it:

1) Click **Start Server Manager Panel** in the red box on the left side of the taskbar, then click **Add Roles and Function** (blue box) in the dashboard to launch the **Add Roles and Functional Wizard**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20IIS%E7%BD%91%E7%AB%99%E8%AE%BE%E7%BD%AEIP%E9%99%90%E5%88%B6%E8%AE%BF%E9%97%AE03.png)

2) Click **Next** until the server role step, select Web Server (IIS) -->Web Server -->security, check **IP Address and Domain Restriction**, click **Next** until the confirmation page, and then click **Install**. After confirming that the installation is complete, close the Add Roles and Functional Wizard. Then, restart IIS Manager and the "IP Address and Domain Restriction" icon will be displayed on the website function page.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20IIS%E7%BD%91%E7%AB%99%E8%AE%BE%E7%BD%AEIP%E9%99%90%E5%88%B6%E8%AE%BF%E9%97%AE04.png)

3. On the "IP Address and Domain Restriction" page, click **Add Rejected Item** in the right operation bar to edit the rejected IP address.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20IIS%E7%BD%91%E7%AB%99%E8%AE%BE%E7%BD%AEIP%E9%99%90%E5%88%B6%E8%AE%BF%E9%97%AE05.png)

4. To deny the access by a single IP, check the specific IP address, enter the IP address in the blank field and click **OK**.

5. To deny the access by an IP segment, check the IP address range, enter the fixed part of the IP segment in the first blank field, replace the change with 0 as shown in the figure below, and enter the mask in the second blank to specify the range of IP segment. Click **OK** when you're done.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20IIS%E7%BD%91%E7%AB%99%E8%AE%BE%E7%BD%AEIP%E9%99%90%E5%88%B6%E8%AE%BF%E9%97%AE06.png)

6. After an item is successfully added, you can see the content of the item on the "IP Address and Domain Restriction" page. Note that the content cannot be modified after the item is added. You can only delete it by selecting it and clicking **Delete** in the right operation bar.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20IIS%E7%BD%91%E7%AB%99%E8%AE%BE%E7%BD%AEIP%E9%99%90%E5%88%B6%E8%AE%BF%E9%97%AE07.png)

# Windows 2008 Disk Management Not Found in Computer Management
**Problem Phenomenon:**

Disk management cannot be found in the computer management of Windows 2008 server, so users cannot manage the disk.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%AE%A1%E7%90%86%E6%89%BE%E4%B8%8D%E5%88%B0%E7%A3%81%E7%9B%98%E7%AE%A1%E7%90%86%E7%9A%84%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9501.png)

**Problem Causes:**

Generally, it is caused by the disabled disk management service in the system group policy.

**Solution:**

1. Click **Start** -**Run** and enter *gpedit.msc* to open **Group Policy**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%AE%A1%E7%90%86%E6%89%BE%E4%B8%8D%E5%88%B0%E7%A3%81%E7%9B%98%E7%AE%A1%E7%90%86%E7%9A%84%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9502.png)

2. Click **Local Computer Policy** → **User Configuration** → **Administrative Templates** → **Windows Components** → **Microsoft Management Console** →**Restricted / Licensed Management Unit** in sequence, and double-Click **Disk Management**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%AE%A1%E7%90%86%E6%89%BE%E4%B8%8D%E5%88%B0%E7%A3%81%E7%9B%98%E7%AE%A1%E7%90%86%E7%9A%84%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9503.png)

3. Click **Not Configured** → **OK**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%AE%A1%E7%90%86%E6%89%BE%E4%B8%8D%E5%88%B0%E7%A3%81%E7%9B%98%E7%AE%A1%E7%90%86%E7%9A%84%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9504.png)

4. Open a command prompt and execute *gpupdate* to update the group policy.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E8%AE%A1%E7%AE%97%E6%9C%BA%E7%AE%A1%E7%90%86%E6%89%BE%E4%B8%8D%E5%88%B0%E7%A3%81%E7%9B%98%E7%AE%A1%E7%90%86%E7%9A%84%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9505.png)

If your problem still can not solved, please submit open ticket to us.

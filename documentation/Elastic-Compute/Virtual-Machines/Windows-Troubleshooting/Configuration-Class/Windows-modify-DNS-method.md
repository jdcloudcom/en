# Method to Modify DNS in Windows

**Problem Description:**

How to modify DNS in Windows system.

**Solution:**

DNS is automatically obtained by default at Windows system server. If the user wants to use his configured DNS or dDNS of public network for resolution, you can modify the DNS of the server by referring to the following method:

1. Open **Network and Sharing Center**;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BF%AE%E6%94%B9DNS%E7%9A%84%E6%96%B9%E6%B3%9501.png)

2. Select **Change Adapter Settings**;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BF%AE%E6%94%B9DNS%E7%9A%84%E6%96%B9%E6%B3%9502.png)

3. Select network interface and right click to select **Properties**;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BF%AE%E6%94%B9DNS%E7%9A%84%E6%96%B9%E6%B3%9503.png)

4. Double click **Intrtnet Protocol Version 4 (TCP/IPV4)**, enter the DNS address to be used under the tab that appears. You can use DNS of the public network 114.114.114.114 and 114.114.115.115, or change to other public network DNS you want to use.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BF%AE%E6%94%B9DNS%E7%9A%84%E6%96%B9%E6%B3%9504.png)


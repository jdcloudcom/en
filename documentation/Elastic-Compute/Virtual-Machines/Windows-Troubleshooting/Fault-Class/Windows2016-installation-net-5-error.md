# Windows 2016 .net3.5 Installation Error
**Problem Phenomenon:**

.net3.5 fails to be installed by default, prompting that the source file cannot be found. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2016%E5%AE%89%E8%A3%85.net3.5%E6%8A%A5%E9%94%9901.png)

**Problem Causes:**

It is because that Windows update service is not running.



**Solution:**

Click [Start] and execute services.msc, and press [Enter] to find the windows update service. The status is disabled by default, and change it as [Manual] and enable it. Install the .net3.5 component online, and disable the windows update service as per demand after the installation is complete.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2016%E5%AE%89%E8%A3%85.net3.5%E6%8A%A5%E9%94%9902.png)

If your problem still can not solved, please submit open ticket to us.

# Windows Firewall Allows/ Forbids ping
Note: The Windows configuration and instructions in this article have been tested on the Windows 2012 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.

1. Click Start in the lower left corner to open the Control Panel.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%98%B2%E7%81%AB%E5%A2%99%E5%85%81%E8%AE%B8%E7%A6%81%E6%AD%A2ping01.png)

2. Select **Windows Firewall**, **Advanced Settings**.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%98%B2%E7%81%AB%E5%A2%99%E5%85%81%E8%AE%B8%E7%A6%81%E6%AD%A2ping02.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%98%B2%E7%81%AB%E5%A2%99%E5%85%81%E8%AE%B8%E7%A6%81%E6%AD%A2ping03.png)

3. Select **Inbound Rules** in the left column, and double-click in the middle column to select File and Printer Sharing (Echo Request - ICMPv4-In).
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%98%B2%E7%81%AB%E5%A2%99%E5%85%81%E8%AE%B8%E7%A6%81%E6%AD%A2ping04.png)

4. General operation is to select Allow/ Forbid Connection to Allow/ Forbid ping, and click OK to take effect.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%98%B2%E7%81%AB%E5%A2%99%E5%85%81%E8%AE%B8%E7%A6%81%E6%AD%A2ping05.png)

If your problem still can not solved, please submit open ticket to us.

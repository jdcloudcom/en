# Mac System Fails to Connect Windows 2012
**Problem Phenomenon:**

Remote Desktop Connection indicates that the remote desktop connection cannot verify the identity of the computer to be connected to, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Mac%E7%B3%BB%E7%BB%9F%E6%97%A0%E6%B3%95%E8%BF%9E%E6%8E%A5Windows2012-01.png)

**Solution:**


1. Connect to the cloud server through the Connection Management terminal.

2. Click powershell on the taskbar, enter the command gpedit.msc, then press [Enter] when the input is complete, and the [Local Group Policy Editor] will be displayed.

3. Click **Computer Configuration**->**Administrative Templates**->**Windows Components**->**Remote Desktop Service**->**Remote Desktop Session Host**->**Security**->**RDP Security Layer**, as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Mac%E7%B3%BB%E7%BB%9F%E6%97%A0%E6%B3%95%E8%BF%9E%E6%8E%A5Windows2012-02.png)

4. Double-Click **RDP Security Layer**, and the following figure will appear:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Mac%E7%B3%BB%E7%BB%9F%E6%97%A0%E6%B3%95%E8%BF%9E%E6%8E%A5Windows2012-03.png)

5. Change **Not Configured** shown in the screenshot to **Enabled**, select RDP in the security layer, and finally click **Apply** to confirm. After that, Mac system can be connected to Windows 2012 VM.



If your problem still can not solved, please submit open ticket to us.

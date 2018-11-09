# Set Not to Lock Screen of Windows System

Take the windows2012 system as an example. Connect the vnc to the virtual machine through the console and you need to enter ctrl+alt+delete to enter the system for the first login. Disconnect vnc. If you do not log in for a while, you will be prompted to enter ctrl+alt+delete after logging in vnc again. You can try to set not to lock the screen of the system in the following way.

1. Click **Start** in the lower left corner and select **Run**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%AE%BE%E7%BD%AE%E4%B8%8D%E9%94%81%E5%B1%8F01.png)

2. Enter gpedit.msc to enter the group policy configuration interface.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%AE%BE%E7%BD%AE%E4%B8%8D%E9%94%81%E5%B1%8F02.png)

3. Select **Computer Configuration** - **Management Template** - **Control Panel** - **Personalization**, and choose not to lock the screen on the right side.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%AE%BE%E7%BD%AE%E4%B8%8D%E9%94%81%E5%B1%8F03.png)

4. Select **Enabled** - **Apply**.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E8%AE%BE%E7%BD%AE%E4%B8%8D%E9%94%81%E5%B1%8F04.png)

In this way, when you exit vnc, connect to vnc again and log in, you will not enter the lock screen.



If your problem still can not solved, please submit open ticket to us.

# Windows 2012 ECN Function Disabled
Click Windows Power Shell after logging in to the server in a remote desktop and enter *netsh int tcp show global* to view the ECN function status:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%B3%BB%E7%BB%9F%E5%85%B3%E9%97%ADECN%E5%8A%9F%E8%83%BD01.png)

Enter *netsh int tcp set global ecn=disable* and press [Enter]. Then normally return to confirm messages. Enter *netsh  int  tcp  show  global* again to check that the ECN function is normally closed.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E7%B3%BB%E7%BB%9F%E5%85%B3%E9%97%ADECN%E5%8A%9F%E8%83%BD02.png)

If your problem still can not solved, please submit open ticket to us.

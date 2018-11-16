# Reset winsock Configuration in Windows

If the EIP state of the Windows VM is normal (no arrears, black holes, puppet machine, blocking, etc.) and the virtual machine security group, ACL, and system firewall have no limit on the access, the virtual machine can obtain the private IP, but If EIP cannot be accessed or the public network cannot be accessed within the virtual machine, which may be caused by the abnormal configuration of the winsock socket. In this case, you can use netsh winsock reset command to fix the problem.

**Note: When the "netsh winsock reset" command is running, programs that access or monitor the Internet (such as antivirus programs, firewall programs, and proxy clients) can be adversely affected. If one of your programs does not work normally after using this solution, reinstall the program to restore the functions.**

**Since there is a certain risk in this operation, it is recommended that you make a private image (https://www.jdcloud.com/help/detail/312/isCatalog/1) of your Virtual Machines before the operation to prevent failure to restore your system in case of an exception caused by resetting.

The netsh winsock reset command is used to reset the winsock directory. If there is a problem in the winsock protocol configuration on one machine, it will cause problems such as network connection. In this case, you need to use netsh winsock reset command to reset the winsock directory to restore the network. This command can reinitialize the network environment to resolve parameter errors caused by software conflicts, viruses, and the like.

The reset method is as follows:

Press the windows logo key and key R at the same time to open the run dialog box, output cmd in the dialog box, and then press Enter to start the CMD command window, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%87%8D%E7%BD%AEwinsock%E9%85%8D%E7%BD%AE01.png)

Enter netsh winsock reset in the CMD window and press Enter. After the execution is successful, you will be prompted that the Winsock directory is successfully reset and you need to restart VM to make the resetting take effect.
As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E9%87%8D%E7%BD%AEwinsock%E9%85%8D%E7%BD%AE02.png)

After restarting the cloud host, verify if the Virtual Machines can connect to the external network. If the problem still remain unsolved, please submit an open ticket.

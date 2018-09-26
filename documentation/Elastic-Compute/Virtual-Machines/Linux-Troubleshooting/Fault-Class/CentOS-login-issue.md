# CentOS Still Can't Be Logged in by Entering the Username Correctly

Sometimes when you log in to the CentOS Virtual Machines, you will not be able to log in to the system after entering the correct username and password, and it will automatically jump back to the interface to enter user name and password again. After you enter them again, you will still not be able to log in. As shown in Fig. 1 and Fig. 2:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%E6%AD%A3%E7%A1%AE%E8%BE%93%E5%85%A5%E7%94%A8%E6%88%B7%E5%90%8D%E4%BB%8D%E6%97%A0%E6%B3%95%E7%99%BB%E5%BD%9501.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%E6%AD%A3%E7%A1%AE%E8%BE%93%E5%85%A5%E7%94%A8%E6%88%B7%E5%90%8D%E4%BB%8D%E6%97%A0%E6%B3%95%E7%99%BB%E5%BD%9502.png)

This is generally caused by the lack of session required /lib64/security/pam_limits.so content in the /etc/pam.d/login file or the content exists but the path to the pam_limits.so file is incorrect (the problematic path is /lib/ Security/pam_limits.so or pam_limits.so, as shown in Fig. 3 and Fig. 4), and you need to enter single-user mode for modification.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%E6%AD%A3%E7%A1%AE%E8%BE%93%E5%85%A5%E7%94%A8%E6%88%B7%E5%90%8D%E4%BB%8D%E6%97%A0%E6%B3%95%E7%99%BB%E5%BD%9503.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%E6%AD%A3%E7%A1%AE%E8%BE%93%E5%85%A5%E7%94%A8%E6%88%B7%E5%90%8D%E4%BB%8D%E6%97%A0%E6%B3%95%E7%99%BB%E5%BD%9504.png)

In the remote connected VNC page, click **Send CtrlAltDel** in the upper right corner to reboot the Virtual Machines, and enter the single-user mode according to the method given in the documentation (https://opms.jcloud.com/archives/220).

Execute the *vi /etc/pam.d/login* command to edit the login file.

Check whether there is session    required    /lib64/security/pam_limits.so content in the last line of the file and the content (if any) is not commented (it is not commented if there is no # at the beginning of the line). If there is no such line, press i to enter the insert mode to add the content.

If there is session required /lib/security/pam_limits.so or session required pam_limits.so content, modify it into session    required    /lib64/security/pam_limits.so.

After the modification is completed, wq to save the file and exit vi, as shown in Fig. 5:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%E6%AD%A3%E7%A1%AE%E8%BE%93%E5%85%A5%E7%94%A8%E6%88%B7%E5%90%8D%E4%BB%8D%E6%97%A0%E6%B3%95%E7%99%BB%E5%BD%9505.png)

Enter reboot in single-user mode to reboot the Virtual Machines, as shown in Fig. 6.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%E6%AD%A3%E7%A1%AE%E8%BE%93%E5%85%A5%E7%94%A8%E6%88%B7%E5%90%8D%E4%BB%8D%E6%97%A0%E6%B3%95%E7%99%BB%E5%BD%9506.png)

After rebooting, you can log in to the system by entering the username and password correctly.

# Not Upgrade Kernel when Upgrading Linux System




When RedHat/CentOS is updated with yum update, the kernel is upgraded by default. However, after the kernel of some server hardware is upgraded, the new kernel may not recognize some hardware. It needs to reinstall the driver. So do not upgrade the kernel unnecessarily in a production environment unless you are sure that there will be no trouble after upgrading the kernel.

There are two ways not to upgrade the kernel when using the yum update:



**Method 1**

Add parameters directly after the yum command. This command only takes effect once:

*yum update --exclude=kernel**

**Method 2**

Modify the configuration file of yum command and take effect permanently.

Here is an example of CentOS 6.6:

1. First check the kernel version and system version.

*[root@localhost ~]# uname -r*

*2.6.32-504.el6.x86_64*

*[root@localhost ~]# cat /etc/issue*

*CentOS release 6.6 (Final)*

*Kernel \r on an \m*

2. Save the configuration file to backup.

*[root@localhost ~]# cp /etc/yum.conf /etc/yum.conf.bak*

3. Edit /etc/yum.conf file.

*[root@localhost ~]# vi /etc/yum.conf*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E5%8D%87%E7%BA%A7%E6%97%B6%E4%B8%8D%E5%8D%87%E5%86%85%E6%A0%B8%E6%93%8D%E4%BD%9C01.png)

4. Add the following content after [main]:

*exclude=kernel**

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E5%8D%87%E7%BA%A7%E6%97%B6%E4%B8%8D%E5%8D%87%E5%86%85%E6%A0%B8%E6%93%8D%E4%BD%9C02.png)

5. Press down Esc and enter the following command to save: wq.

6. Update with yum update.

*[root@localhost yum.repos.d]# yum update*

7. Wait until the update with yum update is completed and restart the computer, and then check the kernel version.

*[root@localhost ~]# uname -r*

*2.6.32-504.el6.x86_64*

*[root@localhost ~]# cat /etc/issue*

*CentOS release 6.8 (Final)*

*Kernel \r on an \m*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E5%8D%87%E7%BA%A7%E6%97%B6%E4%B8%8D%E5%8D%87%E5%86%85%E6%A0%B8%E6%93%8D%E4%BD%9C03.png)

You can see that the system version has been upgraded after yum update, and the kernel version is not upgraded. If you want to disable the system upgrading at the same time, add "exclude=kernel centos-release" at the end of its [main] section.



If your problem still can not solved, please submit open ticket to us.

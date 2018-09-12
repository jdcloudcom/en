# Ubuntu 12.04-14.04 System

**Method 1: ln -s Establishes Start Soft Link**

View the run level of the current system with # runlevel

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%2012.04-14.04%E7%B3%BB%E7%BB%9F01.png)

In the above figure, 2 in "N 2" indicates that the run level is 2, and in the Ubuntu system, 2~5 are complete multi-user modes. By default.

There are 7 run levels in Ubuntu, each of which corresponds to the 7 directories of /etc/ rc[0~6].d

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%2012.04-14.04%E7%B3%BB%E7%BB%9F02.png)

Each of the seven directories stores a service that needs to be closed or opened when the corresponding run level is loaded. From the detailed information, each script file corresponds to the specific service in /etc/init.d/ directory.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%2012.04-14.04%E7%B3%BB%E7%BB%9F03.png)

The script file starting with K represents that it needs to be closed when the run level is loaded, and the script file starting with S represents that it needs to be executed. Therefore, when we need to boot our own scripts, we just need to leave the executable script in the /etc/init.d directory and then create a soft link in /etc/rc*.d:

*[root@localhost ~]# ln -s /etc/init.d/sshd /etc/rc2.d/S100ssh*

Here sshd is the script file of the specific service, S100ssh is its soft link, and S on the beginning means self-starting when loading. If you need to set up self-starting at multiple run levels, you need to create multiple soft links. This method is complicated and suitable for custom service scripts.

**Method 2: Add the service startup command line in /etc/rc.local**

Ubuntu will execute the script in the /etc/rc.local file after booting, so you can add the startup script directly to /etc/rc.local to start the service at boot. It is noted that the statement needs to be added in front of exit 0.

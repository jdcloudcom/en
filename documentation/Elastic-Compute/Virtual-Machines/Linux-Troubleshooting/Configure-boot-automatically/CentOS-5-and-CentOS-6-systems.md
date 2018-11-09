# CentOS 5 and CentOS 6 Systems

There are three ways to configure the service to boot:

*ln -s*                       Establish a soft connection to the /etc/init.d/ service in /etc/rc.d/rc*.d directory (* represents one of seven run levels from 0 to 6)

*chkonfig*                Command line run level setting

*ntsysv*                   pseudo-graphical run level setting

Note:

● The above three methods are mainly used for CentOS 5 and CentOS 6, and not verified for other versions;

● If you do not know the run level, please check the configuration in */etc/inittab* through *cat /etc/inittab* operation, as shown below:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%205%E5%8F%8ACentOS%206%E7%B3%BB%E7%BB%9F01.png)

As shown above, id:3:initdefault: where 3 means the run level is 3, the full multi-user mode. By default, it is under level 3. If the graphical interface is installed, the run level is 5.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%205%E5%8F%8ACentOS%206%E7%B3%BB%E7%BB%9F02.png)

Note: /etc/rc[0~6].d is actually a soft link of /etc/rc.d/rc[0~6].d for compatibility with Unix.

Each of the seven directories stores a service that needs to be closed or opened when the corresponding run level is loaded. From the detailed information, each script file corresponds to the specific service in /etc/init.d/ directory.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%205%E5%8F%8ACentOS%206%E7%B3%BB%E7%BB%9F03.png)

The script file starting with K represents that it needs to be closed when the run level is loaded, and the script file starting with S represents that it needs to be executed. Therefore, when we need to boot our own script, we only need to put the executable script in /etc/init.d directory, and then create a soft link in /etc/rc.d/rc*.d. An example is as follows:

*[root@localhost ~]# ln -s /etc/init.d/sshd /etc/rc.d/rc3.d/S100ssh*

Here sshd is the script file of the specific service, S100ssh is its soft link, and S on the beginning means self-starting when loading. If you need to set up self-starting at multiple run levels, you need to create multiple soft links.

This method is complicated and suitable for custom service scripts. If some services already exist in the system (i.e. there will be httpsd service items when installing apache), the following two methods can be used.

**Method 2: chkconfig Command Line**

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%205%E5%8F%8ACentOS%206%E7%B3%BB%E7%BB%9F04.png)

If you need to self-start some services, just use chkconfig service name on, if you want to close it, turn on to off

By default, chkconfig will automatically start level 2345. If you want to customize it, you can add --level option.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%205%E5%8F%8ACentOS%206%E7%B3%BB%E7%BB%9F05.png)

In the above figure, all the startup levels of the sshd service are closed first, then the custom level is started with --level option.

Note: --list option can view the startup status of the specified service, and chkconfig can view all service status without any option.

**Method 3: ntsysv Pseudo Graphics**

ntsysv adds graphical interface based on chkconfig. There are two ways to start ntsysv. One is to enter ntsysv directly on the command line, and the other is to use the setup command and then select the system service.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%205%E5%8F%8ACentOS%206%E7%B3%BB%E7%BB%9F06.png)

By default, the level of the startup service set in ntsysv is the same as the current run level. For instance, if the current run level is 3, then after selecting the start service in the pseudo-graphical interface, its run level is also 3. If you want to customize the run level, you can use ntsysv --level

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%205%E5%8F%8ACentOS%206%E7%B3%BB%E7%BB%9F07.png)

The above three operations need to ensure that the service script file is executable and has root. Among them, the first method is mostly used for custom scripts, and the second and third methods are used for existing services such as ftp, samba, ssh, httpsd, and so on. Also, to make the relevant settings, you need to know the run level. In addition, if you want to manually start a service, the traditional way is /etc/init.d service name start, in fact, you can also use the service service name start, as shown below:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/CentOS%205%E5%8F%8ACentOS%206%E7%B3%BB%E7%BB%9F08.png)

# vncserver Installation and Configuration in Centos
Only installation of VNC is discussed in hereby, and you need to install it separately for the graphical interface.



**VNC Server Installation in CentOS 6.5**

**Installation**

Install vncserver with the following commands:

*yum -y install tigervnc-server*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver01.png)

**Configuration**

1. Configure as self running after startup.  Use the following command to start the service automatically:

*chkconfig --level 345 vncserver on*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver02.png)

2. Configure the client connection password. Enter the following command and set the VNC password:

*vncserver*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver03.png)

3. Configure to use GNOME desktop. Execute the command vi /root/.vnc/xstartup to modify the file, and after deleting the twm & at the file name end, add the following: gnome-session &:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver04.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver05.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver06.png)

4. Configure the listener port and environment parameters, modify /etc/sysconfig/vncservers file, and modify the two lines of configuration comments below as the following:

*vncservers="1:root"*

*vncserverargs[1]="-geometry 1200x800"*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver07.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver08.png)

5. Restart the service to enable the configuration:

*service vncserver restart*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver09.png)

**Allow root to Access the Graphical Interface and Generate New machine-id**

Execute the following command:

*sed -i 's/.*!= root.*/#&/' /etc/pam.d/gdm*

*dbus-uuidgen >/var/lib/dbus/mechine-id*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver10.png)


**Close selinux and NetworkManager Services**

1. Check the selinux service and close it, and execute

*vi /etc/selinux/config*

Confirm that the value of the SELINUX field is disabled, and if not, change it to be disabled.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver11.png)

2. Close the NetworkManager service, and execute

*chkconfig --level 235 NetworkManager off*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver12.png)

**Test Login Successfully**

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver13.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver14.png)

**CentOS7 Installs VNC Server**

**Installation**

Install vncserver with the following commands:

*yum -y install tigervnc-server*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver15.png)

**Configuration**

1. vi edits the configuration file and finds the following line, and execute the command:

*vi /lib/systemd/system/vncserver@.service*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver16.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver17.png)

Change Type into simple. If the username is root, then change <USER> into root.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver18.png)

2. Change /lib/systemd/system/vncserver@.service into /lib/systemd/system/vncserver@:1.service, and execute the command:

*mv /lib/systemd/system/vncserver@.service /lib/systemd/system/vncserver@:1.service*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver19.png)

3. Restart systemd and execute the command:

*systemctl daemon-reload*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver20.png)

4. Set VNC password. To set a user's password, you must have permission to switch to the user via sudo. If the current user already has root, here I use root to execute "direct vncpasswd".

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver21.png)

5. Set the boot:

*systemctl enable vncserver@:1.service*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver22.png)

Reboot service:

*systemctl start vncserver@:1.service*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver23.png)

**Test Login**

Client connects. After completing the above configuration, install VNC Viewer on the client, and then input the IP address of the server plus VNC port number (5901 by default) for VNC connecting:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos%E5%AE%89%E8%A3%85%E9%85%8D%E7%BD%AEvncserver24.png)

If your problem still can not solved, please submit open ticket to us.

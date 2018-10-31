# Ubuntu Configures Graphical Interface and vnc

Note: The configuration and instructions of Linux in this article have been tested on the Ubuntu 14.04 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Install gnome Desktop Environment:**

1. Install the infrastructure of x-windows and execute the following command:

*sudo apt-get -y install x-window-system-core*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc01.png)

2. Install the login manager and execute the following command:

*sudo apt-get -y install  gdm*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc02.png)

3. Install the Ubuntu desktop and execute the following command:

*sudo apt-get -y install  ubuntu-desktop*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc03.png)

4. Enter the graphical interface and execute the following command:

*startx -extension GLX*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc04.png)

**Install and Configure vncserver Service:**

**Installation**

Excuting command

*apt-get -y install vnc4server*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc05.png)

**Configuration**

1. Enter the command *vncserver* to enable the vnc service. At the first boot, it will be required to set a password, which can be modified later with *vncpasswd*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc06.png)

2. Back up the original xstartup file and execute the command:

*cp /root/.vnc/xstartup /root/.vnc/xstartup.bak*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc07.png)

3. Modify the vnc startup file, and use the following command:

*vi /root/.vnc/xstartup*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc08.png)

After opening, as shown, comment out the line x-window-manager &, and then add a line gnome-session &below

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc09.png)

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc10.png)

4. Kill the original desktop process, enter the command (wherein: 1 refers to the desktop number), and execute the command:

*vncserver -kill :1*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc11.png)

Enter the following command again to generate a new session:

*vncserver :1*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc12.png)

5. Set vncserver to boot automatically, and execute the following command:

*vi /etc/rc.local*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc13.png)

Add the vncserver startup command */usr/bin/vnc4server*

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc14.png)

**Test Login**

Client connects. After completing the above configuration, install VNC Viewer on the client, and then input the IP address of the server plus VNC port number (5901 by default) for VNC connecting:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E9%85%8D%E7%BD%AE%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A2%E5%92%8Cvnc15.png)

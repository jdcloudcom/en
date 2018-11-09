# Centos7 Installs Graphical Interface



Log in to the Virtual Machines and execute the command:

1.*yum -y groupinstall "X Window System"* #Install x window package

2.*yum -y groupinstall "GNOME Desktop"* #Install Gnome package

3. *ln -sf /lib/systemd/system/runlevel5.target /etc/systemd/system/default.target* #Run level start graphical interface

4.*reboot* #Server rebooted

After reboot, through the Virtual Machines console, remotely connect to vnc function to log in, you can see the graphical interface as shown:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Centos7%E5%AE%89%E8%A3%85%E5%9B%BE%E5%BD%A2%E7%95%8C%E9%9D%A201.png)

If your problem still can not solved, please submit open ticket to us.

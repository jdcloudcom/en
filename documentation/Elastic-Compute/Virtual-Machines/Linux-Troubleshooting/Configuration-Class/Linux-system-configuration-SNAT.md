# Linux System Configures SNAT

This method describes how to configure SNAT for the Virtual Machines of the Linux system in the VPC, so that the Virtual Machines without EIP can realize the proxy access to EIP through the Virtual Machines with EIP.

Note: SNAT's Virtual Machines has a separate subnet

Use SSH to log into a Virtual Machines that has been bound to the EIP.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E9%85%8D%E7%BD%AESNAT01.png)

Execute the following command to enable IP forwarding.

*sed -i 's/net.ipv4.ip_forward = 0/net.ipv4.ip_forward = 1/g' /etc/sysctl.conf*

Note: If the default rule of the table chain is changed to drop, execute the following command as well. In the case of the accept by default, it is not necessarily execute this command.

*iptables -A FORWARD -d 10.242.1.0/24 -j ACCEPT*

Execute *sysctl –p* to make IP forwarding take effect.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E9%85%8D%E7%BD%AESNAT02.png)

Run the following command to add SNAT to iptables

*iptables -t nat -I POSTROUTING -s 10.242.0.0/16 -j SNAT --to-source 10.242.1.3*

10.242.0.0/16 is the segment of the virtual network, and 10.242.1.3 is the intranet IP of the SNAT host



Separately create a route table for the intranet host. The routing policy is as shown

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E9%85%8D%E7%BD%AESNAT03.png)

The console vnc logs in to a Virtual Machines 10.242.0.3 only with intranet. The actual test has already accessed the EIP.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E9%85%8D%E7%BD%AESNAT04.png)

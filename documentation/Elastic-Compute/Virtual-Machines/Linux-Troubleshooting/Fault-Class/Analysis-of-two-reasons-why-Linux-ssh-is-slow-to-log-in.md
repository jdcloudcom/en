# Analysis of Two Causes for Slow Login to Linux ssh

There are two parameters in /etc/ssh/sshd_config in Linux system, which may cause ssh connection to be slow. These are UseDNS and GSSAPIAuthentication. If you encounter slow ssh login, please refer to the following operations:

Edit the configuration file /etc/ssh/sshd_config， vi /etc/ssh/sshd_config to find the UseDNS option. If there are no comments, comment it #UseDNS yes add UseDNS no

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%20ssh%E7%99%BB%E9%99%86%E6%85%A2%E7%9A%84%E4%B8%A4%E7%A7%8D%E5%8E%9F%E5%9B%A0%E5%88%86%E6%9E%9001.png)

2. Find the GSSAPIAuthentication option. If there are no comments, add the comment #GSSAPIAuthentication yes add GSSAPIAuthentication no.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%20ssh%E7%99%BB%E9%99%86%E6%85%A2%E7%9A%84%E4%B8%A4%E7%A7%8D%E5%8E%9F%E5%9B%A0%E5%88%86%E6%9E%9002.png)

3. Save the configuration file



Restart the SSH service */etc/init.d/sshd restart*

Note: If the client is a Linux system, make sure that the client makes the same changes and is reboot to take it effect.

# Method to Modify Hostname of Linux System



There are two common methods to modify the hostname of Linux system, which is summarily described herein.



**Temporarily Effective Modification**

Use the command line to modify the hostname (customizable) and re-login shell to take effect.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9%E4%B8%BB%E6%9C%BA%E5%90%8D%E6%96%B9%E6%B3%9501.png)

After re-logging in, you can see that it has taken effect.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9%E4%B8%BB%E6%9C%BA%E5%90%8D%E6%96%B9%E6%B3%9502.png)

**Permanently Effective Modification**

Take CentOS system as an example. In order to modify the configuration file and take effect, modify the HOSTNAME=hostname (customizable) in /etc/sysconfig/network and the restart to take effect.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9%E4%B8%BB%E6%9C%BA%E5%90%8D%E6%96%B9%E6%B3%9503.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9%E4%B8%BB%E6%9C%BA%E5%90%8D%E6%96%B9%E6%B3%9504.png)

If it is an Ubuntu system, modify the file /etc/hostname and change its corresponding hostname to the new one.

Finally, replace the old hostname corresponding to 127.0.0.1 in /etc/hosts with the new one.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9%E4%B8%BB%E6%9C%BA%E5%90%8D%E6%96%B9%E6%B3%9505.png)

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9%E4%B8%BB%E6%9C%BA%E5%90%8D%E6%96%B9%E6%B3%9506.png)

Note: If it is the CentOS 7 operating system, use the command hostnamectl set-hostname to modify. After the modification, SHELL log in again.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9%E4%B8%BB%E6%9C%BA%E5%90%8D%E6%96%B9%E6%B3%9507.png)

If your problem still can not solved, please submit open ticket to us.

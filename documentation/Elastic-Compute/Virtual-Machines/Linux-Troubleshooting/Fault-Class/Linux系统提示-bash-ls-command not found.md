# Linux System Prompts -bash:ls:command not found



**Problem Phenomenon:**

When executing any basic commands, it prompts command not found, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E6%8F%90%E7%A4%BA-bashlscommand%20not%20found01.png)

**Problem Causes:**

It is caused by abnormal system environment variable.



**Solution:**

Permanently Effective Mode:

Change to the correct environment variable and open /etc/profile with the absolute command vi


*vi  /etc/profile*

Add:


*export PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin:/root/bin*


Temporarily Effective Mode:

Direct Execute


*export PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin:/root/bin*


If your problem still can not solved, please submit open ticket to us.

# How to View the Time When the Server Was Last Restarted from the System

**1. Use the Last reboot Command**

The last command is used to display the most recent login record for a user. In the Linux system, there is a pseudo user called reboot, which automatically log into the system each time the system is rebooted. Therefore, by checking the login record of the reboot user through the last command, you can track the reboot record of the system. The information in parentheses indicates how long the system last ran and the corresponding time period.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E5%A6%82%E4%BD%95%E4%BB%8E%E7%B3%BB%E7%BB%9F%E4%B8%AD%E6%9F%A5%E7%9C%8B%E6%9C%8D%E5%8A%A1%E5%99%A8%E4%B8%8A%E4%B8%80%E6%AC%A1%E8%A2%AB%E9%87%8D%E5%90%AF%E7%9A%84%E6%97%B6%E9%97%B401.png)

**2. Use the who -b Command**

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E5%A6%82%E4%BD%95%E4%BB%8E%E7%B3%BB%E7%BB%9F%E4%B8%AD%E6%9F%A5%E7%9C%8B%E6%9C%8D%E5%8A%A1%E5%99%A8%E4%B8%8A%E4%B8%80%E6%AC%A1%E8%A2%AB%E9%87%8D%E5%90%AF%E7%9A%84%E6%97%B6%E9%97%B402.png)

**3. Use the uptime Command**

The uptime command displays the current time of the system and also shows how long the system has been booted, so you can figure out when the system was last started.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E5%A6%82%E4%BD%95%E4%BB%8E%E7%B3%BB%E7%BB%9F%E4%B8%AD%E6%9F%A5%E7%9C%8B%E6%9C%8D%E5%8A%A1%E5%99%A8%E4%B8%8A%E4%B8%80%E6%AC%A1%E8%A2%AB%E9%87%8D%E5%90%AF%E7%9A%84%E6%97%B6%E9%97%B403.png)

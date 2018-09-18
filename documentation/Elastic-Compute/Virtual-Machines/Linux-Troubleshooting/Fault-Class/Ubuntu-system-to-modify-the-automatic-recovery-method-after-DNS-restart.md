# The automatic recovery method after Ubuntu system modifying DNS and restarting



**Problem Phenomenon:**

After the Virtual Machines in the ubuntu system modifying the DNS information in the resolv.conf and restarting, the information in resolv.conf will revert to the pre-modified information;



**Problem Causes:**

As shown below, /etc/resolv.conf in the ubuntu system is actually a soft link of /run/resolvconf/resolv.conf;

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9DNS%E9%87%8D%E5%90%AF%E5%90%8E%E8%87%AA%E5%8A%A8%E8%BF%98%E5%8E%9F%E7%9A%84%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9501.png)

**Solution:**

You can directly modify the DNS information in the /run/resolvconf/resolv.conf;

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Ubuntu%E7%B3%BB%E7%BB%9F%E4%BF%AE%E6%94%B9DNS%E9%87%8D%E5%90%AF%E5%90%8E%E8%87%AA%E5%8A%A8%E8%BF%98%E5%8E%9F%E7%9A%84%E5%A4%84%E7%90%86%E6%96%B9%E6%B3%9502.png)

If your problem still can not solved, please submit open ticket to us.

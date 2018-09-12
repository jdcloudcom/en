# Total Time Exception of Linux System ping Test



**Problem Phenomenon:**

The delay is not high when ping the target address, but the total time is very high. For example, in the following figure, test ping 4 packets for JD Cloud. Each packet is basically within 35ms, but the total  time is over 3,000 ms, and execute:

*ping www.jdcloud.com -c 4*

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9Fping%E6%B5%8B%E8%AF%95%E6%80%BB%E6%97%B6%E9%97%B4%E5%BC%82%E5%B8%B801.png)

**Cause Analysis:**

Actually this is due to the fact that there is 1s interval at each ping packet, which is normal.



**Solution:**

The interval can be controlled by -i parameter. For example, test as the same, by specifying -i 0.1 parameter, you can see that the total time is significantly smaller. Execute:

*ping www.jdcloud.com -c 4 -i 0.1*


![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9Fping%E6%B5%8B%E8%AF%95%E6%80%BB%E6%97%B6%E9%97%B4%E5%BC%82%E5%B8%B802.png)

If your problem still can not solved, please submit open ticket to us.

# Linux System's Query of Time Synchronization Server Timed Out



**Problem Phenomenon**

Error occurs when executing the command of querying the time synchronization server, as shown:

*ntpq -p*

*localhost: timed out, nothing received*

****Request timed out*

**Problem Causes**

ntp configuration file writes that execution of calling ipv6 address will time out.

**Solution**

**Method 1. Use ipv4 Address Method to Query and Execute:**

*ntpq -4p*

The time synchronization server can be queried correctly, as shown:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E6%9F%A5%E8%AF%A2%E6%97%B6%E9%97%B4%E5%90%8C%E6%AD%A5%E6%9C%8D%E5%8A%A1%E5%99%A8%E8%B6%85%E6%97%B601.png)

**Method 2. Close ipv6 Address and Execute:**

*sh -c 'echo 1 > /proc/sys/net/ipv6/conf/all/disable_ipv6'*

*ntpq -p*

The query results are as shown below:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9F%E6%9F%A5%E8%AF%A2%E6%97%B6%E9%97%B4%E5%90%8C%E6%AD%A5%E6%9C%8D%E5%8A%A1%E5%99%A8%E8%B6%85%E6%97%B602.png)

If your problem still can not solved, please submit open ticket to us.

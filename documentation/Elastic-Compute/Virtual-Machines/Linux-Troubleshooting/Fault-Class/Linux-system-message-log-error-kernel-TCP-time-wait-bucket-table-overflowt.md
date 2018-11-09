# Linux system message log error: kernel: TCP: time wait bucket table overflowt



**Problem Phenomenon:**

Cloud server ECS ping external IP packet loss, ping error occurs:

*ping: sendmsg: Operation not permitted*

At the same time, query the server /var/log/message log and find a lot of error messages as follows:

*Aug  4 17:25:37 static1 kernel: TCP: time wait bucket table overflow Aug  4 17:25:37 static1 kernel: TCP: time wait bucket table overflow*

**Problem Causes:**

The system TCP TIME WAIT overflows.



**Solution:**

1. Count the current TCP connections by the following command:

*netstat -anp |grep tcp |wc -l*

2. Compare the value of parameter net.ipv4.tcp_max_tw_buckets in the /etc/sysctl.conf configuration file to see if there is any excess.

3. If excess is verified, you can edit the /etc/sysctl.conf configuration file and properly increase the value of parameter net.ipv4.tcp_max_tw_buckets according to the system specifications.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/Linux%E7%B3%BB%E7%BB%9Fmessage%E6%97%A5%E5%BF%97%E6%8A%A5%E9%94%99kernel01.png)

**Note: **

This parameter does not support infinite increase. The specific supported adjustment values ​​are related to the server specifications (bandwidth, CPU). 

If it is maintained after adjustment, evaluate whether it is normal business traffic. If it it the normal business traffic, it is recommended to introduce Load Balancer and other services in the front end of the server to distribute traffic to reduce the traffic load of a single server.



If your problem still can not solved, please submit open ticket to us.

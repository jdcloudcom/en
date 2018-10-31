# Long Return Time at Calling Tencent API

When calling other third-party API interfaces such as Tencent in the program, there will be a long return time. The cause is that when accessing the URL of the API interface, it takes a long time to resolve the DNS. You need to manually add the domain name resolution of the third-party API interface website or modify the DNS configuration, and use the public DNS server preferentially. For example:

Write the go language program to call the Tencent Map API, and output the return time. When domain name resolution is not added or the DNS server configuration is not modified, the return time is about 10 seconds, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E8%B0%83%E7%94%A8%E8%85%BE%E8%AE%AFAPI%E8%BF%94%E5%9B%9E%E6%97%B6%E9%95%BF%E8%BE%83%E9%95%BF01.png)

You can optimize the return time by modifying the DNS server priority setting as follows:

*vi /etc/resolv.conf* It can be seen that the public DNS server 8.8.8.8 has the lowest priority, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E8%B0%83%E7%94%A8%E8%85%BE%E8%AE%AFAPI%E8%BF%94%E5%9B%9E%E6%97%B6%E9%95%BF%E8%BE%83%E9%95%BF02.png)

Edit the file and write the 8.8.8.8 entry of the public DNS server to the front, that is, adjust the priority of the 8.8.8.8 server to the highest, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E8%B0%83%E7%94%A8%E8%85%BE%E8%AE%AFAPI%E8%BF%94%E5%9B%9E%E6%97%B6%E9%95%BF%E8%BE%83%E9%95%BF03.png)

wq to quit editing and save the file, execute the test program again, then the return time is reduced to about 300ms, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E8%B0%83%E7%94%A8%E8%85%BE%E8%AE%AFAPI%E8%BF%94%E5%9B%9E%E6%97%B6%E9%95%BF%E8%BE%83%E9%95%BF04.png)

Another way is to modify the /etc/hosts file and add the domain name resolution of the calling API website in the file, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E8%B0%83%E7%94%A8%E8%85%BE%E8%AE%AFAPI%E8%BF%94%E5%9B%9E%E6%97%B6%E9%95%BF%E8%BE%83%E9%95%BF05.png)

After saving the file, execute the test program again, then the return time is further reduced to about 80ms, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E8%B0%83%E7%94%A8%E8%85%BE%E8%AE%AFAPI%E8%BF%94%E5%9B%9E%E6%97%B6%E9%95%BF%E8%BE%83%E9%95%BF06.png)

Using this method can save the time for domain name resolution in the public DNS server, but there are two disadvantages:

1. If you need to call more API websites, you need to manually add one by one

2. The added resolution is static resolution, just one of several IPs that access to the website. If the resolved IP address cannot be accessed for some reason, it will return to the public DNS server for resolution. If the resolved IP is not modified, the long  calling time will still occur.

In summary, modify the DNS server priority or add local resolution according to your own situation.

# Method to Configure Port Forwarding for Windows Server
The configuration of Windows server port forwarding can be realized by using the portproxy function of Windows. The operation is as follows:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E6%9C%8D%E5%8A%A1%E5%99%A8%E9%85%8D%E7%BD%AE%E7%AB%AF%E5%8F%A3%E8%BD%AC%E5%8F%91%E7%9A%84%E6%96%B9%E6%B3%9501.png)

The meaning of this command is:

Use ipv4 to ipv4 mode to proxy port 22 with the source address of 116.196.123.136 to port 12345 of all addresses of the server. The source address can also be changed to the intranet address of the server with interconnected intranets.

You can use show all to view the configuration information of port forwarding that has been added:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E6%9C%8D%E5%8A%A1%E5%99%A8%E9%85%8D%E7%BD%AE%E7%AB%AF%E5%8F%A3%E8%BD%AC%E5%8F%91%E7%9A%84%E6%96%B9%E6%B3%9502.png)

After the port forwarding configuration is completed, you can directly access port 12345 of the public network address of the local device and the actual access is port 22 of the server at 116.196.123.136.



If you want to delete the configured forwarding policy, you can delete it by using the following command:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E6%9C%8D%E5%8A%A1%E5%99%A8%E9%85%8D%E7%BD%AE%E7%AB%AF%E5%8F%A3%E8%BD%AC%E5%8F%91%E7%9A%84%E6%96%B9%E6%B3%9503.png)

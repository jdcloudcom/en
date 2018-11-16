# Restart Remote Desktop Service in Windows System
The default remote login port 3389 of Windows system server is exposed to the public network. If it is frequently brute-forced, even if it cannot be successfully invaded, the remote desktop service will be abnormal.


It is recommended to modify the remote desktop port, or you can resolve the problem by logging in the server through the console terminal and restarting the Remote Desktop Services;


Go to the Virtual Machines console and click the remote connection on the page to enter the system;


Successively click **Start** - **Management Tool** - **Services**, find **Remote Desktop Services** and right click to restart;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%87%8D%E5%90%AF%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E6%9C%8D%E5%8A%A101.png)

After the restart, it has been restored through the remote desktop test login;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9F%E9%87%8D%E5%90%AF%E8%BF%9C%E7%A8%8B%E6%A1%8C%E9%9D%A2%E6%9C%8D%E5%8A%A102.png)

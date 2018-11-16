# Software Installation Source Replacement in ubuntu System

The Ubuntu Virtual Machines using the public image uses the internal software installation source of JD Cloud by default. If you need to replace it with the domestic Tsinghua source, please follow the steps below:

1. Backup the original source file: *cp /etc/apt/sources.list /etc/apt/sources.list.backup*

2、*vi /etc/apt/sources.list*

Edit the source file and replace the content with the source that needs to be replaced. Please refer to Tinghua Source's official website（https://mirrors.tuna.tsinghua.edu.cn/help/ubuntu/）to edit the source file, and save the file after editing.

3. *apt-get update* makes the source file in effect and verifies if the installation software is normal.

Please note that if the source file entry uses the https link, it may be stuck in working[0%] when apt-get update is executed. In this case, you need to revise the https of each download link in the source file as https, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/ubuntu%E7%B3%BB%E7%BB%9F%E6%9B%B4%E6%8D%A2%E8%BD%AF%E4%BB%B6%E5%AE%89%E8%A3%85%E6%BA%9001.png)

Revise all https as https

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/ubuntu%E7%B3%BB%E7%BB%9F%E6%9B%B4%E6%8D%A2%E8%BD%AF%E4%BB%B6%E5%AE%89%E8%A3%85%E6%BA%9002.png)

Save the file after the modification and try to update the source again.

If you need to switch back to the internal source of JD Cloud, execute*cp /etc/apt/sources.list.backup /etc/apt/sources.list* to replace the source file with the original backup file, and then execute *apt-get upadate*.

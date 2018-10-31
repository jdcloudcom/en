# Modify Maximum Connections for Created mysql Database

When connecting to the mysql database built on the Virtual Machines, sometimes 1040 error will be reported, indicating too many connections as shown

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E8%87%AA%E5%BB%BAmysql%E6%95%B0%E6%8D%AE%E5%BA%93%E4%BF%AE%E6%94%B9%E6%9C%80%E5%A4%A7%E8%BF%9E%E6%8E%A5%E6%95%B001.png)

In this case, you need to modify the /etc/my.cnf file, and add or modify max_connections=N entry in [mysqld]. The default value is 100, which can be adjusted as needed, as shown in figure

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/%E8%87%AA%E5%BB%BAmysql%E6%95%B0%E6%8D%AE%E5%BA%93%E4%BF%AE%E6%94%B9%E6%9C%80%E5%A4%A7%E8%BF%9E%E6%8E%A5%E6%95%B002.png)

After modification, wq saves the file, restarts the mysql database, to verify whether it takes effect.

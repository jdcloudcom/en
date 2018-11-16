# Method to Limit Memory of Self-built SqlServer of Windows VM

On the Virtual Machines with the SQL Server database installed, during the database usage, sometimes the memory and CPU of the sqlservr.exe process are found in the Task Manager as having a higher occupancy rate.

By setting the maximum server memory in the SQL Server server, you can solve the problem of occupying too much system memory during database usage.

1. Remotely log in the VM to enter SqlServer database, select database instance, and then right click to choose Properties

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BA%91%E4%B8%BB%E6%9C%BA%E8%87%AA%E5%BB%BASqlServer%E9%99%90%E5%88%B6%E5%86%85%E5%AD%98%E6%96%B9%E6%B3%9501.png)

Click the Memory tab. The default maximum server memory is very large and we generally limit it to 50% of the Virtual Machine memory, for example, 16G memory * 50% = 8000MB.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BA%91%E4%B8%BB%E6%9C%BA%E8%87%AA%E5%BB%BASqlServer%E9%99%90%E5%88%B6%E5%86%85%E5%AD%98%E6%96%B9%E6%B3%9502.png)

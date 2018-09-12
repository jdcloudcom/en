# SQL Image Login Method of Windows System
Some Windows image systems of JD Cloud have Microsoft SQL Server database, and customers may fail to log in for the first login to SQL Server;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9FSQL%E9%95%9C%E5%83%8F%E7%99%BB%E9%99%86%E6%96%B9%E6%B3%9501.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9FSQL%E9%95%9C%E5%83%8F%E7%99%BB%E9%99%86%E6%96%B9%E6%B3%9502.png)

In this case, you need to change the server name, fill in the "." or the current instance name.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9FSQL%E9%95%9C%E5%83%8F%E7%99%BB%E9%99%86%E6%96%B9%E6%B3%9503.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9FSQL%E9%95%9C%E5%83%8F%E7%99%BB%E9%99%86%E6%96%B9%E6%B3%9504.png)

By default, the sa account of the SQL Server database is disabled. If the customer needs sa login management, please find sa in the Security - Login Name, right click to choose Properties, then select Enabled in the pop-up interface, and set the corresponding account and password. Thus, you can use sa the next time you log in.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9FSQL%E9%95%9C%E5%83%8F%E7%99%BB%E9%99%86%E6%96%B9%E6%B3%9505.png)

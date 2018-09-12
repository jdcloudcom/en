# Set Log Time and Local Time Synchronous by IIS7.5

**Problem Phenomenon:**

The time points of the web log and ftp log record in the IIS service is inconsistent with the server system time, with an difference of 8 hours, as shown in the figure below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/iis7.5%E8%AE%BE%E7%BD%AE%E6%97%A5%E5%BF%97%E6%97%B6%E9%97%B4%E5%92%8C%E6%9C%AC%E5%9C%B0%E6%97%B6%E9%97%B4%E5%90%8C%E6%AD%A501.png)

**Problem Causes:**

Due to the IIS log mechanism, IIS log W3C format is created in Greenwich Mean Time, so it deviates from the server system time for 8 hours.


**Solution:**

Open IIS Manager, click on the ftp site, and right click the ftp log.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/iis7.5%E8%AE%BE%E7%BD%AE%E6%97%A5%E5%BF%97%E6%97%B6%E9%97%B4%E5%92%8C%E6%9C%AC%E5%9C%B0%E6%97%B6%E9%97%B4%E5%90%8C%E6%AD%A502.png)

Give a file name to Use Local Time at the bottom, tick in front of Scroll Update, and click Apply.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/iis7.5%E8%AE%BE%E7%BD%AE%E6%97%A5%E5%BF%97%E6%97%B6%E9%97%B4%E5%92%8C%E6%9C%AC%E5%9C%B0%E6%97%B6%E9%97%B4%E5%90%8C%E6%AD%A503.png)

If your problem still can not solved, please submit open ticket to us.

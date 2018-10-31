# Reasons for Data Suspension in Windows Task Manager
**Problem Phenomenon:**

In the task management box, the CPU and memory data in the **Process** tab are not refreshed, or the data in the **Performance** tab is not changed or remains at 0, while there is actual network transmission on the server,

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BB%BB%E5%8A%A1%E7%AE%A1%E7%90%86%E5%99%A8%E6%95%B0%E6%8D%AE%E6%9A%82%E5%81%9C%E7%9A%84%E5%8E%9F%E5%9B%A001.png)

**Problem Causes:**

which resulting from the suspension of task manager update speed.

**Solution:**

Click **View** -> **Update Speed** and check whether it is configured as **Suspended**. The status of updated speed can be changed to **General or Normal**, and then observe whether the data in the task manager is refreshed normally or not.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E4%BB%BB%E5%8A%A1%E7%AE%A1%E7%90%86%E5%99%A8%E6%95%B0%E6%8D%AE%E6%9A%82%E5%81%9C%E7%9A%84%E5%8E%9F%E5%9B%A002.png)

If your problem still can not solved, please submit open ticket to us.

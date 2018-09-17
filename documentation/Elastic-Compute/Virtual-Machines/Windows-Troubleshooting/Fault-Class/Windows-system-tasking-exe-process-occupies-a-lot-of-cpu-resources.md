# Large CPU Occupation by Windows System tasking.exe Process
**Problem Phenomenon:**

It can be seen from the task manager that the tasking.exe process occupies a large amount of CPU resources. The process will automatically start again after the process tree is finished, which cannot be stopped even if the file is deleted. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Ftasking.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8%E5%A4%A7%E9%87%8Fcpu%E8%B5%84%E6%BA%9001.png)

**Problem Causes:**

It is caused by the process resulting from that the running of National Instruments Domain Service is enabled.



**Solution:**

First, enter *msconfig* in **Run**, change the status in [General Settings] to selective start and click **Service]. Click on the Microsoft service hidden in the bottom left, and find the service named National Instruments Domain Service from remaining services, uncheck it and the service will active after the server is rebooted. As shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Ftasking.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8%E5%A4%A7%E9%87%8Fcpu%E8%B5%84%E6%BA%9002.png)

If your problem still can not solved, please submit open ticket to us.

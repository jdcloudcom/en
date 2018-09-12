# Windows Auto Updated Occupies  High CPU Memory
**Problem Phenomenon**

If the automatic Windows update is enabled by default, it will cause the high memory use rate or CPU rising. The process of svchost.exe occupies a lot of memory, and the CPU rises sometimes.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%87%AA%E5%8A%A8%E6%9B%B4%E6%96%B0%E6%B6%88%E8%80%97cpu%E5%86%85%E5%AD%98%E8%BF%87%E9%AB%9801.png)

**Problem Causes**

There are mainly two possibilities for the process to consume server resources:

1. The server is hacked with Trojan virus.

2. Windows automatic update is still enabled. If there is no abnormal Trojan virus in the server, users can solve it by disabling Windows Update.

**Solution**

1. Install anti-virus security software to detect and kill viruses.

2. Disable windows automatic update. Enter gpedit.msc in [Running] and disable [Computer Configuration], [Administrative Templates], [Windows Update] and [Configure Automatic Updates].

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%87%AA%E5%8A%A8%E6%9B%B4%E6%96%B0%E6%B6%88%E8%80%97cpu%E5%86%85%E5%AD%98%E8%BF%87%E9%AB%9802.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E8%87%AA%E5%8A%A8%E6%9B%B4%E6%96%B0%E6%B6%88%E8%80%97cpu%E5%86%85%E5%AD%98%E8%BF%87%E9%AB%9803.png)

If your problem still can not solved, please submit open ticket to us.

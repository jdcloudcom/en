# High Troubleshooting for Windows System CPU Occupation
In some cases, this is normal that Windows is in high CPU use rate if a user purchases a Windows 2012 server in low-standard (such as a 1-core 1G VM). Sometimes, CPU of the server is rising, and the CPU suddenly went high. It was found that the Windows update service was performing automatic updates after being located. However, high CPU use rate, in some cases, is caused by virus Trojans, three-party anti-virus/network protection software, application/driver exceptions, or under the running of application program with high IO or high interrupt processing.



Please try the following methods to solve the problem:

1. Please check if the anti-virus software performs scanning in the background when the CPU is high, if there is anti-virus software installed. If possible, upgrade the antivirus software to the latest version or remove the antivirus software.

2. Check whether Windows Update is performed in the background when the CPU is high.

3. Run Windows Update to install the latest Microsoft security patches.

4. If there is high demand for disk access/network access behavior/high computing in the VM, high CPU is normal. Thus, you can try to add instance types, with more cores/memory, to solve the resource bottleneck problem.



**Troubleshooting Methods**

If to find why the CPU is high, users can refer to the official Microsoft blog. There are multiple tools to locate the causes of high CPU use rate, such as the task manager, resource monitor and process explorer.



The CPU occupation and the process of high CPU can be viewed through the task manager and the resource monitor.

**View Mode of windows2008 System: **

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fcpu%E5%8D%A0%E7%94%A8%E9%AB%98%E6%8E%92%E6%9F%A501.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fcpu%E5%8D%A0%E7%94%A8%E9%AB%98%E6%8E%92%E6%9F%A502.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fcpu%E5%8D%A0%E7%94%A8%E9%AB%98%E6%8E%92%E6%9F%A503.png)

**View Mode of windows2012 System: **

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fcpu%E5%8D%A0%E7%94%A8%E9%AB%98%E6%8E%92%E6%9F%A504.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fcpu%E5%8D%A0%E7%94%A8%E9%AB%98%E6%8E%92%E6%9F%A505.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fcpu%E5%8D%A0%E7%94%A8%E9%AB%98%E6%8E%92%E6%9F%A506.png)

**Viewed by Process Explorer:**

Microsoft official sysinternals, download link: https://technet.microsoft.com/en-us/sysinternals/processexplorer.aspx

The powerful tool can locate the possible problem-drives for high CPU through correctly configured Symbols and by checking the Call Stack invoked by the thread of the corresponding program.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fcpu%E5%8D%A0%E7%94%A8%E9%AB%98%E6%8E%92%E6%9F%A507.png)

If your problem still can not solved, please submit open ticket to us.

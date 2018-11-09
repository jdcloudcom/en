# Windows High Bandwidth Occupation Processing
**Possible Reasons for High Bandwidth Occupation of the Server:**

1. The frequent access of the user to the service causes large bandwidth occupation.

2. Network traffic is caused by malicious viruses and Trojans. Sometimes three-party malicious programs may disguise in svchost.exe or Tcpsvcs.exe of the operating system, causing high bandwidth occupation.

3. Windows services (update service, etc.) may occupy higher network traffic.

**View the occupation by the process of bandwidth through Windows Resource Monitor:**

Open the **Task Manager** -> **Performance** -> **Resource Monitor** -> **Network** in Windows 2008 R2, as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E5%B8%A6%E5%AE%BD%E5%8D%A0%E7%94%A8%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%8601.png)

Open **Task Manager** -> **Performance** -> **Resource Monitor** -> **Network** in Windows 2012 R2, as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E5%B8%A6%E5%AE%BD%E5%8D%A0%E7%94%A8%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%8602.png)

If the process is a normal service process and high client traffic results in high bandwidth usage, please consider to purchase more bandwidth as appropriate.

If the process is a name suspicious process, please stop the process directly, or use professional anti-virus software to observe the server behavior after virus killing.

If your problem still can not solved, please submit open ticket to us.

# Processing Method for Large CPU and Memory Resources Occupation by Windows System svchost.exe Process
**Problem Description**

The memory use rate of the process named **svchost.exe** in the Windows System, CPU use rate or memory resource use rate have been high, resulting in system jamming and abnormal use. What is svchost.exe? It is a process on a computer, which can host other individual services that perform various functions on Windows. There can be multiple instances of svchost.exe running on the computer， with each instance containing different services. The instance of svchost.exe can be a single service or multiple services.



**Location and Solutions**

Make a brief analysis before using the task manager, open **Task Manager** of the system, and quickly determine the corresponding service attached under the corresponding svchost process:

1. Right click the taskbar and click **Launch Task Manager** to open **Task Manager**.

2. Switch to the **Progress** tab.

3. Click **Show processes from all users** and if the system requires users to enter the administrator password and confirm, please type password or confirm.

4. Right click on the instance of svchost.exe with the excessive resource use rate and click **Go to Details**. The service associated with the process will be highlighted on the **Services** tab.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fsvchost.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8cpu%EF%BC%8C%E5%86%85%E5%AD%98%E8%B5%84%E6%BA%90%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%86%E5%8A%9E%E6%B3%9501.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fsvchost.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8cpu%EF%BC%8C%E5%86%85%E5%AD%98%E8%B5%84%E6%BA%90%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%86%E5%8A%9E%E6%B3%9502.png)

Use the SC Config command to Isolate the Service

After finding the Svchost with high CPU use rate, users can also try to **stand-alone** the services that reside in the svchost to a separate svchost to run through the SC Config command:

1. When encountering a high CPU use rate, and users can locate the cause and find that svchost occupies a higher CPU use rate. It can be found that there are multiple services in the corresponding svchost process via the tasklist command. Execute the command prompt: ***tasklist /svc***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fsvchost.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8cpu%EF%BC%8C%E5%86%85%E5%AD%98%E8%B5%84%E6%BA%90%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%86%E5%8A%9E%E6%B3%9503.png)

2. Users can run these services separately into a separate svchost process under the SC config command, for example: wuauserv (Windows Update Service). Execute the command prompt:

***sc config wuauserv type= own***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fsvchost.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8cpu%EF%BC%8C%E5%86%85%E5%AD%98%E8%B5%84%E6%BA%90%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%86%E5%8A%9E%E6%B3%9504.png)

After the successful execution, reboot the server and execute the command *tasklist /svc | findstr /I /C:wuau* to find that the Windows Update service has been successfully independent.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fsvchost.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8cpu%EF%BC%8C%E5%86%85%E5%AD%98%E8%B5%84%E6%BA%90%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%86%E5%8A%9E%E6%B3%9505.png)

3. It is found that the Windows Update service occupies a high CPU use rate after monitoring, and the subsequent response adjustment Windows Update strategy is updated at night to avoid the working time affecting the operation of the server service.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fsvchost.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8cpu%EF%BC%8C%E5%86%85%E5%AD%98%E8%B5%84%E6%BA%90%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%86%E5%8A%9E%E6%B3%9506.png)

If the service is restored to the same svchost with other services, please execute the following command *sc config wuauserv type= share* to reboot the server.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9Fsvchost.exe%E8%BF%9B%E7%A8%8B%E5%8D%A0%E7%94%A8cpu%EF%BC%8C%E5%86%85%E5%AD%98%E8%B5%84%E6%BA%90%E9%AB%98%E7%9A%84%E5%A4%84%E7%90%86%E5%8A%9E%E6%B3%9507.png)

If your problem still can not solved, please submit open ticket to us.

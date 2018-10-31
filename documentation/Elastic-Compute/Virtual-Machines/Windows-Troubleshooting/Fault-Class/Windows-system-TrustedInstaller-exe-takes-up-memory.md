# Large Occupation by Windows TrustedInstaller.exe
**Problem Phenomenon:**

It can be seen from [Resource Monitor] that TrustedInstaller.exe occupies a large amount of memories, as shown in the figure below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9FTrustedInstaller.exe%E5%8D%A0%E7%94%A8%E5%86%85%E5%AD%98%E9%AB%9801.png)

**Problem Causes:**

TrustedInstaller.exe actually is the process of the "Windows Modules Installer", and the path is located at C:\Windows\servicing\TrustedInstaller.exe. When users perform Windows Update or install some installer package released by Microsoft, the Windows Modules Installer runs automatically, causing the process to occupy more memory resources.



**Solution:**

Stop the Windows Modules Installer in the service, and set it to manual startup or disabled. Stop the Windows Update, set it to manual startup or disabled.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E7%B3%BB%E7%BB%9FTrustedInstaller.exe%E5%8D%A0%E7%94%A8%E5%86%85%E5%AD%98%E9%AB%9802.png)

If your problem still can not solved, please submit open ticket to us.

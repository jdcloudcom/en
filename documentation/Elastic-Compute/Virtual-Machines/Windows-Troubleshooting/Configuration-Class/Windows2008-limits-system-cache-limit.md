# Windows 2008 Caps System Cache
MetaFile can be understood as system cache. In Windows server 2008 system, for example, there is a large number of file copy and other disk io operations, and the system will automatically cache it into memory. This part of the occupied memory is not reflected in the Task Manager, so the user will consider the memory usage of the system as abnormal. Meanwhile, by default, no limit is applied to MetaFile, so the system will take up the memory limitlessly. But after Windows 2012, the operating system automatically limits the upper limit of the system cache to avoid running out of physical memory.

An article in Microsoft's official Blog introduces that MetaFile exhausts system physical resources, which can be solved through Dyncache service. Please note that this software is not applicable to systems after Windows 2012:

Troubleshooting Windows Performance Issues: Lots of RAM but no Available Memory



The update program of Microsoft Windows Dynamic Cache can be added and then added into the service, and the maximum value of the dynamic cache can be limited by modifying the registry, for example, setting the upper limit as 200M, etc. In this way, a upper limit value is set for the memory of the system used as the cache. Download:

http://www.microsoft.com/en-us/download/details.aspx?id=9258 

The specific steps are as follows:

1. After decompressing, copy the corresponding DynCache.exe file in different system versions to C:\windows\system32.
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9001.png)

2. Open a command prompt as an administrator and execute the following command to add a service:

***sc create DynCache binPath= %SystemRoot%\System32\DynCache.exe start= auto type= own DisplayName= "Dynamic Cache Service"***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9002.png)

3. Go back to the DynCache folder, find the DynCache.reg registry file and import it (double click the file).
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9003.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9004.png)

4. Click Run and enter regedit to open the registry and find *HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\DynCache\Parameters*. Find *MaxSystemCacheMBytes*on the right side and double click it. Here we select "Decimal" and enter the maximum number of caches (in MB) in the value. If you enter 200, it means the maximum number of caches is limited to 200MB, and if you enter 0, it means no limit.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9005.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9006.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9007.png)

5. Click Run and enter *services.msc* to start the *DynCache* service in services.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9008.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%E9%99%90%E5%88%B6%E7%B3%BB%E7%BB%9F%E7%BC%93%E5%AD%98%E4%B8%8A%E9%99%9009.png)

Note: There are several versions available after the downloaded dyncache is decompressed. Please choose the version of retail amd64 rather than ia64 (ia64 means Itanium's 64-bit processor version).



If your problem still can not solved, please submit open ticket to us.


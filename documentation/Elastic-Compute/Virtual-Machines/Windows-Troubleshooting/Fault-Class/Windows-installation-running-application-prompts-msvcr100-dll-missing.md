# msvcr100.dll Lost Prompts during Windows Program Installation
**Problem Phenomenon:**

When the running program is installed in  Windows system, it indicates the start failure due to msvcr100.dll loss, as shown in the figure:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%E5%AE%89%E8%A3%85%E8%BF%90%E8%A1%8C%E5%BA%94%E7%94%A8%E7%A8%8B%E5%BA%8F%E6%8F%90%E7%A4%BAmsvcr100.dll%E4%B8%A2%E5%A4%B101.png)

**Problem Causes:**

msvcr100.dll is a dynamic link library of Visual Studio 2010. If a program is developed with it, such library is required for the running. If some programs directly package them into the installation directory and then register, there will be free of file loss; but some programs have this dynamic link library in the system by default, which spares processing and file loss.



**Solution:**

Download a msvcr100.dll file from internet in the form of a zipped package file, and unzipped the file to the corresponding directory after downloading.

1. If the 32-bit MSVCR100.dll is downloaded and the system is 32-bit as well, it shall be copied to the directory in C:\Windows\System32. If it is a 64-bit system, it shall be put in C:\Windows\SysWOW64.

2. If the 64-bit MSVCR100.dll is downloaded in a 64-bit system, it shall be copied to the directory in C:\Windows\System32. The 32-bit system is incompatible with 64-bit MSVCR100.dll.

3. Enter *regsvr32 msvcr100.dll* in **Run** and register.



If your problem still can not solved, please submit open ticket to us.

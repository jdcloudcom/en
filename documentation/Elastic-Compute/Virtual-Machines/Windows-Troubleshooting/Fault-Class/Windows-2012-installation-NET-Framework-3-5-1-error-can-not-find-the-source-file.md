# Windows 2012 .NET Framework 3.5.1 Installation Error and Source Files Not Found
**Problem Description:**

An error of .NET Framework 3.5.1 installation in Windows Server 2012 is reported, and the error is as shown below:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E5%AE%89%E8%A3%85.NET%20Framework%203.5.1%E6%8A%A5%E9%94%99%E6%89%BE%E4%B8%8D%E5%88%B0%E6%BA%90%E6%96%87%E4%BB%B601.png)

**Problem Causes:**

The installation source file cannot be found.

**Solution:**

1. Locate PowerShell from the start menu and right click to select [Run as Administrator].

2. Press [Enter] to execute after entering the following script.


***1.Set-ItemProperty -Path 'HKLM:\SOFTWARE\Policies\Microsoft\Windows\WindowsUpdate\AU' -Name UseWUServer -Value 0*** 

***2.Restart-Service -Name wuauserv***

***3.Install-WindowsFeature Net-Framework-Core***

***4.Set-ItemProperty -Path 'HKLM:\SOFTWARE\Policies\Microsoft\Windows\WindowsUpdate\AU' -Name UseWUServer -Value 1***

***5.Restart-Service -Name wuauserv***

If your problem still can not solved, please submit open ticket to us.

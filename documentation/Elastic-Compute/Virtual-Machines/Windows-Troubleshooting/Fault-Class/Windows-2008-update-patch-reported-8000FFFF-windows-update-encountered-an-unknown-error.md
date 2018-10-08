# Windows2008 Updated Patches "8000FFFF windows update Errors"
**Problem Phenomenon:**

'"Code 8000FFFF Unknown Error" prompts during Windows 2008 R2 patches are updated:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20%E6%9B%B4%E6%96%B0%E8%A1%A5%E4%B8%81%E6%8A%A5%E2%80%9C8000FFFFwindows%20update%20%E9%81%87%E5%88%B0%E6%9C%AA%E7%9F%A5%E9%94%99%E8%AF%AF%E2%80%9D01.png)

**Problem Causes:**

The main reason is that the disk C without user's authorization causes the updated patch cannot be installed properly.

**Solution:**

Give read/write authorization to add user authorization to disk C, and remove the user authorization after the patches are update, thus to avoid potential security risks.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20%E6%9B%B4%E6%96%B0%E8%A1%A5%E4%B8%81%E6%8A%A5%E2%80%9C8000FFFFwindows%20update%20%E9%81%87%E5%88%B0%E6%9C%AA%E7%9F%A5%E9%94%99%E8%AF%AF%E2%80%9D02.png)
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20%E6%9B%B4%E6%96%B0%E8%A1%A5%E4%B8%81%E6%8A%A5%E2%80%9C8000FFFFwindows%20update%20%E9%81%87%E5%88%B0%E6%9C%AA%E7%9F%A5%E9%94%99%E8%AF%AF%E2%80%9D03.png)

If problems still cannot be solved via above methods, please refer to the following methods:

1. Stop automatic updates and BITS services. Execute as per the command prompt:

***net stop wuauservnet stop bits***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20%E6%9B%B4%E6%96%B0%E8%A1%A5%E4%B8%81%E6%8A%A5%E2%80%9C8000FFFFwindows%20update%20%E9%81%87%E5%88%B0%E6%9C%AA%E7%9F%A5%E9%94%99%E8%AF%AF%E2%80%9D04.png)

2. Delete the folder "C:\Windows\SoftwareDistribution" in the system.



3. Run the automatic update service and BITS service, during which, the folder "C:\Windows\SoftwareDistribution" will be created automatically. Execute as per the command prompt:

***net start wuauservnet start bits***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20%E6%9B%B4%E6%96%B0%E8%A1%A5%E4%B8%81%E6%8A%A5%E2%80%9C8000FFFFwindows%20update%20%E9%81%87%E5%88%B0%E6%9C%AA%E7%9F%A5%E9%94%99%E8%AF%AF%E2%80%9D05.png)

4. Stop the Cryptographic service. Execute as per the command prompt:

***net stop cryptsvc***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20%E6%9B%B4%E6%96%B0%E8%A1%A5%E4%B8%81%E6%8A%A5%E2%80%9C8000FFFFwindows%20update%20%E9%81%87%E5%88%B0%E6%9C%AA%E7%9F%A5%E9%94%99%E8%AF%AF%E2%80%9D06.png)

5. Rename the folder from C:\windows\System32\catroot2 to C:\windows\System32\catroot2.bak.

6. Carry out an automatic update detection as per the command prompt after the folder C:\Windows\SoftwareDistribution” is created.

***wuauclt.exe /resetauthorization /detectnow***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2008%20%E6%9B%B4%E6%96%B0%E8%A1%A5%E4%B8%81%E6%8A%A5%E2%80%9C8000FFFFwindows%20update%20%E9%81%87%E5%88%B0%E6%9C%AA%E7%9F%A5%E9%94%99%E8%AF%AF%E2%80%9D07.png)

7. Check whether the system detects the update in 15 minute. If the update is detected, it can usually be installed normally.

If your problem still can not solved, please submit open ticket to us.

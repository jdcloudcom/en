# Windows2008 Updated Patches "8000FFFF windows update Errors"
**Problem Phenomenon:**

Code 8000FFFF Unknown Error" prompts during Windows 2008 R2 patches are updated:


**Problem Causes:**

The main reason is that the disk C without user's authorization causes the updated patch cannot be installed properly.

**Solution:**

Give read/write authorization to add user authorization to disk C, and remove the user authorization after the patches are update, thus to avoid potential security risks.

If problems still cannot be solved via above methods, please refer to the following methods:

1. Stop automatic updates and BITS services. Execute as per the command prompt:

***net stop wuauservnet stop bits***


2. Delete the folder "C:\Windows\SoftwareDistribution" in the system.



3. Run the automatic update service and BITS service, during which, the folder "C:\Windows\SoftwareDistribution" will be created automatically. Execute as per the command prompt:

***net start wuauservnet start bits***

4. Stop the Cryptographic service. Execute as per the command prompt:

***net stop cryptsvc***


5. Rename the folder from C:\windows\System32\catroot2 to C:\windows\System32\catroot2.bak.

6. Carry out an automatic update detection as per the command prompt after the folder C:\Windows\SoftwareDistribution” is created.

***wuauclt.exe /resetauthorization /detectnow***


7. Check whether the system detects the update in 15 minute. If the update is detected, it can usually be installed normally.

If your problem still can not solved, please submit open ticket to us.

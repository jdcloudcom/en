# Windows 2012 SID Modification
SID, also known as Security Identifiers, is a unique number that identifies users, groups, and computer accounts. Since the cloud server systems use a same mirror image, the SID is the same. Hence, the steps for AD installation on the cloud and offline AD installation are the same, but the steps for the client joining the domain are slightly different. Users need to modify the client SID first, and if not, the interface will prompt "same SID" when the client joins the domain. Therefore, the SID of the server is required to be modified. It is recommended to create a private image with the reference of Create Private Image. Once the modification fails and causes system exception, the system can be restored by the image. The server will reboot after modification and the settings page will display again. It is recommended to login and operate via the console terminal;

First, enter the Sysprep directory in *cd C:\Windows\System32\Sysprep*, then execute Sysprep to open the system preparation tool, select **General** and click **OK**:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E4%BF%AE%E6%94%B9SID01.png)

It prompts that Sysprep is working:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E4%BF%AE%E6%94%B9SID02.png)

Re-enter the settings page:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E4%BF%AE%E6%94%B9SID03.png)

Click **Next** > **Accept**, and then re-enter the password:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E4%BF%AE%E6%94%B9SID04.png)

Relogin to the system according to the prompts.
Enter *whoami /user* to see that the SID has been modified:

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows2012%E4%BF%AE%E6%94%B9SID05.png)

# User root not allowed because not listed in appears for SSH login




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Phenomenon**


When using SSH to connect to a Linux VM, the following information that causing a abnormal login to the server may appear in the secure log of the customer or server (which can be viewed in the system through VNC):

*• Permission denied, please try again.*

*• User test from 192.168.0.1 not allowed because not listed in AllowUsers.*

*• User test from 192.168.0.1 not allowed because listed in DenyUsers.*

*• User root from 192.168.0.1 not allowed because a group is listed in DenyGroups.*

*• User test from 192.168.0.1 not allowed because none of user's groups are listed in AllowGroups.*




**Problem Causes**

This problem is usually caused by SSH service enabling the user login control parameter to restricting the login user.




**Solution**

The related parameters of SSH can restrict the user or user's group logs in. Descriptions as follows:

• AllowUsers: A white list of allowed users. Only the users marked with this parameter can log in.

• DenyUsers: A blacklist of denied users. The users marked with this parameter are denied to log in.

• AllowGroups: A white list of allowed user's groups. Only the user's groups marked with this parameter can log in.

• DenyGroups: Blacklists of denied user's groups. The user's groups marked with this parameter are denied to log in.



Note: The denied policy takes precedence over the allowed policy. For example:

• If the AllowUsers and DenyUsers parameters contain the same user, the deny policy takes precedence, so the user will not be able to log in.

• If the AllowUsers and DenyUsers parameters contain the same user, the deny policy takes precedence, so the user will not be able to log in.



Prior to resolving this problem, please perform the following configuration check or modifications according to the different cases mentioned above:

1. Enter the system via VNC.

2. Check whether /etc/ssh/sshd_config contains the following configurations through cat:


*AllowUsers root test*

*DenyUsers test*

*DenyGroups test*

*llowGroups root*

3. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

4. Use the editor such as vi to modify the policy configuration to ensure that the relevant users can log in normally. Or the entire delete or comment (add # at the beginning) the entire line configuration (completely cancel the user's identity and access management):


*#AllowUsers root test*

*#DenyUsers test*

*#DenyGroups test*

*#AllowGroups root*

5. Use the following command to restart the SSH service for the configuration to take effect:


*service sshd restart*


If your problem still can not solved, please submit open ticket to us.

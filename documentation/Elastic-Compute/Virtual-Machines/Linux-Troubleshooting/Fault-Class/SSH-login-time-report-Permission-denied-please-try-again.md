# Permission denied, please try again appears for SSH login




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Phenomenon**

When logging in to the Linux VM by using SSH, an error message similar to the following will appear if it is the root user, even if the password is entered correctly.

*• Permission denied, please try again.*

• If the SSH server rejected the password, please try it again.

But the non-root user can log in normally, and the root user can log in through VNC as well.



**Problem Causes**

The server of SSH service is configured to prohibit the root user to log in.



**Solution**

Description: Related policies can improve the security of the server. Users need to decide whether to modify the relevant configuration based on the security and usability.

To resolve this problem, please perform the following configuration checks and modifications.

1. Enter the system via VNC.

2. Check whether /etc/ssh/sshd_config contains the following configurations through cat:


*PermitRootLogin no*

Parameter Description:

• The root user is allowed to log in when the parameter is not configured, or the parameter value is configured to yes (default). The root user login will be blocked only if the displayed setting is no.

• This parameter only affects the user's SSH login, and does not affect the user's login to the system through VNC or other means.



3. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

4. Use an editor such as vi to set the parameter value to yes, or the entirely delete or comment (add # at the beginning) the entire line configuration. For example:

*# PermitRootLogin no*

5. Restart the SSH service with the following command:


*service sshd restart*

6. Try to log in to the server again by using root user.



If your problem still can not solved, please submit open ticket to us.

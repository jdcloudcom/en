# Following Error Ocurrs at SSH Login: Disconnected:No supported authentication methods available



Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When logging in to a Linux VM using SSH, even if the password is entered correctly, an error message as follows appears:

*Permission denied (publickey,gssapi-keyex,gssapi-with-mic).*

*sshd[10826]: Connection closed by 192.168.0.1.*

*Disconnected:No supported authentication methods available.*

But the same user can log in normally through vnc.



Problem Causes:

This problem is usually caused by the SSH service modifying the PasswordAuthentication parameter and disabling the password authentication login.



Solution:

1. Enter the system via VNC.

2. Check whether /etc/ssh/sshd_config contains the following configurations through cat:


*cat /etc/ssh/sshd_config*

*PasswordAuthentication no*

Description: This parameter is enabled by default. The default value is yes.



3. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

4. Use an editor such as vi to set the parameter value to yes, or the entirely delete or comment (add # at the beginning) the entire line configuration:


*# PasswordAuthentication no*

5. Restart the SSH service with the following command:


*service sshd restart*

6. Try to log in to the server again.



If your problem still can not solved, please submit open ticket to us.

# SSH Login Fails After Repeatedly Entering the root Password and Following Error Occurs: Too many authentication failures for root

Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When logging in to the Linux VMs using SSH, if the password is entered incorrectly for multiple times, the server returns an error message as follows, and then the connection is interrupted. The login failure prompts:

*Too many authentication failures for root*



**Problem Causes:**

The SSH service can configure a password retry policy. Repeatedly entering incorrect passwords will trigger the policy, causing the connection to be interrupted and the login to fail.

Note: This configuration will not cause the related account to be locked, and only the corresponding session will be disconnected. When SSH loggin in again from the client, try the password again.



**Solution:**

1. Enter the system through the Virtual Machines console vnc.

2. Check whether */etc/ssh/sshd_config* contains the following configurations through cat:


*cat /etc/ssh/sshd_config*

*MaxAuthTries 6*

Description: This parameter is not enabled by default. Used to limit the number of repeatedly entering incorrect password at each time of SSH login. When exceeding the specified number, the SSH connection will be interrupted and the error message will be displayed. However, the corresponding user account will not be locked and you can try SSH login again.

3. Related policies can improve the security of the server. Users need to decide whether to modify the relevant configuration based on the security and usability.

4. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

5. Use an editor such as vi to modify the related parameter value as needed, or the entirely delete or comment (add # at the beginning) the entire line configuration. For example:


*#MaxAuthTries 6*

If your problem still can not solved, please submit open ticket to us.

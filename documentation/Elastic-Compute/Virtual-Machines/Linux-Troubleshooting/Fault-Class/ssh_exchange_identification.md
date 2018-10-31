# Following Error Occurs at SSH Login: ssh_exchange_identification: read: Connection reset by peer




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When logging in to the Linux VMs by using SSH, an error message as follows will appear, even if the password is entered correctly.

*ssh_exchange_identification: read: Connection reset by peer.*

*sshd[11949]: refused connect from 192.168.0.1 (192.168.0.1).*



**Problem Causes:**

This problem is usually caused by the Linux system enabling TCP Wrapper IAM via /etc/hosts.allow or /etc/hosts.deny.



**Solution:**

To resolve this problem, please perform the following configuration checks and modifications.

1. Enter the system via VNC.

2. Check whether /etc/hosts.allow or /etc/hosts.deny contains the following configurations through cat:


*all:all:deny*

3. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

4. Use an editor such as vi to modify the relevant configuration in /etc/hosts.allow  and /etc/hosts.deny as needed, or the entirely delete or comment (add # at the beginning) the entire line configuration. For example:


*# all:all:deny*

5. Try to log in to the server again.



If your problem still can not solved, please submit open ticket to us.

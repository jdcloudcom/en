# Following Error Ocurrs at SSH Login: error Could not get shadow infromation for root



Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When logging in to a Linux VM using SSH, even if the password is entered correctly, an error message as follows will appear in the command line or secure log, causing the connection to fail:

*Permission denied, please try again.*

*error: Could not get shadow infromation for root.*



**Problem Causes:**

This problem is usually caused by the system enabling SELinux.



**Solution:**

View SELinux status

1. Enter the system through vnc

2. Use the following command to view the SELinux current operating status:


*/usr/sbin/sestatus  -v*

Results of execution 

*SELinux status:                 enabled*

If the status value is enabled, SELinux is already enabled.



Temporarily turn off SELinux 

1. Enter the system through vnc

2. Temporarily turn off SELinux using the following command:


*setenforce 0*

3. Try connecting to the server again from the client. If you can log in normally, it is confirmed that the problem is caused by SELinux configuration. If you still can't log in normally, you will need to continue troubleshooting.



Permanently turn off SELinux

1. Enter the system through vnc

2. If you need to modify the relevant configuration, it is recommended to perform a file backup before proceeding.

3. Use an editor such as vi to edit the /etc/selinux/config file, modify or set as follows:


*SELINUX=disabled*

4. Restart the server to permanently disable SELinux



If your problem still can not solved, please submit open ticket to us.

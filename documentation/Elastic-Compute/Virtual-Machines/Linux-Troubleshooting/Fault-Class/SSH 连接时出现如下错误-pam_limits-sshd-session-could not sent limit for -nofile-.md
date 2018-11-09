# Following Error Ocurrs at SSH Login: pam_limits(sshd:session)：could not sent limit for 'nofile'



Note: The configuration and instructions in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When the client connects to the Linux VMs, the command line or secure log displays an error message as follows:

*-bash: fork: retry: Resource temporarily unavailable.*

*pam_limits(sshd:session)：could not sent limit for 'nofile':operaton not permitted.*

*Permission denied.*



**Problem Causes:**

This problem is usually caused by resources occupied by the shell process exceed the server's ulimit quota.



**Solution:**

**Previous Version Operating System of CentOS 6**

For previous version operating system of Cent OS (including RHEL) 6.0, make global resource control via /etc/security/limits.d/90-nproc.conf. Prior to resolving this problem, please perform the following configuration check or modifications:

1. Enter the system through vnc

2. Use cat and other command to view /etc/security/limits.conf, and execute:

*cat /etc/security/limits.conf*

contain settings as follows or not:


 #End of file* soft nofile 65535* hard nofile 65535

Instructions:

By default, the above configuration is not enabled.

* in the first column indicates that it is in effect for all users. It can also be modified to the specified username, indicating that it will only take effect for the specified user.



3. If you need to modify the relevant configuration, it is recommended to perform a file backup before proceeding.

4. Use an editor such as vi to increase the figure in the last column according to the server's specifications so as to increase the limit value. Or the entirely delete the related settings or comment (add # at the beginning) the entire line configuration:


 #* soft nofile 65535#* hard nofile 65535

5. Use exit to exit the current session and then try to reconnect from the client.



**Later Version Operating System of CentOS 6**

For later version operating system of Cent OS (including RHEL) 6.0, make global resource control via /etc/security/limits.d/90-nproc.conf. Prior to resolving this problem, please perform the following configuration check or modifications:

1. Enter the system through vnc

2. Use cat and other command to view /etc/security/limits.d/90-nproc.conf, and execute:


*cat /etc/security/limits.d/90-nproc.conf*

contain settings as follows or not:


    *   soft    nproc    65535

Instructions:

By default, the above configuration is not enabled.

* in the first column indicates that it is in effect for all users. It can also be modified to the specified username, indicating that it will only take effect for the specified user.





3. If you need to modify the relevant configuration, it is recommended to perform a file backup before proceeding.

4. Use an editor such as vi to increase the figure in the last column according to the server's specifications so as to increase the limit value. Or the entirely delete the related settings or comment (add # at the beginning) the entire line configuration:


 #*  soft    nproc    65535

5. Use exit to exit the current session and then try to reconnect from the client.



If your problem still can not solved, please submit open ticket to us.


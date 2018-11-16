# Following Error Ocurrs at SSH Login: pam_unix(sshdsession) session closed for user



Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When logging in to a Linux VM using SSH, even if the password is entered correctly, an error message as follows will appear in the command line or secure log, causing the connection to fail:

*This account is currently not available.*

*Connection to 127.0.0.1 closed.*

*Received disconnect from 127.0.0.1: 11: disconnected by user.*

*pam_unix(sshd:session): session closed for user test.*



**Problem Causes:**

This problem is usually caused by the corresponding user's default Shell being modified.



Solution:

1. Enter the system via console vnc.

2. View the default Shell of the corresponding user by the following command:


*cat /etc/passwd | grep test*

*test: x :1000:1000::/home/test:/sbin/nologin*

Check if the corresponding user's Shell has been modified to nologin.



3. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

4. Use an editor such as vi to change the default Shell of the corresponding user to bash, eg.:


*vi /etc/passwd*

Modify /sbin/nologin to /bin/bash

5. Try connecting to the server again from the client.



If your problem still can not solved, please submit open ticket to us.

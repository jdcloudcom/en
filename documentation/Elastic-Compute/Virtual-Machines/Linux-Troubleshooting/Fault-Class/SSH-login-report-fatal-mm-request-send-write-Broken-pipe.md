# fatal: mm_request_send: write: Broken pipe appears for SSH login




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When the client connects to the Linux VMs, the command line or secure log displays an error message as follows:

*• fatal: mm_request_send: write: Broken pipe.*

*• Connection closed by 192.168.0.1.*




**Problem Causes:**

This problem may be caused by the abnormal running of SSH service affected by viruses such as udev-fall.



**Solution:**

Temporary Recovery:

Take the udev-fall virus as an example, an attempt could be made to temporarily restore the SSH service to normal running as follows:

1. Enter the system via VNC.

2. Use the following command to query the virus process:


*ps aux | grep udev-fall*

*root     24486  0.0  0.0 108340  1848 pts/0    S    10:30   0:00 /usr/bin/udev-fall*

Description: The number in the second column indicates the process ID (PID).



3. End the virus process with the following command:


*kill -9 <Process Corresponding to  PID>**

For example:

*kill -9 24486*

4. Use the following command to cancel the automatic running of the virus service:


*chkconfig udev-fall off*

5. Use the following command to remove the corresponding commands and self-launch configuration of the virus program:


*rm -rf /usr/bin/udev-fall*

*rm -rf /etc/init.d/udev-fall*

6. Restart the SSH service with the following command and then try to reconnect from the client:


*service sshd restart*


Reliable Treatment:

It can not determine that whether the system is tampered by the virus or malicious intruder, or has other hidden virus files. Therefore, in order to maintain the server's long-term stable running, it is suggested to restore the server to a normal state through the system disk reset.



If your problem still can not solved, please submit open ticket to us.

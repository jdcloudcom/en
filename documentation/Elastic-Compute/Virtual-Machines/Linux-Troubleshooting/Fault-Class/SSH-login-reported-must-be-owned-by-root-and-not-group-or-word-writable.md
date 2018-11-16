# must be owned by root and not group or word-writable appears for SSH login




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Phenomenon**

When the Linux VM starts the SSH service, an error message similar to the following appears:

*• /var/empty/sshd must be owned by root and not group or word-writable.*



**Problem Causes**

The permission configurations, groups, and the like for directories or files related to services of the SSH service should be stipulated based on security. This problem is usually caused by an exception in the associated permissions or group settings.



**Solution**

**Method I: /var/empty/sshd Directory Configuration**


The /var/empty/sshd directory permission is 711 by default, and the group is root:root by default. Prior to resolving this problem, please perform the following configuration check or modifications:

1. Enter the system via VNC.

2. View the permission configuration of  /var/empty/sshd/ with the following command:


*ll -d /var/empty/sshd/*

Default Configuration:

*drwx--x--x. 2 root root 4096 Nov 23  2013 /var/empty/sshd/*



3. If the default permissions or groups are modified, you can modify them by the following instructions:


*chown -R root.root /var/empty/sshd* 

*chmod -R 711 /var/empty/sshd*


4. Use the following command to restart the SSH service and verify if the service can start normally:


*service sshd restart*


**Method II: /etc/securetty Directory Configuration Problems**

The /etc/securetty directory permission is 600 by default, and the group is root:root by default. Prior to resolving this problem, please perform the following configuration check or modifications:

1. Enter the system via VNC.

2. View the permission configuration of  /etc/securetty by the following command:


*ll /etc/securetty*

Default Configuration:

*-rw-------. 1 root root 122 Jan 12  2010 /etc/securetty*


3. If the default permissions or groups are modified, you can modify them by the following instructions:


*chown root.root /etc/securetty*

*chmod 600 /etc/securetty*


4. Use the following command to restart the SSH service and verify if the service can start normally:


*service sshd restart*


If your problem still can not solved, please submit open ticket to us.

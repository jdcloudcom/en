# No supported key exchange algorithms appears for SSH login




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Phenomenon**


When using SSH to connect to a Linux VM, the following information that causing a abnormal connection to the server may appear in the secure log of the customer or server (which can be viewed in the system through the management terminal):

*• Read from socket failed: Connection reset by peer.*

*• Connection closed by 192.168.0.1.*

*• sshd error: could not load host key.*

*• fatal: No supported key exchange algorithms [preauth].*

*• DSA host key for 192.168.0.1 has changed and you have requested strict checking.*

*• Host key verification failed.*

*• ssh_exchange_identification: read: Connection reset by peer.*





**Problem Causes**

This problem is usually caused by an exception in the key pair file associated with the SSH service, possible reasons include:

• The related key pair file is abnormal, such as file corruption, deletion or tampering.

• The permission configuration of related key pair file is abnormal, causing failure of correct reading.



**Solution**

**Method I: Check File Permissions**

The SSH service will check the permission of the associated key pair file. For example, the default permission of the key pair file is 600. If it is configured as other permissions such as 777, other users will also have permissions to read or modify. And the SSH service will consider the configuration to be a security risk, which in turn causes the customer connection to fail.

You can restore the default permission configuration of related files by the following command:


*cd /etc/ssh/*

*chmod 600 ssh_host_**

*chmod 644* *.pub*


The Operation is as Follows:


*[root@centos]# cd /etc/ssh/*

*[root@centos]# chmod 600 ssh_host_**

*[root@centos]# chmod 644* *.pub*

*[root@centos]# ll*

*total 156*

*-rw-------. 1 root root 125811 Nov 23  2013 moduli*

*-rw-r--r--. 1 root root   2047 Nov 23  2013 ssh_config*

*-rw-------  1 root root   3639 May 16 11:43 sshd_config*

*-rw-------  1 root root    668 May 20 23:31 ssh_host_dsa_key*

*-rw-r--r--  1 root root    590 May 20 23:31 ssh_host_dsa_key.pub*

*-rw-------  1 root root    963 May 20 23:31 ssh_host_key*

*-rw-r--r--  1 root root    627 May 20 23:31 ssh_host_key.pub*

*-rw-------  1 root root   1675 May 20 23:31 ssh_host_rsa_key*

*-rw-r--r--  1 root root    382 May 20 23:31 ssh_host_rsa_key.pub*


**Method II: Check the Validity of the File**

If you still can't connect properly after modifying the relevant file permissions following the previous steps. Because the lost key pair file will be automatically rebuilt when the SSH service starts. Therefore, you can also directly delete related files and restart the SSH service for auto-generation of related files.

The relevant commands are as follows:

*cd /etc/ssh/*

*rm -rf ssh_host_**

*service sshd restart*


The Operation is as Follows:


*[root@centos]# cd /etc/ssh/*

*[root@centos]# ll*

*total 156*

*-rw-------. 1 root root 125811 Nov 23  2013 moduli*

*-rw-r--r--. 1 root root   2047 Nov 23  2013 ssh_config*

*-rw-------  1 root root   3639 May 16 11:43 sshd_config*

*-rw-------  1 root root    672 May 20 23:08 ssh_host_dsa_key*

*-rw-r--r--  1 root root    590 May 20 23:08 ssh_host_dsa_key.pub*

*-rw-------  1 root root    963 May 20 23:08 ssh_host_key*

*-rw-r--r--  1 root root    627 May 20 23:08 ssh_host_key.pub*

*-rw-------  1 root root   1675 May 20 23:08 ssh_host_rsa_key*

*-rw-r--r--  1 root root    382 May 20 23:08 ssh_host_rsa_key.pub*

*[root@centos]# rm -rf ssh_host_**

*[root@centos]# ll*

*total 132*

*-rw-------. 1 root root 125811 Nov 23  2013 moduli*

*-rw-r--r--. 1 root root   2047 Nov 23  2013 ssh_config*

*-rw-------  1 root root   3639 May 16 11:43 sshd_config*

*[root@centos]# service sshd restart*

*Stopping sshd:                                             [  OK  ]*

*Generating SSH1 RSA host key:                              [  OK  ]*

*Generating SSH2 RSA host key:                              [  OK  ]*

*Generating SSH2 DSA host key:                              [  OK  ]*

*Starting sshd:                                             [  OK  ]*

*[root@centos]# ll*

*total 156*

*-rw-------. 1 root root 125811 Nov 23  2013 moduli*

*-rw-r--r--. 1 root root   2047 Nov 23  2013 ssh_config*

*-rw-------  1 root root   3639 May 16 11:43 sshd_config*

*-rw-------  1 root root    668 May 20 23:16 ssh_host_dsa_key*

*-rw-r--r--  1 root root    590 May 20 23:16 ssh_host_dsa_key.pub*

*-rw-------  1 root root    963 May 20 23:16 ssh_host_key*

*-rw-r--r--  1 root root    627 May 20 23:16 
ssh_host_key.pub*

*-rw-------  1 root root   1671 May 20 23:16 ssh_host_rsa_key*

*-rw-r--r--  1 root root    382 May 20 23:16 ssh_host_rsa_key.pub*


For the operating systems such as Ubuntu and Debain, the modification commands are as follows:


*sudo rm -r /etc/ssh/ssh*key*

*sudo dpkg-reconfigure openssh-server*


If your problem still can not solved, please submit open ticket to us.

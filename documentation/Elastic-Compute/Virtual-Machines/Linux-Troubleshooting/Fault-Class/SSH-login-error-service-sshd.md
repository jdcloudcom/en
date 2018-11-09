# Following Error Ocurrs at SSH Login: pam_listfile(sshd:auth): Refused user root for service sshd



Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**


When logging in to Linux VMs, even if the correct password is entered, it can not be logged in properly. When the problem occurs, it can be logged in through the console vnc or SSH client, or can not be logged in through both modes. At the same time, the error message as follows appears in the /var/log/secure log:

*sshd[1199]: pam_listfile(sshd:auth): Refused user root for service sshd*

*sshd[1199]: Failed password for root from 192.168.0.1 port 22 ssh2*

*sshd[1204]: Connection closed by 192.168.0.2*



**Problem Causes:**

The PAM module pam_listfile.so related IAM policy caused the user login failure.



**Solution:**

The pam_listfile.so module can be used for Linux IAM. Prior to resolving this problem, please perform the following configuration checks:

1. Log in to the server through SSH client or vnc.

2. View the  corresponding PAM configuration file in the abnormal login mode through cat command. Descriptions as follows:

File              Function Description

*/etc/pam.d/login*	Console (vnc) corresponding configuration file

*/etc/pam.d/sshd*	Login corresponding configuration file

*/etc/pam.d/system-auth*	System global configuration file

Note: Each application that enables PAM has a corresponding configuration file with the same name in the /etc/pam.d directory. For example, the configuration file of the login command is /etc/pam.d/login, and specific policiy can be configured in the corresponding configuration file.



3. Check whether there is following configuration information in the configuration file:


*auth required pam_listfile.so item=user sense=allow file=/etc/ssh/whitelist onerr=fail*

Brief description of related parameters:

item: Set the object type of identity and access management, and optional values ​​include tty|user|rhost|ruser|group|shell.

sense: Define the control method when the matching item is found in the configuration file. Optional value: allow|deny. Specifically, allow represents the white list mode, and deny represents the black list mode.

file: Specify the full path name of the configuration file.

onerr: Define the default return value when the error occurs (eg. the configuration file cannot be opened).



4. Related policies can improve the security of the server. Users need to decide whether to modify the relevant configuration based on the security and usability.

5. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

6. Use the editor such as vi to modify the relevant parameter values as needed, and confirm that the access release for relevant user has been made in the corresponding identity and access management file. Or the entirely delete or comment (add # at the beginning) the entire line configuration:


*#auth required pam_listfile.so item=user sense=allow file=/etc/ssh/whitelist onerr=fail*

7. Try to log in to the server again.



If your problem still can not solved, please submit open ticket to us.

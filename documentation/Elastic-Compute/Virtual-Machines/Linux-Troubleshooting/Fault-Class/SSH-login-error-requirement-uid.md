# Following Error Ocurrs at SSH Login: requirement "uid >= 1000" not met by user "root"



Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When logging in to Linux VMs, even if the correct password is entered, it can not be logged in properly. When the problem occurs, it can be logged in through the management terminal or SSH client, or can not be logged in through both modes. At the same time, the following error message appears in the secure log:

*pam_succeed_if(sshd:auth): requirement "uid >= 1000" not met by user "root".*



**Problem Causes:**

PAM related module policy configuration prohibits users with UID less than 1000 from logging in.



**Solution:**


1. Log in to the server through SSH client or vnc.

2. View the  corresponding PAM configuration file in the abnormal login mode through cat command. Descriptions as follows:

File              Function Description

*/etc/pam.d/login*	Console (vnc) corresponding configuration file

*/etc/pam.d/sshd*	Login corresponding configuration file

*/etc/pam.d/system-auth*	System global configuration file

Note: Each application that enables PAM has a corresponding configuration file with the same name in the /etc/pam.d directory. For example, the configuration file of the login command is /etc/pam.d/login, and specific policiy can be configured in the corresponding configuration file.



3. Check whether there is following configuration information in the configuration file:

*auth        required      pam_succeed_if.so uid >= 1000*

4. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

5. Use an editor such as vi to modify the above configuration in the corresponding configuration file, or the entirely delete or comment (add # at the beginning) the entire line configuration:

*auth        required      pam_succeed_if.so uid <= 1000*  (Modify)

or

*#auth        required      pam_succeed_if.so uid >= 1000* (Comment configuration)

6. Try to log in to the server again.



If your problem still can not solved, please submit open ticket to us.

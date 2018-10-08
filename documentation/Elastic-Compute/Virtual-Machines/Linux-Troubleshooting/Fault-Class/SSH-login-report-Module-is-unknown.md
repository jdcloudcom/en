# login: Module is unknown appears for SSH login




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When using vnc or SSH to connect remotely and log in to the Linux VMs, you fail to log in, and the following error messages appear in the secure log:

*login: Module is unknown.*

*login: PAM unable to dlopen(/lib/security/pam_limits.so): /lib/security/pam_limits.so: cannot open shared object file: No such file or directory.*



**Problem Causes:**

Each PAM-enabled application program has a corresponding configuration file with the same name in the /etc/pam.d. For example, the configuration file of the login command is /etc/pam.d/login, and you can configure specific policies in the corresponding configuration file as follows:

File              Function Description

/etc/pam.d/login	Console (vnc) corresponding configuration file

/etc/pam.d/sshd	Login corresponding configuration file

/etc/pam.d/system-auth	System global configuration file

When a remote connect is logged in, some PAM-enabled applications fail to load the module, causing the failure of interaction between it and the login mode configured with corresponding policies. Here, the /etc/pam.d/sshd and /etc/pam.d/system-auth shall be mainly viewed. When there are errors in the /etc/pam.d/login configuration file logged by vnc, you shall restart the server to enter the single-user mode.

**Solution:**

When it fails to log in via the servers's administrator account and password

1. Log in to the Linux VMs via vnc.

2. Execute the cat filename command to view the PAM configuration files, such as cat /etc/pam.d/login and cat /etc/pam.d/system-auth.

3. Check if the following configuration information exists in the configuration file, e.g., the following configuration information checked by /etc/pam.d/system-auth of this configuration file.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E7%99%BB%E5%BD%95%E6%8A%A5loginModule%20is%20unknown01.png)

4. Execute the command ll /lib/security/pam_limits.so to check if pam_limits.so exists in the system.

In this step, it should check if pam_limits.so is incorrectly placed in /lib/security, because the correct path to a 64-bit Linux system is /lib64/security.

5. Execute the vi filename command to correct the path of the item module pam_limits.so, and filename is the configuration file you viewed in step 3, such as vi /etc/pam.d/system-auth in this example.

*session required /lib64/security/pam_limits.so* # Modify to the correct path

6. Re-login to the Linux VM test.



If your problem still can not solved, please submit open ticket to us.

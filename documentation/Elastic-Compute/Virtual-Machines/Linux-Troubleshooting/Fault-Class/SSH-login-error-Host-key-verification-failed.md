# SSH Login Error Host key verification failed
Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.

**Problem Description:**

When logging in to the Virtual Machines of Linux system by using ssh, an error information similar to the following is displayed, causing the connection to fail.

 Error message of Linux connection:

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    WARNING: REMOTE HOST IDENTIFICATION HAS CHANGED!     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@IT IS POSSIBLE THAT SOMEONE IS DOING SOMETHING NASTY!Someone could be eavesdropping on you right now (man-in-the-middle attack)!It is also possible that the RSA host key has just been changed.The fingerprint for the RSA key sent by the remote host isae:6e:68:4c:97:a6:91:81:11:38:8d:64:ff:92:13:50.Please contact your system administrator.Add correct host key in /root/.ssh/known_hosts to get rid of this message.Offending key in /root/.ssh/known_hosts:70RSA host key for x.x.x.x has changed and you have requested strict checking.Host key verification failed.

In the Windows system, e.g. the connection error of the common  customer NetSarang Xshell is shown as the follow public key fingerprint mismatch diagram: The machine key pair of X.X.X.X (port: XX) is inconsistent with that stored in the local machine key database. The machine key pair has changed or this connection may be monitored by someone. If you are not sure, it is recommended to cancel this connection. You can also click to receive and save when the relevant alarm information prompts. You can continue to log in normally be means of setting automatic update of the key pair fingerprint on the program.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E7%99%BB%E5%BD%95%E6%8A%A5%E9%94%99Host%20key%20verification%20failed01.png)

**Problem Causes:**

The SSH public key will changed by some reasons such as Linux server's system re-installation and change of the account information, which causes the inconsistency between the public key fingerprint saved by the customer and the server. As a result, authentication of the SSH fails and is denied to log in. Due to a relatively long public key (up to 1024 bits when using the RSA algorithm). Therefore, for the sake of simplicity, a 128-bit string shall be generated for information comparison by calculating MD5. This is called a public key fingerprint.

**Solution:**

The client is a Windows system

1. Open the Xshell.

2. Click the **Tool** > **Machine Key Pair Manager**, as shown below, select the corresponding entry for the target server, and then click **Delete**.

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E7%99%BB%E5%BD%95%E6%8A%A5%E9%94%99Host%20key%20verification%20failed02.png)

3. You can log in successfully after logging in the server again and confirming that the new public key fingerprint is saved.



The customer is a Linux

1. Edit the known_hosts of the corresponding account by using an editor such as vi:

*vi ~/.ssh/known_hosts*

2. As shown below, find the corresponding entry and delete it:

![](https://github.com/jdcloudcom/cn/blob/cn-VirtualMachine-Linux/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E7%99%BB%E5%BD%95%E6%8A%A5%E9%94%99Host%20key%20verification%20failed03.png)

3. You can log in successfully after connecting the server again and confirming that the new public key fingerprint is saved.



If your problem still can not solved, please submit open ticket to us.

# SSH Enables UseDNS Causing Connection Speed to Slow Down




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Phenomenon**

When logging in to a Linux VM using SSH, even if you log in or transfer data through the intranet, the speed is very slow.



**Problem Causes**

This problem may be caused by that the UseDNS feature is enabled by the SSH service.


The UseDNS feature is a security enhancement feature of the SSH service and is not enabled by default. After being enabled, the server first performs a DNS PTR reverse query based on the client IP to obtain the client host name. Then, according to the obtained client host name, perform DNS forward A record query, and finally check the obtained IP against the original IP to prevent the client spoofing.

But usually, the client uses dynamic IP and there is no corresponding PTR record. Therefore, after the feature is enabled, it can not be used for information comparison, and even the operation delay is increased due to the related query operation, finally slowing down the connection speed of the client.



**Solution**

To resolve this problem, please perform the following configuration checks and modifications.

1. Enter the system via VNC.

2. Check whether /etc/ssh/sshd_config contains the following configurations through cat:

*UseDNS yes*

3. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

4. Use an editor such as vi to set the parameter value to no, or the entirely delete or comment (add # at the beginning) the entire line configuration. For example:

*#UseDNS yes*

5. Use the following command to restart the SSH service and re-verify if the service can be started normally:


*service sshd restart*


If your problem still can not solved, please submit open ticket to us.

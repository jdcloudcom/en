# Following Error Occurs When SSH Service is Started: main process exited, code=exited




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Description:**

When the Linux  Virtual Machines starts the SSH service using the service or systemctl command, the command line does not have any error message. However, the service is not actually run normally, and an error message as follows appears in the secure log:

*• sshd.service: main process exited, code=exited, status=203/EXEC.*

*• init: ssh main process (1843) terminated with status 255.*



**Problem Causes:**

This problem is usually caused by a configuration exception to the $PATH environment variable, or an SSH service-related directive being removed, causing the service startup script to fail.



**Solution:**


Prior to resolving this problem, please perform the following configuration check or modifications:

1. Enter the system via VNC.

2. Check the environment variable configuration with the following command:


*echo $PATH*

The default values ​​are as follows:

*/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin:/root/bin*


3. If the default environment variable is changed, reset it by the following command:



*export PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin:/root/bin*


4. Use the following command to find and confirm the SSH service command:

*find / -name sshd*

Be sure to include the following default path program files:

*/usr/sbin/sshd*


5. If the corresponding file does not exist, try uploading the normal file from the outside via FTP or reinstalling the SSH service.

6. Restart the SSH service with the following command and then try to reconnect from the client:

*service sshd restart*


If your problem still can not solved, please submit open ticket to us.

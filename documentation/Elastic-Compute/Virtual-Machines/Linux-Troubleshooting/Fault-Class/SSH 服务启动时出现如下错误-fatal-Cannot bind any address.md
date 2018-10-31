# Following Error Occurs When SSH Service is Started: fatal: Cannot bind any address




Note: The configuration and instructions of Linux in this article have been tested on the CentOS 6.5 64-bit operating system. For other types and versions of the operating system, configuration may vary. Please refer to the official documentation for the details about relevant operating systems.



**Problem Phenomenon**


When the Linux VM starts the SSH service, the command line or secure log displays the error message as the follows:

*• FAILED.*

*• fatal: Cannot bind any address.*

*• ddress family must be specified before ListenAddress.*




**Problem Causes**

The AddressFamily parameter of the SSH service is used to specify the protocol stack used at running. If the configuration uses only IPV6 and IPV6 is not enabled in the system, or the IPV6 protocol is not configured properly, this problem may occur.



**Solution**

To resolve this problem, please perform the following configuration checks and modifications.

1. Enter the system via VNC.

2. Check whether /etc/ssh/sshd_config contains the following configurations through cat:


*AddressFamily inet6*

Description: The optional value of this parameter is:

• inet: Use the IPV4 protocol stack, as the default.

• net6: Use the IPV6 protocol stack.

• any: Enable both IPV4 and IPV6 protocol stacks.



3. If you need to modify the relevant policy configuration, it is recommended to perform a file backup before proceeding.

4. Use an editor such as vi to set the parameter value to inet, or the entirely delete or comment (add # at the beginning) the entire line configuration. For example:

*#AddressFamily inet6*

5. Also, make sure the AddressFamily parameter is configured before ListenAddress, for example:


*AddressFamily any*   #This line is configured in front

*ListenAddress 0.0.0.0*


If your problem still can not solved, please submit open ticket to us.

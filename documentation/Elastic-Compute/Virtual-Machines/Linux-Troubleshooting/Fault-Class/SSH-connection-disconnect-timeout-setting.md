# Timeout Setting for SSH Disconnection



**Problem Phenomenon:**

After the SSH is logged in to the Virtual Machines, it will be automatically disconnected if no operations are performed for a period of time.



**Problem Causes:**

Caused by timeout of SSH connection.



**Solution:**

Log in to the Virtual Machines, edit the ssh configuration file, and enter the command:


*vi /etc/ssh/sshd_config*

The parameter ClientAliveInterval is the duration of SSH connection, the value is second, you can set it yourself.

E.g.:


*ClientAliveInterval 300*, which indicates 300 seconds, that is, 5 minutes.


In addition, ClientAliveCountMax is the number of times of SSH's allowable timeout. If the customer's does not respond, it will be judged as a timeout.

E.g.:


*ClientAliveCountMax 5*, indicating that 5 times is allowable for timeout.


The following setting indicates that 1500 seconds is allowable for timeout, that is, 25 minutes.

*ClientAliveInterval 300*

*ClientAliveCountMax 5*


If your problem still can not solved, please submit open ticket to us.

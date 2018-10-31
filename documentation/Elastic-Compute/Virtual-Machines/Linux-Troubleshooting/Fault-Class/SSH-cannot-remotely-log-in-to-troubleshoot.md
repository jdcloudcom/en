# Troubleshooting for SSH Remote Login Failure

In the actual operation, remote login may fail. Here is a brief introduction to the possible causes and troubleshooting methods for SSH login failure, to help you to make self-test.



In the operation instance, you can first check whether the firewall is enabled or the related security group is configured in the console to prevent users from remote login. It can be used normally after you stop firewall or open the port number of remote login.

In addition, for most of the instances, the problems can be summed up to the following three: client problem, intermediate network problem, and SSH service configuration problem.

**1. Client Problem**

When the client cannot log in normally, it is recommended to test using different SSH clients first. If you can log in normally, it is judged that the client has configuration problem. You need to check the client configuration or software running. Novice users need to note that Linux client should use Putty or Xshell, but mstsc is the remote login command of Windows operating system. If you are using mstsc, please change the client first.

**2. Intermediate Network Problem**

When the client cannot connect to the server through SSH normally, you can use the following method to test the telnet port to determine whether the ping packet communication is normal:

telnet>
Normally, the server SSH software version number will be returned.

If the port test fails and the ping packet loss or ping failure occurs when the client access the target server, you can use the tracert tool to test the link and determine whether the link is connected.


**3. SSH Service Configuration Problem**

First, you need to determine if SSH provides external services. The command is as follows:

*[root@~]# netstat –ntlp | grep sshd*

*tcp     0     0 0.0.0.0:22             0.0.0.0:*        LISTEN    1132/sshd*

*tcp     0     0  : : :22                0.0.0.0:*        LISTEN    1132/sshd*



Determine whether there is an SSH program running through above method. If it is not already running, start the command to enable the SSH service (the default startup command for CentOS 6.X is service sshd start). In addition, you need to check whether the listener port of ssh level has been modified. If it is modified, you need to determine whether the server's iptables and the console's firewall have been modified accordingly. 0.0.0.0 means that all addresses are monitored. If it is 127.0.0.1, it means that only ssh connections can be made on this machine. You need to modify /etc/ssh/sshd_config for resizing.

It should be noted that the system may be stuck due to resource exhaustion. You can view the CPU from the console and check if it is unable to connect due to high occupation of memory. In this case, please close unnecessary services or reset the server and upgrade the configuration.

**4. Check hosts.deny**
 
Log in to the Virtual Machines through the remote login mode of the console and check /etc/hosts.deny;

 Is there any denying of IP address in cat /etc/hosts.deny? When the IP address is added to the file, the address will not be logged in (protection time is 30 minutes, and it will be automatically cleared after 30 minutes); delete the IP address in vim /etc/hosts.deny file;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E6%97%A0%E6%B3%95%E8%BF%9C%E7%A8%8B%E7%99%BB%E5%BD%95%E6%8E%92%E6%9F%A501.png)

If it is added to hosts.deny again after deletion, you can add the local exit IP address to hosts.allow,

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Linux/SSH%E6%97%A0%E6%B3%95%E8%BF%9C%E7%A8%8B%E7%99%BB%E5%BD%95%E6%8E%92%E6%9F%A502.png)

The above is part of the reason why SSH can't log in remotely. If your problem still can not be solved, please submit open ticket to us.

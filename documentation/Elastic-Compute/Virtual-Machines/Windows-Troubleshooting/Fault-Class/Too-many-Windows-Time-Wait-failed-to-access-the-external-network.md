# Windows Excessive Time_Wait Causes Internet Failure
**Problem Phenomenon:**

The server can ping the internet internally, but cannot access external websites or programs.

**Problem Causes:**

In general, the cause of the problem is the exhausted Windows dynamic port. A simple command test can be carried out in the CMD:

***netstat -ano | findstr 445***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20Time_Wait%E8%BF%87%E5%A4%9A%E5%AF%BC%E8%87%B4%E8%AE%BF%E9%97%AE%E5%A4%96%E7%BD%91%E5%A4%B1%E8%B4%A501.png)

Note: TCP Port 445 is the one used by the Windows File Sharing Service, default in monitoring status.

Execute

***telnet 127.0.0.1 445***

If it is not accessible, the dynamic port is exhausted. By this time, if netstat -ano is executed, a large number of connections can be found in the TIME_WAIT state.

**Solution:**

By this time, the number of dynamic ports is 16384 (from 49152 to 65536) after Windows 2008. If there are a large number of external connections in the server, and the default Time Wait Delay time is 4 minutes according to TCP, a large number of connections will be in Time Waits after disconnection, which cannot be quickly released to other connections for use and cause the ports exhausted.

1. Increase the number of dynamic ports

Please run CMD as an administrator and run the following commands:

***netsh int ipv4 set dynamicport tcp start=1025 num=60000***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20Time_Wait%E8%BF%87%E5%A4%9A%E5%AF%BC%E8%87%B4%E8%AE%BF%E9%97%AE%E5%A4%96%E7%BD%91%E5%A4%B1%E8%B4%A502.png)

This step takes effect immediately without rebooting.

2. Reduce the time of Time Wait, with 30 seconds in minimum.

Open the registry and locate to HKLM\SYSTEM\CurrentControlSet\Services\Tcpip\Parameters to add a new key value TcpTimedWaitDelay, with the type of REG_DWORD and decimal 30. It will take effect after modification.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%20Time_Wait%E8%BF%87%E5%A4%9A%E5%AF%BC%E8%87%B4%E8%AE%BF%E9%97%AE%E5%A4%96%E7%BD%91%E5%A4%B1%E8%B4%A503.png)

If your problem still can not solved, please submit open ticket to us.

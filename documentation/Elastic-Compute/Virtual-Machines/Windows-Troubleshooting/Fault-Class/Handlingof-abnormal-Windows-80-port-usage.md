# Windows Port 80 Exception Processing
**Problem Phenomenon:**

The server port causes service startup failure due to exceptional occupation. For example, Tomcat installed on Windows cannot be started, for TCP Port 80 is already occupied by other applications.



**Problem Causes:**

The TCP/UDP port required by the application program are occupied by other programs or virus Trojans.



**Solution:**

1. Use Command

***netstat -ano |find ":80"***

The process ID of the occupied port is 4. Note: Please modify the port according to the actual condition.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%2080%E7%AB%AF%E5%8F%A3%E5%BC%82%E5%B8%B8%E5%8D%A0%E7%94%A8%E7%9A%84%E5%A4%84%E7%90%8601.png)

2. Use Command


***tasklist /svc| find "4"***

Users can see the system process. Note: Please modify the process ID according to the actual condition.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%2080%E7%AB%AF%E5%8F%A3%E5%BC%82%E5%B8%B8%E5%8D%A0%E7%94%A8%E7%9A%84%E5%A4%84%E7%90%8602.png)

3. Try to shut down IIS Service with a command.


***iisreset /stop***

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%2080%E7%AB%AF%E5%8F%A3%E5%BC%82%E5%B8%B8%E5%8D%A0%E7%94%A8%E7%9A%84%E5%A4%84%E7%90%8603.png)

4. However, Port 80 has still been occupied. Then, use the command to view the server.  


***curl -I 127.0.0.1***

The returned server is Microsoft-HTTPAPI/2.0 instead of Server: Microsoft-IIS/7.5.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%2080%E7%AB%AF%E5%8F%A3%E5%BC%82%E5%B8%B8%E5%8D%A0%E7%94%A8%E7%9A%84%E5%A4%84%E7%90%8604.png)

Only Microsoft products are able to employ Microsoft-HTTPAPI/2.0. Check if SQL SERVER is installed; if it does, users can try to shut down the SQL Server Reporting Service.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%2080%E7%AB%AF%E5%8F%A3%E5%BC%82%E5%B8%B8%E5%8D%A0%E7%94%A8%E7%9A%84%E5%A4%84%E7%90%8605.png)

5. After the shutdown, it will display that the Port 80 cannot be connected when curl -I 127.0.0.1 is used, indicating that the port has been released.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Virtual-Machine/Windows/Windows%2080%E7%AB%AF%E5%8F%A3%E5%BC%82%E5%B8%B8%E5%8D%A0%E7%94%A8%E7%9A%84%E5%A4%84%E7%90%8606.png)

Note: If the curl is not installed, users can use telnet 127.0.0.1 80 to finish the process. If ctrl+c is pressed to shutdown the program, the following figure will display. It can be seen that the server is Microsoft-HTTPAPI/2.0, but the served program cannot be judged simply from the server. It is only can be known that the port is occupied by Microsoft programs. Moreover, users need to check exact Microsoft programs installed on the ECS.



If your problem still can not solved, please submit open ticket to us.

# FAQ  
1. Which protocols are supported by site monitoring and which scenarios are applicable?  
A: Now, site monitoring supports the protocols including HTTP(S), TCP, PING, UDP, SMTP and FTP7.  
- HTTP(S): Web site monitoring service quality  
- TCP: TCP ports of monitoring servers  
- PING: If monitoring service can be pinged  
- UDP: UDP ports of monitoring servers  
- SMTP: Suitable for providing the site monitoring of email service  
- FTP: Suitable for providing the site monitoring of file service  

2. What are the common reasons for exception of site monitoring data?

- DNS resolution failure:  
Phenomena: Generally, the DNS server faces great pressure, the network between the client and the DNS server is unstable, packet loss occurs and the domain does not take effect.  
Reason: It is possible due to failure of DNS server or the DNS server of the detection ISP service provider.  
Solutions: You are suggested to find the DNS server for resolution from the failure logs and contact relevant person in charge. Please select a server operator having good network status in your region.

- Connection timeout:
Phenomena: If no connections are set up within 10 seconds after any request is sent by the detection point, it means that the network, server or backend service is unavailable.
Reason: It is possible that the backend server fails to provide normal service.
Solutions: You are suggested to check if the background service software can normally work.  

- Response timeout:  
Phenomena: Duration from sending a request to the reception moment of data is greater than 10 seconds or no connection is available.  
Reason: The server is busy possibly.  
Solutions: You are suggested to optimize the backend server performance to carry out expansion.  

- Connection failed:  
Phenomena: Errors are directly returned when a detection point is connected to the backend service.
Possible reason: The network between the detection point and the backend service is blocked or the backend service is not started.
Solutions: You are suggested to check if the network or the port listened by the backend service is normal.  

- Disconnection:  
Phenomena: Network connection between a detection point and the backend service is interrupted.
Possible reason: Before the background service is rebooted, all tcp connections will be actively disconnected, causing failure of the network link between the detection point and the server and loss of socket connection; or, the backend server is actively disconnected because the IP address is verified, connections exceed the maximum value and other reasons.
Solutions: You are recommended to check the server Web service program.  

- Ping time-out:  
Phenomena: During ping detection, no response is given by the server.
Possible reason: If such problem is found from a specific detection point, it is possible that a specific operator itself in a specific region has the network connectivity problem. If such problem is found from all detection points, it is possible that the server itself breaks down or losses response.
Solutions: You are recommended to check server status or open tickets for confirmation or consultation.  

3. For availability monitoring, why the detection result always fails, but Agent of Virtual Machines is normal?  
A: Please make sure the network of selected Virtual Machines is connected to that of the target detection address. For example, if the detection address is the one accessible for then public network, then the Virtual Machines require the public network address for normal access; if RDS is selected to be detected, please make sure that the selected Virtual Machines and the detected RDS are under the same VPC; and meanwhile, the network ACL of the subnet and the safety rules and policies of these Virtual Machines will release the access.  

4. Why the alarm rule of availability monitoring is in the "Insufficient Data" status?  
A: Please ensure the availability monitoring task is not disabled and remain its running status. In addition, please remain the plug-ins of Virtual Machines which are selected as the detection source in the normal status, keep the Virtual Machines in normal running state and make sure that Agent has been successfully installed.

# View the monitoring graph
1. Log in the Cloud Detection Console of JD Cloud & AI and click **Management -> Cloud Detection -> Site Monitoring** to log in the monitoring task list page.  
![任务列表](../../../../../image/Cloud-Detection/task-site-list-1.png) 
2. Select a monitoring task and click **Monitoring Graph** under the operation bar to log in the monitoring information page.  
![监控图表](../../../../../image/Cloud-Detection/views-site.png) 
3. You can view the availability rate and response time in the entire and different detection nodes of this monitoring task, and view the packet loss rate indicator for ping protocol. 
The new indicators added to the response time are defined as follows:

Indicator |Definition | Applicable Protocol
----| ---- | ----
DNS Time	 | DNS Domain Name Resolution Time| HTTP(S), SMTP, TCP, UDP and FTP Protocols
Connection Time | Time from issuance of a connection request to the completion of the connection|HTTP(S), SMTP, POP3, TCP, UDP and FTP Protocols
Sending Time | Time from issuance of a connection request to the completion of the request writing|HTTP(S), SMTP, POP3, TCP, UDP and FTP Protocols
First package Time | Time from issuance of a connection byte to the completion of the response of first byte|HTTP(S) Protocol
SSL Time | Time from issuance of a connection request to the completion of the SSL Certification|HTTP(S), SMTP and POP3 Protocols
Receiving Time | Time from issuance of a connection request to the receipt of the response content|HTTP(S), SMTP, POP3, TCP, UDP and FTP Protocols

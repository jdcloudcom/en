## Monitoring management

1. Turn on the Monitoring page by clicking the Application Application Load Balancer-Details-Monitoring;

1. Select the data view period: The monitoring data view of at least 1 hour and at most 14 days is supported or the monitoring data of specified time period (at most 30 days of a month) is supported;

1. Protocol port: Monitoring data of all listeners of the Application Application Load Balancer can be displayed by default, and the monitoring data of corresponding listeners can be viewed by inputting the specified port number.

1. If you need to set alarm rules for the monitoring indicator, please click “Set alarm rules” to go the Cloud Monitor Page for setting.

	![ALB监控管理](../../../../image/Networking/ALB/ALB-038.png)


| Monitoring indicator	| Description	|
| :- | :- |
|Added new requests	|Added new HTTP/HTTPS (limited to 7 layers) requests from clients to Application Application Load Balancer during statistical period.	|
|Active connections	|Time value of TCP connections in all ESTABLISHED status from clients to Application Application Load Balancer.	|
|Created new connections	| Connections created during the statistical period from clients to Application Application Load Balancer.	|
|Server error	|Request failures during the statistical period due to server failure. |
|Client error	|Request failures during the statistical period due to client failure. |
|Input Traffic Rate	|Rate of traffic accessing the Application Load Balancer by the client in the counting period.|
|Output Traffic Rate	|Rate of traffic forwarded to the client by the Application Load Balancer in the counting period.|
|Input byte number	|Number of traffic bytes accessing the Application Load Balancer by the client in the counting period.|
|Output byte number	|Number of traffic bytes forwarded to the client by the Application Load Balancer in the counting period.|
|Total byte number	|Sum of bytes inputting and outputting in the counting period.|

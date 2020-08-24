## Monitoring management

1. Turn on the Monitoring page by clicking the Application Application Load Balancer-Details-Monitoring;

1. Select the data view period: The monitoring data view of at least 1 hour and at most 14 days is supported or the monitoring data of specified time period (at most 30 days of a month) is supported;

1. Protocol port: Monitoring data of all listeners of the Application Application Load Balancer can be displayed by default, and the monitoring data of corresponding listeners can be viewed by inputting the specified port number.

1. If you need to set alarm rules for the monitoring indicator, please click "Set alarm rules" to go the Cloud Monitor Page for setting.

	![ALB监控管理](../../../../image/Networking/ALB/ALB-038.png)

| Monitoring indicator	| Description	|
| :- | :- |
|Added new requests	|HTTP/HTTPS Requests at the client, processed by the Application Load Balancer during a statistical period|
|Active connections	|The quantity of all ESTABLISHED TCP connections built between client and Application Load Balancer|
|Created new connections	|TCP connection requests created by clients and received by Application Load Balancer during a statistical period|
|Server error	|Failed requests due to reasons of servers in a statistical period, for example, due to backend server unavailability, backend connection timeout, oversize HTTP response header or format error, etc.|
|Client error	|Failed requests due to reasons of clients in a statistical period, for example, client connection timeout, wrong HTTP HOST field format, wrong HTTP request line field format, oversize HTTP request head or format error, HTTPS TLS request format error, low HTTPS TLS version or shared secret key suite unavailability, etc.|
|Input Traffic Rate	|Rate of traffic accessing the Application Load Balancer by the client in the counting period. This traffic rate is the sum of all rates of traffic accessing the Application Load Balancer by the client without a differentiation between intranet traffic and internet traffic|
|Output Traffic Rate	|Rate of traffic forwarded to the client by the Application Load Balancer in the counting period. This traffic rate is the sum of all rates of traffic forwarded to the client by the Application Load Balancer without a differentiation between intranet traffic and internet traffic|
|Input byte number	|Number of traffic bytes accessing the Application Load Balancer by the client in the counting period. This number of traffic bytes is the sum of all traffic accessing the Application Load Balancer by the client without a differentiation between intranet traffic and internet traffic|
|Output byte number	|Number of traffic bytes forwarded to the client by the Application Load Balancer in the counting period. This number of traffic bytes is the sum of all traffic forwarded to the client by the Application Load Balancer without a differentiation between intranet traffic and internet traffic|
|Total byte number	|Sum of bytes inputting and outputting in the counting period|

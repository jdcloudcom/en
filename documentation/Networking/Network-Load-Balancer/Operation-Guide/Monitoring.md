## Monitoring management

1. Turn on the Monitoring page by clicking the Load balancer-Details-Monitoring;

2. Select the data view period: The monitoring data view of at least 1 hour and at most 14 days, or the monitoring data of specified time period (at most 30 days for current month) is supported;

3. Protocol port: Monitoring data of all listeners of the network load balancer can be displayed by default, and the monitoring data of corresponding listeners can also be viewed by inputting the specified port number;

4. If you need to set alarm rules for the monitoring indicator, please click “Set alarm rules” to go the Cloud Monitor page for setting.

![NLB Monitoring Management](../../../../image/Networking/NLB/NLB-Monitor.png)

## Monitoring Metric Description

| Monitoring indicator	| Description	|
| :- | :- |
|Created new connection number	| TCP connections created during the statistical period from the client to the target through the load balancer.	|
|Created active connection number	| Total quantity of concurrent TCP traffic (or connections) from the client to the target through the load balancer. This indicator includes the TCP connections in SYN_SENT and ESTABLISHED statuses.	|
|Input traffic rate	| Input traffic per second (bps) during the statistical period from the client to the target through the load balancer.	|
|Input data package rate	| Input packets per second (pps) during the statistical period from the client to the load balancer.	|
|Input byte number	| Total traffic during the statistical period from client to the target through the load balancer.	|



# Limitation description

You care rapidly create and use the Application Load Balancer ALB, but shall pay attention to some registration conditions.


| Resource	| Limit	| Exception application method|
| :- | :- | :- |
|Application Load Balancer instances under a single region	|5	|Ticket|
|Listeners under one Application Load Balancer	|20	|None|
|Backend service under one Application Load Balancer	|20	|None|
|Virtual server group under one Application Load Balancer	|20|	None|
|Instances within one virtual server group	|100|	None|
|Forwarding rules group under the same Application Load Balancer	|50 groups|	None|
|Forwarding rules in a forwarding rules group	|50 rules|	None|
|Security group able to be associated by one Application Load Balancer|4 groups|	None|
|SSL certificate able to be uploaded under a single region|20 pieces|	None||


## Relevant references

- [Product overview](../Introduction/Overview.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Create instance](../Getting-Started/Create-Instance.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)

# Limitation description

You can rapidly create and use the network load balancer NLB, but shall pay attention to some registration conditions.


| Resources	| Limits	| Requests for Exceptions|
| :- | :- | :- |
|Load balancer instances under a single region	|5	|Ticket|
|Listeners under one load balancer	|20	|None|
|Backend service under one load balancer	|20	|None|
|Virtual server group under one load balancer	|20|	None|
|Instances within one virtual server group	|100|	None|


## Relevant References

- [Product overview](../Introduction/Overview.md)
- [Price overview](../Pricing/Price-Overview.md)
- [Create Instance](../Getting-Started/Create-Instance.md) for specific actions.
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)

# Restrictions
You can rapidly create and use the Distributed Network Load Balancer, but shall pay attention to some registration conditions in use.

| Resource	| Restriction	| Exceptional Application Method |
| :- | :- | :- |
|DNLB Instance Number Under a Single Region	|100	|Ticket|
|Number of Listener Under a Single DNLB	|50	|None|
|Number of Backend Service Under a Single DNLB	|50	|None|
|Number of Virtual Server Group Under a Single DNLB	|50|	None|
|Count of Instances within One Virtual Server Group	|1,000|	None|
## Related References
- [Product Overview](../Introduction/Product-Overview.md)
- [Product Pricing](../Pricing/Billing-Overview.md)
- [Create DNLB Instance](../Operation-Guide/Create-DNLB-Instance.md)
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)

# Product Specification

NLB supports the auto scaling and the NLB instances can be expanded as per the business flow; the user shall reserve the required private IP in the segment with NLB depending on the maximum business access scale; and at present, it is suggested at least 8 private IPs shall be reserved.


Product	| concurrent connections	| new connections per second	 |
:---|:--- |---: |
Network Load Balancer	| over 100 million | over a million | 

## Relevant References


- [Price overview](../Pricing/Price-Overview.md)
- [Billing rules](../Pricing/Billing-Rules.md)
- [Create Instance](../Getting-Started/Create-Instance.md) for specific actions.
- [Create virtual server group](../Operation-Guide/TargetGroup-Management.md)
- [Configure listening policy](../Operation-Guide/Listener-Management.md)
- [Manage rear end service and view health status of service instance](../Operation-Guide/Backend-Management.md)
- [View monitoring information](../Operation-Guide/Monitoring.md)

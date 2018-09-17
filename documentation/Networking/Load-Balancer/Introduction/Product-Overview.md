# Product overview


The load balancer can distribute large concurrent traffic to several backend instances, adjust resource utilization, eliminate influence to systems by fault of single device, improve system availability and expand system serviceability. 

The load balancer has the following features:

* Traffic distribution: By setting VIP, the backend instances (virtual machine/container) under the same VPC will be a virtual service pool by the load balancer, the access traffic of frontend customer will be distributed to the backend instance resource pool for processing as per specified rules and the external serviceability of the user can be improved.
* Multi-protocol listening: The load balancer supports the listening service to different ports under multiple protocols as TCP/HTTP/HTTPS, so as to support a variety of client service accesses and traffic distribution.
* Automatic health check: The load balancer service will check the health status of instances in the backend service resource pool, automatically isolate and attach service instances provided by the backend, eliminate single point fault of equipment and guarantee normal operation of business.
* Automatic adjustment of backend instance count: The load balancer backend can be associated to the specified availability group. By setting auto scaling policy, the backend service instance count can be automatically adjusted and resources can be reasonably configured.
* Anti-DDos attack: The anti-DDoS attack ability based on Public IP is provided to improve service security performance.
* Session persistence: The load balancer supports the session persistence function based on the HTTP/HTTPS protocol type.
* Idle connection timeout: The load balancer supports the idle connection timeout based on the TCP/HTTP/HTTPS protocol.
* Source IP pass-through: The load balancer supports the client IP pass-through function based on the TCP/HTTP/HTTPS protocol.

## Common operation

- Easy operation
	- [Create instance](../Getting-Started/Create-Instance.md)
	- [Set white list](../Getting-Started/Set-Whitelist.md)
	- [Connect instance](../Getting-Started/Connect-Instance.md)
- Data migration
	- [Import data to Cloud](../Getting-Started/Import-Data.md)
	- [Export data from Cloud](../Getting-Started/Export-Data.md)
- Expansion upgrade
	- [Change instance type](../Operation-Guide/Instance-Management/Modify-Instance-Spec.md)
- Backup and recovery
	- [Set automatic backup policy](../Operation-Guide/Backup/Modify-Backup-Policy.md)
	- [Manually create backup](../Operation-Guide/Backup/Create-Backup.md)
	- [Recover data](../Operation-Guide/Backup/Restore-Instance.md)
- Operation and maintenance management
	- [View monitor information](../Operation-Guide/Monitoring/Monitoring.md)
	- [Set alarm rules](../Operation-Guide/Monitoring/Alarm-Rules.md)

## Billing
At present, the product of load balancer is used for free. If any public IP resource is associated, the EIP cost shall be paid independently. For details, please refer to [Public IP cost](https://www.jdcloud.com/help/detail/1579/isCatalog/1).

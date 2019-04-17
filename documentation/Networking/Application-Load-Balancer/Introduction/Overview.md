# Product overview


The Application Load Balancer can distribute large concurrent traffic to several backend instances, adjust resource utilization, eliminate influence to systems by fault of single device, improve system availability and expand system serviceability. 

The Application Load Balancer has the following features:

* Traffic distribution: By setting VIP, the backend instances (virtual machine/container) under the same VPC will be a virtual service pool by the Application Load Balancer, the access traffic of frontend customer will be distributed to the backend instance resource pool for processing as per specified rules and the external serviceability of the user can be improved.
* Multi-protocol listening: The Application Load Balancer supports the listening service to different ports under multiple protocols as TCP/TLS/HTTP/HTTPS, so as to support a variety of client service accesses and traffic distribution.
* Automatic health check: The Application Load Balancer service will check the health status of instances in the backend service resource pool, automatically isolate and attach service instances provided by the backend, eliminate single point fault of equipment and guarantee normal operation of business.
* Automatic adjustment of backend instance count: The Application Load Balancer backend can be associated to the specified availability group. By setting auto scaling policy, the backend service instance count can be automatically adjusted and resources can be reasonably configured.
* Anti-DDos attack: The anti-DDoS attack ability based on Public IP is provided to improve service security performance.
* Session persistence: The Application Load Balancer supports the session persistence function based on the HTTP/HTTPS protocol type.
* Idle connection timeout: The Application Load Balancer supports the idle connection timeout based on the TCP/TLS/HTTP/HTTPS protocol.
* Source IP pass-through: The Application Load Balancer supports the client IP pass-through function based on the TCP/TLS/HTTP/HTTPS protocol.


## Billing
At present, the product of Application Load Balancer is used for free. If any public IP resource is associated, the EIP cost shall be paid independently. For details, please refer to [Public IP cost](../Pricing/Billing-Overview.md).

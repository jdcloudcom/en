# Application Scenario

The ENI is applicable in building application scenarios such as single machine hosting multiple business, business traffic separation, and high availability networks. See the information below for specific user scenario and descriptions.

## A Single VM Hosting Multiple Public Network Business
Since the ENI features multiple IP address, it can support the construction of a scenario where a single VM deploys multiple internet businesses. In the case that users provide multiple HTTPS-based web services on the same VM, and each security certificate needs to be associated with a specific IP address, the user’s cost can be greatly saved and the resource utilization rate of the VM can be improved by adopting this deployment method. The scenario architecture is listed below:

![Multi-service bearer scenario](../../../../image/Networking/Elastic-Network-Interface/eni-001.png)


##  VM Business Traffic Separation
Business traffic separation and network isolation is one of the most typical application scenarios of ENI. VM can be mounted with several ENIs belonging to different subnets in the same VPC. Specific network interfaces will host traffic management of intranet, public network and management network in the VM respectively. The access security control policy and the routing policy can be independently set for subnet. Besides, independent security group policy can also be configured for ENI, thus realizing network isolation and business traffic separation. The scenario architecture is listed below:

![Traffic flow separation scenario](../../../../image/Networking/Elastic-Network-Interface/eni-002.png)

## Solutions for High Reliability Application
JD Cloud provides an ENI according to the region level, capable of setting up high-availability solutions and providing powerful support for the user in availability zone. Based on keepalived tools, the user can realize disturbance switching of IP or network interface. Under specific context, the user’s ENI is under strong correlation with the security device strategy and the security certificate. In case of a fault, it needs to use the ENI for migration. Under common scenarios, the user can use IP migration to realize disturbance switching. The scenario architecture is listed below:

![High reliability application solution](../../../../image/Networking/Elastic-Network-Interface/eni-003.png)


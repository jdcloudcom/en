# Use Restrictions

Before using the ENI, please acknowledge the following usage restrictions of the ENI.

## Region Quota
Each JD Cloud account can create 100 secondary network interfaces per region. Some resources will take up the quota of ENI when they are created, such as Kubernetes Service.

## Private IPs
Each ENI can be assigned with 1 primary IP address and 20 secondary IP addresses, and such limit cannot be modified.

#### Security Group
Each ENI can be associated with 1 to 5 security groups, and such limit cannot be modified.

## Availability Zone
ENI can be associated to VM with the same virtual private cloud attribute and are not limited by the availability zone.

## Elastic IP
Elastic IP with secondary network interface associated with “Availability Zone A” attribute is not supported.

## Miscellaneous
The ENI list page only displays secondary network interface operation. Please enter the details of the VM for operations related to the primary network interface.

## Quota of VM Network Interface

| Configuration of VM	| Number of ENI	s|
| :- | :- |
|CPU: 1 core -2 cores 	|2	|
|CPU: 4-8 cores	|4	|
|CPU: more than 8 cores	|8	|


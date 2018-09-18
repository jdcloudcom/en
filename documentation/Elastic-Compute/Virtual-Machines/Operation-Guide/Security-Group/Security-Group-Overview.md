# Security Group Overview
A security group is a distributed, stateful packet filtering virtual firewall that provides network identity and access management to an instance to control the traffic to one or more instances.

When an instance is created, it can be associated with corresponding security group to add instances with the same requirements for network security isolation in the same region to the same security group. Configure security group policy to perform security filtering on the inlet and outlet traffic of an instance.

To create a security group is to enforce an All drop rule for all inlet/ outlet traffic by default; you can add or delete rules for a security group at any time, and the new rules will be automatically applied to all instances associated with that security group.

You can create 50 security groups under each Virtual Private Cloud in each zone. At most 100 rules can be added for each security group in both directions to meet your requirement for network security isolation.

Each network interface corresponding to each instance must be bound to at least one security group and it can be bound to up to 5 security groups to achieve precise control for instance access traffic.
 
## Security Group Template:
The console currently provides three default security group templates:
* Linux security group allows port 22: the inbound rule only allows port TCP 22 port for SSH login, and the outbound rule allows all traffic by default;
* Windows security group allows port 3389: the inbound rule only allows port TCP 3389 for MSTSC login, the outbound rule allows all traffic by default;
* Default security group allows all traffic: inbound/outbound rule allows all traffic by default, and there is a certain security risk
The default security group is configured only as the basic access rule when the machine is quickly created, and the default rule in the template cannot be modified or deleted. If the default rule conflicts with the rule you want to add, create a new security group to configure the rule and associate it with the machine.

## Difference between Security Group and Network ACL

|   **Security Group**  |  **Network ACL**   |
| :--- | :--- |
|  Stateful   |  No state   |
|  Effective at Instance (Network Interface) Level   |  Effective at Subnet Level   |
|  Only Support Allowed Rules  |   Support Allowed and Denied Rules  |
|  Apply to all associated instances  |  Automatically apply to all instances within the subnet   |
## Infrastructure Architecture 

### Overview

JD VPC is completely developed by the JD Cloud Virtual Network Team. A series of performance optimizations have been carried out for traditional SDN networks, such as de-single point and de-single link at different levels. The specific logical architecture is as follows: 

![](/image/Networking/Virtual-Private-Cloud/Basic-Infrastructure.png)



### Component

VPC: VPC is a representation of user network on JD Cloud and contains a series of network functions that are logically isolated from other VPCs. VPC has a network address space in which users can continue to subnet.

Subnet: Subnet is a further division of VPC address space. Users can create VMs in subnet.

Route Table: Route table is implemented on Vrouter. Vrouter itself is not exposed to users, and users can configure routes through route table.

ACL: ACL is implemented on Vrouter. Vrouter itself is not exposed to users, and users can configure subnet-level east-west and south-north access control through ACL.

Security Group: Security group is implemented on each compute node, and users can configure instance-level east-west and south-north access control through security group.

Public Network Gateway: Public network gateway is implemented outside VPC. By default, JD Cloud has configured a public network gateway for each user. Users can configure routes in route table to use public network gateway.

BGW: BGW is implemented outside VPC and carries dedicated Line channel and hosted private virtual interface channel. Users can purchase as requirements and use BGW gateway by configuring route table.



### Multiple AZ Architecture

Subnet: Subnet is a cross-AZ product. Users do not have to select AZ zone when creating subnet. Resources in the subnet can be created and used only based on a certain AZ zone, or distributed to multiple AZ zones.

VPC IP: VPC IP is a cross-AZ product. The AZ attribute of VPC IP is determined by the AZ attribute of associated resources (such as VM).

Public IP: EIP is a cross-AZ product. When users apply for EIP, they do not have to select the attribute of available zones. EIP can be used by default in all AZ zones.

Load Balancer: Load balancer is a multi-AZ product. Users have to select AZ attribute when creating load balancer, and can assign available zones for load balancer as requirements.
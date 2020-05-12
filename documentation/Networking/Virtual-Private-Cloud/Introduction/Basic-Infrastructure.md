## Infrastructure Architecture 

### Overview

JD VPC is completely developed by the JD Cloud & AI Virtual Network Team. A series of performance optimizations have been carried out for traditional SDN networks, such as de-single point and de-single link at different layers. The specific logical architecture is as follows:

![](/image/Networking/Virtual-Private-Cloud/Basic-Infrastructure.png)



### Component

VPC: VPC is a form of user’s network on JD Cloud & AI and contains a series of network functions that are logically isolated from other VPCs. VPC has a network address space in which users can continue to divide subnet spaces.

Subnet: Subnet is a further division of VPC address space. Users can create VMs in subnets.

Route Table: Route table is implemented on Vrouter. Vrouter itself is not exposed to users, and users can configure routes through route table.

ACL: ACL is implemented on Vrouter. Vrouter itself is not exposed to users, and users can configure subnet-level east-west and south-north access control through ACL.

Security Group: Security group is implemented on each compute node, and users can configure instance-level east-west and south-north access control through security group.

Public Network Gateway: Public network gateway is implemented outside VPC. By default, JD Cloud & AI has configured a public network gateway for each user. Users can configure routes in route table to use public network gateway.

BGW: As the Border Gateway of VPC, BGW supports the interconnection among VPCs, among VPC and Private Virtual Interface and Hosted Private Virtual Interface; users can create interconnection APIs and channels by themselves based on demands and realize interconnection among different business ends through configuration of Route Table.



### Multiple AZ Architecture

JD Cloud & AI supports two availability zones: Central availability zone and edge zone, and accordingly supports two types of Subnet: Standard Subnet and Edge Subnet; support two types of Public IP: Standard Elastic IP and Edge Elastic IP.

**Concepts Related to Central Availability Zone:**

Standard Subnet: Standard Subnets cross multiple central availability zones. Users need not to select an AZ when creating a Standard Subnet. Resources in a Standard Subnet can be created and used based on a central availability zone and by distributing in multiple central availability zones.

Standard Subnet Private IP: The Standard Subnet Private IP is a cross-AZ product. The AZ attribute of Standard Subnet Private IP is determined by the AZ attribute of the associated resources (e.g. VM).

Standard Elastic IP: Standard Elastic IP is a cross-AZ product. Users need not to select an AZ when applying for a Standard Elastic IP and the Standard Elastic IP can be used in all central AZs by default.

Load Balancer: Load Balancer is a multiple-AZ product. Users need to select an AZ attribute when creating Load Balancer. Uses can designate the central AZ where the Load Balancer locates as required. Load Balancer cannot be created in an edge zone.

**Concepts Related to Edge Zone:**

Edge Subnet: Creating an Edge Subnet requires association with an edge zone. VM in an Edge Subnet can only be created and used based on the corresponding edge zone.

Edge Subnet doesn't support Elastic Network Interface and multiple private IPs in network interface.

Edge Elastic IP: The Edge Elastic IP shall designate an edge zone as the ISP line access area. Currently, the Edge Elastic IP only supports association with VMs having the same edge zone as its ISP line access area, and doesn't support association with VMs in central availability zones or VMs in other edge zones.

Both the Edge Subnet and Edge Elastic IP associate with the edge zone. VMs created in an Edge Subnet can only associate with an Edge Elastic IP and cannot be connected to the intranet of VMs in central availability zones or VMs in other edge zones under the same VPC.
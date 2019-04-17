# 2 Network Service
      
## 2.1 Virtual Private Cloud

JD Cloud Virtual Private Cloud (VPC) is a logically isolated network space that customized by users on JD Public Cloud. This virtual private cloud space is fully controlled by users and supports customized network segmentation and routing policies. Users can create and manage multiple cloud products in the VPC, such as Virtual Machines, load balancer, etc., and configure resources within the network to connect to the Internet.

The overall architecture of Virtual Private Cloud (VPC) is shown as follows:

![图 6 私有网络逻辑架构图](https://github.com/jdcloudcom/cn/blob/edit/image/Security-Information/vpc11.jpg)

The Virtual Private Cloud (VPC) is the expression of user network on JD Cloud, which contains a series of network and security functions and is isolated from other VPC logic. The primary protection of security group is realized in the instance level, the secondary protection of network ACL is achieved in the subnet level, and 100% security isolation of network is realized between VPCs so that the purpose of IAM can be achieved.

### 2.1.1 Customized Network

JD Cloud is the Virtual Private Cloud providing secure isolation, so that different VPCs are completely isolated and users can customize VPC segment scope, configure subnets, route tables, ACL in the VPC by themselves.

### 2.1.2 Route Policies of Subnet

JD Cloud provides route policies that can be configured flexibly, which can implement route policy edit based on the subnet and accurately control the network traffic accessing the subnet. Route table is a set of route rule collections used to control the directions of traffic accessing the subnet in the Virtual Private Cloud. JD Cloud has two kinds of route tables in total: default route table and customized route table. The default route table is automatically created when creating Virtual Private Cloud while customized route table is created by the users of their own.

### 2.1.3 ACL

Access Control List (ACL) is a subnet level, stateless and optional security layer used to control the data traffic accessing the subnet with the accuracy to be protocol and port granularity, which can be used as the firewall to control the traffic accessing one or multiple subnets.

ACL is implemented on the Vrouter that is not exposed to users who can configure IAM of east-west and south-north directions at subnet level with ACL. Subnets with the same network traffic control can be associated with the same Network ACL. By setting inbound and outbound permission rules, the traffic coming into and out of the subnet can be precisely controlled.

### 2.1.4 Security Group

Security group is a kind of distributed, stateful virtual firewall with packet filtering function, which can implement network IAM for Virtual Machines and Containers, so as to control the access traffic of one or multiple Virtual Machines and Containers. When creating Virtual Machines and Containers, they can be associated to corresponding security groups, which Virtual Machines and Containers with the same network security isolation requirements in the same region will be added into the same security group. The security filter of accessing traffic of Virtual Machines and Containers can be conducted by configuring security group policies.

New security group executes All Drop rule to importing and exporting traffic by default, with a default configuration of allowing all traffic at the export. Users can add or delete rules of security group at any time, of which new rules will be automatically applied to all Virtual Machines and Containers associated with the security group. It can create 50 security groups under each Virtual Private Cloud in each region, which each security group can add 100 rules on bi-direction at most to meet the requirements of users to network security isolation.

### 2.1.5 VPN

VPN gateway provides data encryption transmission service based on the Internet, which can implement interconnection between different VPCs and communicate enterprise IDC with JD Cloud Intranet so as to implement CodeDeploy for Hybrid Cloud. VPN gateway can be created by using image with VPN functions.

· Provide encryption data transmission channel

JD Cloud VPN use the methods of IPSEC, IKE, pre-shared key pair to carry out encryption for the data, providing secure and reliable communication channel based on public network.

· With flexible networking method, support multi-channel sharing gateway

Support to set up multiple channels under VPN gateway (require different opposite terminal gateway) to provide relatively flexible networking method for addressing different business scenario requirements.

· Channel connectivity check, automatically restore channel function

VPN provides  automatic check for channel connectivity by default, which check the connectivity state of the channel and automatically reconnect the disconnected channel for ensuring its availability.

### 2.1.6 NAT Gateway

The problem that Public IP resource is insufficient due to Internet access demand of multiple Virtual Machines in the same VPC can be solved by creating NAT gateway. JD Cloud support self-established NAT gateway for implementing SNAT function. The NAT gateway of JD Cloud Virtual Private Cloud provides security conversion of IP and help use hide the Public IP of the Machines in the Virtual Private Cloud to avoid exposing its network deployment.

### 2.1.7 Elastic Network Interface

Elastic network interface is a kind of virtual network interface, which can be associated with Virtual Machines by users for connecting the Virtual Machines to different networks. The elastic network interface is applicable in building application scenarios such as business traffic separation, multiply businesses hosting and network high availability. JD Cloud provides region level attribute elastic network interface that can be associated with any Virtual Machine in a Virtual Private Cloud. Single Virtual Machine can associate multiple elastic network interfaces with number depending on the specification of the Virtual Machine.

· Route Control

Virtual Machines can attach multiple elastic network interfaces belonging to different subnets, with IAM policies and route forward policies can be set for each subnet respectively to realize the isolation between businesses and networks.

· Business Security

By attaching multiple elastic network interfaces for Virtual Machines, the traffic of specific business can be hosted by specific elastic network interface. Different elastic network interface can be associated security groups respectively with different security policies so as to implement accuracy control to business traffic.

· Reliable Fault Tolerance

Provide elastic network interfaces without availability zone attribute, support the dynamic migration for elastic network interfaces between Virtual Machines in different availability zones, realize the high availability scheme at availability zone level, shorten the fault time and improve the system reliability.

## 2.2 Load Balancer

The load balancer can distribute large concurrent traffic to several virtual machines, adjust resource utilization, eliminate influence to systems by fault of single virtual machine, improve system availability and expand system serviceability.

· High Availability

JD Cloud load balancer provides high availability service by automatic redundancy mechanism, which can automatically provide active-active load balancer service to ensure the high availability of service after creating the instances of load balancer.

· Automatic Health Check for Guaranteeing the Availability

The load balancer service will check the health status of Virtual Machines in the Cloud Server pool, which automatically isolates Virtual Machines providing services, attach backend to eliminate SPOF for the servers and guarantee the normal running of business.

·  Elastic IP Association and Intranet Protection

Load Balancer can be configured in the Intranet environment, and provide external services by associating EIP. Therefore, the Intranet structure can be concealed, so as to enhance the system security. Besides, a more secure protection system can be built by setting a firewall or taking other measures.

· Anti-DDoS attack

Provide the capability of anti-DDoS attack based on Public IP to improve security performance of services.

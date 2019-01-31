# 3. Network Security

JD Cloud provides a mature network security architecture and multi-layer protection security scheme. It provides security isolation and strict IAM between production network and non-production network, business network and management network, as well as virtual network and physical network. JD Cloud provides a reliable network infrastructure to support the connection demands of applications and services, including the network connection or access that possibly exists between the Internet and cloud platform, between resources in the cloud platform, and between local resources and hosted resources.

## 3.1 Security Architecture

![图 5 网络安全架构](https://github.com/jdcloudcom/cn/blob/edit/image/Security-Information/internet11.jpg)


The provision of reliable security components in the border region among the Internet and cloud platform service as well as resource groups may prevent the untrusted network from accessing the internal network resources. It includes anti-denial service (DDoS), Application Security Gateway, Web Application Firewall and VPN device, and also implements firewall policy, IAM list (ACL), specific route and other security policies.

On the cloud platform, network resources are provided with various security tools and functions to create the relevant security services. JD Cloud VPC supports users to build network environment with logic isolation on JD Cloud. In such environment, users can implement autonomous planning for network deployment, including network scope, subnet segment, routing policy, etc., and implement multilevel security protection through security group and network ACL etc.

## 3.2 Border Network Security

Border network is the network region between the Internet and cloud platform virtual network. For the inbound traffic from the Internet, DDoS Protection may prevent massive attacks against JD Cloud, and Application Security Gateway and Web Application Firewall will carry out security protection for cloud platform network or APP service. Public IP address defined by the user may determine the traffic able to enter into the cloud platform virtual network through cloud services based on such route protections. VPN gateway provides data encryption transmission service based on the Internet.

Before the Internet traffic enters into the virtual network, the cloud platform itself will implement two layers of security:

· Border Protection

DDoS Protection provides high-efficiency protection capability, to guarantee the stability of the cloud platform network. See details in "DDoS Protection" chapter.

Web Application Firewall avoids malicious web server intrusion and ensures the core data security of the business. Application Security Gateway carries out visual security analysis and application layer security protection for cloud platform website or APP service. See details in "Web Application Firewall, Application Security Gateway" chapter.

 · Route Protection

Through the enabling of routes and policies, Elastic IP, Application Gateway and other cloud platform functions, public IP addresses routed to the user’s resources are presented to the Internet, and network address translation (NAT) is used to route the traffic to the internal addresses and ports on the cloud platform virtual network, so that the cloud service or resource groups can make the public Internet IP addresses and ports open to the public. The path is the main method for the external traffic to enter into the virtual network. It can configure the public IP address, and determine the incoming traffic, how to convert the traffic on the virtual network, and where it will be routed.

 · Other Security Protection

Firewall: Firewall rules or IAM policies are implemented to incoming requests.

Threat Detection and Prevention: Detect and mitigate malicious attacks from the Internet.

Review and log records: Maintain detailed records for review and analysis.

Reverse proxy: Redirect the incoming request to the corresponding backend server. The redirection involves mapping and converting the target address on the frontend device (generally the firewall) into the backend server address.

VPN device: It is used as crossover VPN gateway, and used for crossover VPN connection between the user on the local network and the virtual network.

## 3.3 Virtual Network Security

The virtual network is a logic construction built on the physical cloud platform network structure. The isolation of each virtual network with all the other virtual networks helps guarantee the customers of other cloud platforms are unable to access the traffic in deployment. Isolation of virtual networks can ensure the complete isolation with all the other networks, and the traffic can only flow through the path with the method configured by the user. Security group, route forwarding and network virtual devices can be used to create a security border, to protect the application deployment in the protected network.

· Traffic Isolation

VPC is a traffic isolation border on the cloud platform. Different Virtual Machines (VMs) in one VPC cannot directly communicate with each other, even if they are created by the same user. For the inbound traffic of virtual network, isolation can guarantee that the user’s VM and communication maintain their privacy in the virtual network.

· Multi-layer Topologies

Virtual network allows the user to divide multi-layer topologies by assigning subnets and specifying independent address spaces for different elements or "layers" of workload. These logic groups and topologies may allow the user to define different access policies based workload type and control the traffic among layers.

· Cross-origin Connection

The user can create cross-origin connection among the virtual network and multiple local sites or other virtual networks in JD Cloud. The customer can use VNet peer-to-peer interconnection, VPN gateway, third-party network virtual device or private virtual interface to build connection.

· Security Group

The user creates rules (ACL) based on the required granularity (network interface, single VM or virtual subnet). The workload in the virtual network is permitted or denied through cross-origin connection or direct Internet communication so as to control the access.

· Customized Route and IP Forwarding

It allows the user to define the communicate paths among different layers in the virtual network. The user can deploy the firewall, IDS/IPS and other virtual devices, and route the network traffic through these security devices, so as to implement security border policies, review and check.

· Other Network Virtual Security Devices

Firewall, load balancer and IDS/IPS, bastion host as well as other security devices are provided in the cloud marketplace and VM image library The user can deploy these devices to the user’s virtual VPC, especially security border (including perimeter network subnet), to implement multi-layer security network environment.

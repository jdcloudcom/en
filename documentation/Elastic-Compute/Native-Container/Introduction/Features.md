# Features

JD Cloud native container mainly provide following functions and experience JD Cloud console for more functions:

**Product Type**

Product modality: it supports two types of Native Container Instance and Native Container Pod; JD Cloud console provides separated operation interfaces for the two types of native containers.

Native Container Instance: one Container Instance only runs single container that exclusively enjoys all resources defined by instance type.

Native Container Pod: compatible with Kubernetes Pod definition, one Pod encapsulates multiple containers of sharing kernel, network and file system.

**Specification and Billing**

Enrich configuration: JD Cloud provides Native Container Instance and Native Container Pod with different type and configuration of general type, compute optimized type, memory optimized type, high frequency compute, which easily addresses various micro-miniature business and large business. It can fully satisfy requirements of different business types so that users can buy them as required.


Flexible billing: JD Cloud Native Container Instance and Native Container Pod provide billing type of paying by configuration, with the billing granularity to be as low as second level. It does not charge resources in stop status. The minimum billing cycle is 5 minutes. It supports monthly package that can decrease investment cost efficiently.

**Reliable Storage**

Persistence Storage: Cloud Disk Service provides Native Container Instance and Native Container Pod with persistence storage with low latency and high reliability.

Cloud Disk Service and its snapshot: cloud disk service provides customers with two types of cloud disks of Premium Hdd Cloud Disk and SSD Cloud Disk. It supports to set capacity of Cloud Disk Service as required and the capacity can be expanded at any time to satisfy the rapid increase of business. In addition, Cloud Disk Service provide function of make snapshot that can further satisfy data backup, batch deployment, rapid restore and other demand scenarios

**Networking**

Network isolation: virtual private cloud divides a private space for isolation security for users. Virtual Private Clouds are independent and isolated with each other, deploying Native Container Instance and Native Container Pod in different Virtual Private Clouds can implement network isolation. Users fully control network management, supporting subnet independent division, Public IP configuration, etc. Moreover, it can use VPN or dedicated line to connect user local servers with JD Cloud Native Container Instance or Native Container Pod to implement the expansion of current network deployment.

They are instance resources in VPC together with VM, database, etc.; assign private IP in subnets and it can realize accurate Identity and Access management based on security group; it can intercommunicate with Redis cache and object storage service.


**Docker Image**

Image: directly run Native Container Instance and Native Container Pod based on Docker Image to quickly implement lightweight deployment and rapid start.

Repository: seamlessly integrated with JD Cloud repository to implement high speed image download and accelerate the deployment of container application.


**Security Group and Monitoring**

Security Group: security is a kind of distributed virtual firewall with status that has the function of detecting and filtering data packages accessing Native Container Instance and Native Container Pod. Use security group can implement network access control for single or multiple groups of resources, including the east-west traffic between resources and south-north traffic of communication between resources and public network. Network security isolation between containers can be realized by using the Security Group function. Network security isolation between containers can be realized by using the Security Group function.  

Monitoring: monitor in multi-dimension, grasp instance running status in real time, provide CPU use rate, memory use rate, system disk read-write traffic, network access traffic, which can set alarm function for different monitoring parameters and alarm in real time to facilitate users to rapidly aware business peak and adjust instance type timely.


**Health Check**  
It supports survival detection for configuration container of Native Container Pod, automatically re-detects ailed container; supports configuration ready detection and report detected status in real time to provide reliable basis for upper applications to determine the status of the container.

**Log**

Log check: Provide check function for standard logs of the container and the log has a maximum volume of 10M.



# Core Concepts

About JD Cloud Swift, you need to understand the following concepts:

| **Concept**   | **Introduction**                                                     |
| ---------- | ------------------------------------------------------------ |
| Cluster       | Cluster is a group of physical server that provides resources for users as a whole. Cluster is featured with expandability, high availability, Load Balancer and error recovery. A physical server in the same cluster must install a same operating system (Virtual Machines management program, Hypervisor), owning the same two-layer network connection. |
| Basic Node   | A kind of physical server that takes responsibility for the basic component service in running cluster to provide running environment support for the whole cluster. |
| Control Node   | A kind of physical server that takes responsibility for controlling the remaining nodes, including Virtual Machines establishment, migration, network assignment, storage assignment, etc. |
| Computing Node   | A kind of physical server that takes responsibility for Virtual Machines running and providing VM Instance with resources such as computing, network, storage. |
| Storage Node   | A kind of physical server that takes responsibility for extra storage management of Virtual Machines, which is a storage server used to store Virtual Machines disk files. |
| Network Node   | A kind of physical server that takes responsibility for communication between Internet (public segment) and in-cloud network (private segment) and communication/topology between management Virtual Machines networks. |
| Virtual Machines     | Computing resources on JD Cloud Swift platform, which is a virtual machines instance running on a physical machine that can access the public network to run the application service with independent IP address. |
| Availability Zone     | Physical deployment location of Virtual Machines and other resources.                             |
| Virtual Machines Specifications | Virtual Machines Specifications identify different Virtual Machines configurations, including vCPU (core), memory (GB), system disk capacity (GB) and system disk type. |
| Image       | Preset template of Virtual Machines running environment, including preconfigured environment of server (current version only includes operating system). |
| Cloud Disk Service     | Distributed and persistent block storage device that can be used as data disk of VM Instance to provide extra bucket for Virtual Machines. |
| Cloud Disk Snapshot | Data backup of a certain disk at a certain time point                           |
| Cloud Disk Service Specifications | Definition of creating the size of Cloud Disk Service Capacity.                                   |
| Object Storage Service   | Storage based on object. Each object is stored in a storage pool with a plat address space. All objects in this space are attributable to one same layer, excluding the multiple level tree directory structure in file system. |
| Bucket   | Bucket is the fundamental organization unit of data in Object Storage Service and all data must be a certain Bucket. The name of bucket is globally unique. Each bucket has its own access permission and other attributes that satisfy the storage demands in different scenarios together with other advanced attributes. |
| Object       | Object is the fundamental unit in Object Storage Service and an object contains the object name, file data and its related metadata. Data uploaded by a user to JD Cloud Swift Object Storage Service are stored in the bucket in the form of object. |
| AK/SK      | AccessKeyId (AK) and SecretAccessKey (SK) are identities used by users for accessing JD Cloud Swift Object Storage Service. |
| VLAN       | In a computer network, a two-layer network can be divided into multiple different broadcast domains, which is called VLAN (Virtual Local Area Network). A broadcast domain is related to a particular user group. Under default circumstances, these different broadcast domains are isolated to each other. If communication among different broadcast domains is required, it can be done through one or more routers. |
| Public Network   | IP address field of the external Internet may be connected by the public address field assigned by the Internet information center. |
| Virtual Private Cloud| Customized virtual network space can implement logical separation between resources.                 |
| Intranet Address   | Connection address that provides source IP and clients of private network with services                     |
| Floating IP     | Public IP that can be dynamically associated/disassociated with Virtual Machines, i.e. IP address of VPC accessing to a private network. |
| Security Group     | Virtual Machines level security IAM effective can appoint inbound and outbound Virtual Machines IPs, network package flow, protocols and port rules. |
| Cloud Management Platform   | User resource management interface based on Web.                                  |
| Subnet       | A subnet is an IP address block within the VPC. Cloud resources in the current VPC (e.g. Virtual Machines, Load Balancer, etc.) are deployed in Subnet. After creating a network, you can add a Subnet under the network or create a Subnet at the same time of creating a network. IP address blocks of Subnets under the same network cannot overlap, and IP address blocks of Subnets under different VPCs can overlap. |
| Virtual Routing   | A kind of logic device used to implement functional simulation of physical router in software and hardware layers. The virtual routing separately runs the route protocol instances and has their specific I/O port, address space and route table, etc. |
| Route Table      | Route Table is a set of route rule collections used to control the directions of traffic accessing the Subnet in VPC. |
| NAT        | NAT is short for Network Address Translator. Virtual routing can provide enterprise level public network access services for users through NAT. |
| Load Balancer   | Load Balancer may distribute traffic to a number of Virtual Machines, improving application system availability by eliminating single points of fault. |
| Organization       | Organization is a collection of users. JD Cloud Swift consists of 4 levels of organizations except the root organization. With the organizational grading, the system administrator can more conveniently divide the resources and assign the permission. |
| System Administrator | Default user role when the JD Cloud Swift platform is initialized, and the holder of highest permission of the system, who has the complete control right to the system and manages the organization, user, quota and operation and maintenance monitoring for the whole platform. |
| Tenant Administrator | Leader of tenant's organization, who manages its own organization personnel and assigns quota and is able to access the cloud resources. |
| Tenant       | User with basic cloud permission and user of cloud resources. Created through system administrator or superior tenant administrator. |
| Operation and Maintenance Administrator | Leader of operation and maintenance personnel who can manage the operation and maintenance personnel and have the operation and maintenance permission.       |
| Operation and Maintenance Personnel   | Operation and maintenance personnel on the cloud platform, who mainly deal with issues and faults generated on the cloud platform. Created through system administrator or superior operation and maintenance administrator. |
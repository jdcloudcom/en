# Cloud Product Service Security


JD Cloud provides users with IaaS, PaaS and SaaS multiple class cloud product services, including computing, network, storage, database, big data analysis, application, management, security, etc., so as to provide users with assurance for secure empowerment and convenient access to cloud. The following is a basic technical and security introduction for each cloud service. You can log in JD Cloud official website www.jdcloud.com to query the specific content.

## 1. Computing Service

### 1.1 Virtual Machines

Virtual Machine is a basic service unit of cloud computing provided by JD Cloud, providing computing services with scalable processing capacity. It includes CPU, memory, operating system, disk, network, security and all required resources. Every resource has a variety of specifications to choose to meet the personalized needs of different business. JD Cloud provides multilevel Virtual Machines security protection and guarantee.

#### 1.1.1 User Isolation

User instance isolation isolates multiple virtual machines at the system level based on virtual machine management of hardware virtualization technology. At the same time, storage isolation and network layer isolation are provided in the virtualization management layer.

· Virtual Machine Isolation

Through the abstraction of the physical resources of the server, the physical resources such as CPU, memory, I/O are transformed into a set of logical resources that can be uniformly managed, flexibly scheduled and dynamically assigned, based on which multiple virtual machine execution environments that run simultaneously and are isolated from each other are constructed on a single physical server.

· Storage Isolation

The virtual machine-based separation of computing and storage enables autonomous expansion of computing and storage, making it easy to provide multiple tenants and isolation. In the virtualization layer, ensure that the virtual machine can only access the physical disk space assigned to it, thus implementing security isolation of different virtual machine hard disk spaces.

· Network Isolation

Virtual Private Cloud divides an isolated and secure private space for the users. Virtual Private Clouds are independent and isolated with each other; deploying the Virtual Machines in different Virtual Private Clouds can implement network isolation. Users fully control network management, supporting subnet independent division, Public IP configuration, etc. Moreover, it can use services such as VPN and dedicated line to connect user local servers with JD Cloud Virtual Machines to implement the expansion of current network deployment.

#### 1.1.2 Availability Group

Availability Group is the Virtual Machines logic set provided by JD Cloud. Virtual Machines in the Availability Group are distributed and deployed on physical resources isolated with each other, and only partial Virtual Machines will be affected in the event of hardware failure or regular maintenance, with the user’s business still in the available status.

· Data High Reliability

JD Cloud Virtual Machines makes a commitment of 99.95% service availability and data reliability of 99.9999999% at least. It ensures a stable network architecture and multi-copy disaster tolerance of Cloud Disk Service, while providing snapshot functions of data and image and supporting the entire machine backup.

· High Business Availability

The availability group supports cross availability zones. When the user chooses to deploy VMs within an availability group, JD Cloud will ensure that user’s VMs are dispersed on different physical fault domains of multiple availability zones, and the fault domains are isolated from each other. When hardware fault or regular maintenance occurs in a fault domain, only the VMs deployed on the fault domain are affected. The VMs on other fault domains are still available to ensure the normal operation of user’s business.

· Automatic Operation and Maintenance

The real-time manual intervention is not required, and the number of VMs can be adjusted dynamically and the availability group can support the dynamic addition and deletion of VMs based on the alarms / timing policies preset by the user, so that you can easily deal with the fluctuation of workloads, and ensure the service capability at the peak of workloads.

#### 1.1.3 Auto Scaling

Auto Scaling is a service that automatically adjusts the resource scale based on user business demand and scaling policy. Users having the right amount of resources to ensure smooth and healthy operation of business can be ensured by setting timed tasks and monitoring alarm policies. During the peak period of business, the number of VM Instances is automatically increased to ensure that business performance is not affected. When the service demand is lower, the number of VM Instances is reduced to save costs.

· Alarm Scaling

You can adjust business deployment and customize the alarm triggering policy based on the VM monitoring performance indicators (such as CPU, memory usage, network access traffic, etc.). When the traffic load makes the indicators reach the threshold, the VM Instances are automatically increased or decreased according to the set policy, so that the business load changes can be flexibly responded to improve resource utilization.

· Timed Scaling

You can set up timed tasks to plan the user's resource expansion/contraction activities in advance. Users can configure periodic tasks to automatically increase or decrease VM Instances periodically, so as to flexibly respond to business load changes and improve resource utilization. When the periodic demand fluctuates, the alarm scaling mode can be configured at the same time to cope with unpredictable changes.

· Automatic Addition of Load Balancer

VM Instances that are increased with alarms and timing policies directly associates with existing Load Balancer to share business traffic and improve service availability.

#### 1.1.4 Security Protection

· Rich Security Components

JD Cloud provides integrated security service for Virtual Machines, including Endpoint Security, free DDoS basic service, paid Anti-DDoS Pro, intrusion detection, vulnerability scanning, etc.

· Security Group

Security Group is a kind of distributed virtual firewall with status, with the functions of detecting and filtering data package of Virtual Machines access. Use security group can implement network access control for single or multiple Virtual Machines, including the east-west traffic between Virtual Machines and south-north traffic of communication between Virtual Machines and public network. Network security isolation between Virtual Machines can be realized by using the Security Group function.

· SSH Key Pair

JD Cloud allows the use of key pair to encrypt and decrypt the Linux system-based machine login information, further enhancing the security of Virtual Machines. SSH Key Pair login refers to the use of key pair technology to encrypt and decrypt login information. The user needs to create a pair of unique matching key pair: "Public key pair" and "private key pair". The public key pair needs to be stored on JD Cloud to encrypt the data. The public key pair is public and can be configured to your corresponding account on the target server as needed. The private key pair needs to be stored by the user. The private key pair can only decrypt the data encrypted by the matching public key pair. The SSH client uses the private key pair to prove its identity to the server.

· Vulnerability Patch

The Endpoint Security risks are monitored in real time. For the vulnerabilities and high risk vulnerabilities of operating system released by the official, JD Cloud will notify users as soon as possible and provide vulnerability patch scheme to protect users' business from being affected.

#### 1.1.5 Security Image

Image is the Virtual Machines running environment template, including the operating system and pre-installed software and related configurations. You can start any number of Virtual Machines based on the image, or you can start the Virtual Machines from any number of different images as needed.

· Batch Deployment of Software Environment

Create customized image of the Virtual Machines that have already deployed the environment, and then create the Virtual Machines in batches based on the image. After the Virtual Machines are created, the software environment is consistent with that of the previous Virtual Machines, so that the software environment can be deployed in batches.

· Server Running Environment Backup

For creating images to a Virtual Machine, if the Virtual Machine fails to run properly during subsequent use due to software image damage, the image can be used to recover the damaged Virtual Machine.

### 1.2 Native Container

The Native Container is an innovative container product based on JD Cloud’s deep accumulation in container technology. The product fully integrates the advantages of containers and virtual machines. It does not need to manage virtual machine or cluster and provides users with a safe and easy-to-use container service with flexible billing method, which effectively reduces the invested costs of the users.

· Security Isolation

It adopts independent kernel technology, which avoids the hidden hazards of sharing core among containers based on the isolation of virtual machines. Different tenants are completely isolated based on the SDN technology.

· Reliable Storage

Cloud disk and snapshot may be expanded. It supports to set capacity of Cloud Disk Service as required and the capacity can be expanded at any time to satisfy the rapid increase of business. By making snapshot to data of the Cloud Disk Service, requirements of demand scenarios as data backup, batch deployment and rapid recovery can be further satisfied.

· Network Isolation

Virtual Private Cloud divides an isolated and secure private space for the users. Virtual Private Cloud are independent and isolated with each other; deploying the containers in different Virtual Private Clouds can implement network isolation. Users fully control network management, supporting subnet independent division, Public IP configuration, etc. Moreover, services such as VPN and dedicated line can be used to connect user local servers with JD Cloud Container to implement the expansion of current network deployment.

· Elastic IP

The elastic IP is associated with the JD Cloud account and the user is able to associate the elastic IP with any container in the same region, to enable Internet access of container and adjust bandwidth and change associated container depending on real usage of the network at the same time.

· Security Group

Security Group is a kind of distributed virtual firewall with status, with the functions of detecting and filtering data package of container access. Use security group can implement network access control for single or multiple containers, including the east-west traffic between containers and south-north traffic of communication between containers and public network. Network security isolation between containers can be realized by using the Security Group function.

· Security Image

Support Docker standard images; you can select Docker Hub to download images or download images from the Private Container Registry. Third-party Secrets can be saved.

· Monitoring Management

Monitor in multi-dimension, grasp instance running status in real time, provide CPU utilization rate, memory utilization rate, system disk read-write traffic, network access traffic, where alarm function for different monitoring parameters and warn in real time can be set to facilitate users to rapidly aware business peak and adjust instance type timely.

· Log View

Provide container standard log query function; the maximum log capacity is 10M.

### 1.3 Cloud Disk Service

Cloud disk service is a low-delay, persistent and high-reliability data block-level storage provided by JD Cloud for Virtual Machines. Data in cloud disk service are stored in multiple real-time copies to prevent data unavailability due to component failure while providing the users with high-availability data storage service. Elastic expansion is allowed for cloud disk service capacity. The users can expand data bucket at a low price in a few minutes to achieve persistent storage of your data."

· High Performance

The single disk provides a maximum of 20,000 random IOPS and 100MB/s throughput, helping the users easily cope with high throughput data access requirements on the service side.

· Reliability

Based on the multiple real-time copies of data, it ensures the data reliability up to 99.9999999%, providing the users with safe and reliable data storage services.

· Easy-expandability

The users can freely allocate and expand the storage capacity of the cloud disk as needed. The capacity of a single disk ranges from 20-3,000GB.

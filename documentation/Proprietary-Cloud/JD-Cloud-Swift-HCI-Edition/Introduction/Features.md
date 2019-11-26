# Features

## Software Definition Calculation, Network and Storage for Hyper-converged and Hybrid Deployment

### Virtual Resource Service

Compared with traditional hyper-converged products, JD Cloud Swift HCI Edition has more powerful SDN (Software Defined Network) function. Provide software defined compute, storage and network virtual services for HCI and hybrid deployment, support self-service access to cloud management platform and application for IT resources on demand by users, easily use virtual resources such as Virtual Machines, Cloud Disk Service, Object Storage Service, Virtual Private Cloud, Load Balancer and others, with 3 nodes supporting running of more than 200 Virtual Machines.

## Integrated and Unified Resource Management Platform

### Multi-tenant Unified Management

Support user to make unified identity authorization to multiple levels and multiple tenants via the cloud management platform. There are 5 roles in the platform, which can create up to 4 levels of users, effectively improving the operational efficiency of the platform.

### Unified Resource Management

Support integrated management for physical resources and virtual resources of the entire cluster via the cloud management platform; support users to conduct hierarchical resource quota management. Quota management can be accurate to single user, while the virtual resource management can be accurate to core.



## Integrated Monitoring, Operation and Maintenance Platform

### Monitoring Cabinet Visualization Screen of All-in-one Machine

For complete machine delivery, visual information such as core monitoring of all-in-one machine can be exhibited via the visualization screen of cabinet. Service conditions of CPU, memory and disks in all-in-one machine, creation number of virtual machines as well as service statuses of calculation, network, storage and database can be conveniently browsed.

### Visual Operation, Maintenance and Monitoring of Cloud Management Platform

The cloud management platform provides all-around visual monitoring from hardware facility to cloud platform, and realizes multi-dimensional monitoring and alarm to resource survival, utilization rate and performance from points of views such as physical level, management level and virtual level, effectively promoting operation and maintenance efficiency.



## Integrated Application

### Integrated Application Delivery

Support comprehensive convergence of application deployment, configuration, monitoring as well as operation and maintenance to JD Cloud Swift HCI Edition; provide unified installation and configuration guide, unified visual monitoring as well as unified operation and maintenance and realize integrated application delivery.



# Function List

| **First Level Directory** | **Second Level Directory** | **Third Level Directory**  | **Function Description**                                                 |
| ------------ | ------------ | ------------- | ------------------------------------------------------------ |
| Infrastructure Cloud      | Overview         | ——            | User Resource Usage                                             |
|              | Computing Resource     | Virtual Machines        | Support full life cycle management operations such as list view and screening, creation, edition, reboot, shutdown/start, pending/recovery, creating images, resetting passwords, rebuilding, resizing, remote connection and deleting. <br>Support details view, attaching/detaching cloud disk, binding/unbinding elastic network interface, associating/disassociating floating IP, associating/disassociating security group and monitoring information view of a single set of Virtual Machines. |
|              |              | Image          | Support list view of official and private images and screening of private images and support full life cycle management operations such as creation (based on Virtual Machines), edition and deletion of private image. <br>Support creating VM instance based on official or private images. |
|              | Storage Resource     | Cloud Disk Service        | Support full life cycle management operations such as list view and screening, direct creation, creation based on snapshot, edition, attach/detach, capacity expansion and deletion. <br>Support view of single cloud disk details and snapshot details created based on this cloud disk. |
|              |              | Cloud Disk Snapshot    | Support full life cycle management operations such as list view and screening, creation, edition, creation of cloud disk and deletion. |
|              |              | Object Storage Service      | Support full life cycle management operations such as bucket list view and screening, creation and deletion. <br>Support detail view of a single bucket. <br>Support creating/deleting folder in a single bucket, object list view and screening, uploading/downloading/deleting objects, obtaining object external links, shard management, object detail view and other object management operations. <br>Support executing space permission setting in a single bucket, cross-origin resource sharing rule setting, object life cycle management rule setting and other bucket management operations. <br>Support view of monitoring information in a single bucket. |
|              | Network Resource     | Network          | Support full life cycle management such as list view and screening, creation, edition, adding Subnet and deletion. <br>Support detail view of a single network, list view of internal Subnet, creation, edition, deletion and other operations. <br>Support detail view of a single Subnet, list view of internal Elastic Network Interface, details view, edition, associating/disassociating Virtual Machines, deletion and other operations. |
|              |              | Routing          | Support full life cycle management operations such as list view and screening, creation, edition, connecting/removing Subnet, setting gateway, clearing gateway, details view, setting static route table and deletion. |
|              |              | Elastic Network Interface      | Support full life cycle management such as list view and screening, creation, edition, details view, associating/disassociating Virtual Machines and deletion. |
|              |              | Security Group        | Support list view and screening, creation, management of security group and deletion of security group.     |
|              |              | Floating IP        | Support list view, assigning/releasing floating IP, associating/disassociating Virtual Machines or Load Balancer. |
|              |              | Load Balancer      | Support life cycle management operations such as list view and screening, creation of Load Balancer, edition, associating/disassociating floating IP. <br>Support Load Balancer detail view, internal listener creation, edition, health check configuration and deletion. <br>Support creation of Load Balancer internal resource pool, edition, adding Virtual Machines, modifying Virtual Machines weight and deleting Virtual Machines. |
| Background Management     | User Management     | ——            | Support adding and editing organization (only support 4 levels currently), viewing and screening user list in the organization. <br>Support adding user, edition, permission management, resetting password, enabling/locking. |
|              | Quota Management     | ——            | Support quota assignment and edition of subordinate organizations, quota assignment and modification of same-level and subordinate users, viewing the total quota of its organization and remaining distributable quota information. |
| Operation and Maintenance Monitoring     | Monitoring Visualization Screen     | ——            | Support load monitoring (CPU, memory, disk capacity, etc.) of physical nodes, service liveness monitoring on all types of physical nodes, storage performance and data-related monitoring, resource load and service liveness monitoring on platform management page, etc. |
|              | Virtual Assets     | VM Instance    | Support management of all VM Instances on the platform, such as instance list view and screening, remote connection, edition, image creation, shutdown/start, hot migration, reboot and instance deletion. |
|              | Physical Asset     | Machine          | Support viewing start status and service status of machine nodes.                       |
| System Setting     | Specification Setting     | Virtual Machines Specification    | Support list view, creation, user authorization, deletion, etc. of Virtual Machines Specification.       |
|              |              | Cloud Disk Service Specification    | Support list view and screening, creation, modification, user authorization, deletion, etc. of Cloud Disk Service Specification. |
|              | Object Storage Service Setting | Object Storage Service Configuration  | Support creation, modification, user authorization, deletion, etc. of Object Storage Service configuration.         |
| Account Management     | Account Management     | Personal Data Management  | Support view and modification of personal basic information and resetting user password, etc.           |
|              |              | AccessKey Management | Support list view, creation, deletion, etc. of AK/SK.                      |
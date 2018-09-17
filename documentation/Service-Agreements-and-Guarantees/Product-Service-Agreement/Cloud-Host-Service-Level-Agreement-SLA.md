**1. Service Scope**

The virtual machine provided by JD Cloud is a computing service with auto scaling processing capabilities, whose management mode is simpler and more efficient than that of a physical server. It can quickly build a business system and reduce the difficulty of development and operation and overall IT costs. The virtual machine supports resilient capacity expansion and provides on-demand and pay-as-you go settling functions based on the cloud computing model.

**2. Service Level Indicators**

**2.1 Data Persistence**

Data Persistence: Not less than 99.9999999% 

Data persistence is counted by service period. One service period is a natural month. If it is less than one month, it is not counted as one service period.

Data Persistence Calculation Formula: Virtual machine disk with good data per service term/(virtual machine disk with good data per service cycle + virtual machine disk with data loss per service cycle).

That is, for every 10,000 virtual machine disks, the probability that the data is not lost is 99.9999999% per month, or only one virtual machine disk may have data loss per month.

**2.2 Data Destructibility**

2.2.1 If the user deletes the data or needs to destroy the data after the service expires, JD Cloud will automatically clear the disk and memory data on the corresponding physical server, so that the data cannot be recovered.

2.2.2 Before the equipment used in the cloud service is scrapped, disposed, repaired by outsourcing or resold, JD Cloud will degauss its physical disk.

**2.3 Data Migration**

When the user enables the virtual machine, JD Cloud provides mirror reproduction and snapshot recovery methods, so that the user can quickly deploy the environment and import data; when the user stops using the virtual machine, the data can be exported through the network.

**2.4 Data Privacy**

JD Cloud uses encryption, security group isolation and other means to ensure that user data in the same resource pool is mutually invisible. The security group isolates different user resources through a series of identity and access management technologies such as data link layer and network layer.

**2.5 Right to Know about Data**

2.5.1 The user has the right to know the data, the geographical location of the data center where the backup data is located, and the number of data backups, among which:

2.5.1.1 At present, the data centers of JD Cloud are located in cn-north-1, cn-east-1, cn-east-2 and cn-south-1. Users must select the corresponding data according to the geological position when applying for cloud service and the user data will be stored in its designated data center;

2.5.1.2 JD Cloud Service has automatic data backup function. The backup data is stored in the same data center as the source data by default. The user does not need to specify the number of automatic backups and the location where the date backed up automatic is stored.

2.5.2 JD Cloud data center will comply with relevant local laws and regulations, and users have the right to know about this, and can contact JD Cloud's customer service personnel for detailed information.

2.5.3 Unless required by local laws and regulations, or regulatory and auditing requirements of government's regulatory authorities, all data, applications and behavior logs of users will not be provided to third parties. In addition to the statistics and analysis of the operating status of the products used by JD Cloud, the user's behavior log will not present the user's personal information data.

**2.6 Data Reviewability**

In accordance with current laws and regulations or according to the requirements of government regulatory authorities, safety compliance, auditing or forensics investigations and in the context of complete processes and procedures, JD Cloud can provide relevant information of the service purchased by the user, including running logs of key components, operation records of operation and maintenance personnel, and user's operation records.

**2.7 Service Features**

Virtual machine has advanced features such as self-service management, data security guarantee, automatic fault recovery, and anti-network attacks. Virtual machine services are suitable for community sites, corporate websites, portals, e-commerce sites, SAAS apps, and gaming apps. For details on all the specific functions of the virtual machine service, please refer to the detailed description documentation, technical documentation and help documentation provided by JD Cloud on the official website. All functional changes to the virtual machine service that may affect the user will be announced to the user.

**2.8 Service Availability**

Service Availability: No less than 99.95%.

Virtual Machine Availability Calculation Formula: All available time of a single virtual machine per service term/ (all available time of a single virtual machine per service term + all unavailable time of a single virtual machine per service term).

Wherein:

(1) Virtual machine availability is counted according to service term. One service term is a natural month. If it is less than one month, it is not counted as one service term. The statistical business unit is a single virtual machine, and the time unit is minutes.

(2) Unavailable Time: The time when the service provided by virtual machine service is not available for 5 minutes or more, and if the service is unavailable for less than 5 minutes, it is not counted into unavailable time. The unavailable time of virtual machine service does not include daily system maintenance time, and the unavailable time due to user reasons, third-party causes, or force majeure.

**2.9 Service Resource Allocation Capability**

The virtual machine service provides multiple configurations and has elastic capacity expansion. Users can expand or reduce the virtual machine resources used online according to the JD Cloud's configuration plan. The user can enable or release 100 virtual machines in 10 minutes, or complete the shutdown to upgrade the CPU and memory within 5 minutes, and support online real-time upgrade of EIP bandwidth.

**2.10 Fault Recovery Capability**

JD Cloud provides 7×24h operation and maintenance for the cloud services of paying users, and provides technical support by means of phone reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, rapid positioning and fast recovery.

**2.11 Network Access Performance**

When setting up the virtual machine service of JD Cloud, the user can select the EIP outlet bandwidth required for each virtual machine. The EIP outlet bandwidth can be configured from 1Mbps to 200Mbps. JD Cloud provides BGP multi-line access to ensure the quality of network access for users.

**2.12 Service Measurement Accuracy**

Virtual machine service has an accurate and transparent metering and billing system. JD Cloud settles and charges in real time according to the actual usage of the user's virtual machine, and the specific billing standard is subject to the effective billing mode and price announced on the official website of JD Cloud. The user's original billing log is reserved for a minimum of 3 years by default for future reference.

**2.13 Service Compensation Terms**

2.13.1 Compensation Scope:

For the inability of virtual machine to work properly caused by JD Cloud fault, and the inability of normal access to the website caused by JD Cloud fault, JD Cloud will compensate for the unavailable time. However, the service unavailable time caused by the following reasons is not included:

(1) Caused by the system maintenance procedures after JD Cloud's notification in advance, including cutting, maintenance, upgrading and simulated fault drill;

(2) Packet loss and delay caused by operators' fault;

(3) Caused by the hackers' hacking to the users' application programs or data information;

(4) Caused by the loss or leakage of data, commands, passwords etc. due to user's improper maintenance or improper confidentiality measures;

(5) Caused by the user upgrading the operating system by himself;

(6) Caused by the user's application or installation activities;

(7) Caused by user's negligence or operation authorized by the user;

(8) Caused by force majeure and accidents;

(9) Unavailability caused by other reasons not related to JD Cloud.

2.13.2 Compensation Plan

Fault time = unavailable time.

Virtual machine in monthly package is compensated in the way of service time compensation, i.e. 100 times/set of the fault time.

The virtual machine pay by configuration is compensated in the form of coupon, the payout amount = the average hourly cost in the first 24 hours of the fault/ 60 × fault time × 100.

Instructions:

If the use time of virtual machine pay by configuration is less than 24 hours, the cost shall be calculated based on the actual use time; and the fault time shall be calculated by minutes;

Total amount of compensation shall not exceed the total amount of cash paid for current service through a single virtual machine.

**3. Others**

JD Cloud has the right to make adjustments to some service indicators of the SLA according to the changes, and promptly publish announcements at www.jdcloud.com or send emails or written notices to notify users of the revised content.

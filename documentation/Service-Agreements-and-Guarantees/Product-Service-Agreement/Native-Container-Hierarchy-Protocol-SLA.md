**1. Service Scope**

Native container is the newly released innovative container product based on JD Cloud's deep accumulation in container technology. The product fully combines the advantages of containers and virtual machines, without managing servers or clusters, creating a secure, easy-to-use native container for users and billing in flexible way to effectively reduce user input costs.

**2. Service Level Indicators**

**2.1 Service Features**

Native containers have advanced features such as self-service management, data security guarantee, automatic fault recovery, and anti-network attacks. Native containers are suitable for community sites, corporate websites, portals, e-commerce sites, SAAS apps, and gaming apps. For details on all the specific functions of the native container, please refer to the specifications documentation, technical documentation and help documentation provided by JD Cloud on its official website. All functional changes to the native container that may affect the user will be announced to the user.

**2.2 Service Availability**

Service Availability: No less than 99.95%.

The native container availability calculation formula: All available time per container per service period/(all available time per container per service period + all unavailable time per container per service period). 

Wherein:

(1) The availability of the native container is counted according to the service period. One service period is a natural month. If it is less than one month, it is not counted as one service period. The statistical business unit is a single container, and the time unit is minute.

(2) Unavailable Time: The time when the service provided by the native container is not available for 5 minutes or more, and if the service is unavailable for less than 5 minutes, it is not counted into unavailable time. The unavailability time of native container does not include daily system maintenance time, and the unavailability time due to user reasons, third-party causes, or force majeure.

**2.3 Service Resource Allocation Capability**

The native container provides multiple configurations and has elastic scalability. Users can expand or reduce the container resources used online according to the JD Cloud's configuration plan. After the image download is completed, the user can enable or release 100 containers in 10 minutes, or complete the shutdown to upgrade the CPU and memory within 5 minutes, and support online real-time upgrade of EIP bandwidth.

**2.4 Fault Recovery Capability**

JD Cloud provides 7×24h operation and maintenance for the container instances of paying users, and provides technical support by means of telephone reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, rapid positioning and fast recovery.

**2.5 Network Access Performance**

When setting up the JD Cloud's native container, the user can select the EIP outlet bandwidth required for each container. The EIP outlet bandwidth can be configured from 1Mbps to 200Mbps. JD Cloud adopts BGP multi-line access to ensure the quality of network access for users.

**2.6 Service Measurement Accuracy**

The native container has an accurate and transparent metering and billing system. The native container settles and charges in real time according to the actual usage of the user's native container, and the specific billing standard is subject to the effective billing mode and price announced on the official website of JD Cloud. The user's original billing log is reserved for a minimum of 3 years by default for future reference.

**2.7 Data Persistence**

Data Persistence: Not less than 99.9999999% 

Data persistence is counted by service period. One service period is a natural month. If it is less than one month, it is not counted as one service period.

Data Persistence Calculation Formula: container disk with good data per service period/(container disk with good data per service cycle+container disk with data loss per service cycle). That is, for every 10,000 container disks, the probability that the data is not lost is 99.9999999% per month, or only one container disk may have data loss per month.

**2.8. Data Destructibility**

2.8.1 If the user deletes the data or needs to destroy the data after the service expires, JD Cloud will automatically clear the disk and memory data on the corresponding physical server, so that the data cannot be recovered.

2.8.2 Before the equipment used in the cloud service is scrapped, disposed, repaired by outsourcing or resold, JD Cloud will degauss its physical disk.

**2.9. Data Migration**

When the user enables the container, JD Cloud provides a snapshot recovery method, so that the user can quickly deploy the environment and import data; when the user stops using the container, the data can be migrated out through the network.

**2.10. Data Privacy**

JD Cloud uses encryption, tenant isolation, security group isolation and other means to ensure that user data in the same resource pool is mutually invisible. The security group isolates different user resources through a series of identity and access management technologies such as data link layer and network layer.

**2.11. Right to Know about Data**

2.11.1. The user has the right to know the data, the geographical location of the data center where the backup data is located, and the number of data backups, among which:

2.11.1.1. At present, JD Cloud Data Center is located in cn-north-1, cn-east-1, cn-east-2 and cn-south-1. Currently, the container has been launched in cn-north-1. Users must select the corresponding data when registers the service. The user data will be stored in its designated data center.

2.11.1.2. JD Cloud Service has automatic data backup function. The backup data is stored in the same data center as the source data by default. The user does not need to specify the number of automatic backups and the location where the date backed up automatic is stored.

2.11.2 JD Cloud data center will comply with relevant local laws and regulations, and users have the right to know about this, and can contact JD Cloud's customer service personnel for detailed information.

2.11.3. Unless required by local laws and regulations, or regulatory and auditing requirements of government's regulatory authorities, all data, applications and behavior logs of users will not be provided to third parties. In addition to the statistics and analysis of the operating status of the products used by JD Cloud, the user's behavior log will not present the user's personal information data.

**2.12. Data Reviewability**

In accordance with current laws and regulations or according to the requirements of government regulatory authorities, safety compliance, auditing or forensics investigations and in the context of complete processes and procedures, JD Cloud can provide relevant information of the service purchased by the user, including running logs of key components, operation records of operation and maintenance personnel, and user's operation records.

**3. Service Compensation Terms**

**3.1 Compensation Scope**

When the native container cannot be used normally due to the JD Cloud fault, JD Cloud will compensate for the unavailable time, but not including the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance procedures after JD Cloud's notification in advance, including cutting, maintenance, upgrading and simulated fault drill;

(2) Packet loss and delay caused by operators' fault;

(3) Caused by the hackers' hacking to the users' application programs or data information;

(4) Caused by the loss or leakage of data, commands, passwords etc. due to user's improper maintenance or improper confidentiality measures;

(5) Caused by the user upgrading the operating system by himself;

(6) Caused by the user's application or installation activities;

(7) Caused by user's negligence or operation authorized by the user;

(8) Caused by force majeure and accidents;

(9) Unavailability caused by other reasons not related to JD Cloud.

**3.2 Compensation Plan**

Fault time = unavailable time.

The native container in monthly package is compensated for service time by 100 times/set of the fault time.

The native container paid by configuration is indemnified in the form of coupon, the payout amount = the average hourly cost in the first 24 hours of the fault/60×fault time×100.

Instructions:

If the use time of the native container paid by configuration is less than 24 hours, the cost shall be calculated based on the actual use time; and the fault time shall be calculated by seconds;

Total amount of compensation shall not exceed the total amount of cash paid for the current service of single instance.

**4. Others**

JD Cloud has the right to make adjustments to some service indicators of the SLA according to the changes, and promptly publish announcements at www.jdcloud.com or send emails or written notices to notify users of the revised content.

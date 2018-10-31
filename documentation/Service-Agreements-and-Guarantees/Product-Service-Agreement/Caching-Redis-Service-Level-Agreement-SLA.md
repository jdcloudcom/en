## **1. Service Scope**

Redis of JD Cloud is an online caching service based on Redis protocol, which supports multiple data types to meet different business scenarios. Hot standby and high availability can reduce business risks and ensure business continuity.

## **2. Service Level Indicators**

**2.1 Data Persistence: No Less than 99.9%; **

Data persistence is counted by service period. One service period is a natural month. If it is less than one month, it is not counted as one service period.

That is, for every 10,000 Redis user instances, the probability the data is not lost per month is 99.9%, that is, only 10 instances may have data loss per month.

**2.2 Data Destructibility**

2.2.1 If the user deletes the data or needs to destroy the data after the service expires, JD Cloud will automatically clear the disk and memory data on the corresponding physical server, so that the data cannot be recovered.

2.2.2 Before the equipment used in the cloud service is scrapped, disposed, repaired by outsourcing or resold, JD Cloud will degauss its physical disk.

**2.3 Data Privacy**

JD Cloud uses encryption, security group isolation and other means to ensure that user data in the same resource pool is mutually invisible. The security group isolates different user resources through a series of identity and access management technologies such as data link layer and network layer.

**2.4 Right to Know about Data**

2.4.1 The user has the right to know the data, the geographic location of the data center where the backup data is located, and the number of data backups, among which:

2.4.1.1 At present, the data centers of JD Cloud are located in cn-north-1, cn-east-1 and cn-south-1. Users must select the corresponding data according to the geological position when applying for cloud service and the user data will be stored in its designated data center;

2.4.1.2 JD Cloud Service has automatic data backup function. Please refer to the related technical documents for the number of backups. The backup data is stored in the same data center as the source data by default. The user does not need to specify the number of automatic backups and the location where the date backed up automatic is stored.

2.4.2 JD Cloud data center will comply with relevant local laws and regulations, and users have the right to know about this, and can contact JD Cloud's customer service personnel for detailed information.

2.4.3 Except for local laws and regulations, or regulatory and auditing requirements of government's regulatory authorities, all data, applications and behavior logs of users will not be provided to third parties. In addition to the statistics and analysis of the operating status of the products used by JD Cloud, the user's behavior log will not present the user's personal information data.

**2.5 Data Reviewability**

In accordance with current laws and regulations or according to the requirements of government regulatory authorities, safety compliance, auditing or forensics investigations and in the context of complete processes and procedures, JD Cloud can provide relevant information of the service purchased by the user, including running logs of key components, operation records of operation and maintenance personnel, and user's operation records.

**2.6 Service Features**

Redis is an online Key-Value type data storage service. Redis service can be opened via web or API, and provides management functions such as online expansion and monitoring. Please refer to the detailed description documentation, technical documentation and help documentation provided by JD Cloud on the official website for all the specific functions of Redis service. All functional changes to Redis that may affect the user will be announced to the user.

**2.7 Service Availability**

Service Availability: No less than 99.95%.

Calculation Formula of Redis Availability: All available time per service term for a single instance/ (all available time per service term for a single instance + all unavailable time per service term for a single instance).

Wherein:

(1) The availability is counted according to service term. One service term is a natural month. If it is less than one month, it is not counted as one service term. The statistical business unit is a single database instance, and the time unit is minute.

(2) Unavailable Time: The time when the service provided by Redis is not available for 5 minutes or more, and if the service is unavailable for less than 5 minutes, it is not counted into unavailable time. The unavailability time of Redis does not include daily system maintenance time, and the unavailability time due to user reasons, third-party causes, or force majeure.

**2.8 Service Resource Allocation Capability**

Redis offers a variety of specifications, the current minimum configuration supports 1GB of memory capacity, and the maximum configuration supports 64GB of memory capacity.

**2.9 Fault Recovery Capability**

JD Cloud provides 7×24h operation and maintenance for cloud services for paying users, and provides technical support by means of online open ticket and telephone reporting, and has a series of fault emergency response mechanisms, such as fault monitoring, fault diagnosis, rapid positioning and fast recovery.

**2.10 Network Access Performance**

Redis is limited to JD Cloud computing intranet environment access, and has corresponding intranet bandwidth limitation according to different memory capacities. For detailed performance indicators, please refer to the detailed description documentation, technical documentation and help documentation provided by JD Cloud on the official website. Redis does not support public network access at present.

**2.11 Service Measurement Accuracy**

Redis service of JD Cloud has an accurate and transparent metering and billing system. JD Cloud settles and charges in real time according to the actual usage of the user's Redis, and the specific billing standard is subject to the effective billing mode and price announced on the official website of JD Cloud. The user's original billing log is reserved for a minimum of 3 years by default for future reference.

**2.12 Service Compensation Terms**

2.12.1 Scope of Compensation: When the Redis service cannot be used normally due to the JD Cloud's equipment fault, defects in design or improper operation, JD Cloud will indemnify the unavailable time, but not including the unavailable time caused by the following reasons:

(1) Caused by the system maintenance procedures after JD Cloud's notification in advance, including cutting, maintenance, upgrading and simulated fault drill;

(2) Caused by any network or equipment fault or configuration adjustment of equipment not belonging to JD Cloud;

(3) Caused by the hackers' hacking to the users' application programs or data information;

(4) Caused by the loss or leakage of data, commands, passwords etc. due to user's improper maintenance or improper confidentiality measures;

(5) Caused by the user upgrading the operating system by himself;

(6) Caused by the user's application or installation activities;

(7) Caused by user's negligence or operation authorized by the user;

(8) Caused by force majeure and accidents;

(9) Unavailability caused by other reasons not related to JD Cloud.

2.12.2 Compensation plan

Fault time = unavailable time.

Redis in monthly package is compensated in the way of service time compensation, i.e. 100 times/single instance.
Redis paid by configuration is compensated in the form of coupon, the payout amount = the average hourly cost in the first 24 hours of the fault / 60 × fault time × 100.

Note: If the use time of Redis is paid by configuration is less than 24 hours, the cost shall be calculated based on the average of actual use time, the fault time shall be calculated by minutes;
Total amount of compensation shall not exceed the total amount of cash paid for the current service of a single set of Redis.

## **3.Others**

JD Cloud has the right to make adjustments to some service indicators of the SLA according to the changes, and promptly publish announcements at [www.jdcloud.com](https://www.jdcloud.com/) or send emails or written notices to notify users of the revised content.

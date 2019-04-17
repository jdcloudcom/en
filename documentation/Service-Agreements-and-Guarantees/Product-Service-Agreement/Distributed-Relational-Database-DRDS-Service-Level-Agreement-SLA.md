## **1.Service Scope**

JD Cloud provides the user with the Distributed Relational Database Service (DRDS) with the functions such as database and table sharding, online expansion and performance monitoring, and provides the settlement functions based on the cloud computing mode, such as pay by consumption and pay by demands.

## **2.Service Level Indicator**

**2.1 Data Persistence**

The Distributed Relational Database Service (DRDS) itself is not used for data storage. The data are stored in the user’s RDS MySQL. For data durability of Distributed Relational Database Service (DRDS), please refer to the [RDS Service Level Agreement](https://docs.jdcloud.com/en/product-service-agreement/cloud-database-rds-service-level-agreement-sla)

**2.2 Destruction Nature of Data**

   2.2.1 If the users actively delete the data or need to destruct the data after expiry of the service period, JD Cloud will automatically remove corresponding data in the physical disks and memory of the server, which the data cannot be recovered.

   2.2.2 Before scrapping, disposal, outsourced maintenance or resale of the device used for the Distributed Relational Database Service (DRDS), JD Cloud will adopt demagnetization operation on its physical disk.

**2.3 Privacy of Data**

By means of encryption and security group isolation, JD Cloud ensures that the user data in the same resource pools are invisible with each other. In which, security groups can isolate different user resources through a series of data link level and network level IAM technology.

**2.4 Right to Know of Data**

   2.5.1 Users have the right to know the geographical location of data center with their data and backup data, as well as the number of data backup, of which:

   2.5.1.1 At present, JD Cloud data centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai), South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they open cloud service, and their data will be stored in the data center specified by themselves;

   2.5.2 JD Cloud data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

   2.5.3 Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics & analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

**2.5 Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

**2.6 Service Functions**

The Distributed Relational Database Service (DRDS) is an on-line database service, providing functions such as database and table sharding, online expansion and performance monitoring. For all specific functions of DRDS, please see detailed description documents, technical documents and help documentation provided by JD Cloud on its official website. Any functional change with possible influence to the user will be announced to the user.

**2.7 Service Availability**

Service availability: Not lower than 99.95%.

The formula for computing the availability is as follows: all available time for a single database instance per service cycle/ (all available time for a single database instance per service cycle + all unavailable time for a single database instance per service cycle).

Where,

(1) Availability of is counted by service cycle to the extent that a service cycle is a natural month and if it is less than a month, then it is not counted as a service cycle. The business unit of statistics is single database instance, and the time unit is minute.

(2) Unavailable time: Only services provided are unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time of services shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure.

**2.8 Service Resource Allocation Capability**

Multiple configurations and elastic expansion capacity are provided. The user can increase or reduce database resources on its own depending on the needs and make seamless upgrade online to the database.

**2.9 Fault Recovery Capability**

JD Cloud provides 7×24 hours of operation maintenance for the Distributed Relational Database Service (DRDS) of the paying users, and provides technical support by means of online ticket and telephone fault reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

**2.10 Service Metering Accuracy**

The Distributed Relational Database Service (DRDS) has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time of DRDS according to the user’s actual usage. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

**2.11 Service Compensation Terms**

   2.11.1 Compensation Scope:

In the event of failure of normal use of the Distributed Relational Database Service (DRDS) due to JD Cloud’s fault, or failure of normal website access due to JD Cloud’s fault, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud have notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Unavailability situations such as packet loss and latency caused by operator fault;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or operations authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud’s account.

   2.11.2 Compensation Scheme
   
Fault Time = Unavailable Time.

The Distributed Relational Database Service (DRDS) in the Monthly Package mode is subject to service period compensation way, and the compensation is made by 100 times of the fault time per set.

For the Distributed Relational Database Service (DRDS) paid by configuration, compensation shall be made by the means of coupons, with compensation amount = average hourly charge per hour of 24 hours before the fault/60 x fault time x 100.

Note:

If the usage time of the Distributed Relational Database Service (DRDS) paid by consumption is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual usage duration;

Fault time shall be calculated by minutes;

The total compensation amount shall not exceed the total service expense paid in cashes by the user for a single Distributed Relational Database Service (DRDS);

**3. Miscellaneous**

JD Cloud has the right to make adjustments to some service indicators of the Service Level Agreement according to changes, and promptly publish announcements on JD Cloud official website [www.jdcloud.com](https://www.jdcloud.com/), or send emails or written notices to notify the users of the modified contents.

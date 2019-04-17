## **1. Service Scope**

The JCS for Memcached of JD Cloud is an on-line cache service based on the Memcached protocol, supporting various data types and meeting different business scenarios. The hot standby is featured by high availability, can reduce business risk and guarantee business continuity.

## **2. Service Level Indicator**

**2.1 Data Persistence  Data persistence: no lower than 99.9%;**

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle.

I.e., the no data loss probability per 10,000 JCS for Memcached instances of the user is 99.9%. This means that at most 10 instances may be subject to the data loss per month.

**2.2 Destruction Nature of Data**

2.2.1 If the users actively delete the data or need to destruct the data after expiry, JD Cloud will automatically remove corresponding data in the disks and memory of the physical server, and the data cannot be recovered.

2.2.2 Before scrapping, outsourced maintenance or resale of the equipment used for the cloud services, JD Cloud will adopt demagnetization operation on its physical disk.

**2.3 Privacy of Data**

By means of encryption and security group isolation, JD Cloud ensures that the user data in the same resource pools are invisible with each other. In which, security groups can isolate different user resources through a series of data link level and network level IAM technology.

**2.4 Right to Know of Data**

2.4.1 Users have the right to know the geographical location of data center with their data and backup data, as well as the number of data backup, of which:

2.4.1.1 At present, JD Cloud Data Centers are distributed in North China (Beijing), East China (Shanghai) and South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they enable the cloud service;

2.4.1.2 The JD Cloud Service provides automatic data backup function. For details of the backup number, please refer to relevant technical documents. The backup data are stored in the same data center as the source data by default. Users need not to designate the number and storage location for their data’s automatic backup.

2.4.2 JD Cloud data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

2.4.3 Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics & analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

**2.5 Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

**2.6 Service Functions**

JCS for Memcached is an on-line Key-Value type data storage service. The JCS for Memcached instances can be enabled via web or API, with on-line expansion, monitoring functions and other management functions. For details of all functions of the JCS for Memcached service, please refer to the detailed description document, technical document and help documentation provided by JD Cloud on the official website. All the functional changes of the JCS for Memcached service that may affect users will be announced to the users.

**2.7 Service Availability**

Service availability: Not lower than 99.95%.

The formula for availability computing the JCS for Memcached is as follows: all available time for a single database instance per service cycle/ (all available time for a single instance per service cycle + all unavailable time for a single instance per service cycle).

Where:

(1) Availability of is counted by service cycle to the extent that a service cycle is a natural month and if it is less than a month, then it is not counted as a service cycle. The business unit of statistics is single database instance, and the time unit is minute.

(2) Unavailable time: Only services provided by JCS for Memcached are unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure.

**2.8 Service Resource Allocation Capability**

JCS for Memcached provides different specifications. At present, the minimum configuration supports 1GB memory capacity, while the maximum configuration supports 64GB memory.

**2.9 Fault Recovery Capability**

JD Cloud provides 7×24 hours of operation maintenance for the Cloud services of the paying users, and provides technical support by means of on-line ticket, telephone fault reporting and the like, and has a series of fault emergency response mechanisms such as fault monitoring, fault diagnosis, fast positioning, and fast recovery.

**2.10 Network Access Performance**

JCS for Memcached can be accessed and used with the computing intranet environment of JD Cloud. Corresponding intranet bandwidth restrictions are made depending on different memory capacities. For specific performance indicators, please refer to specific description documents, technical documents and help documentation provided on official website of JD Cloud. JCS for Memcached does not support public network access now.

**2.11 Service Metering Accuracy**

JCS for Memcached service has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual usage of JCS for Memcached. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud’s official website. The user's original billing log shall be kept for at least 3 years by default for future reference.

**2.12 Service Compensation Terms**

2.12.1 Compensation range: If the JCS for Memcached service purchased by the user cannot be used normally due to the failure of JD Cloud device, design defects or improper action, JD Cloud will compensate for the unavailable time, excluding the service unavailability time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud have notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Any problems caused by the network, equipment failure or configuration adjustment other than JD Cloud’s device;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords and others due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or operations authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud’s account.

2.12.2 Compensation Scheme

Fault Time = Unavailable Time.

For the monthly package JCS for Memcached, compensation shall be made by the means of compensating service duration at 100 times of fault time/single instance.
For the JCS for Memcached paid by configuration, compensation shall be made by the means of coupons at the single instance compensation amount = average charge per hour of 24 hours before the fault/60 x fault time x 100.

Note: If the usage time of JCS for Memcached paid by configuration is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual usage duration, and the fault time shall be calculated by minutes;
The total compensation amount shall not exceed the total amount of current service cash charge already paid for a single JCS for Memcached.

## **3. Others**

JD Cloud has the right to make adjustments to some service indicators of the Service Level Agreement according to changes, and promptly publish announcements on JD Cloud official website [www.jdcloud.com](https://www.jdcloud.com/), or send emails or written notices to notify the users of the modified contents.

 

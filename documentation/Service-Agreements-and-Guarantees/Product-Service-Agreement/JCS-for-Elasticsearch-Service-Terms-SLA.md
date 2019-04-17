**1. Service Scope**

JCS for Elasticsearch is an open-source distributed searching and data analysis engine based on Elasticsearch, which works on scenarios such as data analysis, searching and APP monitoring. Through JD Cloud console, the JCS for Elasticsearch cluster can be quickly created and configured, to implement the fully-hosted service of real-time data search, collection and analysis.

 

**2.** **Service Level Indicator**

**2.1 Service Functions**

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle. I.e., the no data loss probability per 1,000 JCS for Elasticsearch cluster is 99.9999% per month. This means that at most 1 JCS for Elasticsearch cluster may have the data loss per month.

**2.2 Destruction Nature of Data**

2.2.1 If the users actively delete the data or need to destruct the data after expiry, JD Cloud will automatically remove corresponding data in the physical disks and memory of the server, which the data cannot be recovered.

2.2.2 Before scrapping, outsourced maintenance or resale of the equipment used for the services, JD Cloud will adopt demagnetization operation on its physical disk.

**2.3** **Privacy of Data**

By means of encryption and security group isolation, JD Cloud ensures that the user data in the same resource pools are invisible with each other. In which, security groups can isolate different user resources through a series of data link level and network level IAM technology.

**2.4 Right to Know of Data**

2.4.1 The user has the right to know about the data, the geographical location of the data center where the backup data resides, and the number of data backups, among which: At present, JD Cloud data centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai), South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they open cloud service, and their data will be stored in the data center specified by themselves.

2.4.2 JD Cloud data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

2.4.3 Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

**2.5 Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

**2.6 Service Availability**

Service Availability: Not lower than 99.95%.

Perform statistics for service availability as per service period, and service availability is calculated as follows:

Service availability = all available time for a single cluster per service cycle/ (all available time for a single cluster per service cycle + all unavailable time for a single cluster per service cycle)

Where,

(1) JCS for Elasticsearch service is counted by service cycle, a service cycle is a natural month.

Number of minutes of service cycle is calculated as follows: Total number of days within service cycle × 24 (hours) × 60 (minutes).

(2) Unavailable time: Only services provided by JCS for Elasticsearch are unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time of JCS for Elasticsearch services shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure.

 

**2.7** **Service Resource Allocation Capability**

JCS for Elasticsearch services provide multiple configurations and have the capacity of expansion so that users can expand the computing cluster online by themselves as needed.

**2.8** **Fault Recovery Capability**

JD Cloud provides 7×24 hours of operation maintenance for the cloud services of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

**2.9** **Service Metering Accuracy**

JCS for Elasticsearch has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual usage for JCS for Elasticsearch. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

**2.10** **Service Compensation Terms**

2.10.1 Compensation Scope:

In the event of failure of normal use of JCS for Elasticsearch services due to JD Cloud fault, or failure of normal website access due to JD Cloud fault, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud has notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Unavailability situations such as packet loss and latency caused by operator fault;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or operations authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud’s account.

2.10.2 Compensation Scheme

• Fault Time = Unavailable Time.

• For the monthly package JCS for Elasticsearch services, compensation shall be made by the means of compensating service duration at the 10 times of fault time/cluster and by the means of coupons.

• For the JCS for Elasticsearch services paid by configuration, compensation shall be made by the means of coupons at the compensation amount = average charge per hour of 24 hours before the fault/60 x fault time x 10.

Note:

• If the usage time of JCS for Elasticsearch services paid by amount is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual usage duration.

• Fault time shall be calculated by minutes;

The total compensation amount shall not exceed the total amount of current service cash charge already paid for a single JCS for Elasticsearch service cluster;

 

**3. Miscellaneous**

JD Cloud has the right to make adjustments to partial service indicators of the Service Level Agreement according to changes at the time moment, and promptly release announcements on JD Cloud official website of [www.jdcloud.com](https://www.jdcloud.com/index), or send e-mails or written notices to notify users of the modified contents.

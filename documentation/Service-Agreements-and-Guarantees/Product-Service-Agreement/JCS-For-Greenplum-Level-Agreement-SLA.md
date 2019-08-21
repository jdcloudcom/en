**1 Service Scope**

JD Cloud JCS for Greenplum Services (hereinafter referred to as "Services") provide the user with the online data repository services, and provide the settlement functions based on the cloud computing mode, such as use on demand and pay on demand.

**2 Service Level Indicator**

**2.1 Data Persistence**

· Data persistence: Not below 99.9999%.

· Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle. Namely, the no data loss probability per 1,000 JCS for Greenplum instances is 99.9999% per month. This means that at most 1 JCS for Greenplum instance may have the data loss per month.

**2.2 Destruction Nature of Data**

2.2.1 If the users actively delete the data or need to destruct the data after expiry, JD Cloud will automatically remove corresponding data in the disks and memory of the physical server, and the data cannot be recovered.

2.2.2 Before scrapping, outsourced maintenance or resale of the equipment used for the services, JD Cloud will adopt demagnetization operation on its physical disk.

**2.3 Migration Nature of Data**

JCS for Greenplum is delivered online to the user, and the user can import data through the corresponding database client software, so as to meet the migration requirements of user data.

**2.4 Privacy of Data**

By means of encryption and security group isolation, JD Cloud ensures that the user data in the same resource pools are invisible with each other. In which, security groups can isolate different user resources through a series of data link level and network level IAM technology.

**2.5 Right to Know Data**

2.5.1 Users have the right to know the geographical location of data center with their data and backup data, as well as the number of data backup, of which:

2.5.1.1 At present, JD Cloud Data Centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai) and South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they enable the cloud services, and the user data will be stored at the designated data center.

2.5.2 JD Cloud data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

2.5.3 Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics & analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

**2.6 Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

**2.7 Service Functions**

The JCS for Greenplum is the online MPP massively parallel processing data repository service, which can be subscribed via Web or API. For details of all functions of JCS for Greenplum, please refer to specific instruction documentation, technical documentation and help documentation provided by JD Cloud on the official website. All the functional changes of JCS for Greenplum that may affect users will be announced to the users.

**2.8 Service Availability**

· Service availability: Not below 99.90%.

· The formula for computing the availability of JCS for Greenplum is as follows: all available time for a single database instance per service cycle/ (all available time for a single database instance per service cycle + all unavailable time for a single database instance per service cycle).

Where,

(1) Availability of JCS for Greenplum is counted by service cycle to the extent that a service cycle is a natural month and if it is less than a month, then it is not counted as a service cycle. The business unit of statistics is single database instance, and the time unit is minute.

(2) Unavailable time: Only services provided by JCS for Greenplum are unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time of JCS for Greenplum Services shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure.

**2.9 Fault Recovery Capability**

JD Cloud offers 7×24 hours of operation maintenance for the cloud services of the paying users, offers technical support by means of on-line ticket and telephone fault reporting, and has a series of fault incident response mechanisms such as fault monitoring, automatic alarm, fast positioning and fast recovery.

**2.10 Service Metering Accuracy**

JCS for Greenplum Services have an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual usage of JCS for Greenplum. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

**2.11 Service Compensation Terms**

2.11.1 Compensation Scope:

In the event of failure of normal use of JCS for Greenplum due to JD Cloud’s fault, or failure of normal website access due to JD Cloud's fault, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud has notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Unavailability situations such as packet loss and latency caused by operator fault;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or operations authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud’s account.

2.11.2 Compensation • Scheme Fault Time = Unavailable Time.

• For the monthly package of Greenplum instance, compensation shall be made by the means of compensating service duration at the 100 times of fault time/set.

• For the Greenplum instance paid by configuration, compensation shall be made by the means of coupons at the compensation amount = average charge per hour of 24 hours before the fault/60 x fault time x 100.

Description:

• If the usage time of Greenplum instance in Pay By Configuration Consumption is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual usage duration;

• Fault time shall be calculated by minutes;

• The total compensation amount shall not exceed the total amount of current service charge already paid for a single set of JCS for Greenplum;

**3 Miscellaneous**

JD Cloud has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud official website [www.jdcloud.com](https://www.jdcloud.com) or send emails or written notices to notify users of the modified contents.

 
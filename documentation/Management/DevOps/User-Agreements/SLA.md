# SLA


**1. Service Scope**

JD Cloud DevOps service is set of DevOps service constructed on the basis that JD Cloud combines its own automatic operation and maintenance technology and ability and aims at public cloud scenarios and characters. Simplify the service life cycle management of deployment, monitoring, operation and maintenance and other applications, so as to greatly improve the efficiency and stability of operation and maintenance, and help enterprises to quickly implement service construction and efficient and stable operation and maintenance.


**2. Service Level Indicator**

**2.1 Data persistence**

Data persistence: not less than 99.99%

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle.

**2.2 Data destructibility**

2.2.1 If the users actively delete the data or need to destruct the data after expiry, JD Cloud will automatically remove corresponding data in the physical disks and memory, which the data cannot be recovered.

2.2.2 Before scrapping, outsourced maintenance or resale of the equipment used for the cloud services, JD Cloud will adopt demagnetization operation on its physical disk.

**2.3 Data portability**

When users use the DevOps services, JD Cloud provides package version management functions, including uploading and downloading for quick deployment.

**2.4 Data privacy**

By means of encryption and security group isolation, JD Cloud ensure that the user data in different resource pools are invisible with each other.

**2.5 Right to know of data**

2.5.1 Users have the right to know the geographical location of data center with their data and backup data, as well as the number of data backup, of which:

2.5.1.1 At present, JD Cloud data centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai), South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they open cloud service, and their data will be stored in the data center specified by themselves.

2.5.1.2 JD Cloud service provides automatic data backup function, the backup data are stored in the same data center as the source data by default. Users need not to designate the number and storage location for their data’s automatic backup.

2.5.2 JD Cloud data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

2.5.3 Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics and analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

**2.6 Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user action and other information.

**2.7 Service functions**

DevOps service has CMDB, CICD, intelligent monitoring, operation and maintenance tools and other functions, see detailed description documents, technical documents and Help Documentation provided by JD Cloud on the official website for all specific functions of DevOps services. All the functional changes of DevOps services that may affect users will be announced to the users.

**2.8 Service availability**

Service availability: not less than 99.9%.

DevOps service is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle. The business unit of statistics is single function module, and the time unit is in minute.

Unavailable time: only services provided by DevOps are unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time of DevOps services shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure (see article 2.12.1 for details).

**2.9 Service resource allocation capability**

DevOps services provide multiple configurations and have the capacity of auto scaling so that users can expand or contract the resources they use online according to JD Cloud configuration scheme.

**2.10 Fault recovery capability**

JD Cloud provides 7×24 hours of operation maintenance for the cloud services of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

**2.11 Service metering accuracy**

DevOps service has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual usage. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

**2.12 Service compensation terms**

2.12.1 Compensation scope:

In the event of failure of normal use of DevOps services due to JD Cloud fault, or failure of normal website access due to JD Cloud fault, JD Cloud will compensate for the unavailability time, excluding the service unavailability time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud have notified the users in advance, including cut-over, maintenance, upgrade and simulation fault drill;
(2) Unavailability situations such as packet loss and latency caused by operator fault;
(3) Caused by hacker attacks to the user’s application program or data information;
(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;
(5) Caused by user’s own upgrading of operating system;
(6) Caused by user’s application program or installation activities;
(7) Caused by user’s negligence or actions authorized by the user;
(8) Caused by force majeure and accidents;
(9) Other unavailability caused not due to JD Cloud’s account.

2.12.2 Compensation scheme

Fault Time=Unavailable Time.

There is no compensation for the free DevOps service.
For charged DevOps services, compensation shall be made by means of compensating service duration at the 100 times of fault time/set.
The total compensation period shall not exceed the total paid service time.



**3. Others**

JD Cloud has the right to make adjustments to partial service indicators of the Service Level Agreement according to changes at the time moment, and promptly release announcements on JD Cloud official website of www.jdcloud.com, or send e-mails or written notices to notify users of the modified contents.




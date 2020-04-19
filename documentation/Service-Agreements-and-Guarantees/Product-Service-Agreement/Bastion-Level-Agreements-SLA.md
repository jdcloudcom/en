### 1. Service Scope

JD Cloud & AI's bastion provides users with an operation and maintenance platform for cloud computing security control, which can implement 4A security control of operation and maintenance resources. The operation and maintenance bastion contains function modules of user management, resource management, operation and maintenance policy and audit, and can provide security control and protection for Windows or Linux and other operating systems.

### 2. Service Level Indicator

#### 2.1 Data Persistence

Data Persistence: Shall not be less than 99.9999999%

Data persistence is counted by service cycle. A service cycle is a natural month, and if it is less than a month, then it is not counted as a service cycle.
Calculation formula for data persistence: Instance of complete data per service cycle / (instance of complete data per service period + instance of lost data per service period). Namely, the no loss probability per 1,000,000,000 bastion instances in normal use per month is 99.9999999%, which means at most 1 bastion instance may have data loss per month.

#### 2.2 Destruction Nature of Data

2.2.1 If users actively delete the data or need to destruct the data after expiry, JD Cloud & AI will automatically remove corresponding data in the disks and memory of the physical server and the data cannot be recovered.

2.2.2 Before scrapping, outsourced maintenance or resale of the device used for the cloud service, JD Cloud & AI will demagnetize its physical disk.

#### 2.3 Migration Nature of Data

During users use the operation and maintenance bastion service, the data may be migrated by public network or Intranet.

#### 2.4 Right to Know Data

2.4.1 Users have the right to know the geographical location of data center where their data and backup data are stored, as well as the number of data backup, of which:

2.4.1.1 At present, JD Cloud & AI Data Centers are distributed in North China (Beijing), East China (Shanghai) and South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they subscribe the cloud service and the user data will be stored at the designated data center;

2.4.1.2 JD Cloud & AI's services provide automatic data backup function. For details of the backup number, please refer to relevant technical documents. The backup data are stored in the same data center as the source data by default. Users need not to designate the number and storage location for their data’s automatic backup.

2.4.2 JD Cloud & AI data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud & AI to acquire the detailed information.

2.4.3 Except for the requirements of local laws and regulations or supervision and auditing of regulatory authorities, all user data, applications and behavior logs will not be provided to any third party. Apart from being used for statistics & analysis of product operation status of JD Cloud & AI, user behavior logs will not display users’ personal information data to the external.

#### 2.5 Privacy of Data

By means of encryption and security group isolation, JD Cloud & AI ensures that the user data in the same resource pools are invisible with each other, in which security groups can isolate different user resources through a series of data link level and network level IAM technology.

#### 2.6 Auditability of Data

In accordance with the existing laws and regulations or the requirements for reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud & AI may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

#### 2.7 Service Functions

The operation and maintenance bastion can be purchased in the online purchasing. With operation and maintenance bastion, users may implement operation and maintenance and audit functions such as unified asset management, unified user management, unified permission control and security audit. For details of all functions of operation and maintenance bastion, please refer to the detailed description document, technical document and help documentation provided by JD Cloud & AI on the official website. All functional changes in the operation and maintenance bastion service that may affect users will be announced to the users.

#### 2.8 Service Availability

 Service Availability: Shall not be less than 99.95%.

 Calculation formula for bastion service availability: All available time per service cycle of a single bastion instance / (all available time per service cycle of a single bastion instance + all unavailable time per service cycle of a single bastion instance).

Where,

(1) Bastion service availability is counted by service cycle. A service cycle is a natural month, and if it is less than a month, then it is not counted as a service cycle. The business unit of statistics is a single bastion instance, and the time unit is minute.

(2) Unavailable time: Only services provided by bastion which are unavailable for successive 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not count as unavailable time. The unavailable time of bastion service shall exclude daily system maintenance time and unavailable time due to user reasons, third-party reasons or force majeure.

#### 2.9 Service Resource Allocation Capability

JD Cloud & AI bastion service provides many configurations and is capable of configuration upgrade. At present, the minimum configuration has 2-core 4 GB memory, 1000GB log disk and 50 resource counts while the maximum configuration has 8-core 16GB memory and 5000 resource counts. When users purchase the bastion service, they can set the appropriate configuration and the number of managed machines according to their own business situation.

#### 2.9 Network Access Performance

The JD Cloud & AI bastion service provides the required public network outlet bandwidth and JD Cloud & AI provides BGP multi-line access to ensure the quality of network access for the users.

#### 2.10 Service Measurement Accuracy

JD Cloud & AI bastion service has an accurate and transparent measurement and billing system. JD Cloud & AI settles charges according to the user’s actual use time and purchase quantity of cabinet. The specific billing standard shall be subject to the valid billing mode and price announced on JD Cloud & AI's official website. The user’s original billing log shall be kept for at least 3 years by default for future reference.

#### 2.11 Service Compensation Terms

**2.11.1 Compensation Scope:**

In the event of failure of normal use of bastion service due to JD Cloud & AI’s faults or failure of normal website access due to JD Cloud & AI’s fault, JD Cloud & AI will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud & AI has notified the user in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Unavailability situations such as packet loss and latency caused by operator fault;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by forgetting, loss or leakage of data or passwords due to the user’s improper maintenance or improper confidentiality;

(5) Caused by the user’s own upgrading of operating system;

(6) Caused by the user’s application program or installation activities;

(7) Caused by the user’s negligence or operation authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud & AI’s account.

**2.11.2 Compensation Scheme**

Fault Time = Unavailable Time.

For the paid bastion service, compensation shall be made by the means of compensating service duration at the 100 times of fault time/set

The total compensation period shall not exceed the total paid service time.

### 3. Miscellaneous

JD Cloud & AI has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud & AI’s official website [www.jdcloud.com](https://www.jdcloud.com) or send emails or written notices to notify users of the modified contents.

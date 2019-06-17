# SLA
## **1. Service Scope**

JD Cloud Object Storage Service (OSS) provides a safe, stable, mass and convenient object storage service for users with JD's rich technological experience in the field of distributed storage. JD Cloud Object Storage Service provides a full range of products including file upload, storage, download, distribution and online processing. From a few bytes to a few terabytes of data, we can offer you a complete storage solution.

Meanwhile, JD Cloud Object Storage Service also provides you with a simple and convenient Restful interface and easy-used SDK to help you manage and access the data on JD Cloud Object Storage Service at any place to which the Internet can be accessed; currently, the settlement method of Pay-As-You-Go is adopted for Object Storage Service.

## **2. Service Level Indicator**

### **2.1 Data Persistence**

Data persistence: no lower than 99.999999999%;

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle.

**2.2 Destruction Nature of Data**

2.2.1. If the users actively delete the data or need to destruct the data after expiry, JD Cloud will automatically remove corresponding data in the disks and memory of the physical server, and the data cannot be recovered.

2.2.2. Before scrapping, outsourced maintenance or resale of the equipment used for the cloud services, JD Cloud will adopt demagnetization operation on its physical disk.

**2.3 Migration Nature of Data**

The user file is the object of JD Cloud Object Storage Service, with the file type format remaining unchanged. When using Object Storage Service, the user can access and download its files at any time and save or migrate the same out at any time depending on the user’s demand.

**2.4 Privacy of Data**

The user can enable the Object Storage Service on the official website of JD Cloud, and JD Cloud assigns AccessKey and Secret key security encryption pairs to the user, carries out permission control and isolation from the Object Storage Service access interface, and guarantees user data privacy.

**2.5 Right to Know Data**

2.5.1 Users have the right to know the geographical location of data center with their data and backup data, as well as the number of data backup, of which:

2.5.1.1 At present, JD Cloud Data Centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai) and South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they enable the cloud service, and the user data will be stored at the designated data center;

2.5.1.2. JD Cloud service provides automatic data backup function, the backup data are stored in the same data center as the source data by default. Users need not to designate the number and storage location for their data’s automatic backup.

2.5.2. JD Cloud data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

2.5.3. Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics & analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

**2.6 Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

**2.7 Service Functions**

Object Storage Service applies to the storage of unstructured data, and the distributed storage mechanism is adopted for the underlayer. A single file in Object Storage Service can support 48.8TB at most, with the file type and Nr. default unlimited. For details of all functions of Object Storage Service, please refer to the detailed description document, technical document and help documentation provided by JD Cloud on the official website. All the functional changes of JD Cloud that may affect users will be announced to the users.

Bucket is adopted by JD Cloud as the naming space of user files and the management entity for senior functions such as billing, permission control and log recording; the Bucket name shall be globally unique among the Object Storage Service of JD Cloud. If the Bucket of a name is created by you, other users cannot create the Bucket with the same name. Each file stored in the Object Storage Service by the user must be contained in the user’s Bucket.

**2.8 Service Availability**

Service availability: not less than 99.9%.

Availability of Object Storage Service is counted by service cycles. A service cycle is a natural month, and if it is less than a month, then it is not counted as a service cycle.

The counted business unit covers all Buckets of each user and the unit of time is minute.

Unavailable time: Only when the services provided by Object Storage Service are unavailable for continuous 5 minutes or above, it can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it doesn’t account for the unavailable time. The unavailable time of Object Storage Service shall exclude the daily system maintenance time and the unavailable time due to user reasons, the third party reasons or force majeure.

**2.9 Service Resource Allocation Capability**

The JD Cloud Object Storage Service provides the file storage service to the user and supports the file on-line upload and download by the user through network. The storage amount will be expanded with the user’s demand. With the growth of traffic, the background processing capacity of Object Storage Service will be automatically expanded without the user’s intervention.

**2.10 Fault Recovery Capability**

JD Cloud provides 7×24 hours of operation maintenance for the cloud services of the paying users, provides technical support by means of on-line ticket and telephone fault reporting, and has a series of fault  incident response mechanisms such as fault monitoring, automatic alarm, fast positioning and fast recovery.

**2.11 Service Metering Accuracy**

JD Cloud Object Storage Service has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual consumption of JD Cloud Object Storage Service. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud’s official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

**2.12 Service Compensation Terms**

2.12.1 Compensation Scope:

In the event of failure of normal use of Object Storage Service due to JD Cloud fault, or failure of normal website access due to JD Cloud fault, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

1. Caused by the system maintenance that JD Cloud have notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

2. Unavailability situations such as packet loss and latency caused by operator fault;

3. Caused by hacker attacks to the user’s application program or data information;

4. Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

5. Caused by user’s own upgrading of operating system;

6. Caused by user’s application program or installation activities;

7. Caused by user’s negligence or actions authorized by the user;

8. Caused by force majeure and accidents;

9. Other unavailability caused not due to JD Cloud’s account.

2.12.2 Compensation Scheme

Fault Time = Unavailable Time.

Compensation amount of a single Bucket = average charge per hour of 24 hours before the fault/60 x fault time x 100.

Description:

The total compensation amount shall not exceed the total amount of current service cash charge already paid for Object Storage Service.

The fault compensation for the Object Storage Service will be made in the form of coupons which cannot be converted to cash.

If the user’s usage time is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual service duration, and the fault time shall be calculated by minutes.

## **3. Others**

JD Cloud has the right to make adjustments to some service indicators of the Service Level Agreement according to changes, and promptly publish announcements on JD Cloud official website ([www.jdcloud.com](https://www.jdcloud.com/)), or send emails or written notices to notify the users of the modified contents.

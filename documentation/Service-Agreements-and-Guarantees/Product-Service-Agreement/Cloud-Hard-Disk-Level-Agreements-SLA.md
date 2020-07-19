### 1. Scope of Service

Cloud Disk Service of JD Cloud & AI provides users with block storage service of low time delay, high reliability and high availability by making use of deep technical accumulation of JD in the distributed storage field of years. Data of Cloud Disk Service are stored in three duplicates, avoiding influence to data integrity by component failure. Capacity of Cloud Disk Service can be flexibly expanded, and functions of snapshot and customized snapshot policy are supported at the same time. At present, Cloud Disk Service comprises two settlement methods, pay-in-advance and pay-as-you-go.

### 2. Service Level Indicator

**2.1** ** Data persistence**

Data persistence: Not less than 99.9999999%;

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle.

**2.2**  **Destructibility of Data**

2.2.1． If users actively delete the data or need to destruct the data after expiry, JD Cloud & AI will automatically remove corresponding data in the disks and memory of the physical server and the data cannot be recovered.

2.2.2． Before scrapping, outsourced maintenance or resale of the device used for the cloud services, JD Cloud & AI will adopt demagnetization operation on its physical disk.

### 2.3 Migration Nature of Data

When using Cloud Disk Service, users can use computing products such as Virtual Machine and container to attach cloud disk so as to access data in cloud disk. When the data needs to be migrated, it can be exported in the form of cloud disk snapshot by opening ticket.

### **2.4** Privacy of Data

Users may subscribe Cloud Disk Service via JD Cloud & AI’s official website. Users may operate cloud disk and access the data in cloud disk only if they merely log in JD Cloud & AI and their identity verification is approved. The data in cloud disk of different users are isolated.

JD Cloud & AI provides "encryption" disk function. AES-256 algorithm is adopted to encrypt the data in cloud disk, which can further protect the privacy of data for users.

#### 2.5 Right to Know Data

2.5.1．Users have the right to know the geographical location of data center where their data and backup data are stored, as well as the count of data backup, of which:

2.5.1.1 At present, JD Cloud & AI Data Centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai) and South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they enable the cloud service, and the user data will be stored at the designated data center;

2.5.2 JD Cloud & AI data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud & AI to acquire the detailed information.

2.5.3 Except for the requirements of local laws and regulations or supervision and auditing of regulatory authorities, all user data, applications and behavior logs will not be provided to any third party. Apart from being used for statistics & analysis of product operation status of JD Cloud & AI, user behavior logs will not display users’ personal information data to the external.

### 2.6 Auditability of Data

In accordance with the existing laws and regulations or the requirements for reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud & AI may provide relevant information about the services used by users including the running logs of key components, operational records of operation and maintenance personnel, records of user operation and other information.

### 2.7 Service Functions

JD Cloud & AI provides three new types of Cloud Disk Services, which respectively are: general type SSD Cloud Disk Service, performance type SSD Cloud Disk Service and capacity type HDD Cloud Disk Service to meet the application scenarios of different performance requirements.

Capacity HDD Cloud Disk Service: Single disk capacity: 20-16,000G; the maximum IOPS and maximum throughput shall not be committed. Typical Application Scenarios: Applicable to scenarios with moderate read-write rate, fewer transactions to process, cold data backup, etc.; 

General SSD Cloud Disk Service: Single disk capacity: 20-16,000G; the maximum IOPS of the single disk: 15,000; the maximum throughput of the single disk: 150MBps; Typical Application Scenarios: Applicable to boot volumes, small databases, large-scale development tests, web servers, and other business scenarios that require random read-write; 

Performance SSD Cloud Disk Service: Single disk capacity: 20-16,000G; the maximum IOPS of the single disk: 32,000; the maximum throughput of the single disk: 150MBps; Typical Application Scenarios: big data analysis; I/O intensive business, as well as medium and large-sized database application.

Cloud Disk Service provides high-reliability, high-availability and high-performance data storage service: 1) Data in cloud disk are independent from the status of Virtual Machine, support attaching and detaching at any time; a single Virtual Machine may be attached with up to 8 cloud disks (including system disk) to meet higher storage demands of users; 2) users only need to pay for the current capacity and type of the cloud disk, and may expand the cloud disk capacity at any time based on business development; and 3) real-time monitoring of IOPS and throughput of Cloud Disk Service is provided to know health status of hard disk at any time.

Cloud Disk Service provides snapshot function to realize data backup at specified time points

1) Snapshot is a full copy of cloud disk, including the data image of the disk from creation time point to backup time point, to store it in a redundant manner. 2) You can roll back cloud disk by snapshot to recover your business to any snapshot time point. 3) Create image to Virtual Machine, and simultaneously create a snapshot for the cloud disk attached to Virtual Machine. Based on the Virtual Machine image, another Virtual Machine with the same configuration can be quickly reproduced, to realize quick bulk deployment of business.

### 2.8 Service Availability

Service Availability: not less than 99.95%.

Availability of Cloud Disk Service is counted by service cycles. A service cycle is a natural month, and if it is less than a month, it shall not be counted as a service cycle.

The counted business unit covers all cloud disk instances of each user and the unit of time is minute.

Unavailable time: Only services provided by Cloud Disk Service which are unavailable for successive 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not count as unavailable time. The unavailable time of Cloud Disk Service shall exclude daily system maintenance time and unavailable time due to user reasons, third-party reasons or force majeure.

### 2.9 Fault Recovery Capability

JD Cloud & AI provides a 7×24 hours operation and maintenance for the cloud services of the paying users and provides technical support by such means as on-line ticket and telephone fault reporting. It has a series of fault incident response mechanisms such as fault monitoring, automatic alarming, fast positioning and fast recovery.

2.10 Service Metering Accuracy

JD Cloud & AI Cloud Disk Service has an accurate and transparent metering and billing system. JD Cloud & AI shall settle according to users’ JD Cloud & AI cloud disk capacity purchased. The specific billing standards shall be subject to the effective billing mode and price announced on JD Cloud & AI’s official website. Users’ original billing logs shall be kept for at least 1 year by default for future reference.

#### 2.12 Service Compensation Terms

**2.12.1 Compensation Scope**:

In the event of failure of normal use of Cloud Disk Service due to JD Cloud & AI’s faults, and failure of normal website access due to JD Cloud & AI’s fault, JD Cloud & AI will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

1. System maintenance that JD Cloud & AI has notified the user in advance, including migration, maintenance, upgrade and simulation fault drill;

2. Unavailability situations such as packet loss and latency caused by operator fault;

3. Caused by hacker attacks to the user’s application program or data information;

4. Caused by loss or leakage of data, passwords, etc. due to user's improper maintenance or improper confidentiality;

5. Caused by user’s own upgrading of operating system;

6. Caused by user’s application program or installation activities;

7. Caused by user’s negligence or actions authorized by the user;

8. Caused by force majeure and accidents;

9. Other reasons not due to JD Cloud & AI.

**2.12.2. Compensation Scheme**

Fault Time = Unavailable Time.

Compensation amount of a single cloud disk = average charge per hour of 24 hours before the fault/60 x fault time x 100.

Note:

The total compensation amount shall not exceed the total amount of current service cash charge already paid for Cloud Disk Service.

The fault compensation for the Cloud Disk Service will be made in the form of coupons which cannot be converted to cash.

If the user’s usage time is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual service duration, and the fault time shall be calculated by minutes.

### 3. Miscellaneous

JD Cloud & AI has the right to adjust partial service indicators of the Service Level Agreement as per the changes from time to time and promptly release announcements on JD Cloud & AI’s official website (\[www.jdcloud.com](https://www.jdcloud.com/)) or send emails or written notices to notify users of the modified contents.


 

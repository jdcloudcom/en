# 1. Service Scope

JD Cloud File Service is a fully-hosted distributed file system with high reliability, expandability and sharable access. It can be expanded or reduced as needed based on your use of the file system without interrupting the application service, and billed according to actual usage. The NFS protocol is adopted, which supports POSIX file API and provides shared access services for Virtual Machines under Linux.

# 2. Service Level Indicator

## 2.1 Service Availability

Service availability: Not lower than 99.99%.

The formula for computing the availability of Cloud File Service is as follows: all available time for a single service cycle/(all available time for a single service cycle + all unavailable time of a single file system per service cycle).

Where,

(1) Availability of Cloud File Service is counted by service cycle and a service cycle is a natural month. If it is less than a month, then it is not counted as a service cycle. The business unit of statistics is a single file system, and the time unit is minute.

(2) Unavailable time: Only services provided by Cloud File Service unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time of Cloud File Service shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure.

## 2.2 Data Persistence

Data persistence: no lower than 99.9999999%;

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle.

## 2.3 Destruction Nature of Data

2.3.1 If the users actively delete the data or need to destruct the data after expiry, JD Cloud will automatically remove corresponding data in the disks and memory of the physical server, and the data cannot be recovered.

2.3.2 Before scrapping, outsourced maintenance or resale of the equipment used for the cloud services, JD Cloud will adopt demagnetization operation on its physical disk.

## 2.4 Migration Nature of Data

Users may from time to time access, write and read files in the file system via the file system attached with Cloud File Service. When you need to stop Cloud File Service, you can save data in the file system on your own or migrate the same.

## 2.5 Privacy of Data

Users can subscribe Cloud File Service on JD Cloud’s official website. With a series of IAM functions and technical guarantees such as Account System, Access Permission Control, VPC Network Isolation and Security Group, Cloud File Service can ensure that user data in the same resource pool are invisible to each other and isolate user resources.

## 2.6 Right to Know Data

2.6.1 Users have the right to know the geographical location of data center with their data and backup data, as well as the number of data backup, of which:

2.6.1.1 At present, JD Cloud Data Centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai) and South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they enable the cloud service, and the user data will be stored at the designated data center;

2.6.1.2 JD Cloud service provides automatic data backup function, the backup data are stored in the same data center as the source data by default. Users need not to designate the number and storage location for their data’s automatic backup.

2.6.2 JD Cloud data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

2.6.3 Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

## 2.7 Reviewability of Data

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

## 2.8 Service Functions

Cloud File Service is applicable to storage demands of shared file documents. The distributed storage mechanism is adopted as the underlayer, providing the three-copy data redundancy storage and guarantee data durability. Single file storage can provide the maximum PB-level capacity. The file storage capacity will be auto scaled as per actual consumption and billed as per actual consumption. Multiple Virtual Machines can access file storages in Cloud File Service via the NFS protocol and write and read the same. For details of all functions of the Cloud File Service, please refer to the detailed description document, technical document and help documentation provided by JD Cloud on the official website. All functional changes of Cloud File Service that may affect users will be announced to the users.

## 2.9 Service Resource Allocation Capability

Cloud File Service of JD Cloud provides users with fully-hosted distributed file system service, with the file system capacity expanded as per user’s consumption and file system throughout bandwidth and IOPS increased as per the performance formula. For detailed specification of performance formula, please refer to introduction in "Performance" document for Cloud File Service in Help Documentation of JD Cloud’s official website.

## 2.10 Fault Recovery Capability

JD Cloud provides 7×24 hours of operation maintenance for the cloud services of the paying users, provides technical support by means of on-line ticket and telephone fault reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, fast positioning and fast recovery.

## 2.11 Service Metering Accuracy

The Cloud File Service of JD Cloud has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual usage. The specific billing standard shall be subject to the effective billing mode and price announced on the JD Cloud’s official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

## 2.12 Service Compensation Terms

### 2.12.1 Compensation Scope

In the event of failure of normal use of Cloud File Service due to JD Cloud’s fault, or failure of normal website access due to JD Cloud fault, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

1. Caused by the system maintenance that JD Cloud have notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

# 2. Unavailability situations such as packet loss and latency caused by operator fault;

3. Caused by hacker attacks to the user’s application program or data information;

4. Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

5. Caused by user’s own upgrading of operating system;

6. Caused by user’s application program or installation activities;

7. Caused by user’s negligence or actions authorized by the user;

8. Caused by force majeure and accidents;

9. Other unavailability caused not due to JD Cloud’s account.

### 2.12.2 Compensation Scheme

Fault time (unit: minute) = Unavailable time (unit: minute).

Compensation amount of a single Cloud File Service = average cost per hour of 24 hours before the fault/60 x fault time (unit: minute) x 100.

Description:

The total compensation amount shall not exceed the total cost of current service cash charge already paid for Cloud File Service.

The fault compensation for the Cloud File Service will be made in the form of coupons which cannot be converted to cash.

If the user’s usage time is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual service duration, and the fault time shall be calculated by minutes.

# 3. Miscellaneous

JD Cloud has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud official website (

[www.jdcloud.com](https://www.jdcloud.com/)) or send emails or written notices to inform users of the modified contents.
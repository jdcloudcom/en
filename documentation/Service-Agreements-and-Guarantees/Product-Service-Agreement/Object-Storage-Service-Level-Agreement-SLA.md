## **1. Service Scope**

JD Cloud's object storage provides users with secure, stable, massive and convenient object storage service with JD's rich technology accumulation in the field of distributed storage for many years. JD Cloud's object storage service provides a full range of products including file upload, storage, download, distribution, and online processing. From a few bytes to a few terabytes of data, the object storage service can provide you a complete storage solution.

At the same time, JD Cloud's object storage also provides you with a simple and convenient Restful interface and easy-to-use SDK to help you manage and access data on the object storage in any place where you can access the Internet. At present, the pay-as-you-go billing mode is adopted for the object storage service.

## **2. Service Level Indicators**

### **2.1 Data Persistence**

Data persistence: no less than 99.999999999%;

Data persistence is counted by service period. One service period is a natural month. If it is less than one month, it is not counted as one service period.

**2.2 Data Destructibility**

2.2.1. If the user deletes the data or needs to destroy the data after the service expires, JD Cloud will automatically clear the disk and memory data on the corresponding physical server, so that the data cannot be recovered.

2.2.2. Before the equipment used in the cloud service is scrapped, disposed, repaired by outsourcing or resold, JD Cloud will degauss its physical disk.

**2.3 Data Migration**

The object of JD Cloud's object storage service is the user files, and the file type remains unchanged. When users use the object storage, they can access and download their files at any time, and save or migrate them out as needed.

**2.4 Data Privacy**

Users can open the object storage service at JD Cloud official website. JD Cloud assigns Access Key and Secret key encryption key pairs to users, and controls and isolates the rights from the object storage access interface to ensure the privacy of user data.

**2.5 Right to Know about Data**

2.5.1. The user has the right to know the data, the geographical location of the data center where the backup data is located, and the number of data backups, among which:

2.5.1.1. At present, the data centers of JD Cloud are located in cn-north-1, cn-east-1 and cn-south-1. Users must select the corresponding data according to the geological position when applying for cloud service and the user data will be stored in its designated data center;

2.5.1.2. JD Cloud Service has automatic data backup function. The backup data is stored in the same data center as the source data by default. The user does not need to specify the number of automatic backups and the location where the date backed up automatic is stored.

2.5.2. JD Cloud data center will comply with relevant local laws and regulations, and users have the right to know about this, and can contact JD Cloud's customer service personnel for detailed information.

2.5.3. Unless required by local laws and regulations, or regulatory and auditing requirements of government's regulatory authorities, all data, applications and behavior logs of users will not be provided to third parties. In addition to the statistics and analysis of the operating status of the products used by JD Cloud, the user's behavior log will not present the user's personal information data.

**2.6 Data Reviewability**

In accordance with current laws and regulations or according to the requirements of government regulatory authorities, safety compliance, auditing or forensics investigations and in the context of complete processes and procedures, JD Cloud can provide relevant information of the service purchased by the user, including running logs of key components, operation records of operation and maintenance personnel, and user's operation records.

**2.7 Service Features**

Object storage is suitable for unstructured data storage, and a distributed storage mechanism is adopted for the underlying. A single file of the object storage can support up to 48.8TB, and the type and number of files are not restricted by default. For details on all the specific functions of the object storage, please refer to the specifications documentation, technical documentation and help documentation provided by JD Cloud on its official website. All functional changes to the JD Cloud that may affect the user will be announced to the user.

JD Cloud uses Bucket as the namespace of user files, and is also the management entity for advanced functions such as billing, permission control, and logging; the name of Bucket is globally unique in JD Cloud's object storage. If you create a bucket of a certain name, other users will no longer be able to create buckets of the same name. Each file that the user stores on the object store must be included in the bucket owned by the user.

**2.8 Service Availability**

Service availability: no less than 99.9%.

The availability of the object storage service is counted according to the service period. One service period is a natural month. If it is less than one month, it is not counted as one service period.

The statistical business unit is all Buckets of each user, and the time unit is minute.

(2) Unavailable Time: The time when the service provided by the object storage is not available for 5 minutes or more, and if the service is unavailable for less than 5 minutes, it is not counted into unavailable time. The unavailability time of object storage does not include daily system maintenance time, and the unavailability time due to user reasons, third-party causes, or force majeure.

**2.9 Service Resource Allocation Capability**

JD Cloud's object storage provides users with file storage service and supports users to upload and download files through the network. The amount of storage will expand according to the needs of users. As the visitor volume grows, the object storage background processing capability automatically expands without user intervention.

**2.10 Fault Recovery Capability**

JD Cloud provides 7×24h operation and maintenance for the cloud services of paying users, and provides technical support by means of online open ticket and phone reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, rapid positioning and fast recovery.

**2.11 Service Measurement Accuracy**

The object storage of JD Cloud has an accurate and transparent metering and billing system. It settles and charges in real time according to the user's actual usage of the object storage, and the specific billing standard is subject to the effective billing mode and price announced on the official website of JD Cloud. The user's original billing log is reserved for a minimum of 1 year by default for future reference.

**2.12 Service Compensation Terms**

2.12.1 Compensation Scope:

For the inability of object storage to work properly caused by JD Cloud fault, and the inability of normal access to the website caused by JD Cloud fault, JD Cloud will compensate for the unavailable time. However, the service unavailable time caused by the following reasons is not included:

1. Caused by the system maintenance procedures after JD Cloud's notification in advance, including cutting, maintenance, upgrading and simulated fault drill;

2. Packet loss and delay caused by operators' fault;

3. Hackers' hacking to the users' application programs or data information;

4. The loss or leakage of data, key, passwords, etc. due to user's improper maintenance or improper confidentiality measures;

5. The user upgrading the operating system by himself;

6. The user's app or installation activities;

7. The user's negligence or operation authorized by the user;

8. Force majeure and accidents;

9. Other reasons beyond D Cloud.

2.12.2. Compensation Plan

Fault time = unavailable time.

Payout amount of a single Bucket = the average hourly cost in the first 24 hours of the fault /60×fault time×100.

Instructions:

Total amount of compensation shall not exceed the total amount of cash paid for the current service of object storage.

Fault compensation for object storage is made with coupon only, rather than cash refund.

* If the use time of user is less than 24 hours, the cost shall be calculated based on the average of actual use time; and the fault time shall be calculated by minutes;

## **3.Others**

JD Cloud has the right to make adjustments to some service indicators of the SLA according to the changes, and promptly publish announcements at ([www.jdcloud.com](https://www.jdcloud.com/)) or send emails or written notices to notify users of the revised content.

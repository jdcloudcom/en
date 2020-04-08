### 1. Service Scope

API Gateway service provided by JD Cloud & AI is a Distributed Queue Service researched and developed by the Middleware R&D Department of JD Cloud & AI. This product can provide services such as API life cycle management, traffic control policy, access authorization, backend signature and API calling situation monitoring.

### 2. Service Level Indicator

#### 2.1 Data Persistence

Data persistence: not less than 99.99% 

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle.

Calculation formula for data durability is as follows: API number of defined complete data per service cycle/(API count of defined complete data per service cycle + API count of defined data loss per service cycle). I.e., the no data loss probability per 10,000 APIs is 99.99%. This means that at most 1 API may have the defined data loss per month.

#### 2.2 Destruction Nature of Data

2.2.1 If the users actively delete the data or need to destruct the data after user service expiry, JD Cloud & AI will automatically remove corresponding data in the disks and memory of the physical server, and the data cannot be recovered.

2.2.2 Before scrapping, outsourced maintenance or resale of the device used for the cloud services, JD Cloud & AI will adopt demagnetization operation on its physical disk.

#### 2.3 Privacy of Data

A user shall sign safety encryption with AccessKey and Secret key for API calling, to avoid illegal calling and guarantee user data’s privacy.

#### 2.4 Right to Know Data

2.4.1 A user has the right to know about the geographical locations of the data centers where the message data and backup data in the API Gateway reside, among which: At present, JD Cloud & AI data centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai) and South China (Guangzhou). A user must select corresponding data centers according to the geographical locations when they enable cloud service, and their data will be stored in the data center specified by themselves;

2.4.2 JD Cloud & AI data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud & AI to acquire the detailed information.

2.4.3 Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics & analysis of product operating status of JD Cloud & AI, user behavior logs will not display user personal information data to the external.

#### 2.5 Reviewability of Data

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud & AI may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

#### 2.6 Service Functions

For details of all functions of the API Gateway Service, please refer to the detailed description document, technical document and help documentation provided by JD Cloud & AI on the official website. All the faults and functional changes that may affect users will be announced to the users.

#### 2.7 Service Availability

API calling process:

Service availability: Not lower than 99.95%.

Calculation formula for API Gateway calling process availability is: All available time of API Gateway per service cycle/(All available time of API Gateway per service cycle + All unavailable time of API Gateway per service cycle).

Where,

(1) Calling process availability of API Gateway shall be counted according to the service cycle; one natural month shall be one service cycle; and in case of less than one month, it shall not be counted as one service cycle and the time unit is minute.

(2) Unavailable time: Only services provided are unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time of API Gateway shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure.
 

API Gateway Console:

Service availability: not less than 99.9%.

Calculation formula for API Gateway availability is: All available time of API Gateway Console per service cycle/(All available time of API Gateway Console per service cycle + All unavailable time of API Gateway Console per service cycle).

Where,

(1) Availability of API Gateway Console shall be counted according to the service cycle; one natural month shall be one service cycle; and in case of less than one month, it shall not be counted as one service cycle and the time unit is minute.

(2) Unavailable time: Only services provided are unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time of API Gateway Console shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure.

#### 2.8 Service Resource Allocation Capability

API Gateway provides elastic expansion capability of the system, which can be manually expanded according to the needs of cluster service capability.
 
#### 2.9 Fault Recovery Capability

JD Cloud & AI provides 7×24 hours of operation maintenance for the cloud services of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault incident response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

#### 2.10 Service Metering Accuracy

API Gateway has an accurate and transparent metering and billing system. JD Cloud & AI settles and deducts charges in real time according to the user’s actual usage. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud & AI official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

#### 2.11 Service Compensation Terms

2.11.1 Compensation Scope:

In the event of failure of normal use of API Gateway due to JD Cloud & AI device faults, design defects or misoperation, JD Cloud & AI will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud & AI has notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Unavailability situations such as packet loss and latency caused by operator fault;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or operations authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud & AI’s account.

2.11.2 Compensation Scheme

Fault Time = Unavailable Time.

Compensation amount = average charge per hour of 24 hours before the fault/60 x fault time x 100.

Description:

The total compensation amount shall not exceed the total amount of current service cash charge already paid for an API Gateway.

The fault compensation for the API Gateway will be made in the form of coupons which cannot be converted to cash.

If the user’s usage time is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual service duration, and the fault time shall be calculated by minutes.

2.11.3 Compensation time limit

Customers may apply for compensation after the fifth working day of each month for the service failed to meet the availability commitment for a two-month period. The compensation application must be made within two months at the end of the relevant month in which the IoT Hub Protocol Adaptor Service fails to meet the availability commitment. Compensation application exceeding the time limit for application will be deemed as the customer’s waiver to such request.

### 3. Miscellaneous

JD Cloud & AI has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud & AI official website www.jdcloud.com or send emails or written notices to notify users of the modified contents.





### 1. Service Scope

Notification Service provided by JD Cloud & AI is the message notification service with the serverless architecture independently researched and developed by JD Cloud’s Middleware Product Department, providing high reliability, high availability, safety, dynamic expansion and subject subscription mode. It provides sending-receiving subjects of many-to-many pushed messages and helps users decouple the distributed system and the serverless applications. The message publisher can fan out messages to multiple subscription terminal nodes, realizing message broadcasting. Besides, the Notification Service provides the settlement functions of used and billed on demand.

### 2. Service Level Indicator

#### 2.1 Data Persistence

Data persistence: 99.9999999%

Notification Service provides fully hosted message notification service, guaranteeing the data persistence of the message within the notification process.

#### 2.2 Destruction Nature of Data

2.2.1 After the user’s service period expires, it needs to destroy message data. JD Cloud & AI will automatically clear the data of corresponding Notification Service and the data cannot be recovered.

2.2.2 Before scrapping, outsourced maintenance or resale of the device used for the cloud service, JD Cloud & AI will demagnetize its physical disk.

#### 2.3 Migration Nature of Data

The user can call the service through API provided by Notification Service to complete release and subscription of message data, while JD Cloud & AI provides the corresponding technical support.

#### 2.4 Privacy of Data

JD Cloud & AI guarantees that the user data in the same resource pool are mutually invisible via means of encryption, user separation, etc.

#### 2.5 Right to Know Data

2.5.1 Users have the right to know the geographical location of data center where the message data and backup data of Notification Service are located, of which: At present, JD Cloud & AI Data Centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai) and South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they subscribe the cloud service, and the user data will be stored at the designated data center;

2.5.2 JD Cloud & AI data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud & AI to acquire the detailed information.

2.5.3 Except for the requirements of local laws and regulations or supervision and auditing of regulatory authorities, all user data, applications and behavior logs will not be provided to any third party. Apart from being used for statistics & analysis of product operation status of JD Cloud & AI, user behavior logs will not display users’ personal information data to the external.

#### 2.6 Auditability of Data

In accordance with the existing laws and regulations or the requirements for reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud & AI may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

#### 2.7 Service Functions

The notification is applicable for multi-terminal broadcasting of message, service decoupling, etc. For details of all functions of Notification Service, please refer to the detailed description document, technical document and help documentation provided by JD Cloud & AI on the official website. All the faults and functional changes that may affect users will be announced to the users.

#### 2.8 Service Availability

Service availability: shall not be less than 99.95%.

Service availability shall be counted by service cycle and calculated as per the method below:

Service availability = ((Total number of minutes of service cycle - Number of minutes unavailable for service)/Total number of minutes of service cycle × 100%.

The availability of Notification Service is no less than 99.95%, and the customer can be compensated as agreed in Article 2.12 hereof, if the committed availability hasn’t been achieved.

Definition:

Service cycle: One service cycle is one natural month.

Minutes of service cycle: Total number of days within service cycle × 24 (hours) × 60 (minutes).

Total minutes of service cycle: the sum of minutes of service cycle for all subjects of Notification Service under one JD Cloud & AI account within one service cycle.

Service unavailable minutes: It is deemed that the service of the designated subject is unavailable in the period when all successive attempts of the customer to call API of a designated subject of Notification Service within one minute failed or the message notification has failed for at least 5 minutes due to the server. The sum of minutes of service unavailable for all subjects of Notification Service under one JD Cloud & AI account within one service cycle is the minute of service unavailable.

#### 2.9 Service Resource Allocation Capability

Notification Service can support smooth expansion. With growth of TPS and notification subscription number, Notification Service provides the system with elastic expansion capacity. 

#### 2.10 Fault Recovery Capability

JD Cloud & AI provides 7×24h operation and maintenance for the cloud service of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault emergency response mechanisms such as perfect fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

#### 2.11 Service Metering Accuracy

The Notification Service has an accurate and transparent metering and billing system. JD Cloud & AI shall settle and deduct charges in real time according to the user’s actual usage. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud & AI’s official website. The user’s original billing logs shall be kept for at least 1 year by default for future reference.

#### 2.12 Service Compensation Terms

**2.12.1 Compensation scope**:

In the event of failure of normal use of Notification Service due to JD Cloud & AI’s fault, JD Cloud & AI will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud & AI has notified the user in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Unavailability situations such as packet loss and latency caused by operator fault;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by the user’s own upgrading of operating system;

(6) Caused by the user’s application program or installation activities;

(7) Caused by the user’s negligence or operation authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud & AI’s account, for example (including but not limited to):

The delay in message delivery due to the customer’s account, including but not limited to message piling up or notification failure caused by slow handling at the customer’s subscription end;

**2.12.2 Compensation scheme**

Monthly service charge: The total actual service charge paid by the customer as for service charge of Notification Service under JD Cloud & AI for a natural month.

Make compensation based on the monthly service availability of Notification Service as per the following scheme:

| **Service Availability**                  | **Compensation Coupon Amount** |
| ------------------------------- | -------------------- |
| Lower than 99.95% but equal to or above 99.00% | 15% of the monthly service charge   |
| Lower than 99.00% but equal to or above 95.00% | 30% of the monthly service charge   |
| Lower than 95.00%                     | 100% of the monthly service charge  |


 Description:

The total compensation amount shall not exceed the total amount of current service cash charge already paid for the Notification Service (excluding the amount deducted by the coupon).

The compensation for Notification Service will be made in the form of Notification Service coupons which cannot be converted to cash for return.

#### 3. Miscellaneous

JD Cloud & AI has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud & AI’s official website [www.jdcloud.com](https://www.jdcloud.com) or send emails or written notices to notify users of the modified contents.


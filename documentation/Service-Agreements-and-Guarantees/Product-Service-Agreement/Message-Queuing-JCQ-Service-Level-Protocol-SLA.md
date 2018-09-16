#### **1.** **Service Scope**

The message queue service provided by JD Cloud is a distributed message queue service independently developed by JD Cloud's middleware R&D Department. The products can provide some cloud services with high reliability such as message publishing subscription, message query, message backtracking, dead message queue and monitoring alarm, etc.

#### **2.** **Service Level Indicators**

**2.1** **Data Persistence**

 The message queue service provides a message queue service. The message could be stored in the message queue for 3 days and will not be saved permanently.

**2.2** **Data Persistence**

2.2.1 Where the data should be destroyed after the service expires, JD Cloud will automatically clear the disk and memory data on the corresponding message queue, so that the data cannot be recovered.

2.2.2 Before the equipment used in the cloud service is scrapped, disposed, repaired by outsourcing or resold, JD Cloud will degauss its physical disk.

**2.3** **Data Migration**

Users can make service invocation through the API provided by the message queue, complete the release and subscription of message data, and JD Cloud will provide corresponding technical support.

**2.4** **Data Privacy**

JD Cloud uses encryption, security group isolation and other means to ensure that user data in the same resource pool is mutually invisible. The security group isolates different user resources through a series of identity and access management technologies such as data link layer and network layer.

**2.5** **Right to Know about Data**

2.5.1 The user has the right to know the data in the message queue, the geographical location of the data center where the backup data is located, among which: At present, JD Cloud data center is located in cn-north-1, cn-east-1, cn-east-2 and cn-south-1. Users must select the corresponding data according to the geographical location when registers the service. The user data will be stored in its designated data center;

2.5.2 JD Cloud data center will comply with relevant local laws and regulations, and users have the right to know about this, and can contact JD Cloud's customer service personnel for detailed information.

2.5.3 Unless required by local laws and regulations, or regulatory and auditing requirements of government's regulatory authorities, all data, applications and behavior logs of users will not be provided to third parties. In addition to the statistics and analysis of the operating status of the products used by JD Cloud, the user's behavior log will not present the user's personal information data.

**2.6** **Data Reviewability**

In accordance with current laws and regulations or according to the requirements of government regulatory authorities, safety compliance, auditing or forensics investigations and in the context of complete processes and procedures, JD Cloud can provide relevant information of the service purchased by the user, including running logs of key components, operation records of operation and maintenance personnel, and user's operation records.

**2.7** **Service Features**

Message Queue is suitable for application decoupling of systems, asynchronous processing and peak clipping control of traffic, etc. For details on all the specific functions of the message queue service, please refer to the detailed description documentation, technical documentation and help documentation provided by JD Cloud on the official website. All faults and functional changes that may affect the user will be announced to the user.

**2.8** **Service Availability**

Service Availability: No less than 99.95%.

Service availability shall be counted according to the service period as follows:

Service availability = ((Total minutes in the service periods - service unavailable minutes) / Total minutes in the service period) × 100%.

The message queue's availability is not less than 99.95%. In the case of failure to meet the above availability commitment, the customer may obtain compensation pursuant to Article 2.12 of this Agreement.

Definition:

Service Period: One service period is a natural month.

Minutes in One Service Period: Total days in the service period × 24 (h) × 60 (min).

Total Minutes in the Service Period: The sum of minutes in one service period of all Topics of the message queue under a JD Cloud account.

Minutes of Service Unavailable: When all consecutive attempts by the customer to call Topic's API specified by JCQ fail within a certain minute, or when the message delivery delays for over 5 minutes, and the timing message error exceeds 5 minutes, it is considered that the service for the specified Topic in the segment is not available. In a service period, the sum of the minutes of service unavailable for all Topic services of JCQ under a certain JD Cloud account is the minutes of service unavailable.

**2.9 Service Resource Allocation Capability**

Message queue service support is smooth and expandable. As TPS grows, the Message Queue provides the system with scalability.

**2.10 Fault Recovery Capability**

JD Cloud provides 7×24h operation and maintenance for the cloud services of paying users, and provides technical support by means of phone reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, rapid positioning and fast recovery.

**2.11 Service Measurement Accuracy**

The message queue JCQ has an accurate and transparent metering and billing system. JD Cloud settles and charges in real time according to the actual usage of the user's message queue JCQ, and the specific billing standard is subject to the effective billing mode and price announced on the official website of JD Cloud. The user's original billing log is reserved for a minimum of 1 year by default for future reference.

**2.12** **Services Compensation Terms**

2.12.1 Compensation Scope:

When the message queue cannot be used normally due to the JD Cloud fault, JD Cloud will compensate for the unavailable time, but not including the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance procedures after JD Cloud's notification in advance, including cutting, maintenance, upgrading and simulated fault drill;

(2) Packet loss and delay caused by operators' fault;

(3) Caused by the hackers' hacking to the users' application programs or data information;

(4) Caused by the loss or leakage of data, commands, passwords etc. due to user's improper maintenance or improper confidentiality measures;

(5) Caused by the user upgrading the operating system by himself;

(6) Caused by the user's application or installation activities;

(7) Caused by user's negligence or operation authorized by the user;

(8) Caused by force majeure and accidents;

(9) Unavailability caused by other reasons not related to JD Cloud, for example (including but not limited to):

2.12.1.1 Delay in message delivery due to the customer's own reasons, including but not limited to the case where slow consumption and processing by customers result in message accumulation;

2.12.1.2 Timing message errors caused by the customer's own reasons, including but not limited to errors caused by inconsistent server clocks and inconsistent time zones.

2.12.2 Compensation plan

Monthly Service Fee: The service fee paid by the customer in a natural month for the message queue under a JD Cloud account.

According to the monthly service availability of the message queue, compensation is made according to the following ways:

| **Service Availability**                  | **Compensation Coupons Amount**  |
| ------------------------------- | ------------------- |
| Below 99.95% but equal to or higher than 99.00% | 15% of Monthly Service Fee |
| Below 99.00% but equal to or higher than 95.00% | 30% of Monthly Service Fee |
| Below 95.00% | 100% of Monthly Service Fee |

 Instructions:

The total amount of compensation shall not exceed the total amount of current service cash charges (excluding the deduction by the coupons) for the message queue.

The message queue compensation is made with JCQ coupon only, rather than cash refund.

If the user does not use it for 24 hours, the charge is calculated based on the actual average usage time.

#### **3. Others**

JD Cloud has the right to make adjustments to some service indicators of the SLA according to the changes, and promptly publish announcements at www.jdcloud.com or send emails or written notices to notify users of the revised content.

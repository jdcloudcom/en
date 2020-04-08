**1. Service Scope**

The Queue Service provided by JD Cloud & AI is fully hosted message Queue Service with serverless architecture independently researched and developed by JD Cloud & AI’s Middleware Product Department, which can provide highly reliable and almost unlimitedly extendable hosted message queues. The Queue Service is mainly used for receiving and sending messages, and for the asynchronous decoupling between the requested peak-load shaving and service. Besides, the Queue Service provides the settlement function used and billed on demand.

**2. Service Level Indicator**

**2.1 Data Persistence**

Data persistence: 99.9999999%

The Queue Service provides fully hosted message Queue Service, guaranteeing the data persistence within the life cycle of messages.

**2.2 Destruction Nature of Data**

2.2.1 After the user’s service period expires, it is required to destruct message data. JD Cloud & AI will automatically clear the data of the corresponding Queue Service, so that the data won’t restore.

2.2.2 Before scrapping, outsourced maintenance or resale of the equipment used for the cloud services, JD Cloud & AI will adopt demagnetization operation on its physical disk.

**2.3 Migration Nature of Data**

The user can call a service through the API provided by the Queue Service to complete the sending and reception of message data, while JD Cloud & AI provides the corresponding technical support.

**2.4 Privacy of Data**

JD Cloud & AI guarantees that the user data of one resource pool are unseeable to one another by encryption, user separation, etc.

**2.5 Right to Know Data**

2.5.1 The user has the right to know about the geographical location of the data center where the message and backup data in the Queue Service reside, among which: At present, JD Cloud & AI data centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai), South China (Guangzhou). Users must select the corresponding data center according to the geographical location when they subscribe cloud service, and their data will be stored in the data center specified by themselves.

2.5.2 JD Cloud & AI data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud & AI to acquire the detailed information.

2.5.3 Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics and analysis of product operating status of JD Cloud & AI, user behavior logs will not display user personal information data to the external.

**2.6 Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud & AI may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

**2.7 Service Functions**

The queue applies to service decoupling, heterogeneous integration, despiking flow control, etc. For details of all functions of the Queue Service, please refer to the detailed description document, technical document and help documentation provided by JD Cloud & AI on the official website. All the faults and functional changes that may affect users will be announced to the users.

**2.8 Service Availability**

Service availability: Not lower than 99.95%.

Perform statistics for service availability as per service period, and service availability is calculated as follows:

Service availability=(Total number of minutes of service cycle-number of minutes unavailable for service)/Total number of minutes of service cycle x 100%.

The availability of Queue Service is no less than 99.95%, and the customer can be compensated as agreed in Article 2.12 hereof, if the promised availability hasn’t been achieved.

Definition:

Service cycle: One service cycle is one natural month.

Number of minutes of service cycle is calculated as follows: Total number of days within service cycle × 24 (hours) × 60 (minutes).

Total number of minutes of service cycle: The sum of all the numbers of minutes of the service cycles of all the queues of the Queue Services under one JD Cloud & AI account within one service cycle.

Number of minutes of service unavailable: It is deemed that the service of the API of the designated queue is unavailable in the period, when the customer fails to continuously try to call the designated queue of a Queue Service or one message is delayed in delivery for more than 5min. The sum of all the numbers of minutes of the service unavailable of all the queues of the Queue Services under one JD Cloud & AI account within one service cycle is the number of minutes of a service unavailable.

**2.9 Service Resource Allocation Capability**

The Queue Service can support smooth expansion, and as the TPS increases, the Queue Service provides the elastic expansion capability of the system. 

**2.10 Fault Recovery Capability**

JD Cloud & AI provides 7×24 hours of operation maintenance for the cloud services of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault incident response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

**2.11 Service Metering Accuracy**

The Queue Service has an accurate and transparent metering and billing system. JD Cloud & AI settles and deducts charges in real time according to the user’s actual usage. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud & AI official website.

**2.12 Service Compensation Terms**

2.12.1 Compensation Scope:

In the event of failure of normal use of the Queue Service due to JD Cloud & AI fault, JD Cloud & AI will compensate for the unavailable time, excluding the service unavailability time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud & AI have notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Unavailability situations such as packet loss and latency caused by operator fault;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or operations authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud & AI’s account, like (including but not limited to):

The delay in message delivery due to the customer, including but not limited to message accumulation caused by slow handling of customer consumption;

2.12.2 Compensation Scheme

Monthly service charge: The service charge paid by the customer within one natural month for the Queue Service under a JD Cloud & AI account.

Perform compensation based on the availability of the monthly Queue Service as well as the following scheme:

| **Service Availability**                  | **Compensation coupon amount**  |
| ------------------------------- | ------------------- |
| Lower than 99.95% but equal to or above 99.00% | 15% of the monthly service charge  |
| Lower than 99.00% but equal to or above 95.00% | 30% of the monthly service charge  |
| Lower than  95.00%                     | 100% of the monthly service charge |

 

Description:

The total compensation amount shall not exceed the total amount of current service cash charge already paid for the Queue Service (excluding the amount deducted by the coupon).

The compensation for the Queue Service will be made in the form of Queue Service coupons which cannot be converted to cash for return.

**3. Miscellaneous**

JD Cloud & AI has the right to make adjustments to some service indicators of the Service Level Agreement according to changes, and promptly publish announcements on JD Cloud & AI official website [www.jdcloud.com](https://www.jdcloud.com/), or send emails or written notices to notify the users of the modified contents.
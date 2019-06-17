#### **1. Service Scope**

The NAT Gateway service provided by JD Cloud is a gateway service provided for virtual machine access Internet within user VPC so as to offer reliable and convenient Internet access for users through fixed public IPs.

#### **2. Service Level Indicator**

2.1 Service Functions

The NAT Gateway provides reliable and convenient Internet access for JD Cloud users. It is suitable for community websites, enterprise official websites, portals, e-commerce websites, SAAS applications and gaming applications. For details of the functions of the NAT Gateway, please refer to the detailed description documentation, technical documentation and help documentation provided by JD Cloud on the official website. All functional changes of the NAT Gateway that may affect users will be announced to the users.

2.2 Service Availability

Service availability of NAT Gateway: not less than 99.9%

Calculation formula for service availability: Actual instance availability = (total time - actual unavailable time) / total time × 100%

In which,

(1) The availability of NAT Gateway shall be counted according to the service cycle, specifying that one natural month shall be one service cycle; in case of less than one month, it shall not be counted as one service cycle.

(2) Unavailable time: only services provided by the NAT Gateway that are unavailable for successive 5 minutes or above can be counted as unavailable time. If the unavailable service time is less than 5 minutes, it shall not be recorded as unavailable time.

(3) Definition of unavailability: where all data packages of the NAT Gateway outbound are discarded in a minute, the NAT Gateway service in this minute shall be taken as unavailable service. The unavailability caused by excess of user quota shall not be recorded as unavailable time.

Guarantee for service availability: the service availability shall not be less than 99.9%. That is, the service unavailable time within the service cycle of one natural month shall not be more than 43 minutes.

2.3 Service Resource Allocation Capability

The NAT Gateway provides elastic expansion capability of the system, which can be manually expanded according to the needs of cluster service capability.

2.4 Fault Recovery Capability

JD Cloud provides 7×24 hours of operation maintenance for the cloud services of the paying users, provides technical support by means of on-line ticket and telephone fault reporting, and has a series of fault incident response mechanisms such as fault monitoring, automatic alarm, fast positioning and fast recovery.

2.5 Network Access Performance

When users enable JD Cloud's NAT Gateway service, the NAT Gateway will associate with the Public IP and users may select the public network exit bandwidth by themselves. JD Cloud provides BGP multi-line access to ensure the quality of network access for users.

2.6 Service Metering Accuracy

JD Cloud's NAT Gateway has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the specifications of the NAT Gateway selected by users. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

#### **3. Service Compensation Terms**

3.1 Compensation Scope

In the event of failure of normal use of NAT Gateway service purchased by users due to JD Cloud device faults, design defects or misoperation, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud have notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Any problems caused by the network, equipment failure or configuration adjustment other than JD Cloud’s device;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or operations authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud’s account.

3.2 Compensation Scheme

JD Cloud compensates for each instance of the user's existing NAT Gateway according to unavailable time. Compensation amount = average fee per minute in 24 hours before the instance fails × unavailable time of the failure.

If the user’s usage time is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual service duration, and the fault time shall be calculated by minutes.

The compensation will only made against users who incur costs of NAT Gateway services in the form of NAT Gateway coupons which cannot be converted to cash for return; the total compensation amount shall not exceed the total cash amount of current service already paid for that NAT Gateway instance.

#### **4. Others**

JD Cloud has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud official website [www.jdcloud.com](https://www.jdcloud.com/index) or send emails or written notices to notify users of the modified contents.
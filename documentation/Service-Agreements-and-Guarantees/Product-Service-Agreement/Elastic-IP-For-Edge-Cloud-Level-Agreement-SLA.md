### 1. Service Scope

The Service Level Agreement (hereinafter referred to as "SLA") specifies the level indicators and the compensation scheme for the services of single-line Edge Cloud Public IP, also called as "Elastic IP Address" (hereinafter referred to as "EIP") type provided by JD Cloud & AI to customers. EIPs of multi-line type (BGP) are not covered by the SLA.

### 2. Service Level Indicator

#### 2.1 Service Functions

Edge Cloud Public IP provides services, including dynamic association capacity such as associating and disassociating business resources, for two-way interconnection between the business resources internally deployed in Virtual Private Cloud of JD Cloud & AI Distributed Cloud Physical Server and the Internet network.

#### 2.2 Service Availability

Service cycle: one natural month shall be one service cycle; in case of less than one month, it shall not be counted as one service cycle.

Service cycle minute: refer to the period in minutes, calculated as per total actual day in a service cycle ×24 (hour) ×60 (minute).

Unavailable minutes of service cycle: Where all data packages of the Edge Cloud Public IP outbound are discarded in the gateway device of the JD Cloud & AI exit in a minute, the Edge Cloud Public IP will be deemed as unavailable in this minute. Accumulative duration of the unavailable minutes of a single Edge Cloud Public IP of single user within one service cycle is called the unavailable minutes in this service cycle.

Calculation formula for service availability: (Total minutes of all Edge Cloud Public IPs at a single node for a single user within one service cycle – total unavailability minutes of all Edge Cloud Public IPs at a single node for a single user within one service cycle)/Total minutes of all Edge Cloud Public IPs at a single node for a single user within one service cycle × 100%.

Service availability commitment: The service availability at single node for a single user within one service cycle shall not be less than 99.5%.

(Node: refer to different geological locations (region-city) of Edge Data Center of JD Cloud & AI. Different nodes are absolutely isolated, providing services which are communicated via the public network).

#### 2.3 Fault Recovery Capability

JD Cloud & AI provides a 7×24 hours operation and maintenance for the cloud services of the paying users and provides technical support by such means as on-line ticket and telephone fault reporting. It has a series of fault incident response mechanisms such as fault monitoring, automatic alarming, fast positioning and fast recovery.

#### 2.4 Network Access Performance

When users subscribe JD Cloud & AI's Edge Cloud Public IP, they may independently select the public network exit bandwidth required for each EIP instance. The ratio of uplink bandwidth and downlink bandwidth is 1:1 by default and the range that can be configured is from 1Mbps to 10000Mbps at most (10000Mbps is the maximum bandwidth that can be provided. The maximum value may vary depending on various nodes, so please make a reasonable choice according to the actual nodes; in case that uplink bandwidths is not enough for use, additional bandwidths can be applied for).

#### 2.5 Service Metering Accuracy

There is an accurate and transparent metering and billing system for Edge Cloud Public IP. JD Cloud & AI settles and deducts charges in accordance with the billing type, actual service time and quantity of user’s Edge Cloud Public IP. The specific billing and deducting standard shall be subject to the valid billing model, price and deducting method announced on JD Cloud & AI’s official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

### 3 Service Compensation Terms

#### 3.1 Compensation Scope

In the event of failure of normal use of Edge Cloud Public IP service purchased by users due to JD Cloud & AI’s device faults, design defects or misoperations, JD Cloud & AI will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud & AI has notified the user in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Any problems caused by the network, device failure or configuration adjustment other than JD Cloud & AI’s device;

(3) Hackers’ attacks to the customers’ application programs;

(4) Customer’s failure to correctly deploy or configure resources associated with Public IP (such as Distributed Cloud Physical Server) and other problems caused by relevant exception of carried service;

(5) Service unavailability caused by relevant network configuration error (such as wrong configuration of Security Group) of resources associated to the customer’s Edge Cloud Public IP;

(6) Customers’ failure to follow user manual or use recommendations for JD Cloud & AI products;

(7) Customer’s negligence or operations authorized by the customer;

(8) Caused by force majeure and accidents;

(9) Suspension and termination of Edge Cloud Public IP due to customer’s breach of JD Cloud & AI Service Agreement, including but not limited to service suspension and release of Physical Cloud Public IP due to order’s expiration or account’s arrearage;

(10) Unavailability caused not due to JD Cloud & AI’s account.

#### 3.2 Compensation Scheme

Fault Time = Unavailable Time.

For the Edge Cloud Public IP by monthly package, compensation shall be made by the means of compensating service duration at the 100 times of the unavailable time.

For the Edge Cloud Public IP paid by configuration, compensation shall be made by the means of coupons with the compensation amount = average charge per hour of 24 hours before the fault/60 x service unavailable time x 100.

Description:

JD Cloud & AI makes compensation by giving coupons only supporting purchase of Edge Cloud Public IP products. The total amount of compensation shall not exceed the monthly service charge that has been paid by users for use of the Edge Cloud Public IP (excluding the amount of the gift balance or the deduction fee of coupons).

If the usage time of Elastic IP paid by configuration is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual usage duration, and the service unavailable time shall be calculated by minutes.

###  4. Miscellaneous

JD Cloud & AI has the right to adjust partial service indicators of the Service Level Agreement as per the changes from time to time and promptly release announcements on JD Cloud & AI’s official website www.jdcloud.com or send emails or written notices to notify users of the modified contents. If you disagree with the modification to the Service Level Agreement made by JD Cloud & AI, you have the right to stop using the Edge Cloud Public IP service. If you continue to use Edge Cloud Public IP, you will be deemed to have accepted the modified Service Level Agreement.
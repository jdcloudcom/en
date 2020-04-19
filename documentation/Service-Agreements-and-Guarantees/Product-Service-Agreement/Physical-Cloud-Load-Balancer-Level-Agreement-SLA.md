### 1. Service Scope

The Service Level Agreement (hereinafter referred to as "SLA") specifies the level indicators and the compensation scheme for the services of Physical Cloud Elastic Load Balancer (hereinafter referred to as "ELB") provided by JD Cloud & AI to customers. Other Load Balancer products of JD Cloud & AI are not covered by the SLA.

### 2. Service Level Indicator

#### 2.1 Service Functions

Physical Cloud Elastic Load Blancer service, as a service dedicated for Cloud Physical Server, is provided by JD Cloud & AI, aiming to distribute the high-concurrency traffic arising from the frontend access to multi-set backend instances in accordance with users’ requirements through traffic distribution; main functions of the service include creation and management of Load Balancer Instances and listeners, and configuration of listening port, health check and session persistence.

#### 2.2 Service Availability
Service cycle: one natural month shall be one service cycle; in case of less than one month, it shall not be counted as one service cycle.

Service cycle minute: refer to the period in minutes, calculated as per total actual day in a service cycle ×24 (hour) ×60 (minute).

Unavailable minutes of service cycle: Accumulated unavailable duration of all listening services provided by single Load Balancer Instance for a single user within one service cycle.

Calculation formula for service availability: (Total minutes of all Load Balancer instances at all availability zones of a single region for a single user within one service cycle – total unavailable minutes of all Load Balancer instances at multiple availability zones of a single region for a single user within one service cycle)/Total minutes of all Load Balancer instances at all availability zones of a single region for a single user within one service cycle × 100%.

Service availability commitment: the service availability of a single user per region per service cycle shall not be less than 99.9%.

(Region: refer to the concept of Region of JD Cloud & AI; Availability zone: refer to the concept of AZ of JD Cloud & AI.)

#### 2.3 Fault Recovery Capability

JD Cloud & AI provides 7×24 hours of operation maintenance for the Physical Cloud Load Balancer Instance of the paying users, and provides technical support by means of telephone fault reporting, and has a perfect fault incident response mechanism.

#### 2.4 Network Access Performance

When users enable the JD Cloud & AI’s Physical Cloud Load Balancer Service, they can independently select the public network exit bandwidth (by associating with Physical Cloud Public IP) required for configuration of each Load Balancer instance; the public network exit bandwidth can be configured from 1Mbps to 200Mbps.

#### 2.5 Service Metering Accuracy

There is an accurate and transparent metering and billing system for Physical Cloud Load Balancer Service. JD Cloud & AI settles and deducts charges in accordance with the billing type, actual service time and quantity of user’s Physical Cloud Load Balancer Instances. The specific billing and deducting standard shall be subject to the valid billing model, price and deducting method announced on JD Cloud & AI’s official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

### 3. Service Compensation Terms

#### 3.1 Compensation Scope

In the event of failure of normal use of Physical Cloud Load Balancer Service purchased by customer due to JD Cloud & AI’s device faults, design defects or misoperations, JD Cloud & AI will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud & AI has notified the user in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Any problems caused by the network, device failure or configuration adjustment other than JD Cloud & AI’s device;

(3) Hackers’ attacks to the customers’ application programs cause including but not limited to that Public IP is set as in the black-hole status or cleaning status by JD Cloud & AI when it is subject to DDoS attack;

(4) Service unavailability caused by customer’s configuration error (such as wrong configuration of firewall, listening port and certificate);

(5) Problems caused by customer’s failure to configure backend server or backend server’s exception (users are suggested to enable the health check function so as to monitor backend server status in real time);

(6) Customers’ failure to follow user manual or use recommendations for JD Cloud & AI products;

(7) Caused by customer’s negligence or operations authorized by the customer;

(8) Caused by force majeure and accidents;

(9) Suspension and termination of Physical Cloud Load Balancer Service due to customer’s breach of JD Cloud & AI Service Agreement, including but not limited to service suspension and release of Load Balancer Instance due to order’s expiration or account’s arrearage;

(10) Unavailability caused not due to JD Cloud & AI’s account.

#### 3.2 Compensation Scheme

Fault Time = Unavailable Time.

For Physical Cloud Load Balancer by monthly package, compensation shall be made by the means of compensating service duration at 100 times of fault time/single instance.

Description:

JD Cloud & AI makes compensation by giving coupons, which is only provided to support the purchase of Physical Cloud Load Balancer products, and the total amount of compensation shall not exceed the monthly service charge (excluding the amount of the gift balance or the deduction fee of the coupon) that has been paid by users for use of the Physical Cloud Load Balancer instance;

Compensation for Physical Cloud Load Balancer is only provided for the Physical Cloud Load Balancer instance itself other than the Cloud Physical Servers associated to the Physical Cloud Load Balancer.

### 4. Others

JD Cloud & AI has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud & AI’s official website [www.jdcloud.com](https://www.jdcloud.com) or send emails or written notices to notify users of the modified contents. If you disagree with the modification to the Service Level Agreement made by JD Cloud & AI, you have the right to stop using the Physical Cloud Load Balancer service. If you continue to use the Physical Cloud Load Balancer service, you will be deemed to have accepted the modified Service Level Agreement.


### 1 Service Scope

The IoT Hub Protocol Adaptor Service converts the adaptor modules through the built-in non-standard device communication protocol and the communication protocol to help users in JD Cloud Onboarding of existing devices in a quick and low-cost way. The current service has built in JT/T-808 (GNSS System for Operational Vehicles - General Specifications for Vehicle Terminal Communication Protocol and Data Format) protocol supports.

### 2 Service Level Indicator 

#### 2.1 Service Functions 

For details of all functions of the IoT Hub Protocol Adaptor Service, please refer to the detailed description document, technical document and help documentation provided by JD Cloud on the official website. All functional changes of IoT Hub Protocol Adaptor Service that may affect users will be announced to the users. 

#### 2.2 Service Availability 

Service cycle: one natural month shall be defined as one service cycle. In case of less than one natural month, it shall not be counted as one service cycle.

Service availability: not less than 99.9%.

Calculation formula for service availability of IoT Hub Protocol Adaptor Service is: ((Effective messages per service cycle - failed message count per service cycle) /effective message count per service cycle)×100%.

Where,

Effective messages: All messages received and/or forwarded by the IoT Hub Protocol Adaptor from a device end and/or server. Effective messages do not include those failed to be received or forwarded due to improper user operation, product restrictions, off-line device, network failure and other reasons, such as:

(1) After the server API is called, a request other than 5xx error is returned (5xx refers to system exception). For example, traffics are restricted because of frequent requests or network is blocked;

(2) For messages subject to traffic restriction because of frequent device reporting, if QoS=0 per single device, the restriction is 30QPS, and if QoS=1 per single device, the restriction is 10QPS;

(3) For messages sent from service to devices and subject to traffic restriction, the restriction per single device is 50QPS;

(4) Messages which are not sent to IoT Hub Protocol Adaptor due to network failure, are not connected by devices or are not reported by devices;

(5) Messages discarded due to off-line device after the communication mechanism MQTT QoS=0 is selected;

Failed messages: Effective messages which are not circulated due to system failure of IoT Hub Protocol Adaptor Service. For example:

(1) Messages failed to be uplinked with by a device due to system exception when the device connection is normal

(2) Messages which are sent by a device to IoT Hub Protocol Adaptor, but failed to be received by a server due to system exception.

(3) Messages failed to be sent to a device due to system exception when a user calls an API and sends an instruction to an on-line device. 

#### 2.3 Service Resource Allocation Capability 

IoT Hub Protocol Adaptor Service provides multiple configurations. Users can expand the IoT Hub Protocol Adaptor resources on line on their own as per JD Cloud configuration schemes according to their demands. 

#### 2.4 Fault Recovery Capability

JD Cloud provides 7×24 hours of operation maintenance for the load balancer instance of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault incident response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

 

#### 2.5 Network Access Performance

 

A user has the public network export bandwidth of 100Mbps by default while enabling the IoT Hub Protocol Adaptor Service. JD Cloud adopts BGP multi-line access to ensure the quality of network access for users. 

#### 2.6 Service Metering Accuracy 

IoT Hub Protocol Adaptor Service has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to actual usage of the users’ Virtual Machines. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 3 years by default for future reference. 

### 3 Service Compensation Terms 

#### 3.1 **Compensation Scope**

In the event of failure of normal use of IoT Hub Protocol Adaptor Service purchased by users due to JD Cloud’s device faults, design defects or misoperation, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud has notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Any problems caused by the network, equipment failure or configuration adjustment other than JD Cloud’s device;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or operations authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud’s account. 

#### 3.2 Compensation Scheme 

The compensation amount for the IoT Hub Protocol Adaptor Service shall be calculated according to standards of the table below on the basis of the service availability of one service cycle. The compensation method is only limited to coupons used for purchasing IoT Hub Protocol Adaptor, and the total compensation amount shall not exceed the cost paid by the customer for the IoT Hub Protocol Adaptor for the month in which the service availability commitments are not reached (excluding the fees deducted with coupons).

 

| Service Availability                   | Compensation Coupon Quota             |
| ---------------------------- | -------------------------- |
| Lower than 99.9% but equal to or above 99.00% | 15% of the service charge of the service cycle  |
| Lower than 99.00% but equal to or above 95.00% | 30% of the service charge in the service cycle  |
| Lower than 95.00%                   | 100% of the service charge of the service cycle |

 

#### 3.3 Compensation Time Limit

Customers may apply for compensation after the fifth (5th) working day of each month for the service failed to meet the availability commitment for a two-month period. The compensation application must be made within two (2) months at the end of the relevant month in which the IoT Hub Protocol Adaptor Service fails to meet the availability commitment. Compensation application exceeding the time limit for application will be deemed as the customer’s waiver to such request. 

#### 4 Miscellaneous

JD Cloud has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud official website [www.jcloud.com](https://www.jcloud.com) or send emails or written notices to notify users of the modified contents.
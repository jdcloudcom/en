**1. Service Scope**

JD Cloud CDN (Content Delivery Network) is a service which distributes the contents in the origin server to all acceleration nodes in the country to shorten the delay of viewing objects, improve the response speed for websites access as well as the availability of websites, and solve the problems of small network bandwidth, large user access and uneven network distribution.

## **2. Service Level Indicators**

### **2.1 Data Persistence**

JD Cloud CDN (Content Delivery Network) provides a cache service. The data saved on the node is automatically cleared according to the access heat and will not be saved permanently.

**2.2** **Data Erasability**

The object cached by JD Cloud CDN (Content Delivery Network) is the user's file, and the file types remain unchanged. When users use CDN, they can access, download files and clear the cache files as needed. Once cleared, this file is unrecoverable, but can be retrieved from the origin server.

**2.3** **Data Migration**

The cache service dynamically allocates cache node resources based on the actual access of the user as well as the decision of the intelligent scheduling system. That is, the user's cache data is cached on different nodes according to time, actual access, and node quality.

**2.4** **Data Privacy**

Users can apply for the CDN service and add an accelerated domain name on JD Cloud official website [www.jdcloud.com](https://www.jdcloud.com/). Access authentication policies can be configured based on actual needs to control and isolate external access so as to ensure the privacy of user data.

**2.5** **Right to Know about Data**

2.5.1 The user has the right to know the location of the data cache: At present, the data cached by JD Cloud CDN is distributed on each node in the country, and the node resources are allocated according to the domain name access;

2.5.2 JD Cloud data center will comply with relevant local laws and regulations, and users have the right to know about this, and can contact JD Cloud's customer service personnel for detailed information.

2.5.3 Unless required by local laws and regulations, or regulatory and auditing requirements of government's regulatory authorities, all data, access records, applications and behavior logs of users will not be provided to third parties. In addition to the statistics and analysis of the operating status of the products used by JD Cloud, the user's behavior log will not present the user's personal information data.

**2.6 Data Reviewability**

In accordance with current laws and regulations or according to the requirements of government regulatory authorities, safety compliance, auditing or forensics investigations and in the context of complete processes and procedures, JD Cloud can provide relevant information of the service purchased by the user, including running logs of key components, operation records of operation and maintenance personnel, and user's operation records.

**2.7** **Service Features**

JD Cloud CDN (Content Delivery Network) is suitable for the distribution and acceleration of contents such as static files and large file downloads. It supports billing methods for traffic and peak bandwidth. For details on all the specific functions of CDN service, please refer to the detailed description documentation, technical documentation and help documentation provided by JD Cloud on the official website. All faults and functional changes that may affect the user will be announced to the user.

**2.8** **Service Availability**

Service Cycle: A natural month is defined as a service cycle. If it is less than one natural month, the service cycle will not be counted.

Statistical Unit: All the domain names of the same account whose request quantity in the next month >=1 million are defined as one statistical unit.

Estimated QPS Value of Node: It is the average value of the daily average QPS of the statistical unit at that node in the recent seven days, which is used to estimate the QPS of the statistical unit at that node when the node is unavailable.

Total Requests of Failure Node: It is equal to SUM (QPS estimate of failure node * seconds for node failure).

Service Error Rate: The service error rate is calculated every 5 minutes. The calculation formula is as follows: (5xx requests within 5 minutes + total requests of the failure node within 5 minutes) / (total requests for all service nodes within 5 minutes + total requests of failure nodes within 5 minutes).

Note: The following error requests are not calculated:

1. 5xx error due to back-to-source error;

2. Errors caused by ban of the domain name due to banned content or domain name attack, etc.;

Service Unavailable Unit Period: For each 5-minute period of calculating the service error rate, if the service error rate is >0.05%, the 5-minute period is a service unavailable unit period.

Service Unavailable Time: If two or more service unavailable unit periods appear continuously, the number of seconds corresponding to these unit periods is included into the service unavailable time.

Service Availability Calculation Formula: (100% – service unavailable time in the service period) / total service period.

Guarantee on Service Availability: Service availability no less than 99.9%. That is, the service unavailable time in a service period of a natural month is no more than 43 minutes.

**2.9** **Service Resource Allocation Capability**

JD Cloud CDN (Content Delivery Network) provides users with content distribution and acceleration services, and supports the introduction of security protection functions to ensure the security of user's origin server. When a user applies for a CDN service, bandwidth and storage restrictions are not set, and the capacity is dynamically expanded in real time as needed. As the visitor volume grows, the bandwidth and storage processing capability in the CDN background will automatically expand without user's intervention.

**2.10** **Fault Recovery Capability**

JD Cloud provides 7×24h operation and maintenance for the cloud services of paying users, and provides technical support by means of online DONGDONG and phone reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, rapid positioning and fast recovery.

**2.11** **Network Access Performance**

JD Cloud CDN (Content Delivery Network) does not limit the public network outlet bandwidth of users. JD Cloud CDN deploys cache nodes in many places across the country to ensure the network access quality of users.

**2.12** **Service Measurement Accuracy**

CDN (Consent Delivery Network) service of JD Cloud has an accurate and transparent metering and billing system. JD Cloud settles and charges in real time according to the actual usage of the user's CDN, and the specific billing standard is subject to the effective billing mode and price announced on the official website of JD Cloud. The user's original billing log is reserved for a minimum of 1 year by default for future reference.

## **3. Service Compensation Terms**

**3.1** **Compensation Scope**

When the advanced CDN service cannot be used normally due to the JD Cloud's equipment fault, defects in design or improper operation, JD Cloud will indemnify the unavailable time, but not including the service unavailable time caused by the following reasons:

3.1.1. Caused by the system maintenance procedures after JD Cloud's notification in advance, including cutting, maintenance, upgrading and simulated fault drill;

3.1.2. Caused by any network or equipment fault or configuration adjustment of equipment not belonging to JD Cloud;

3.1.3. Caused by the hackers' attack to the users' application programs or data information;

3.1.4. Caused by the loss or leakage of data, commands, passwords etc. due to user's improper maintenance or improper confidentiality measures;

3.1.5. Caused by the user's upgrading the operating system by himself/herself;

3.1.6. Caused by the user's application programs or installation activities;

3.1.7. Caused by user's negligence or operation authorized by the user;

3.1.8. Caused by force majeure and accidents;

3.1.9. Unavailability caused by other reasons not related to JD Cloud, such as (including but not limited to):

3.1.9.1 User's origin server fault;

3.1.9.2 The user modifies the configuration of origin server or the DNS configuration of the accelerating domain name without notifying JD Cloud in advance, causing the JD Cloud node server fails to access the user origin server normally;

**3.2** **Compensation Plan**

JD Cloud compensates 10 times of the unavailable time for each domain name of the user. The compensation amount = the average cost per minute before the domain name fault in the first 24h × the service unavailable time × 10 times;

**3.3** **Special Instructions**

3.3.1 The compensation shall be paid in the form of CDN coupon only for users who uses CDN service with expenses incurred, which cannot be converted into cash back;

3.3.3 If using is less than 24 hours, the average charge per minute is calculated based on the actual average using time;

3.3.4 The compensation amount shall not exceed the total amount of CDN fees paid by the user for the fault domain name;

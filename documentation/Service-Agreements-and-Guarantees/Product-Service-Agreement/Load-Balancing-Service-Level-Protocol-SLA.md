## 1. Service Scope

The load balancer provided by JD Cloud is a service that distributes traffic to multiple cloud servers. Load balancer extends the external service capability of the application system through traffic distribution and improves the availability of the application system by eliminating single point of fault.

## 2. Service Level Indicators

### 2.1 Service Features

The load balancer has advanced features such as self-service management, automatic fault recovery, and anti-network attacks. The load balancer is suitable for community sites, corporate websites, portals, e-commerce sites, SAAS apps, and gaming apps. For details on all the specific functions of the load balancer service, please refer to the detailed description documentation, technical documentation and help documentation provided by JD Cloud on the official website. All functional changes to the load balancer that may affect the user will be announced to the user.

### 2.2 Service Availability

#### 2.2.1 Definitions of service availability

(1) Service cycle: Availability of Load Balancer is counted by service cycles. A service cycle is a natural month, and if it is less than a month, then it is not counted as a service cycle.

(2) Unavailable single monitoring service of instance: If all attempts of a customer to set up connection with one listener in the appointed Load Balancer instance failed within 1 minute, it is deemed that the listening service is unavailable within this minute.

(3) Unavailable minutes of all listening services of instance: Service unavailable minute sum of all listened services for a single Load Balancer instance in a service cycle.

(4) Unavailable minute sum of all listening services of instance: Sum of all listened service cycles for a single Load Balancer instance within one service cycle.

#### 2.2.2 Calculation formula for service availability

Instance service availability = (total minutes of all listened service cycles of instances - minutes of all listened unavailable services of instances) / total minutes of service cycle of all listened service cycle of instances × 100%

Calculation formula of service unavailable time: (unit: minute)

Service unavailable time = (1-instance service unavailability) X service cycle day X 24 (hour) X 60 (minute)

Service availability commitment to Load Balancer of JD Cloud: The service availability of a single instance service per availability zone is no less than 99.5% and the service availability of a single instance in multiple availability zones is no less than 99.95%.

### 2.3 Service Resource Allocation Capability

The Load Balancer provides elastic system expansion capability, which can be manually expanded according to the needs of cluster service capability.

### 2.4 Fault Recovery Capability

JD Cloud provides 7×24 hours of operation maintenance for the cloud services of the paying users, provides technical support by means of on-line ticket and telephone fault reporting, and has a series of fault incident response mechanisms such as fault monitoring, automatic alarm, fast positioning and fast recovery.

### 2.5 Network Access Performance

The public network bandwidth cap and billing method of Load Balancer purchased by the user are subject to EIP associated with the Load Balancer. JD Cloud provides self-built BGP multi-line access (including Telecom, Unicom, Mobile, etc.), ensuring users’ network access quality.

### 2.6 Service Measurement Accuracy

The load balancer service has an accurate and transparent metering and billing system. JD Cloud settles and charges in real time according to the actual usage of the user's load balancer, and the specific billing standard is subject to the effective billing mode and price announced on the official website of JD Cloud. The user's original billing log is reserved for a minimum of 1 year by default for future reference.

## 3. Services Compensation Terms

### 3.1 Compensation Scope

In the event of failure of normal use of Load Balancer service purchased by users due to JD Cloud’s device faults, design defects or misoperation, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud have notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Any problems caused by the network, equipment failure or configuration adjustment other than JD Cloud’s device;

(3) Service unavailable due to user’s configuration error (such as wrong configuration of Security Group, ACL, Certificate, etc.);

(4) Caused by hacker attacks to the user’s application program or data information;

(5) Problems due to customer’s failure to configure backend server or backend server exception (it is suggested that the user shall enable the health check function and monitor backend server status in real time);

(6) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(7) Caused by user’s own upgrading of operating system;

(8) Caused by user’s application program or installation activities;

(9) Caused by user’s negligence or operations authorized by the user;

(10) Caused by force majeure and accidents;

(11) Server suspended or terminated due to breach of JD Cloud Service Agreement by customers, including but not limited to service suspension, release or others of Load Balancer instance due to arrear;

(12) Other unavailability caused not due to JD Cloud’s account.

### 3.2 Compensation Scheme

JD Cloud will make the compensation equal to 100 times of the unavailable time per instance of Load Balancer to users, with the compensation amount = average cost per minute in 24 hours before the instance fails × service unavailable time × 100 times.

Description:

(1) If the service is used for less than 24 hours by the user before the failure, the average cost per minute shall be calculated as per the actual service time.

(2) Service unavailable time is calculated by minutes.

(3) The compensation will only be made against users who incur cost of Load Balancer services in the form of Load Balancer coupons which cannot be converted to cash for return.

(4) The total compensation amount shall not exceed the total cash cost of current service cycle already paid for the Load Balancer instance.

### 3.3 Compensation Application Deadline

(1) If the service cycle of a month fails to reach the service availability standard, you can propose a compensation application via the ticket system of your corresponding account after the fifth (5th) working day of the month following the end of corresponding failure service cycle. JD Cloud will correspondingly verify your compensation application and calculate service availability of the service cycle. If there is a dispute between the Parties, the Parties agree to finally solve such dispute subject to the background records of JD Cloud.

(2) The compensation application proposing time shall be no later than sixty (60) natural days after the end of corresponding failure service cycle. If you failed to propose the compensation application within sixty (60) days after the end of corresponding failure service cycle or propose after sixty (60) days after corresponding failure service cycle or failed to propose the application as agreed in the Agreement, it is deemed that you have automatically given up your right of claim and other rights against JD Cloud. JD Cloud has the right to reject your compensation application and make no compensation or indemnity.

## 4. Others

JD Cloud has the right to make adjustments to some service indicators of the SLA according to the changes, and promptly publish announcements at [www.jdcloud.com](https://www.jdcloud.com/) or send emails or written notices to notify users of the revised content. If you disagree with any modification to the Service Level Agreement by JD Cloud, you have the right to stop using the Load Balancer service. If you continue to use the Load Balancer service, it is deemed that you have accepted the modified Service Level Agreement.

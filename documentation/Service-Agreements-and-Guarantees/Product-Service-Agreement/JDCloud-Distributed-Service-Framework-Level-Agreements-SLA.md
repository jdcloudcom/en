#### 1. **Service Scope**

JD Cloud Distributed Service Framework (JDSF) is a PaaS platform serving for JD Distributed Service applications, which, around the entire life cycle of JD Distributed Service, provides full support for management, observation/monitoring, etc. of JD Distributed Service, facilitating implementation by users of JD Distributed Service applications such as Spring Cloud, Dubbo, etc. Meanwhile, service management plug-in is provided to Spring Cloud to support functions such as service authentication, route policies, service traffic limit and log configuration.

 

#### 2. **Service Level Indicator**

##### 2.1. **Persistence of Data**

JDSF provides Configuration Center function, with the configuration data persistence of no less than 99.9999%

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle.

##### 2.2. **Destructibility of Data**

1) If the users actively delete the data or need to destruct the data after expiry of service term, JD Cloud will automatically clear the corresponding data in the disks and memory of the physical server, and the data cannot be recovered.

2) Before scrapping, outsourced maintenance or resale of the device used for the cloud services, JD Cloud will adopt demagnetization operation on its physical disk.

##### 2.3. **Privacy of Data**

By means of encryption and security group isolation, JD Cloud ensures that the user data in the same resource pools are invisible with each other. In which, security groups can isolate different user resources through a series of data link level and network level IAM technology. 

##### 2.4. **Right to Know of Data** 

Users have the right to know the geographical location of data center with their data and backup data, as well as the number of data backup, of which::

1) At present, JD Cloud Data Centers are distributed in North China (Beijing) and East China (Shanghai) respectively. Users must select the corresponding data center according to the geographical location when they enable the cloud service, and their data will be stored in the data center specified by themselves;

2) JD Cloud service provides automatic data backup function; the backup data are stored in the same data center as the source data by default. Users need not to designate the number and storage location for their data’s automatic backup.

3) JD Cloud data centers will comply with the relevant local laws and regulations; users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

4) Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics & analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

##### 2.5. **Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user operation and other information.

##### 2.6. **Service Availability**

##### 2.6.1. **Standard for Availability**

Service availability is not lower than 99.90%.

##### 2.6.2. **Calculation Formula**

Service availability = (all available time for the entire cluster per service cycle/(all available time for the entire cluster per service cycle + All unavailable time for the entire cluster per service cycle)) × 100%  

Where,

(1) Unavailable time of service: Regarding services provided by the JDSF, for successive 5 minutes or above, during which all connections that the user has attempted to the specified JDSF service registration center is failed, such a period of time is recorded as unavailable time. If the unavailable service time is less than 5 minutes, it shall not be recorded as unavailable time. The unavailable time shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure. 

2) If the gear cap of the service specification (such as the number of instances, TPS, QPS, etc.) purchased by the user at the time of creating the service is lower than the actual usage specification, it may lead to the decline of service stability and availability. We are not responsible for the data and service reaching the availability standard, but only provide operation and maintenance support. 

##### 2.7. **Fault Recovery Capability**

JD Cloud provides 7×24 hours of operation maintenance for the cloud services of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault incident response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc. 

##### 2.8. **Network Access Performance**

When a user enables the JD Cloud Virtual Machines service, the user may select the public network exit bandwidth required for each Virtual Machine; the public network exit bandwidth can be configured from 1Mbps to 200Mbps. JD Cloud provides BGP multi-line access to ensure the quality of network access for users.

##### 2.9. **Service Resource Allocation Capability**

JDSF provides multiple configurations and have the capacity of elastic expansion so that users can expand the container resources they use on-line according to JD Cloud configuration scheme. 

##### 2.10. **Service Metering Accuracy** 

JD Distributed Service Framework has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual usage of JD Distributed Service Framework. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 3 years by default for future reference.

##### 2.11. **Migration Nature of Data**

​	JDSF does not support data migration for the time being. 

##### 2.12. **Service Compensation Terms**

##### 2.13.1 **Compensation Scope**

In the event of failure of normal use of Virtual Machines due to JD Cloud fault, or failure of normal website access due to JD Cloud fault, JD Cloud will compensate for the unavailable time, excluding the service unavailable time caused by the following reasons:

(1) Caused by the JDSF specification selected by the user being lower than then actual usage specification (such as the number of instances, TPS, etc.);

(2) Caused by the system maintenance that JD Cloud has notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(3) Unavailability situations such as packet loss and latency caused by operator fault;

(4) Caused by hacker attacks to the user’s application program or data information;

(5) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(6) Caused by user’s own upgrading of operating system;

(7) Caused by user’s application program or installation activities;

(8) Caused by user’s negligence or operations authorized by the user;

(9) Caused by force majeure and accidents;

(10) Other unavailability caused not due to JD Cloud’s account.

 

##### 2.13.2 **Compensation Scheme**

1) The fault compensation will be made in the form of coupons which cannot be converted to cash. You shall abide by the rules for the use of coupons (including the duration of use, etc., which shall be subject to the relevant rules of coupon released by the Official Website of JD Cloud website).

2) The total amount of compensation shall not exceed **the corresponding monthly service charge you paid for this service within the corresponding substandard service month ** (The monthly service charge here excludes charges deducted by coupon, value voucher, service charge reduction and exemption, etc.)

3) If the user’s usage time is less than 24 hours, the cost shall be calculated as per the average value of the actual usage duration and the fault time shall be calculated by minutes. 

Fault time = number of minutes during which service is unavailable.

Compensation amount = average charge per hour of 24 hours before the fault/60 x fault time x 100. 

#### 2.13.3 **Compensation Time Limit**

Customers may apply for compensation after the fifth (5th) working day of each month for the service failed to meet the availability commitment for a two-month period. The compensation application must be made within two (2) months at the end of the relevant month in which the IoT Hub Protocol Adaptor Service fails to meet the availability commitment. Compensation application exceeding the time limit for application will be deemed as the customer’s waiver to such request. 

#### **3. Others**

JD Cloud has the right to from time to time make adjustments to partial service indicators of the Service Level Agreement according to changes and promptly release announcements on JD Cloud official website [www.jdcloud.com](https://www.jdcloud.com) or send emails or written notices to notify users of the modified contents.

 

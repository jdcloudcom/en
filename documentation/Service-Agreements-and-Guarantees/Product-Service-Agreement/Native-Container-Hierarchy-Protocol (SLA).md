**1. Service Scope**

The native container is an innovative container product that is released based on JD Cloud’s deep accumulation in container technology. The product fully integrates the advantages of containers and virtual machines. It does not need to manage server or cluster and provides users with a safe and easy-to-use native container with flexible billing method, which effectively reduces the invested costs of the users.

**2. Service Level Indicator**

**2.1 Service Functions**

Native container has advanced functions such as self-service management, data security guarantee, automatic fault recovery and anti-network attacks. It is suitable for community websites, enterprise official websites, portals, E-commerce websites, SAAS applications and gaming applications. For details on all the specific functions of the native container, please refer to the detailed description document, technical document and help documentation provided by JD Cloud on the official website. All the functional changes of native container that may affect users will be announced to the users.

**2.2 Service Availability**

Service availability: no lower than 99.95%.

The formula for computing the availability of native containers is as follows: all available time for a single container per service cycle/ (all available time for a single container per service cycle+all unavailable time for a single container per service cycle). 

Where,

(1) Availability of native containers is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle. The business unit of statistics is single container, and the time unit is minute.

(2) Unavailable time: only services provided by native containers are unavailable for continuous 5 minutes or above can be regarded as unavailable time. If the unavailable time is less than 5 minutes, it does not account for unavailable time. The unavailable time of native containers shall exclude daily system maintenance time and unavailable time due to user reasons, the third party reasons or force majeure.

**2.3 Service Resource Allocation Capability**

Native container services provide multiple configurations and have the capacity of elastic expansion so that users can expand or contract the container resources they use on-line according to JD Cloud configuration scheme. After the image is downloaded, the user can enable or release 100 containers in 10 minutes, or complete downtime upgrading of CPU and memory in 5 minutes, and support online real-time upgrading of public network bandwidth.

**2.4 Fault Recovery Capability**

JD Cloud provides 7×24 hours of operation maintenance for the container instance of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

**2.5 Network Access Performance**

When an user enables the JD Cloud native container, the user may select the public network exit bandwidth required for each container; the public network exit bandwidth can be configured from 1Mbps to 200Mbps. JD Cloud adopts BGP multi-line access to ensure the quality of network access for users.

**2.6 Service Metering Accuracy**

Native container has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual usage of container. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 3 years by default for future reference.

**2.7 Data Persistence**

Data persistence: no lower than 99.9999999% 

Data persistence is counted by service cycle, a service cycle is a natural month, if it is less than a month, then it is not counted as a service cycle.

The data durability calculation formula is as follows: container disk of complete data per service period/(container disk of complete data per service period+container disk of lost data per service period). I.e., the no data loss probability per 10,000 container disk is 99.9999999%. This means that at most 1 container disk may have the data loss per month.

**2.8 Destruction Nature of Data**

2.8.1 If the users actively delete the data or need to destruct the data after expiry, JD Cloud will automatically remove corresponding data in the physical server disks and memory and the data cannot be recovered.

2.8.2 Before scrapping, outsourced maintenance or resale of the equipment used for the cloud services, JD Cloud will adopt demagnetization operation on its physical disk.

**2.9 Migration Nature of Data**

When the user enables the container, JD Cloud provides the way of snapshot recovery, so that the user can quickly deploy the environment and move in the data. When the user stops using the container, he/she can move the data out of the network by himself/herself.

**2.10 Privacy of Data**

By means of encryption, tenant isolation and security group isolation, JD Cloud ensures that the user data in the same resource pools are invisible with each other. In which, security groups can isolate different user resources through a series of data link level and network level IAM technology.

**2.11 Right to Know of Data**

2.11.1. Users have the right to know the geographical location of data center with their data and backup data, as well as the number of data backup, of which:

2.11.1.1 At present, JD Cloud data centers are distributed in North China (Beijing), East China (Suqian), East China (Shanghai) and South China (Guangzhou). At present, the Containers have been launched in North China (Beijing). Users must select the corresponding data center when enabling the service, and their data will be stored in the data center specified by themselves.

2.11.1.2. JD Cloud service provides automatic data backup function, the backup data are stored in the same data center as the source data by default. Users need not to designate the number and storage location for their data’s automatic backup.

2.11.2 JD Cloud data centers will comply with the relevant local laws and regulations, users have the right to know and they can contact customer service personnel of JD Cloud to acquire the detailed information.

2.11.3. Except for the requirements of local laws and regulations or the supervision and auditing of regulatory authorities, all user data, applications and behavior log will not be provided to the third party. Apart from being used for statistics & analysis of product operating status of JD Cloud, user behavior logs will not display user personal information data to the external.

**2.12 Reviewability of Data**

In accordance with existing laws and regulations or the requirements from reasons such as supervision by government supervision department, safety and compliance, audit or forensic investigation, and subject to compliance with processes and procedures, JD Cloud may provide relevant information about the services used by users including the running log of key components, operational records of operation and maintenance personnel, records user action and other information.

**3 Service Compensation Terms**

**3.1 Compensation Scope**

In the event of failure of normal use of native container due to JD Cloud fault, JD Cloud will compensate for the unavailable time, excluding the service unavailability time caused by the following reasons:

(1) Caused by the system maintenance that JD Cloud have notified the users in advance, including migration, maintenance, upgrade and simulation fault drill;

(2) Unavailability situations such as packet loss and latency caused by operator fault;

(3) Caused by hacker attacks to the user’s application program or data information;

(4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

(5) Caused by user’s own upgrading of operating system;

(6) Caused by user’s application program or installation activities;

(7) Caused by user’s negligence or actions authorized by the user;

(8) Caused by force majeure and accidents;

(9) Other unavailability caused not due to JD Cloud’s account.

**3.2 Compensation Scheme**

Fault Time = Unavailable Time.

For the monthly package native container, compensation shall be made by the means of compensating service duration at the 100 times of fault time/set.

For the native container paid by configuration, compensation shall be made by the means of coupons at the compensation amount = average charge per hour of 24 hours before the fault/60 x fault time x 100.

Note:

If the usage time of native container paid by configuration is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual usage duration, and the fault time shall be calculated by seconds.

The total compensation amount shall not exceed the total amount of current service cash charge already paid for a single instance.

**4. Miscellaneous**

JD Cloud has the right to make adjustments to partial service indicators of the Service Level Agreement according to changes, and promptly publish announcements on JD Cloud official website of www.jdcloud.com, or send emails or written notices to notify the users of the modified contents.

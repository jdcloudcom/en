**1. Service Scope**

The load balancer provided by JD Cloud is a service that distributes traffic to multiple cloud servers. Load balancer extends the external service capability of the application system through traffic distribution and improves the availability of the application system by eliminating single point of fault.

## **2. Service Level Indicators**

### **2.1 Service Features**

The load balancer has advanced features such as self-service management, automatic fault recovery, and anti-network attacks. The load balancer is suitable for community sites, corporate websites, portals, e-commerce sites, SAAS apps, and gaming apps. For details on all the specific functions of the load balancer service, please refer to the detailed description documentation, technical documentation and help documentation provided by JD Cloud on the official website. All functional changes to the load balancer that may affect the user will be announced to the user.

**2.2 Service Availability**

Service Availability: No less than 99.9% of single instance.

Calculation Formula for Service Availability: Actual availability of the instance = (total time-actual unavailable time) / total time × 100%

Among them, the actual unavailable time = unavailable time × reduction ratio of user's business traffic, which applies to the VIP of 4/7 layer as well.

Instructions:

1) Calculate the actual availability of the instance in month.

Fault statistical point:

| **Statistical Point**                                              | **Included in Availability or Not**                                           |                            |      |
| ------------------------------------------------------- | ------------------------------------------------------------ | -------------------------- | ---- |
| Instance Running Status                                           | Network                                                         | User Network                   | No   |
| ISP Network                                                      | No                                                           |                            |      |
| Basic Network IDC (Fault caused by force majeure will not be deemed as service unavailability) | Yes                                                          |                            |      |
| Intranet and Internet ACL                                   | Yes                                                          |                            |      |
| Security                                                    | Network Attack (Attacks against individual user are not included, and attacks against JD Cloud are included)       | Yes                        |      |
| Product                                                    | Service unavailability The unavailability caused by the configuration of users' application servers (such as the user's firewall rule restrictions, failure of health check caused by false configuration of the user's health check, etc.), capacity bottlenecks of the backend server, fault of backend server itself is not included.  | Hardware Faults Such as Servers and Storage Devices | Yes  |
| JD Cloud System Software Fault                                      | Yes                                                          |                            |      |
| Service Unavailability Caused by Changes in System                                | Yes                                                          |                            |      |
| Management Console                                              | Create Instance                                                     | No                         |      |
| Configuration Management (e.g. Health Check, Session Persistence, etc.)                    | No                                                           |                            |      |
| Display Exception (e.g. Health Check Results, etc.)                           | No                                                           |                            |      |
| OpenAPI                                                 | Create Instance                                                     | No                         |      |
| Configuration Management (e.g. Health Check, Session Persistence, etc.)                    | No                                                           |                            |      |
| Display Exception (e.g. Health Check Results, etc.)                           | No                                                           |                            |      |

### **2.3 Service Resource Allocation Capability**

Load balancer provides the system elastic capacity expansion, it can manually expand the capacity according to the cluster service capacity.

**2.4 Fault Recovery Capability**

JD Cloud provides 7×24h operation and maintenance for the load balancer instances of paying users, and provides technical support by means of telephone reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, rapid positioning and fast recovery.

**2.5 Network Access Performance**

When setting up the load balancer service of JD Cloud, the user can select the public network outlet bandwidth required for each load balancer or billing by traffic. The public network outlet bandwidth can be configured from 1Mbps to 100Mbps. JD Cloud provides BGP multi-line access to ensure the quality of network access for users.

**2.6 Service Measurement Accuracy**

The load balancer service has an accurate and transparent metering and billing system. JD Cloud settles and charges in real time according to the actual usage of the user's load balancer, and the specific billing standard is subject to the effective billing mode and price announced on the official website of JD Cloud. The user's original billing log is reserved for a minimum of 1 year by default for future reference.

**2.7 Services Compensation Terms**

The load balancer service of JD Cloud follows the principle of compensation for faults by 100 times.

**2.7.1** **Compensation Scope**

For the inability of the load balancer to work properly caused by JD Cloud fault, and the inability of normal access to the website caused by JD Cloud fault, JD Cloud will compensate for the unavailable time. However, the service unavailable time caused by the following reasons is not included:

1) Caused by the system maintenance procedures after JD Cloud's notification in advance, including cutting, maintenance, upgrading and simulated fault drill;

2) Packet loss and delay caused by operators' fault;

3) Hackers' hacking to the users' application programs or data information;

4) The loss or leakage of data, key, passwords, etc. due to user's improper maintenance or improper confidentiality measures;

5) Caused by the user upgrading the operating system by himself;

6) Caused by the user's application or installation activities;

7) Caused by user's negligence or operation authorized by the user;

8) Caused by force majeure or accidents;

9) Unavailability caused by other reasons not related to JD Cloud.

**2.7.2** **Compensation Plan**

Fault time = actual unavailable time.

Load balancer in monthly package is compensated in the way of service time compensation, i.e. 100 times/set of the fault time.

Load balancer paid by configuration is compensated in the form of coupon, the payout amount of a single case = the average hourly cost in the 24 hours before the fault/ 60 × fault time × 100.

Instructions:

If the use time of the load balancer is paid by configuration is less than 24 hours, the cost shall be calculated based on the average of actual use time, the fault time shall be calculated by minutes;

Total amount of compensation shall not exceed the total amount of cash paid for the current service of a single set of load balancer;

Load balancer only compensates the load balancer itself, and does not compensate for the virtual machine under the load balancer.

## 3. Others

JD Cloud has the right to make adjustments to some service indicators of the SLA according to the changes, and promptly publish announcements at [www.jdcloud.com](https://www.jdcloud.com/) or send emails or written notices to notify users of the revised content.

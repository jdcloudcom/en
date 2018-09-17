# Service Level Agreement (SLA) of Load Balancing Service

## 1. Service Scope ##

The load balancer provided by JD Cloud is a load balancing service that distributes traffic to multiple cloud servers. Load balancer extends the external service capability of the application system through traffic distribution, improving application system availability by eliminating single points of fault.

## 2. Service Level Indicator ##
**2.1 Service Functions**

Load balancer has advanced functions such as self-service management, automatic fault recovery and anti-network attacks. It is suitable for community websites, enterprise official websites, portals, E-commerce websites, SAAS applications and game applications. For details on all the specific functions of the load balancing service, please refer to the detailed description document, technical document and helping document provided by JD Cloud on the official website. All the functional changes of load balancer that may affect users will be announced to the users.

**2.2 Service Availability**

Service availability: Single instance no less than 99.99%.

Calculation formula for service availability: Actual instance availability = (total time - actual unavailable time) / total time × 100%

Wherein, the actual unavailable time = unavailable time × user business traffic reduction ratio, also applying to 4/7 layer VIP.

Description:

The actual availability of instance shall be calculated in the unit of month.

Fault Statistical Point:

<table>
   <tr>
      <td colspan="5">Statistical Point</td>
      <td>Whether to be included in the availability</td>
   </tr>
   <tr>
      <td rowspan="8">Instance Operation Status</td>
      <td rowspan="4">Network</td>
      <td colspan="3">User Network</td>
      <td>No</td>
   </tr>
   <tr>
      <td colspan="3">ISP Network</td>
      <td>No</td>
   </tr>
   <tr>
      <td colspan="3">Basic Network IDC (Faults due to force majeure shall not be deemed as service unavailability)</td>
      <td>Yes</td>
   </tr>
   <tr>
      <td colspan="3">Connected Intranets ACL</td>
      <td>Yes</td>
   </tr>
   <tr>
      <td>Security</td>
      <td colspan="3">Network Attack (Attacks to a single user not included, attacks to JD Cloud included)</td>
      <td>Yes</td>
   </tr>
   <tr>
      <td rowspan="3">Product</td>
      <td rowspan="2">In event of service unavailability, the unavailability caused by the user application server configuration (such as user firewall rule limit, health check failure due to user health check configuration error, etc.), service capability bottleneck of backend server and fault of the backend server itself shall not be included. </td>
      <td colspan="2">Fault of the server, storage device and other hardware</td>
      <td>Yes</td>
   </tr>
   <tr>
      <td colspan="2">JD Cloud system software fault</td>
      <td>Yes</td>
   </tr>
   <tr>
      <td colspan="3">Service unavailability due to system change</td>
      <td>Yes</td>
   </tr>
   <tr>
      <td rowspan="3">Manage Console</td>
      <td colspan="4">Create Instance</td>
      <td>No</td>
   </tr>
   <tr>
      <td colspan="4">Configuration Management (such as health check, session persistence, etc.)</td>
      <td>No</td>
   </tr>
   <tr>
      <td colspan="4">Display Exception (such as the result of health check, etc.)</td>
      <td>No</td>
   </tr>
   <tr>
      <td rowspan="3">OpenAPI</td>
      <td colspan="4">Create Instance</td>
      <td>No</td>
   </tr>
   <tr>
      <td colspan="4">Configuration Management (such as health check, session persistence, etc.)</td>
      <td>No</td>
   </tr>
   <tr>
      <td colspan="4">Display Exception (such as the result of health check, etc.)</td>
      <td>No</td>
   </tr>
</table>

**2.3 Service Resource Allocation Capability**

The load balancing providing system has flexible expansion capacity and can be manually expanded according to the demand of cluster service capability.

**2.4 Fault Recovery Capability**

JD Cloud provides 7×24 hours of operation maintenance for the load balancer instance of the paying users, and provides technical support by means of telephone fault reporting, and has a series of fault emergency response mechanisms such as fault monitoring, automatic alarm, fast positioning, fast recovery, etc.

**2.5 Network Access Performance**

When an user turns on the JD cloud load balancing service, the user can select the public network exit bandwidth required for each load balancer instance or adopt the method of billing by traffic; the public network exit bandwidth can be configured from 1Mbps to 100Mbps. JD Cloud provides BGP multi-line access to ensure the quality of network access for users.

**2.6 Service Metering Accuracy**

The load balancing service has an accurate and transparent metering and billing system. JD Cloud settles and deducts charges in real time according to the user’s actual usage of the load balancing instance. The specific billing standard shall be subject to the effective billing model and price announced on the JD Cloud official website. The user's original billing log shall be kept for at least 1 year by default for future reference.

**2.7 Service Compensation Terms**

The principle of “100 times compensation for faults” is implemented for JD Cloud load balancing service.

2.7.1 Compensation Scope

In the event of failure of normal use of load balancer due to JD Cloud fault, or failure of normal website access due to JD Cloud fault, JD Cloud will compensate for the unavailability time, excluding the service unavailability time caused by the following reasons:

1) Caused by the system maintenance that JD Cloud have notified the users in advance, including cutover, maintenance, upgrade and simulation fault drill;

2) Unavailability situations such as packet loss and latency caused by operator fault;

3) Caused by hacker attacks to the user’s application program or data information;

4) Caused by loss or leakage of data, passwords, etc. due to user’s improper maintenance or improper confidentiality;

5) Caused by user’s own upgrading of operating system;

6) Caused by user’s application program or installation activities;

7) Caused by user’s negligence or actions authorized by the user;

8) Caused by force majeure and accidents;

9) Other unavailability caused not due to JD Cloud’s account.

2.7.2 Compensation Scheme

Fault Time = Actual Unavailable Time

For the monthly package load balancer, compensation shall be made by the means of compensating service duration at the 100 times of fault time/single instance.

For the load balancer paid by configuration, compensation shall be made by the means of coupons at the single instance compensation amount = average charge per hour of 24 hours before the fault/60 x fault time x 100.

Description:

If the usage time of load balancer paid by configuration is less than 24 hours, the charge shall be calculated in accordance with the average value of the actual usage duration, and the fault time shall be calculated by minutes.

The total compensation amount shall not exceed the total amount of current service cash charge already paid for a single load balancer;

Compensation for load balancer is only provided for the load balancer itself other than the virtual machine under the load balancer.

## 3. Miscellaneous ##

JD Cloud has the right to make adjustments to partial service indicators of the Service Level Agreement according to changes, and promptly publish announcements on JD Cloud official website (www.jdcloud.com), or send Emails or written notices to notify users of the modified contents.
# Load Balancer

## Product Overview

The Load Balancer can distribute large concurrent traffic to several backend instances (specifically the Cloud Physical Server), adjust resource utilization, eliminate influence to systems by fault of a single device, improve system availability and expand system serviceability. Now, the traffic listening and forward service based on 4 layers (TCP and UDP) is provided. The Load Balancer is called as "Physical Cloud Load Balancer".

## Use Restrictions

Please note the following use restrictions during use of the Load Balancer.

1. Each JD Cloud account supports a maximum of 10 Load Balancers in each region currently. If you need more quota, please open ticket for application. At present, only cn-north-1 is opened.<br/>

2. The Load Balancer supports the 1:1 association with the Elastic IP.<br/>

3. One Load Balancer instance can be equipped with several listeners and the cap is 50.<br/>

4. One Load Balancer instance can be equipped with several virtual server groups and the cap is 20.<br/>

5. One virtual server group can be equipped with at most 100 instances.<br/>

6. Now, monthly package resources are not allowed to be deleted.<br/>

## Billing Overview

Load Balancer supports 2 billing methods, namely Monthly Package and Pay By Configuration.

## Subscription Requirements

Subscription requirement: When subscribing a Load Balancer associated with the Elastic IP, in order to ensure your normal use, the sum of the balance and available voucher in your account shall not be less than the consumption threshold of RMB 50 when you activate Pay By Configuration.

**Amount Overdue/Expiry Description**

The Load Balancer instance is always for free, and thus no arrears will occur. If the Elastic IP associated to Load Balancer is in arrears, the use of the Elastic IP will be affected, and meanwhile, the function of load balancing on public IP traffic will not be able to be used.

## Billing Rules

At present, the Load Balancer is free. If any Elastic IP resource is associated, the EIP cost shall be paid independently. For details, please refer to Elastic IP [Price Overview](../../Pricing/Price-Overview.md).

## Price Overview

**Monthly Package & Pay By Configuration**

When using the Load Balancer under monthly package or billed by configuration at present, all Regions are free of charge.

## Renew Process

**Renewal Rules**

Renewal to instances in the Monthly Package: Prolong service time of the Load Balancer in the Monthly Package. The renewal time periods include 1 month ~ 9 moths, 1 year, 2 years and 3 years. If you operate to renew prior to the instance date due, the start time of the new order is expiration time of the original order; if you renew after resource date due, the start time of the new order is expiration time of the date of renewal.

Associated renewal: During the instance renewal, the Elastic IPs associated to the instance can displayed and users can select the associated resources to be renewed with the instance.

## Operation Guide

The Load Balancer is mainly composed of the following parts: Load Balancer instances, listeners and virtual server groups. Now, the four-layer Load Balancer is supported.

**Create a Load Balancer instance**

Open the Console, Click **Cloud Physical Server**->**Load Balancer** on the left navigation bar in turn, enter the Load Balancer Instance List page, Click **Create**, select **Region**, **Network Part**--network type (supporting public network), IP version (supporting IPv4 currently), private network, type of associated server (supporting Cloud Physical Server), **Basic Information*--instance name and description, **Bandwidth**--check Elastic IP, select the bandwidth billing mode, line type and bandwidth cap or do no purchase temporarily (associate the IP after an instance is created), and **Purchase Amount**--purchase duration as required, and click **OK** to create a Load Balancer.<br/>

**Associate EIP**

Open the Console, enter the Load Balancer Instance List page, select the targeted Load Balancer, click **Associate EIP**, select the required Elastic IP and associate it.<br/>

**Disassociate EIP**

Open the Console, enter the Load Balance Instance List page, select the targeted Load Balancer, click **Disassociate EIP** to disassociate the Elastic IP. After the Elastic IP is disassociated, a new IP can be associated.<br/>

**Delete Load Balancer**

Open the Console, enter the Load Balancer Instance List page, select the targeted Load Balancer, click **Delete** to delete the Load Balancer.<br/>
Explanation:<br/>
1. The Load Balancer under monthly package cannot be deleted. Only the Load Balancer paid by configuration can be deleted.<br/>
2. All associated listeners and virtual server groups will all be deleted and unrecoverable once the Load Balancer is deleted;<br/>
3. After the Load Balancer is deleted, the backend Cloud Physical Server will be kept continuously. If you do not need to keep it, please go to the corresponding page to delete it, so as not to incur any extra cost.<br/>

**Load Balancer Instance Management**

1. **Add Listener**, click **Add Listener** and redirect to the listener page.<br/>
2. **Enable/Disable**, the Load Balancer can be started and stopped (if the Load Balancer is not associated with EIP, do not click the grey **Enable** button).<br/>
3. **Associate/Disassociate Elastic IP**, if the Load Balancer provides the Internet service, the Elastic IP shall be associated; if the service is not required, the Elastic IP can be disassociated.<br/>
4. **Renew**, the Load Balancer can be independently renewed and joint renewal of Load Balancer and EIP are also supported.<br/>
5. Click **ID/Instance Name**, redirect to the Instance Details, and view the detailed information.<br/>

**Listener Management**

Turn on the Console, click **Cloud Physical Server** -> **Load Balancer** -> **Instance Details** in turn at the left navigation bar, select the tab page, log in the Listener List Page and click **Create Listener**, Select the listener according to your demands,<br/>
**Basic Configuration**--<br/>
**Name**: Listener name entered (the Load balancer instance names under the same user cannot be the same);<br/>
**Listening protocol**: The four-layer TCP and UDP protocol is supported;<br/>
**Port**: After the listening rules are created, protocols and ports cannot be modified. Among ports provided by the Load Balancer, the port 80 is used for TCP in general;<br/>
**Session persistence**: The four-layer protocol session persistence is disabled by default;<br/>
**Scheduling algorithm**: If session persistence is disabled, weighted round robin and weighted least connection number are supported; if session persistence is enabled, source IP is supported. **Weighted round robin**: Via weighted round robin, access requests will be distributed to the backend server in turn. The greater the weight value of backend server, the greater the frequency (probability) of round robin. **Weighting least connection number**: Except that round robin is made to each backend server based on the weight value set, actual load (i.e. connection count) of such backend server shall be considered as well. Where the weight values are the same, the less the current connection number, the greater the frequency (probability) of backend server subject to round robin. **Source IP**: For the consistency hash based on the source IP address, the same backend server will be scheduled to the same source address.<br/>
**Get actual IP**: If the protocol is TCP, it is disabled by default. A user can set it as enabled if required: Install via the yum source. Taking Centos for example, after the toa Kernel module plug-ins are installed with yum install kmod-toa, parameters can be returned by socket.accept() or actual source IP can be obtained by calling socket.getpeername().<br/>

**Health check**--The Load Balancer instance can periodically send Ping and connection attempts to the backend server or send requests to test backend server running status<br/>
**Health check**: It is enabled by defaulted. If disabled, the following fields will not be displayed;<br/>
**Response time-out period**: Maximum time-out period of health check response, if the backend cloud server does not give correct response in corresponding period, the health check is determined as failed. Restriction: 2-60s. The response time-out period must be less than the health check interval. The default value is 3.<br/>
**Health check interval**: Health check time interval. Restriction: 5-300s, the default value is 5.<br/>
**Healthy threshold**: Refer to the connection health count of backend instance from failed to successful. Restriction: 1-10 times, and the default value is 3.<br/>
**Unhealthy threshold**: Refer to the connection health failure count of backend instance from successful to failed. Restriction: 1-10 times, and the default value is 3.<br/>
**Health check IP**: 100.64.0.0/10<br/>

**Backend Server**--<br/>
Select a virtual server group. If no created server group is available, please click **Add Server Group** to create one.

After the above steps, click **OK** and then a listener is created.

Open the Console, click **Cloud Physical Server**->**Load Balancer**->**Instance Details** on the left navigation bar in turn, select the Listener tab page, enter the Listener List page, click **Listener Name**, enter the Listener Details, and view the detailed information.<br/>

**Operation Supported by Listener**<br/>
1.**Edit**: The listen ports and protocols cannot be modified, but other fields can be modified<br/>
2.**Enable/Disable**: Switch between the enabled and disabled status is supported. <br/>
3.**Delete**: After the listener is deleted, the responding backend server will be disassociated with the listener.<br/>

**Virtual Server Group Management**

Open the Console, click **Cloud Physical Server**->**Load Balancer**->**Instance Details** on the left navigation bar in turn, select the Virtual Server Group tab page, enter the Virtual Server Group list page, click **Add Virtual Server Group**, select **Virtual Server Group Name** (the group name cannot be duplicated), select an instance (not required) and click **OK** to create a Virtual Server Group.<br/>

Click the name of **Virtual Server Group**, enter the Details of Virtual Server Group, and view the detailed information.<br/>

**Operation Supported by Server Groups of Virtual Machines**<br/>
1. **Edit**: The edit operation is supported.<br/>
2. **Delete**: Deletion conditions for virtual server groups: Do not associate with any listener.<br/>

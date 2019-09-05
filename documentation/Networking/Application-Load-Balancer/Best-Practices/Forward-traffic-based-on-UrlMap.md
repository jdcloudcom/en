# Forward traffic based on domain and URL path

## Preparation and Planning

- Network Preparation

	According to your business deployment needs, plan for an Application Load Balancer, and region, availability zone, virtual private cloud, etc. of VMs and containers as backend servers in advance.
	
	Note: VMs and containers as backend servers need to be in the same region, virtual private cloud with the Application Load Balancer.

- Server Preparation

	It is necessary to create VMs and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

- Application Load Balancer Instance

	Create an Application Load Balancer Instance, and set up the region, availability zone, network, security group and other configurations.
	

## Configuration Steps

Configure the Application Load Balancer according to the following steps, forward the traffic to different backend services based on access requested domains and URL paths:

[Create A Seven-layer Listener](forward-traffic-based-on-urlmap#user-content-1)

[Add A Forwarding Rules Group](forward-traffic-based-on-urlmap#user-content-2)

[Associate Listener with Forwarding Rules Group](forward-traffic-based-on-urlmap#user-content-3)

### Create A Seven-layer Listener
<div id="user-content-1"></div>

Only the Seven-layer Listener (HTTP or HTTPS) supports association with forwarding rules, here take HTTP Listener as example.

- Frontend listening configuration:

  Click **Add** to create a listener: select HTTP Protocol, configure listening port, idle connection timeout.

  ![ALB后端转发设置](../../../../image/Networking/ALB/ALB-101.png)

- Backend forwarding configuration: May create a new backend service or select an existing backend service, it is noted that backend services of backend HTTP (or HTTPs) type protocol can be selected.

  Create a new backend service: configure backend service name, Protocol (HTTP), port 80, scheduling algorithm selects weighted round robin, turn on/off session persistence switch, set session persistence timeout time.

  ![ALB后端转发设置](../../../../image/Networking/ALB/ALB-102.png)

- Configure health check: set related parameters of health check, wherein the HTTP method is used here.![NLB health check setting](../../../../image/Networking/ALB/ALB-103.png)

- Add server group: Select virtual server group, availability group according to business needs.

  Select virtual server group, availability group according to business needs.

  ![ALB服务器组设置](../../../../image/Networking/ALB/ALB-105.png)

- If there is no available virtual server group, click **Create a new virtual server group** to create a new virtual server group. VMs and containers can be selected to define the port and weight of the instance.

  Note: Only VMs and container resources in the same Virtual Private Cloud with the Application Load Balancer can be selected.

  ![ALB虚拟服务器组设置](../../../../image/Networking/ALB/ALB-106.png)

- So far, the listener based on the HTTP Protocol has been created and can be viewed in the listener list.

  ![ALB监听器列表页](../../../../image/Networking/ALB/ALB-urlmap6.png)

### Add A Forwarding Rules Group
<div id="user-content-2"></div>

1. Enter the forwarding rules group list page by Application Load Balancer-Detail-Forwarding Rules Group.

	![转发规则组列表页](../../../../image/Networking/ALB/ALB-urlmap2.png)

2. Click **Create Forwarding Rules Group**，open forwarding rules group creation page, fill the name and description of forwarding rules group.
3. Click **Add Rules**, configure forwarding rules for forwarding rules group.
    - Domain: Domain for matching client request. Support entry of IPv4 address and domain, domain supports exact match and wildcard match, the entry limitations are as follows:
      - It only supports entry of uppercase and lowercase letters, numbers, English line-through "_" and ".", case insensitive, which cannot exceed 110 characters.
      - Include at least one dot "." and do not begin or end with dot "." and line-through "-", dot "." cannot be after or before line-through "-".
      - Wildcard match support includes one star "*", entry format is \*.XXX or XXX.\*.
    - URL path: URL path for matching client request, support exact match and prefix match.
      - Must begin with /.
      - Only support uppercase and lowercase letters, numbers and special characters: $-_.+!' ()%:@&=/, case sensitive, and the description cannot exceed 128 characters.
      - Wildcard match support includes one star "*", entry format is /XXX\* or /\*.
    - Backend service: Backend service where Application Load Balancer forwards the packet of matching rules to. In the drop-down list, backend services that show the backend protocol as HTTP are shown.

### Associate Listener with Forwarding Rules Group
<div id="user-content-3"></div>

1. Click **More - Manage Forwarding Rules Group** by Listener List Page - Operation Bar to pop up the dialog box of Manage Forwarding Rules Group.

![ALB管理转发规则组](../../../../image/Networking/ALB/ALB-urlmap4.png)

2. In the dialog box of Manage Forwarding Rules Group, one forwarding rules group can be associated with the Listener.

![ALB转发规则组](../../../../image/Networking/ALB/ALB-urlmap3.png)

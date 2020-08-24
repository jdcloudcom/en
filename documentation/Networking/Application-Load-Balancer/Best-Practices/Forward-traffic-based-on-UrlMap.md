# Deploy Load Balancer to forward traffic based on domain and use different certificates for different domains

## Preparation and Planning

- Network Preparation

	Plan the Application Load Balancer and the territories, availability zones, virtual private cloud, etc. to be used as the Backend Server in advance in accordance with the demands of business deployment.

- Server Preparation

	Require advance creation of the resources such as Virtual Machine and Container used for carrying business traffic, and ensure to enable the port required for listening and reasonably configure Security Group and SCL Policy.

- Application Load Balancer Instance

	Create an Application Load Balancer Instance, and set up the region, availability zone, network, security group and other configurations.
	

## Configuration Steps

Configure the Application Load Balancer according to the following steps, forward the traffic to different backend services based on access requested domains and URL paths:

[Create A Seven-layer Listener](forward-traffic-based-on-urlmap#user-content-1)

[Add A Forwarding Rules Group](forward-traffic-based-on-urlmap#user-content-2)

[Listener correlates with the Forwarding Rule Group so as to realize domain-based traffic forwarding](forward-traffic-based-on-urlmap#user-content-3)

[Listener attaches multiple certificates so that different domains will return different certificates]forward-traffic-based-on-urlmap#user-content-4)

### Create A Seven-layer Listener
<div id="user-content-1"></div>

Only the Seven-layer Listener (HTTP or HTTPS) supports association with forwarding rules, here take HTTPS Listener as example.

- Frontend listening configuration:

  Click **Add** to create a listener: select HTTPS Protocol, configure listening port, idle connection timeout.

  ![ALB后端转发设置](../../../../image/Networking/ALB/ALB-045.png)

- Backend forwarding configuration: May create a new backend service or select an existing backend service, it is noted that backend services of backend HTTP (or HTTPs) type protocol can be selected. Create a new backend service: Configure backend service name, protocol (HTTP) and port (80), select the weighted round robin as the Scheduling Algorithm, turn on the switch closing Session Persistence and set time-out period for Session Persistence.

  ![ALB后端转发设置](../../../../image/Networking/ALB/ALB-102.png)

- Configure health check: set related parameters of health check, wherein the HTTP method is used here.

  ![ALB健康检查设置](../../../../image/Networking/ALB/ALB-094.png)

  Select virtual server group, availability group according to business needs.

  ![ALB服务器组设置](../../../../image/Networking/ALB/ALB-049.png)

- So far, the listener based on the HTTPS Protocol has been created and can be viewed in the listener list.

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
    - Action: Select forwarding, select the Application Load Balancer to forward the matched requested packet to the backend server. The drop-down list only shows the backend services with HTTP as their backend protocols.

### Listener correlates with the Forwarding Rule Group so as to realize domain-based traffic forwarding
<div id="user-content-3"></div>

1. Click **More - Manage Forwarding Rules Group** by Listener List Page - Operation Bar to pop up the dialog box of Manage Forwarding Rules Group.

![ALB管理转发规则组](../../../../image/Networking/ALB/ALB-urlmap4.png)

2. In the dialog box of Manage Forwarding Rules Group, one forwarding rules group can be associated with the Listener.

![ALB转发规则组](../../../../image/Networking/ALB/ALB-urlmap3.png)

### Listener attaches multiple certificates so that different domains will return different certificates
<div id="user-content-4"></div>

1. Click **More - Manage Certificate** on the Listener List page - Operations bar to pop up the Manage Certificate dialog box.

![ALB管理证书](../../../../image/Networking/ALB/ALB-sni1.png)

2. Select Extended Certificate in the Manage Certificate dialog box, enter or select the domain of Extended Certificate Service.
    - Extended Certificate: The selected extended certificates must be those that have been uploaded to/subscribed in Cloud Security - SSL Certificate
    - Domain: The domain of Extended Certificate Service. Domain can be selected or entered. If selected, only the bound domains and standby domains in the Extended Certificate are supported; While if entered, exact domain and extensive domain are supported under the following restrictions:
      - Only support entering capital and lower-case letters, figures, English line-through "-" and point "." (case-insensitive) with no more than 110 characters.
      - Include at least one point ".", do not start or end with a point "." or a line-through "-", and enter no point "." before and after a line-through "-".
      - Wildcard Matching support including an asterisk "*" with the input format of \*.XXX.
3. When a certificate needs to provide services for multiple domains (e.g. extensive domain certificate or multiple domain certificate), you can select or enter multiple domains for an added certificate, and then you can click **Add** to add multiple corresponding relations between domain and extended certificate in batches to the Certificate List.

![ALB管理证书](../../../../image/Networking/ALB/ALB-sni2.png)

4. Click **OK**, and complete the operations for adding multiple certificates.

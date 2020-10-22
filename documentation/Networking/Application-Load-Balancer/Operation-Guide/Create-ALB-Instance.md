# Create Application Application Load Balancer

[Create IPv4 Application Load Balancer](Create-ALB-Instance#user-content-1)

[Create IPv6 Application Load Balancer](Create-ALB-Instance#user-content-2)

## Create IPv4 Application Load Balancer
<div id="user-content-1"></div>

1. Enter into the Application Application Load Balancer list page via the Menu-Network-Application Application Load Balancer.

	![ALB列表页](../../../../image/Networking/ALB/ALB-015.png)

1. Click **Create** to create an Application Load Balancer instance and configure the following fields:

 - Select a region and pay attention to select the region of the virtual private cloud to be selected.

 - Select an availability zone, and the Application Load Balancer only can forward the traffic to the backend server of the selected availability zone under the same VPC.

 - Select a virtual private cloud and subnet information and the Application Application Load Balancer only can forward the traffic to the backend server under the same virtual private cloud.

 - Security group configuration: Configure the security group to be associated with the Application Application Load Balancer instance and the security group with a completely-opened port is associated by default.

 - Select IPv4 public network billing method: Charge by fixed bandwidth or by traffic;  For example, create Application Load Balancer of Intranet type, you are entitled to purchase no Application Application Load Balancer now or associate EIP after creating the Application Application Load Balancer.

 - Fill in Application Application Load Balancer Name, Description.


1. Confirm configuration and cost information on the right side of the page and click **Purchase immediately**.

	![ALB创建设置](../../../../image/Networking/ALB/ALB-016.png)

	![ALB创建设置](../../../../image/Networking/ALB/ALB-017.png)

1. Confirm order information and complete payment, create a Application Application Load Balancer instance

	![ALB确认订单](../../../../image/Networking/ALB/ALB-018.png)

1. Complete Application Application Load Balancer instance creation; as the resource creation lasts for a period (several seconds in general), please view status by manually refresh the list page.

	![ALB创建完成](../../../../image/Networking/ALB/ALB-019.png)
	
## Create IPv6 Application Load Balancer
<div id="user-content-2"></div>

1. Log in the Application Load Balancer List page through Menu - Network - Load Balancer.

	![ALB列表页](../../../../image/Networking/ALB/alb-ipv61.png)

1. Click **Create** to create an Application Load Balancer instance and configure the following fields:

 - Select the region, which must be consistent with the region of the selected Virtual Private Cloud.

 - Select the available zone. The Application Load Balancer can only forward traffic to the backend server under the same Virtual Private Cloud in the selected available zone.

 - Select the information of Virtual Private Cloud and Subnet supporting IPv6 to enable IPv6. The Application Load Balancer can only forward traffic to the backend server under the same Virtual Private Cloud.

 - Configure security group: When a user configure a security group that needs to be associated with the Application Load Balancer instance, a security group with fully open port is associated by default.

 - Select IPv4 public network billing method: Charge by fixed bandwidth or by traffic. If the created Load Balancer only supports IPv6 service, users may choose not to buy it; if the created Load Balancer supports both IPv4 and IPv6 dual stack service, users may choose to buy it.

 - Fill in the name and description of Application Load Balancer.


1. Confirm the configuration and cost information on the right side of the page and then click **Buy Now**.

	![ALB创建设置](../../../../image/Networking/ALB/alb-ipv62.png)

	![ALB创建设置](../../../../image/Networking/ALB/ALB-017.png)

1. Confirm the order information and make the payment to create an Application Load Balancer instance.

	![ALB确认订单](../../../../image/Networking/ALB/ALB-018.png)

1. Complete the creation of Application Load Balancer instance; As it may take a while (generally, a few seconds) to create the resource, users may manually refresh the list page to check the status.

	![ALB创建完成](../../../../image/Networking/ALB/alb-ipv61.png)

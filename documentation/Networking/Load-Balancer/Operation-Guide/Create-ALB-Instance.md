# Create load balancer

1. Enter into the load balancer list page via the Menu-Network-Load balancer.

		![ALB列表页](../../../../image/Networking/ALB/ALB-015.png)

1. Click “Create” to create a new load balancer instance.

1. Select a region and pay attention to select the region of the virtual private cloud to be selected.

1. Select an availability zone, the load balancer only can forward the traffic to the backend server of the selected availability zone.

1. Select a virtual private cloud and subnet information and the load balancer only can forward the traffic to the backend server under the same virtual private cloud.

1. Security group configuration: Configure the security group to be associated with the load balancer instance and the security group with a completely-opened port is associated by default.

1. Select EIP billing method: Charge by fixed bandwidth or by traffic; if any Intranet load balancer is created, you are entitled to purchase no load balancer now or associate EIP after creating the load balancer.

1. Fill in Load Balancer Name, Description.

1. Select creation count and the count able to be created is subject to the quota limit of load balancer, EIP, subnet, etc. For quota information, please view the overview page.

1. Confirm configuration and cost information on the right side of the page and click **Purchase immediately**.

	![ALB创建设置](../../../../image/Networking/ALB/ALB-016.png)

		![ALB创建设置](../../../../image/Networking/ALB/ALB-017.png)

1. Confirm order information and complete payment, create a load balancer instance

		![ALB确认订单](../../../../image/Networking/ALB/ALB-018.png)

1. Complete load balancer instance creation; as the resource creation lasts for a period (several seconds in general), please view status by manually refresh the list page.

		![ALB创建完成](../../../../image/Networking/ALB/ALB-019.png)

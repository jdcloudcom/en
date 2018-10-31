# Create network load balancer instance

It can choose to purchase and configure network load balancer instances of public network and Intranet types according to the specific business scenario.

###### 1. Enter into the load balancer list page via the Menu-Network-Load balancer.

![NLB列表页](../../../../image/Networking/NLB/NLB-List.png)

###### 2. Click “Create” to create a new load balancer instance.

###### 3. Select load balancer type, and here network load balancer should be selected.

![NLB列表页](../../../../image/Networking/NLB/NLB-ChooseLB.png)
 
###### 4. Network load balancer parameter configuration:

- Select a region and pay attention to select the region of the virtual private cloud to be selected.

- Select availability zone: the load balancer will deploy instance resource in the selected availability zone, and it is highly recommended multiple availability zones be selected.

- Select a virtual private cloud and subnet information and the load balancer only can forward the traffic to the backend server under the same virtual private cloud.

- Select EIP billing method: Charge by fixed bandwidth or by traffic; if any Intranet load balancer is created, you are entitled to purchase no load balancer now or associate EIP after creating the load balancer.

- Fill in Load Balancer Name and Description.

- Select creation number and the number able to be created are subject to the quota limit of load balancer, EIP, subnet, etc. For quota information, please view the overview page.
![NLB创建设置](../../../../image/Networking/NLB/NLB-InstanceCreate.png)

- Confirm configuration and cost information on the right side of the page and click **Buy Now**.
![NLB购买](../../../../image/Networking/NLB/NLB-BuyInfo.png)

###### 5. Confirm order information and complete payment, create a load balancer instance
![NLB确认订单](../../../../image/Networking/NLB/NLB-BuyConfirm.png)

###### 6. Complete load balancer instance creation; as the resource creation lasts for a period (several seconds in general), please view status by manually refreshing the list page.
![NLB创建完成](../../../../image/Networking/NLB/NLB-List.png)

## Intranet Load Balancer

- Intranet load balancer only can be used in JD Cloud Intranet, can forward client request having access permission to JD Cloud Intranet. - Steps for creating Intranet load balancer are as follows:
![创建内网NLB设置](../../../../image/Networking/NLB/NLB-058.png)

Select “Not purchase” EIP when creating load balancer, complete relevant resource configuration, confirm load balancer instance for creating Intranet type by default.
	
## Public network load balancer

- Public network load balancer may forward access request traffic from the public network to backend virtual server; public network load balancer needs to purchase EIP separately with the following steps:
![创建公网NLB设置](../../../../image/Networking/NLB/NLB-059.png)

Select EIP (not exceeding creation quota of EIP) when purchasing load balancer, the system will automatically create and associate EIP for load balancer.

## Intranet load balancer is converted to public network load balancer

- JD Cloud supports mutual conversion of load balancer type of Intranet and public network, Intranet load balancer can be converted to load balancer of public network type through associating EIP, after the public network load balancer disassociates EIP, it can be converted to load balancer of Intranet type.
![内网NLB转为公网NLB设置](../../../../image/Networking/NLB/NLB-060.png)

	

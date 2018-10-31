# Create Intranet/Extranet load balancer instance

It can choose to purchase and configure load balancer instances of public network and Intranet types according to the specific business scenario.

## Intranet load balancer

- Intranet load balancer only can be used in JD Cloud Intranet, can forward client request having access permission to JD Cloud Intranet. - Steps for creating Intranet load balancer are as follows:

	![创建内网ALB设置](../../../../image/Networking/ALB/ALB-058.png)

	Select “Not purchase” EIP when creating load balancer, complete relevant resource configuration, confirm load balancer instance for creating Intranet type by default.
	
## Public network load balancer

- Public network load balancer may forward access request traffic from the public network to backend virtual server; public network load balancer needs to purchase EIP separately with the following steps:

	![创建公网ALB设置](../../../../image/Networking/ALB/ALB-059.png)

	Select EIP (not exceeding creation quota of EIP) when purchasing load balancer, the system will automatically create and associate EIP for load balancer.

## Intranet load balancer is converted to public network load balancer

- JD Cloud supports mutual conversion of load balancer type of Intranet and public network, Intranet load balancer can be converted to load balancer of public network type through associating EIP, after the public network load balancer disassociates EIP, it can be converted to load balancer of Intranet type.

	![内网ALB转为公网ALB设置](../../../../image/Networking/ALB/ALB-060.png)

	

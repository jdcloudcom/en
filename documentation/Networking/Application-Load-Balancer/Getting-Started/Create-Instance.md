# Create Application Load Balancer instance

It can choose to purchase and configure Application Load Balancer instances of public network and Intranet types according to the specific business scenario.

## Intranet Application Load Balancer

- Intranet Application Load Balancer only can be used in JD Cloud Intranet, can forward client request having access permission to JD Cloud Intranet. - Steps for creating Intranet Application Load Balancer are as follows:

	![创建内网ALB设置](../../../../image/Networking/ALB/ALB-058.png)

	Select **Not purchase** EIP when creating Application Load Balancer, complete relevant resource configuration, confirm Application Load Balancer instance for creating Intranet type by default.
	
## Public network Application Load Balancer

- Public network Application Load Balancer may forward access request traffic from the public network to backend virtual server; public network Application Load Balancer needs to purchase EIP separately with the following steps:

	![创建公网ALB设置](../../../../image/Networking/ALB/ALB-059.png)

	Select EIP (not exceeding creation quota of EIP) when purchasing Application Load Balancer, the system will automatically create and associate EIP for Application Load Balancer.

## Intranet Application Load Balancer is converted to public network Application Load Balancer

- JD Cloud supports mutual conversion of Application Load Balancer type of Intranet and public network, Intranet Application Load Balancer can be converted to Application Load Balancer of public network type through associating EIP, after the public network Application Load Balancer disassociates EIP, it can be converted to Application Load Balancer of Intranet type.

	![内网ALB转为公网ALB设置](../../../../image/Networking/ALB/ALB-060.png)

	

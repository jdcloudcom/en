# Use availability group as backend server

## Preparation and planning

- Networking preparation

	Plan for load balancer, and region, availability zone, virtual private cloud, etc. of VM and containers as backend server in advance, according to business deployment needs.
	
	Note: VM and containers as backend server need to be in the same region, virtual private cloud with load balancer.

- Server preparation

	It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

- Load balancer instance

	Create a load balancer instance, and set up the region, availability zone, network, security group and other configurations.

## Create an availability group

- Create instance template
   Open the console, select elastic compute >> VM>> instance template, set the parameters required by a series of instance templates, and finally click **Create** to generate the instance template required by availability group
- Create availability group
   Open the console, select elastic compute >> availability group, set the parameters such as region, availability zone, and instance template and finally click **OK** to create availability group

## Create a listener of TCP Protocol

- Take HTTP listener as an example, explain how to deploy availability group as backend server.
	
	Assume that a load balancer instance, a high-availability group resource has been created.

	Click ** Add ** to create a listener: select HTTP Protocol, configure port, idle connection timeout, and click **Next**.
	
	![ALB前端监听设置](../../../../image/Networking/ALB/ALB-092.png)

- Create a new backend service, configure name, protocol (by default), port, scheduling algorithm, turn on session persistence, configure to get HTTP header field, click **Next**.
	
	![ALB后端转发设置](../../../../image/Networking/ALB/ALB-093.png)

- Configure health check parameters, click **Next**.

	![ALB健康检查设置](../../../../image/Networking/ALB/ALB-094.png)

- Select server type as availability group, select and associate an availability group, and click **OK**.

	![ALB服务器组设置](../../../../image/Networking/ALB/ALB-095.png)
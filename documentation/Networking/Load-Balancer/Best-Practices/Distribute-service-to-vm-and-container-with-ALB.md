# Use VM and containers to be deployed as backend server

## Preparation and planning

- Networking preparation

	Plan for load balancer, and region, availability zone, virtual private cloud, etc. of VM and containers as backend server in advance, according to business deployment needs.
	
	Note: VM and containers as backend server need to be in the same region, virtual private cloud with load balancer.

- Server preparation

	It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

## Create an HTTP listener

- Frontend listening configuration:
	
	Assume that you have created a load balancer instance, VM, and a container resource, take HTTP listener as an example as below, explain how to deploy VM and container resource as backend server.

	Click **Add** to create a listener: select HTTP Protocol, configure port, idle connection timeout, and click Next.

	![ALB前端监听设置](../../../../image/Networking/ALB/ALB-061.png)

- Backend forwarding configuration:
	
	Create a new backend service, configure backend service name, protocol (by default), port, scheduling algorithm, turn on session persistence, configure to get HTTP header field, click Next.

	![ALB后端转发设置](../../../../image/Networking/ALB/ALB-062.png)

- Configure health check:

	Configure health check parameters, click Next

	![ALB健康检查设置](../../../../image/Networking/ALB/ALB-063.png)

- Create a new server group:

	Select virtual server group type, click to create a new server group.

	![ALB新建服务器组设置](../../../../image/Networking/ALB/ALB-064.png)

- Add machine and container type resource to the virtual server group.
	
	Fill in virtual server group name, select and add machine, resource instance of container type, configure port and weight.

	![ALB虚拟服务器组添加资源设置](../../../../image/Networking/ALB/ALB-065.png)

- Associate virtual server group.

	Select and associate this virtual server group, click OK.

	![ALB绑定虚拟服务器组](../../../../image/Networking/ALB/ALB-066.png)


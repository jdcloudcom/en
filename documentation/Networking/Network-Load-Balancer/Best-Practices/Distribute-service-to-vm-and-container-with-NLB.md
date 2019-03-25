# Use VM, containers to be deployed as backend server

## Preparation and planning

- Network Preparation

  Plan for load balancer and region, availability zone, virtual private cloud, etc. of VM, containers as backend server in advance, according to business deployment needs.
	
  Note: VM, containers as backend server need to be in the same region, virtual private cloud with load balancer.

- Server Preparation

  It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

## Create a TCP listener

- Frontend listening configuration:
	
  Assume that you have created a load balancer instance, VM, and a container resource, take TCP listener as an example as below, explain how to deploy VM and container resource as backend server.

  Click **Add** to create a listener: select TCP Protocol, configure port, idle connection timeout, and click Next.

  ![NLB前端监听设置](../../../../image/Networking/NLB/NLB-022.png)

- Backend forwarding configuration:
	
  Create the new backend service, configure backend service name, protocol (by default), port, scheduling algorithm, enable session persistence, connection draining timeout period, click Next;

  ![NLB后端转发设置](../../../../image/Networking/NLB/NLB-023.png)

- Configure health check:

  Configure health check parameters, click Next.

  ![NLB健康检查设置](../../../../image/Networking/NLB/NLB-029.png)

- Associate server group:

  Select virtual server group type, click to create a new server group.

  ![NLB新建服务器组设置](../../../../image/Networking/NLB/NLB-030.png)

- Create virtual server group, and add machine, container type and resource:
	
  Fill in virtual server group name, select and add machine, resource instance of container type, configure port and weight.

  ![NLB虚拟服务器组添加资源设置](../../../../image/Networking/NLB/NLB-079.png)




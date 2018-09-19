# Configure and deploy the TCP listener supporting source IP pass-through

  When the network load balancer employs backend virtual server group or availability group to provide TCP service, the default is to support the pass-through of the client source IP to the application server without special configuration by a user.

## Preparation and planning

- Network Preparation

  Plan for load balancer and region, availability zone, virtual private cloud, etc. of VM, containers as backend server in advance, according to business deployment needs.
	
  Note: VM, containers as backend server need to be in the same region, virtual private cloud with load balancer.

- Server Preparation

  It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

- Load Balancer Instance

  Create a load balancer instance, and set up the region, availability zone, network, security group and other configurations.

## Create a TCP listener

- Frontend listening configuration:
	
  Click **Add** to create a listener: select TCP Protocol, configure listening port, idle connection timeout.

  ![NLB前端监听设置](../../../../image/Networking/NLB/NLB-022.png)

- Backend forwarding configuration:

  You may create new backend service or select an existing backend service. It shall be noted that only backend services of backend TCP type protocol can be selected.
	
  Create a new backend service here: configuring backend service name, protocol (TCP) and port 80, selecting weighted round robin as scheduling algorithm, enabling session persistence, and setting the connection draining timeout period.

  ![NLB后端转发设置](../../../../image/Networking/NLB/NLB-023.png)

- Configure health check

  Set related parameters of health check, wherein the TCP method is used here.

  ![NLB健康检查设置](../../../../image/Networking/NLB/NLB-029.png)

- Add server group:

  Select virtual server group, availability group according to business needs;

  ![NLB服务器组设置](../../../../image/Networking/NLB/NLB-030.png)

- Create virtual server group

  If there is no available virtual server group, click **Create New Virtual Server Group** to create a new virtual server group. VM and containers can be selected to define the port and weight of the instance **Note: only VM, container resources in the same virtual private cloud with load balancer can be selected**.

  ![NLB虚拟服务器组设置](../../../../image/Networking/NLB/NLB-079.png)

- So far, the listener based on the TCP Protocol has been created and can be viewed in the listener list.

  ![NLB监听器列表页](../../../../image/Networking/NLB/NLB-ML-Listenerlist.png)

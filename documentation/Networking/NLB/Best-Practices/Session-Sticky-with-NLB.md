# Deploy TCP listener policy supporting session persistence

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
	
  Here, create the new backend service: configure backend service name with Protocol (TCP) and port 80, weighted round robins as scheduling algorithm, and set the connection draining timeout period.

  ** In addition, pay special attention to enabling session persistence. The default time-out period of session persistence is 1,440s, during which all packets with same source and destination IP will be forwarded to the same backend server. When the session persistence duration is time out, it is not guaranteed that the packet will be forwarded to the same backend server.**

  ![NLB后端转发设置](../../../../image/Networking/NLB/NLB-023.png)

- Configure health check: set related parameters of health check, wherein the TCP method is used here.

  ![NLB健康检查设置](../../../../image/Networking/NLB/NLB-029.png)

- Add server group: Select virtual server group, availability group according to business needs.

  Select virtual server group, availability group according to business needs;

  ![NLB服务器组设置](../../../../image/Networking/NLB/NLB-030.png)

- Create a new server group:
  
  If there is no available virtual server group, click **Create New Virtual Server Group** to create a new virtual server group. VM and containers can be selected to define the port and weight of the instance **Note: only VM, container resources in the same virtual private cloud with load balancer can be selected**.

  ![NLB虚拟服务器组设置](../../../../image/Networking/NLB/NLB-079.png)

- So far, the listener based on the TCP Protocol has been created and can be viewed in the listener list.

  ![NLB监听器列表页](../../../../image/Networking/NLB/NLB-057.png)

# Modify and allocate a TCP listener policy supporting session persistence

## Modify backend service to support session persistence

- Backend service entered in load balancer instance

  From load balancer instance->specific instance name->backend service->edit
  
  ![NLB后端服务编辑](../../../../image/Networking/NLB/NLB-BackEditEntrance.png)

- Modify backend service configuration

  Find specific backend service name at the backend service, click “Edit” under “Actions” to enable session persistence function. The default time-out period is 1440s，which is the shortest guaranteed time of session persistence and during which time all packet with same source and destination IP will be forwarded to the same backend server no matter how NLB and backend service is elastically extended. When the session persistence duration is time out, it is not guaranteed that the packet will be forwarded to the same backend server.

  ![NLB会话保持修改](../../../../image/Networking/NLB/NLB-BackSessionSticky.png)



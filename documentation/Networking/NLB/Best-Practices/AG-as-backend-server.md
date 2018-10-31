# Use availability group as backend server

## Preparation and planning

- Network Preparation

  Plan for load balancer and region, availability zone, virtual private cloud, etc. of VM, containers as backend server in advance, according to business deployment needs.
Note: VM, containers as backend server need to be in the same region, virtual private cloud with load balancer.

- Server Preparation

  It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.

- Load Balancer Instance

  Create a load balancer instance, and set up the region, availability zone, network, security group and other configurations.

## Create an availability group

- Create instance template
   
   Enable the console, select elastic compute >> VM>> instance template, set the parameters required by  instance templates, and finally click **Create** to generate the instance template required by availability group
   
- Create availability group

   Enable the console, select elastic compute >> availability group, set the parameters such as region, availability zone, and instance template and finally click **OK** to create availability group

## Create a listener policy of TCP Protocol

Assume that you have created load balancer instance and availability group resource, and take TCP listener as an example to explain how to deploy availability group as backend server.

 - Create a TCP listener: click **Add** to create a listener: select TCP Protocol, configure port, idle connection timeout, and click **Next**;
 
![NLB前端监听设置](../../../../image/Networking/NLB/NLB-022.png)

- Create the new backend service: configure name, protocol (by default), port, scheduling algorithm, enable session persistence, configure connection draining timeout period, click **Next**;

![NLB后端转发设置](../../../../image/Networking/NLB/NLB-023.png)

- Configure health check parameters, click **Next**;

![NLB健康检查设置](../../../../image/Networking/NLB/NLB-029.png)

- Select server type as availability group, select and associate an availability group, and click **OK**.

![NLB服务器组设置](../../../../image/Networking/NLB/NLB-095.png)

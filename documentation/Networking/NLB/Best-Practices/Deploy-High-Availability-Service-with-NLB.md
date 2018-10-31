# Create high availability load balancer across availability zones

## Preparation and planning

- Network Preparation

  Plan for load balancer and region, availability zone, virtual private cloud, etc. of VM, containers as backend server in advance, according to business deployment needs.

- Server Preparation

  It is necessary to create VM and containers for carrying business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured. **Note: Only when the available zone of the load balancer instance is created, VM and containers under the availability zone can be configured as the backend service. For example, when the load balancer is in Availability Zone A, Availability Zone B, VM and containers in Availability Zone A, Availability Zone B can be configured to conduct traffic forwarding.**

	
## Create load balancer instance


#### 1. Open the load balancer resource list page through the console menu - load balancer, and click **Create** to create a new load balancer instance.

![NLB创建实例设置](../../../../image/Networking/NLB/NLB-Create.png)

#### 2. Select load balancer type: network load balancer should be selected.
 
 ![NLB类型选择](../../../../image/Networking/NLB/NLB-ChooseLB.png)

#### 3. Select the corresponding region: cn-north-1, Availability Zone: Availability Zone A, Availability Zone B.

![NLB选择地域设置](../../../../image/Networking/NLB/NLB-ChooseRegion.png)

#### 4. Select Virtual Private Cloud, Subnet, Associate EIP, and select Billing Method and Bandwidth.

![NLB网络设置](../../../../image/Networking/NLB/NLB-IP.png)

#### 5. Fill in Load Balancer Name and Description.

![NLB基本设置](../../../../image/Networking/NLB/NLB-Name.png)

#### 6. Confirm Configuration Information, Click **Buy Now**.

![NLB购买设置](../../../../image/Networking/NLB/NLB-BuyInfo.png)

#### 7. Confirm order information and complete payment, create a load balancer instance.

![NLB支付设置](../../../../image/Networking/NLB/NLB-BuyConfirm.png)

#### 8. Refresh load balancer list, view the newly created load balancer instance.

![NLB查看设置](../../../../image/Networking/NLB/NLB-List.png)

#### 9. Click **Add listener** on the right side of the list to open listener page.

![NLB监听设置](../../../../image/Networking/NLB/NLB-List-Add-Listener.png)

## Configure listening policy

#### 1. Create a TCP listener:

- Click **Create a Listener** to create a listener;

- Configure frontend listening: configure frontend listening protocol as TCP, Port 80;

- Idle connection timeout: set idle connection timeout time.

![NLB新建监听器设置](../../../../image/Networking/NLB/NLB-022.png)

#### 2. Backend forwarding configuration:

- Default backend service: create a new backend service or select an existing backend service;

- Backend service name: define backend service name;

- Backend Protocol: display the corresponding default protocol according to the Listening Protocol

- Port: define backend forwarding port;

- Scheduling algorithm: select according to business needs, and specify it as weighted round robin;

- Session persistence: enable/disable; the default time-out period is 1,440s，which is the shortest guaranteed time of session persistence and during which time all packet with same source and destination IP will be forwarded to the same backend server no matter how NLB and backend service is elastically extended. When the session persistence duration is time out, it is not guaranteed that the packet will be forwarded to the same backend server;

- Connection draining: set the connection draining timeout period. When a server is removed from the "virtual server group" or the availability group (AG), the connection draining timer is started. After that, only the established TCP connection packet will continue to be forwarded to the server until the connection draining time expires. So far, the newly established TCP connection will not be forwarded to the server;

![NLB后端转发设置](../../../../image/Networking/NLB/NLB-023.png)

- Health check: select health check method as: HTTP/TCP

![NLB健康检查设置](../../../../image/Networking/NLB/NLB-029.png)

#### 3. Add server group:

- Select virtual server group, availability group according to business needs;

![NLB添加服务器组设置](../../../../image/Networking/NLB/NLB-030.png)

- Add server to the virtual server group;

- If there is no available virtual server group, click “Create New Virtual Server Group” to create a new virtual server group. VM and containers can be selected to define the port and weight of the instance **Note: only VM and container resources with the same availability zone as that of the load balancer and in the virtual private cloud with may be selected**.

![NLB虚拟服务器组添加成员设置](../../../../image/Networking/NLB/NLB-079.png)

## Creation Completed

Thus, a load balancer HTTP listener configuration across the Availability Zones is completed. When A single Availability Zone (such as Availability Zone A) fails, the load balancer will forward the traffic to Availability Zone B to ensure the normal operation of business.
		

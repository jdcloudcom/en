# Implement business session persistence when the backend server is stable

Distributed network load balancer can only provide load balancer service for Layer 4 stateless business, and does not support session persistence. When the backend server is stable, the same source IP business request can be forwarded to the same backend server by configuring the listening policies scheduled by weighted source IPs, to meet the session persistence needs with the business source IP unchanged.

## Preparation and Planning

- Network Preparation

  According to business deployment needs, plan distributed network load balancers, and region, availability zone, virtual private cloud, etc. of VMs/containers as backend servers in advance.

      Note: VMs/containers as backend servers are required to belong to the same region and virtual private cloud as the distributed network load balancer.

- Server Preparation

  It is necessary to create VMs/containers for hosting business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.
  
- Load Balancer Instance

  Create a distributed network load balancer instance, and set the region, network and other configurations.
## Operation Steps
1. You can go to the listener list page with the following two methods on the distributed network load balancer list page.

   - Click the specified distributed network load balancer under the **Name** bar, and go to the details of the distributed network load balancer. Click the **Listener** tab and go to the listener list page.
   - Click the **Add Listening** link under the **Operation** bar and go to the listener list page.

2. Click the **Create Listener** button, and configure the listening protocol and port in the pop-up configuration wizard dialog box.

3. Click **Next** to go to the Backend Forwarding Setting tag. Select the default backend service type:

   - If there is no backend service under the distributed network load balancer or the existing backend service cannot meet the business needs, please select **Create Backend Service**.
   - If there is an existing backend service under the distributed network load balancer meeting the business needs, you can select **Select a Backend Service**, and the newly created listener will use the selected backend service with other listeners.

4. In this example, **Create Backend Service** is selected, and **Weighted Source IP** is selected for the backend service name, backend protocol and scheduling algorithm.

5. Click **Next** to go to the Health Check Configuration tag. In this example, default health check parameters are used, and the user can modify them as needed.

6. Click **Next** to go to the Add Server Group tag. Add a virtual server or availability group as the backend server.

7. Click the **OK** button to complete the operation of creating a listener.




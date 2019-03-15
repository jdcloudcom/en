# Use an availability group as a backend server
## Preparation and Planning
- Network Preparation

  According to business deployment needs, plan distributed network load balancers, and region, availability zone, virtual private cloud, etc. of VMs as backend servers in advance.
  
      Note: VMs as backend servers need to belong to the same region and virtual private cloud as the distributed network load balancer.
  
- Server Preparation

  It is necessary to create an availability group in which the VMs for hosting business traffic exist in advance, and security groups and ACL policies shall be properly configured.
  
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

4. In this example, **Create Backend Service** is selected, and the backend service name, backend protocol and scheduling algorithm are configured.

5. Click **Next** to go to the Health Check Configuration tag. In this example, default health check parameters are used, and the user can modify them as needed.

6. Click **Next** to go to the Add Server Group tag. Select the **Availability Group** as the server group, and select the specified availability group. Click the **OK** button to complete the operation. VMs in the availability group will be used as the backend server to provide service.

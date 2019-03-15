# Deploy service based on VMs and containers with distributed network load balancer

Distributed network load balancer supports VMs and containers as the backend server, and supports separate deployment and mixed deployment of two types of backend servers, providing more choices for user business deployment.
## Preparation and Planning

- Network Preparation

  According to your business deployment needs, plan for a load balancer, and region, availability zone, virtual private cloud, etc. of VMs/containers as backend servers in advance.
  
      Note: VMs/containers as backend servers are required to belong to the same region and virtual private cloud as the load balancer.
    
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
   
4. In this example, **Create Backend Service** is selected, and the backend service name, backend protocol and scheduling algorithm are configured.

5. Click **Next** to go to the Health Check Configuration tag. Configure the health check parameters. In this example, default health check parameters are used, and the user can modify them as needed.

6. Click **Next** to go to the Add Server Group tag. Select **Virtual Server Group**, click **Create Server Group**, and go to the virtual server list page.

7. Click **Create Virtual Server Group** button, and select the instance type to be added in the **Type** bar of the **Optional Instance** list, including all, VMs and containers. Click the **Add** button to add the selected instance to the selected instance list.

8. Configure the port number and weight of the selected instance. Click **OK** button to complete the operation of adding the virtual server group.

9. Return to the Add Server Group tag in the Create Listener configuration wizard, select the newly added virtual server group, and click the **OK** button to complete the operation.




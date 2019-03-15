# Quickly deploy multiple listeners based on the same business
If your business needs to support multiple listeners at the same time, you can reuse backend services for quick deployment. For example, if you can access, through different ports, services deployed with the backend server, you can create listeners for different port numbers that reuse the same backend service.
## Preparation and Planning
- Network Preparation

  According to business deployment needs, plan distributed network load balancers, and region, availability zone, virtual private cloud, etc. of VMs/containers as backend servers in advance.
  
      Note: VMs/containers as backend servers are required to belong to the same region and virtual private cloud as the load balancer.

- Server Preparation

  It is necessary to create VMs/containers for hosting business traffic in advance, and ensure that the ports needed for listening are opened, and that security groups and ACL policies are properly configured.
  
- Load Balancer Instance

  Create a distributed network load balancer instance, and set the region, network and other configurations.
  
## Operation Steps
### Create a listener
1. You can go to the listener list page with the following two methods on the distributed network load balancer list page.

  - Click the specified distributed network load balancer under the **Name** bar, and go to the details of the distributed network load balancer. Click the **Listener** tab and go to the listener list page.
  -  Click the **Add Listening** link under the **Operation** bar and go to the listener list page.

2. Click the **Create Listener** button, and configure the listening protocol and port in the pop-up configuration wizard dialog box.

3. Click **Next** to go to the Backend Forwarding Setting tag. Select **Create Backend Service** as the default backend service type. Configure the backend service name, backend protocol and scheduling algorithm.

4. Click **Next** to go to the Health Check Configuration tag. In this example, default health check parameters are used, and the user can modify them as needed.

5. Click **Next** to go to the Add Server Group tag. Add a virtual server or availability group as the backend server. Click the **OK** button to complete the operation of creating a listener.

6. View the created listener in the listener list, and associated newly created backend service can be viewed in the backend service list.

### Reuse the backend service to create another listener

1. Click the **Create Listener** button, and configure the listening protocol and port in the pop-up configuration wizard dialog box.

2. Click **Next** to go to the Backend Forwarding Setting tag. Select **Backend Service** as the default backend service type, and select the reused backend service name. The listener will reuse the specified backend service configuration, health check configuration and server group configuration.

3. Click **Next**, until the configuration is completed.

4. View the created listener in the listener list, and two listeners use the same backend service.

5. Repeat the above steps to quickly create multiple listeners that reuse the same backend service.

     Note: Please confirm that the business scenario can reuse all configurations of the backend services, such as the same backend forwarding port, etc.

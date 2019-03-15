# Listener Management
Listener management is used to guide you in creating a new listener and managing existing listeners.

 -  New Listener: The New Listener Guide will guide you on how to create a new listener. The guide includes four parts: Frontend listening configuration, backend forwarding configuration, health check configuration, and backend server group configuration.
 -  Manage Listeners: You can enable/disable, edit, delete, and perform other operations on the existing listeners.

## Operation Steps

### Step 1: Frontend Listening Configuration

 1. You can go to the listener list page with the following two methods on the distributed network load balancer list page.
 
   - Click the specified distributed network load balancer under the **Name** bar, and go to the details of the distributed network load balancer. Click the **Listener** tab and go to the listener list page.
   - Click the **Add Listening** link under the **Operation** bar and go to the listener list page.

 2. Click the **Create Listener**, and configure the listening protocol and port in the pop-up configuration wizard dialog box. Click **Next** to enter the Backend Forwarding Setting tab.
 
     Note:
     * Currently it only supports listening to the TCP protocol.
     * Listening ports cannot be repeated under the same DNLB.
     * Listening Protocol and ports cannot be allowed for modification after configuration.

### Step 2: Backend Forwarding Configuration
 
 1. Select the default backend service type:
 
   - If there is no backend service under the distributed network load balancer or the existing backend service cannot meet the business needs, please select **Create Backend Service**.
   - If there is an existing backend service under the distributed network load balancer meeting the business needs, you can select **Select a Backend Service**, and the newly created listener will use the selected backend service with other listeners.

 2. If you need to create backend service, configure backend service name, backend service protocol and other parameters.
 
| Parameter	| Description	| 
| :- | :- |
|Backend Service	|Protocol used by the backend server in service Because the frontend listening protocol only supports TCP, this parameter is displayed by default as TCP|
|Port	|A port used for receiving service requests by the backend server, with inputting range of 1-65,535. Different backend services can use the same port|
|Scheduling Algorithm|Algorithm for distributing service requests to backend servers by the Distributed Network Load Balancer, with the value range:<br><br>● **Weighted Source IP**: The hash algorithm made based on source IP Address distributes service requests of the same source IP to the same backend server, considers weights of backend servers and distributes service requests according to weight proportion<br><br>● **Weighted Quintuple Form**: The hash algorithm is made according to the Quintuple Form (protocol, source IP, source port, destination IP and target port), service requests in packets with in same Quintuple Form are distributed to the same backend server, weights of backend server are considered at the same time and service requests are distributed according to weight proportion. For example: When the cloud business is accessed via the NAT gateway by the Campus Network, the weighted Quintuple Form algorithm can be used for meeting the demand of undertaking business loads. In such case, all business requests in the Campus Network will not be distributed to the same backend server|

3. Click **Next** to go to the Health Check Configuration tag.

### Step 3: Health Check Configuration

1. Health check is enabled by default in the configuration guide and health check parameters can be configured. If you need to disable such function, please carry out the operation in the edition dialog box of backend service.
 
| Parameter	| Description	| 
| :- | :- |
|Health Check Method|Detection protocol for health check of backend server, only supporting TCP now|
|Check Port|Detection port for health check of backend server has inputting range varying from 1-65,535. The backend service port will be used by default if this parameter is not filled in|
|Response Time-out Period(s)|Maximum time-out period for health check response If no correct response is received from the backend service within specified time, the Distributed Network Load Balancer will determine the backend server as abnormal. The input range is 2-60s|
|Health Check interval(s)|Time interval for health check of backend server. The input range is 5-300s|
|Unhealthy Threshold|Failure number of continuous health check for the backend server which turns from the success status to the failure status. The input range is 1-5|
|Healthy Threshold|The number of consecutive health check successes from failure to success of the backend instance. The input range is 1-5|

2. Click **Next** to go to the configuration tag of backend server group.
 
### Step 4: Backend Server Group Configuration
1. Select a server group type: the virtual server group, the Availability Group, or add no server now.

   - Select the virtual server group: The system will automatically filter out the list of virtual server groups that can be associated now, if there is no available virtual server group, it may click **Create a New Virtual Server Group** to create one.
   - Select the Availability Group: The system will automatically filter out the availability groups that can be associated now, if there is no availability group, please go to the Availability Group page to create one.
   
         Note:
         * Backend instances in a server group must be under the same region and VPC of the Distributed Network Load Balancer.
         * Backend instances of the Availability Group do not support configuration weight and port number. All backend instances in the group have the same weight and the backend service port number is adopted.
         * The IP Address 169.254.169.110 is used as the source IP for health check of the Distributed Network Load Balancer. If such health check function is enabled, the backend server shall not shield this IP.

2. If creation of virtual server group is selected, the page will be automatically redirected to the list page of virtual server group. For creation of a new virtual server group, please refer to [Virtual Server Group Management](../Operation-Guide/TargetGroup-Management.md).

3. Select the newly created virtual server group name, click the **OK** to complete the operation of creating a listener.

### Manage Listeners

 1. View details: Click on the specified listeners under the **Listening Protocol: Port** bar and go to the details page to view its details.

 2. Enable/disable listeners: Click **Enable/Disable** under the **Operations** bar to enable or disable this listener.
 
 3. Edit listeners: Click **Edit** under the **Operations** bar to modify the backend service associated by the listener in the pop-up dialog box.
  
 4. Delete listeners: Click **Delete** under the **Operations** bar to delete the specified listeners.
 
 5. View backend service details: Click on the specified backend service under the **Default Backend Services** bar to view the details of the backend services associated to the listeners.
 
 6. View backend server information: Click the specified server group under the **Server Group**, and view the health status and other information of all backend servers in the group.

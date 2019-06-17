# Backend Service Management
Backend service management is used for giving instructions about creating a backend service and managing existing backend service.
 -  Create backend service: The created backend service guide will give instructions about creating a backend service. The guide includes three parts, including basic information configuration, health check configuration and backend server group configuration.
 -  Backend service management: You can make operations to existing backend services such as edition and deletion.
## Operation Steps
### Step 1: Basic Information Configuration
1. You can go to the backend service list page with the following two methods on the Distributed Network Load Balancer list page.

  - Click the specified distributed network load balancer under the **Name** bar, and go to the details of the distributed network load balancer. Click **Backend Service** tab to enter the backend service list page.
  -  Click the **Add Listening** link under the **Operation** bar and go to the listener list page. Click **Backend Service** tab to enter the backend service list page.
    
2. Click **Create Backend Service** and configure backend service name, backend service protocol and other parameters in a pop-up dialog box.

| Parameter	| Description	| 
| :- | :- |
|Backend Service	|Protocol used by the backend server in service TCP is displayed by default|
|Port	|A port used for receiving service requests by the backend server, with inputting range of 1-65,535. Different backend services can use the same port|
|Scheduling Algorithm|Algorithm for distributing service requests to backend servers by the Distributed Network Load Balancer, with the value range:<br><br>● **Weighted Source IP**: The hash algorithm made based on source IP Address distributes service requests of the same source IP to the same backend server, considers weights of backend servers and distributes service requests according to weight proportion<br><br>● **Weighted Quintuple Form**: The hash algorithm is made according to the Quintuple Form (protocol, source IP, source port, destination IP and target port), service requests in packets with in same Quintuple Form are distributed to the same backend server, weights of backend server are considered at the same time and service requests are distributed according to weight proportion. For example: When the cloud business is accessed via the NAT gateway by the Campus Network, the weighted Quintuple Form algorithm can be used for meeting the demand of undertaking business loads. In such case, all business requests in the Campus Network will not be distributed to the same backend server|

3. Click **Next** to go to the Health Check Configuration tag.

### Step 2: Configure Health Check

 1. Health check is enabled by default in the configuration guide and health check parameters can be configured. If you need to disable such function, please carry out the operation in the edition dialog box of backend service.
 
| Parameter	| Description	| 
| :- | :- |
|Health Check Method|Detection protocol for health check of backend server, only supporting TCP now|
|Check Port|Detection port for health check of backend server has inputting range varying from 1-65,535. The backend service port will be used by default if this parameter is not filled in|
|Response Time-out Period(s)|Maximum time-out period for health check response If no correct response is received from the backend service within specified time, the Distributed Network Load Balancer will determine the backend server as abnormal. The input range is 2-60s|
|Health Check interval(s)|Time interval for health check of backend server. The input range is 5-300s|
|Unhealthy Threshold|Failure number of continuous health check for the backend server which turns from the success status to the failure status. The input range is 1-5|
|Healthy Threshold|Success number of consecutive health check for the backend server which turns from the failure status to the success status. The input range is 1-5|

2. Click **Next** to go to the configuration tag of backend server group.
 
### Step 3: Backend Server Group
1. Select a server group type: the virtual server group, the Availability Group, or add no server now.

   - Select the virtual server group: The system will automatically filter out the list of virtual server groups that can be associated now, if there is no available virtual server group, it may click **Create a New Virtual Server Group** to create one.
   - Select the Availability Group: The system will automatically filter out the availability groups that can be associated now, if there is no availability group, please go to the Availability Group page to create one.
   
         Note:
         * Backend instances in a server group must be under the same region and VPC of the Distributed Network Load Balancer.
         * Backend instances of the Availability Group do not support configuration weight and port number. All backend instances in the group have the same weight and the backend service port number is adopted.
         * The IP Address 169.254.169.110 is used as the source IP for health check of the Distributed Network Load Balancer. If such health check function is enabled, the backend server shall not shield this IP.
        
2. If creation of virtual server group is selected, the page will be automatically redirected to the list page of virtual server group. For creation of a new virtual server group, please refer to [Virtual Server Group Management](../Operation-Guide/TargetGroup-Management.md).

3. Select the name of the newly-created virtual server group, click the **OK** to complete creation of backend service.

### Backend Service Management

 1. View backend service details: Click specified backend service under the **Name** bar and go to the detail page to view specific information.
 
 2. Change the associated server group: click **Change** under **Server Group** in the Details of Backend Service to change the server group associated with the backend service.
 
 3. Edit the backend service: Click **Edit** under the **Operation** bar and then the backend service information can be modified in the popped-up dialog box.
 
         Note:
         * The on/off status of health check can be modified in the backend service editing dialog box only. The Distributed Network Load Balancer can detect running status of backend server via the health check function. When any backend service failure is detected, traffic will not be distributed to the backend service, guarantee overall business availability. It is suggested that the health check function shall not be disabled.
         * Where the health check function is disabled, the health status of the backend server will be displayed as "N/A". In such case, traffic will be distributed to all "running" backend servers as per the scheduling algorithm by the Load Balancer.

 4. Delete backend service: click **Delete** under the **Operation** bar to delete specified backend service.
 
         Note:
         * Once being deleted, the backend service will be automatically disassociated with the associated server group.
         * The backend service associated with any listener cannot be deleted.
       
 5. View backend server information: Click the specified server group under the **Server Group** bar, and view the health status and other information of all backend servers in the group.



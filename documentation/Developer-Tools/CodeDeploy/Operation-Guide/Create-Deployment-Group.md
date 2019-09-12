## Create Deployment Groups in Application

There are options as below for creating deployment group in application:

- Deployment group name: Please fill in name of deployment group. In the same application, the deployment group name is unique
- Deployment type: Two deployment types are supported, namely "rolling deployment" and "blue and green deployment". See "Operation Guide-Deployment Type" for details
- Deployment target: Click **Select** and select Virtual Machines existed in this region in the popup; Three filter conditions for selection are supported: Availability Group, Tag and Condition. The union is taken among these three filter conditions.

    - Filter by Availability Group: Virtual Machines can be screened according to Availability Group. A maximum of 3 Availability Groups can be used
    - Filter by Tag: Support to screen multiple key-value pairs. Union is taken in the same key and intersection is taken among different keys. For specific logic, see the Tag Product Help Documentation for details. A maximum of 3 keys are supported here. Each key is corresponding to a maximum of 3 values
    - Filter by Condition: Support private IP fuzzy search
    
- JD Distributed Service Framework registration center: If you select **Yes** in the option **Use JD Distributed Service Framework**, then you need to specify an existing registration center. Please note that the Virtual Machines in the selected deployment targets and the registration center shall be under the same subnet
- Use Load Balancer: If the "Deployment Type" selects the "Rolling Deployment", then you can select "Use Load Balancer or Not"; if the Deployment Type selects the Blue and Green Deployment, then you must use Load Balancer
- Load Balancer instance: If in the "Use Load Balancer" option, you select "Yes", then you need to appoint an existed Load Balancer instance. Please note: If the Load Balancer is selected, then the Virtual Machines in the selected deployment target shall be in the same subnet with the Load Balancer instance
- Backend service of Load Balancer: If in the "Use Load Balancer or Not" option, you check "Yes", then you need to select the existed backend service of a specified Load Balancer instance.
- Concurrency: If "Rolling Deployment" is selected in the "Deployment Type", the concurrency deployment setting is supported. Two setting modes are supported, i.e. the setting based on percentage and the setting based on machine number. Taking the concurrency setting of 2 sets as example, the application deployment and the traffic routing are made via 2 machines when conducting the rolling deployment
- Failure threshold: If deployment of n or more sets failed, it indicates that the deployment task failed
- Senior option: For details, please refer to the "Operation Guide-Senior Options of Deployment Group"


![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Oper-5%EF%BC%88Ch%EF%BC%89.png)

After filling in the basic information of application and deployment group, please click **Create** to create the deployment group in the application.

It will redirect to the "Application Details" page after created.

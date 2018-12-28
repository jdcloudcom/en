## Edit Deployment Group

The following options are provided for edition of the following deployment group:

- Deployment target: Click **Select** and select Virtual Machines existed in this region in the popup. Three filter conditions for selection are supported: Availability Group, Tag and Condition. The union is taken among these three filter conditions. For details, please refer to "Operation Guide-Create Deployment Groups in Application". Please note that for the purpose of guaranteeing the business availability, the Virtual Machines taking over traffic cannot be deleted from the deployment target.
- Use Load Balancer: If the "Deployment Type" selects the "Rolling Deployment", then you can select "Use Load Balancer or Not"; if the Deployment Type selects the Blue and Green Deployment, then you must use Load Balancer
- Load Balancer instance: If in the "Use Load Balancer or Not" option, you select "Yes", then you need to appoint an existed Load Balancer instance. Please note: If the Load Balancer is selected, then the Virtual Machines in the selected deployment target shall be in the same subnet with the Load Balancer instance
- Backend service of Load Balancer: If in the "Use Load Balancer or Not" option, you check "Yes", then you need to select the existed backend service of a specified Load Balancer instance.
- Concurrency: If "Rolling Deployment" is selected in the "Deployment Type", the concurrency deployment setting is supported. Two setting modes are supported, i.e. the setting based on percentage and the setting based on machine number.
Taking the concurrency setting of 2 sets as example, the application deployment and the traffic routing are made via 2 machines when conducting the rolling deployment.
- Senior option: For details, please refer to the "Operation Guide-Senior Options of Deployment Group"


![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/operation10.png)

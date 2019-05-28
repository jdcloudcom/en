## Create Application and Deployment Group

On the "Application List" page, after appointing the region same as that of Virtual Machines, click **Create Application**,

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Start-2%EF%BC%88Ch%EF%BC%89.png)


redirect to the "New Application" page.

On the "New Application" page, first fill in the application information. Application name: codedeploy-app-demo01.

Use JD Distributed Service Framework: Please select **No** by default

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Start-3%EF%BC%88Ch%EF%BC%89.png)

Click **Create** to create the application.

Next, Create deployment groups in application.

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Start-4%EF%BC%88Ch%EF%BC%89.png)

There are options as below:

- Name of deployment group: Please fill in name of deployment group, group1
- Deployment type: Please select **Rolling Deployment
- Deployment target: Click **Select** and select Virtual Machines in the popup. Three filter conditions for selection are supported: Availability Group, Tag and Conditions. Please select the Virtual Machines created in the previous step here, namely the machine name is: codedeploy-demo01
- Use Load Balancer or not: No
- Concurrency: 100%
- Advanced option: Keep the default option. See Operation Guide for details

![Alt text](https://github.com/jdcloudcom/cn/blob/edit/image/CodeDeploy/Ch/Start-5%EF%BC%88Ch%EF%BC%89.png)

After filling in the basic information of deployment group, please click **Create** to create the deployment group in the application.

It will redirect to the "Application Details" page after created.

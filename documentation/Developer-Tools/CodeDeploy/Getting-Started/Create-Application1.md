## Create Application and Deployment Group

On the "Deployment Application" page, after appointing the region same as that of Virtual Machines, click **Create Application**,

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting5.png)


redirect to the "New Application" page.

On the "New Application" page, first fill in the application information. Application name: codedeploy-app-demo01

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/operation18.png)

Click **Create** to create the application.

Next, Create deployment groups in application.

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting10.png)

There are options as below:

- Name of deployment group: Please fill in name of deployment group, codedeploy-group-demo01
- Deployment type: Please select **Rolling Deployment
- Deployment target: Click **Select** and select Virtual Machines in the popup. Three filter conditions for selection are supported: Availability Group, Tag and IP. Please select the Virtual Machines created in the previous step here, namely the machine name is: codedeploy-demo01
- Use Load Balancer or not: No
- Concurrency: 100%
- Advanced option: Keep the default option. See Operation Guide for details

![Alt text](https://github.com/jdcloudcom/cn/blob/codedeploy/image/CodeDeploy/starting8.png)

After filling in the basic information of deployment group, please click **Create** to create the deployment group in the application.

It will redirect to the "Application" page after created.

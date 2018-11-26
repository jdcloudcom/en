# Configure online release

Release the compiled program packages to Virtual Machine.

**Operation steps**

1. Basic Settings

Select an application of the service tree on the left side, select menu “Continuous Delivery-Online Launch”, log in the “Basic Setting” page and click **Set**.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Starting12.png)


Set executing account and associate the application with the module(s).

- Executive Account: root
- Port: 9011
- Module: devops-demo/java-demo

Note: Compilation and construction are related to on-line release via modules. Only by associating them, program package version compiled by the module can be selected when on-line.

2. Group Settings

Click **Configuration** of a specified group on the [Group Setting] page to set configuration files and environmental variables for each group. 

Here, the example code does not require configuration.

3.Online

Select the group(s) to be online on the "online" page and set online concurrence and time-out period. Select package revision to be online for online release. On the “Online Dynamic” page, you can view online details and perform rollback operation.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Starting11.png)


Then, the basic online release is completed.

4. It supports Instance Management, including start, stop, restart program packages; expand and contract capacity; log service, etc.

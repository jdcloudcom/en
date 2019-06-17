# On-line Release

Support the deployment function for JD Cloud Virtual Machines, physical machines and other vendors’ virtual machines.

Click **Continuous Delivery** in the menu bar to log in the "On-line Release".

1. Basic Settings

Set an executing account (an account executing deployment task in the Virtual Machine), port, etc., and select a module.

[Module] Associate and compile the module compiled and constructed. The optional modules here are those compiled and constructed by the user under the application. Upon selecting the modules, corresponding package version shall be selected in the launching process for purpose of launching.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation19.png)

2. Group Settings

List all groups of applications. See Service Tree-Editing Group for newly-added/edited group information.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation20.png)

Support configuration operation for groups, including environment variables and configuration files.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation21.png)

Support load balancer configuration and scaling policy operation for groups supporting scaling.

a. Load Balancer

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation22.png)

- Load Balancer: Please select the load balancer instance added in the console after checking the accessed load balancer. The Virtual Private Cloud and availability zone of the selected load balancer instance shall be deployed in the same Virtual Private Cloud and availability zone of the deployed instance.
- Target group: Virtual server group created under load balancer instances
- Port: Port of deployed instance


b. Scaling Policy

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation23.png)

If automatic migration is started, used resources will be recycled, the Virtual Machine will be created again and program of current version will be deployed according to the migration policies by remaining the intranet ip unchanged.

3. On-line

Select the group(s) to be launched and set launch concurrency and time-out period. Select package revision to be on-line for on-line release. On the "On-line Dynamic" page, you can view on-line details and perform rollback operation.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation24.png)

4. Expansion

Grouping and Expansion

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation25.png)

5. Instance Management

It supports batch operations of restart, start, stop, enable or disable traffic, scaling (elastic deployment) for the instance dimension I.e. execute control files of code package. For writing specification of control file, please refer to "Compilation and Construction".

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation26.png)

6. Launch Dynamics

Show launch history and support view of deployment logs and rollback operation.

![Alt text](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation27.png)

7. Log Service

Query logs on site, subscribe logs, and view and download historic logs of subscribed logs. For log view, keyword highlighting, reverse query, whole word matching, etc. are supported. Click a log row and its context log also can be viewed.

- On-site Log: Via log files saved by the machine at present, specified log files of specified instances can be queried.
- Historic Log: For subscribed logs, please view subscribed groups and instance logs from the Historic Log page.
- Log Download: Subscribed logs can be downloaded to the local memory.
- Log Subscription: Select log subscription logs and provide log path to create log subscription. Any log subscribed will be saved in ES dedicated for containing logs.



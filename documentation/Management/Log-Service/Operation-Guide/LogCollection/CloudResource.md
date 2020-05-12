## Cloud Product Log Collection

The log collection for cloud product class is only currently supported. Cloud product class logs do not need to be installed with plug-ins. Simply specify the cloud product and the log type, and configure the instance and interface to be collected to complete the collection configuration.  

### Preconditions  
The cloud product requiring collecting logs is created or purchased at the Console.  

### Operation Steps
1. Log into to the JD Cloud Console, and click **Cloud Service** -> **Monitoring, Operation and Maintenance** -> **Log Service** to enter the Log Overview Page.

2. Click **Create Log Configuration** and enter the creation page.

3. Create a new log set and log subject and enter the log source setting page.

4. Please select the product (e.g. Application Security Gateway), the log type (e.g. security log), select **All Instances** or **Select Instances** as collected instances, click **Next** to complete the creation of log configuration.  
- All instances: Collect all instances of the user product, including automatically collect the follow-up newly increased instances.  
- Select instances: Select partial instances; you may collect the instances you are paying attention to. Up to 20 instances can be added.

![云产品日志](https://raw.githubusercontent.com/jdcloudcom/cn/zhangwenjie-only/image/LogService/LogCollection/cloudLog01.png)

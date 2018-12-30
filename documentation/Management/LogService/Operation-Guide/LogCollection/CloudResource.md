## Cloud Product Log Collection

&#160;&#160;&#160;&#160; the log collection for cloud product class is only currently supported. Cloud product class logs do not need to be installed with plug-ins. Simply specify the cloud product and the log type, and configure the instance and interface to be collected to complete the collection configuration.  

### Preconditions  
- Instance has been created for the cloud product to be collected.  
- The log collection and log subject have been created.

### Operation Steps
1. 	Enter the log collection management page, select the created log collection, click **View**, enter the log details page, select the collection configuration "unconfigured" status log subject, click **Collection Configuration** to enter the collection configuration page.

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogCollection/noConfig.png)

2. 	Click **Add Collection Configuration** to enter the adding collection configuration page.

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogCollection/addConfig.png)

3. 	Select the product (such as Application Security Gateway), log type (such as Web Security Log), select **All Instances** or **Select Instances** for the collection instance, and click **Save** to complete the settings of collection configuration.  
- All instances: Collect all instances of the user product, including automatically collect the follow-up newly increased instances.  
- Select instances: Select partial instances; you may collect the instances you are paying attention to. Up to 20 instances can be added.

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogCollection/configuration.png)

## Collection Configuration Management
### View Collection Instance
**Precondition Description**
- Collection configuration has been added under the log subject

**Operation Steps**
1.	 Log in JD Cloud console.
2. 	Click the navigation bar on the left side, select **Management->Log Service->Log Collection Management** to enter the log collection management page.
3. 	Select the log subject to be viewed, click the log subject name or **Collection Configuration** under the Management button to enter the collection configuration page of the log subject, and you can view the collection instance information configured by the log subject.
4. 	If the current log subject is configured to collect all instances, the page will be displayed as follows:

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogSetManagement/collectAll.png)

5. 	If the current log subject only collects partial instances, the page will be displayed as follows:

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogSetManagement/addCollectionConfig.png)

### Modify Collection Instance
**Modified to Select Partial Instances**  
&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;When the log subject is configured to collect all instances, it is supported to be modified to select partial instances.
1. 	Click **Modify** on the collection configuration page to enter the collection instance modification page. 
2. 	Switch to **Add Partial Instances**, select the instance you want to add, and click **OK**.

![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/LogSetManagement/editColletcionConfig.png)

**Partial Instance Management**  
&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;If it is currently configured to collect partial instances, it is supported to remove the added instances and add new instances.
1. 	On the Instance List page, select the instance you want to remove, click **Remove**, or select multiple instances, and click the batch **Remove**.
2. 	Click **Add Collection Instance** to enter the adding partial instances page. Support adding new collection instances, as well as modifying to collect "All Instances".

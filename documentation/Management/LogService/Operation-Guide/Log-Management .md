# Management

## Log Collection Management
### Create Log Collection   
&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Log collection, log subject, and collection instance under the log subject can be managed.  
**Precondition Description**  
- The quota of the log collection under the region to be created is sufficient

**Operation Steps**
1.	 Log in JD Cloud console.
2. 	Click the navigation bar on the left side, select **Management->Log Service->Log Collection Management** to enter the log collection management page.
3. 	Click **Create Log Collection** to enter the log collection creation page.
4. 	Set the log name, description and save time, click **OK**.
![](https://github.com/luolei-laurel/cn-1/blob/patch-1/image/LogService/cjrzj.png)

### Modify Log Collection
1.	 Log in JD Cloud console.
2. 	Click the navigation bar on the left side, select **Management->Log Service->Log Collection Management** to enter the log collection management page.
3. 	Select the log collection you want to modify and click **Modify** to enter the log collection modification page.
4. 	You can modify the description and save time of the log collection.
![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/editLogSet.png)

### Delete Log Collection

**Precondition Description**  
- The log subject under the log collection has been removed. If there is still a log subject under the current log collection, the Delete button is grayed out, and the mouse hovers notification "There is a log subject under the log collection, and deletion is not allowed".
![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/deleteLogSet_WithLogSet.png)

**Operation Steps**
1.	 Log in JD Cloud console.
2. 	Click the navigation bar on the left side, select **Management->Log Service->Log Collection Management** to enter the log collection management page.
3. 	Select the log collection you want to delete, click **Delete** to enter the log collection deletion confirmation notification page, click **OK** to delete.
![](https://raw.githubusercontent.com/luolei-laurel/cn-1/patch-1/image/LogService/deleteLogSet_NoLogSet.png)



### View Log Collection
1.	 Log in JD Cloud console.
2. 	Click the navigation bar on the left side, select **Management->Log Service->Log Collection Management** to enter the log collection management page.
3. 	In the log collection list, click the log collection name or **View** under operations to enter the log collection details page.
4. 	On the details page, you can view the basic information of the log collection and the log subjects that have been created under the log collection.

## Log Subject Management
### Add Log Subject
**Precondition Description**  
- Log Collection Created  
- The log subject quota under the current log collection is sufficient

**Operation Steps**
1.	 Log in JD Cloud console.
2. 	Click the navigation bar on the left side, select **Management->Log Service->Log Collection Management** to enter the log collection management page.
3. 	Select the log collection to add the log subject, click the log collection name or **"View** under operations to enter the log collection details page.
4. 	Click **Add Log Subject** to enter the adding log subject page.
5. 	Set the log subject name and description information, click **OK**.
6. 	Click **OK** on the pop-up collection configuration guide page to enter the adding collection configuration page; if you do not want to add any for now, click **Cancel**.

### Add Collection Configuration
**Operation Steps**
1. 	Select the log subject that has not added the collection configuration, and click **Collection Configuration** under Management to enter the collection configuration page.
2. 	Click **Add Collection Configuration** to enter the adding collection configuration page.
3. 	Select the product and log type of the log source.
4. 	Set the collection instance, you can select **All Instances** or **Select Instances** (add partial instances).
- Select **All Instances** is to collect all instances of the user product, including automatically collect the follow-up newly increased instances.
- Select "Select Instance" to implement log collection for the key instances or the instances you are paying attention to according to needs; up to 20 instances can be added.

## Collection Instance Management
### View Collection Instance
**Precondition Description**
- Collection configuration has been added under the log subject

**Operation Steps**
1.	 Log in JD Cloud console.
2. 	Click the navigation bar on the left side, select **Management->Log Service->Log Collection Management** to enter the log collection management page.
3. 	Select the log subject to be viewed, click the log subject name or **Collection Configuration** under the Management button to enter the collection configuration page of the log subject, and you can view the collection instance information configured by the log subject.
4. 	If the current log subject is configured to collect all instances, the page will be displayed as follows:
5. 	If the current log subject only collects partial instances, the page will be displayed as follows:

### Modify Collection Instance
**Modified to Select Partial Instances**  
&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;When the log subject is configured to collect all instances, it is supported to be modified to select partial instances.
1. 	Click **Modify** on the collection configuration page to enter the collection instance modification page. 
2. 	Switch to **Add Partial Instances**, select the instance you want to add, and click **OK**.

**Partial Instance Management**  
&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;If it is currently configured to collect partial instances, it is supported to remove the added instances and add new instances.
1. 	On the Instance List page, select the instance you want to remove, click **Remove**, or select multiple instances, and click the batch **Remove**.
2. 	Click **Add Collection Instance** to enter the adding partial instances page. Support adding new collection instances, as well as modifying to collect "All Instances".

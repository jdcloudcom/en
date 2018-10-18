# Stop Instance

If you need to suspend the instance service or as a precondition for other operations, such as rebuild, etc., you can stop the instance.

## Precondition

The instance must be in the "Running" status. If the instance is in the "Stopped" status, the instance has been stopped and no secondary operation is necessary. If the instance is in other unstable status, please wait for the pre-order operation to complete before stopping.
	
	Please note:
	* Stop operation will cause your business to be interrupted, please be cautious;
	* Data of local data disk will be cleared if the action is stopped;
	* After the trigger of stop operation, the instance will enter the "Stopping" status and the instance will not be able to perform other operations. When the stop is complete, the instance will enter the "Stopped" status.


## Operation Steps
1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. Select the instance you want to stop in the instance list and confirm that its status is "Running". If you need to operate multiple instances at the same time, you can complete through multiple selection.
4. Single Operation: Click **Operate** - **Stop**, or click the instance name to enter the details page and click **Operate** - **Stop**;
<br>Batch operation: Click **Stop** below the list
![](../../../../../image/vm/stopinstance.png)
5. In the "Stop Instance" pop-up window, confirm the information and click **OK** to submit the start.

When instance enters the "Stopping" status, instance shall not be able to perform other operations. When the stop is complete, the instance will enter the "Stopped" status.

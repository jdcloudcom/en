# Start Instance

If you need to put the stopped instance back into use, you can complete by starting the instance.

## Precondition

The instance must be in the "Stopped" status. If the instance is in the "Running" status, the instance has been started and no secondary operation is necessary. If the instance is in other unstable status, please wait for the pre-order operation to complete before starting the operation.
	
	Please note:
	* If the billing paid by configuration instance has been overdue or the monthly package billing instance has expired, the service will be stopped. At this time, the instance is in the "Stopped" status, and the start instance operation will fail.
	* After the start operation is triggered, the instance will enter the "Starting" status, and the instance will not be able to perform other operations. When the start is complete, the instance will enter the "Running" status.


## Operation Steps

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. Select the instance you want to start in the list of instances and confirm that its status is "Stopped". If you need to operate multiple instances at the same time, you can complete through multiple selection.
4. Single Operation: Click **Operate** - **Start**, or click the instance name to enter the details page and click **Operate** - **Start**;
<br>Batch Operation: Click **Start** below the list
![](../../../../../image/vm/startinstance.png)
5. In the "Start" pop-up window, confirm the information, and click OK to submit the start.

After that, the instance will enter the "Starting" status, the instance will not be able to perform other operations. When the start is complete, the instance will enter the "Running" status.

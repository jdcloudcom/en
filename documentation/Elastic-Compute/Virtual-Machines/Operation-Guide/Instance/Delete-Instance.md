# Delete Instance

If you no longer need these instances due to business changes, you can delete instances to save cost.

## Precondition

* The instance must be in the "stopped" status. If the instance is in the "Running" status, please operate [Stop Instance](Stop-Instance.md) first; if the instance is in other unstable status, please wait for the pre-order operation to complete before deleting the instance.
* For the monthly package instance, deletion is not allowed before expiration but only allowed after expiration;
	
		Please note:
		* After the deletion of instance, all data will be cleared and cannot be restored. Please back up the data in advance. For details, please refer to create private image and create cloud disk snapshot.
		* When an instance is deleted, the attached cloud disk will be executed according to the configured delete attributes. The associated elastic IP will continue to be retained. If you do not need to keep it, please go to the corresponding page to delete it in void of extra cost.

## Operation Steps
1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. Select the instance you want to delete from the instance list and confirm that its status is "Stopped". If you need to operate multiple instances at the same time, you can complete through multiple selection.
4. Single Operation: Click **Operate** - **More** - **Delete**, or click instance name to enter the details page and then click **Operate** - **Delete**.
<br>Batch Operation: Click **More** - **Delete** below the list
![](../../../../../image/vm/deleteinstance1.png)
5. In the "Delete Instance" pop-up window, confirm the information and click **OK** to submit the deletion. ![](../../../../../image/vm/deleteinstance2.png)

After that, the instance will enter the deleting status, please wait patiently for the deletion.

## Related Reference

[Stop Instance](Stop-Instance.md)

[Make Private Image](http://docs.jdcloud.com/cn/virtual-machines/create-private-image)

[Create Cloud Disk Snapshot](http://docs.jdcloud.com/cn/cloud-disk-service/create-clouddisk-snapshot)

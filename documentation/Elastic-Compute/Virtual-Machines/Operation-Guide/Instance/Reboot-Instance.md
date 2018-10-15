# Reboot Instance

If your instance has an unrecoverable fault, you can operate to reboot instance.

## Precondition

The instance must be in the "Running" status. If the instance is in the "Stopped" status, you only need to [Start Instance](Start-Instance.md); if the instance is in other unstable status, please wait for the pre-order operation to complete before restarting.
	
	Please note:
	* Reboot operation will cause your business to be interrupted, please be cautious;
	* After the reboot operation is triggered, the instance will enter the "Rebooting" status, and the instance will not be able to perform other operations. When the reboot is complete, the instance will enter the "Running" status.


## Operation Steps
1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page.
2. Select a region.
3. Select the instance you want to reboot from the instance list and confirm that its status is "Running". If you need to operate multiple instances at the same time, you can complete through multiple selection.
4. Single Operation: Click **Operate** - **More** - **Reboot**, or click instance name to enter the details page and click **Operate** - **More** - **Reboot**;<br>![](../../../../../image/vm/rebootinstance1.png)
<br>Batch Operation: Click **More** - **Start** below the list.
![](../../../../../image/vm/rebootinstance2.png)
5. In the "Reboot Instance" pop-up window, confirm information, and click **OK** to submit the start.

After that, the instance will enter the "Rebooting" status, and the instance will not be able to perform other operations. When the reboot is complete, the instance will enter the "Running" status.

## Related Reference

[Start Instance](Start-Instance.md)

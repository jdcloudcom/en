# Detach Cloud Disk
## Precondition
If you want to detach the system disk from an instance, the instance needs to be in the "Stopped" status.

## Operation Steps
### Detach Data Disk

The cloud disk is attached to the instance as a data disk by default. The detailed steps are as follows:

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select a region.
3. In the Instances list, select the instance from which the cloud disk is to be detached and click on the name to go to the details page.
4. Click **Disk** Tab, find the cloud disk to be detached and click **Detach**. ![](../../../../../image/vm/detachclouddisk.png)
5. In the secondary confirmation pop-up window, click **OK**.

In addition, you can also perform detaching operation from the cloud disk console. Refer to [Cloud Disk Side Detaching](http://docs.jdcloud.com/cn/cloud-disk-service/detach-cloud-disk) for detailed steps.

The attaching state of the cloud disk in the tab page will be changed into "Detaching". It takes some time to detach the cloud disk. Please wait patiently and refresh the page. After the detaching succeeds, the attaching state will be changed into "Detached". This state will remain for 15 minutes and the cloud disk under this state does not occupy the number of attached disks of the instance.

## Related Reference

[Cloud Disk Side Detaching](http://docs.jdcloud.com/cn/cloud-disk-service/detach-cloud-disk)
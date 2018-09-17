# Rebuild

You can restore instance to the system status that it was just created by rebuilding operation, which is a means of recovering when instance encounters a software failure. Also, if you want to replace the operating system in use with the endpoint type, you can complete by rebuilding. You can choose to reset the instance to Linux system or reinstall to Windows system.

It shall be noted that reinstalling the system will result in the loss of all contents of system disk, and the data of data disk will not be affected (but need to be re-identified). Therefore, in the case of the need to retain system operating data, it is strongly recommended that you [Create Private Image]() before rebuilding, and then select private image when rebuilding to achieve the retention of system operating data.

## Precondition

* The instance must be in "Stopped" status. If the instance is in the "Running" status, please run [Stop Instance](Stop-Instance.md) first; if the instance is in other unstable status, please wait for the pre-order operation to complete before resizing.
	
		Please note that ::
		* If instance is created based on private image and private image has been deleted, you cannot use original image to rebuild, that is, you cannot restore to the system status just created. It is recommended to keep private image referenced by instance;
		* You need to reassign password when rebuilding. For Linux system you can also reassign key pair;


## Operation Steps
1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) and enter the instance list page. Or access [JD Cloud Console](https://console.jdcloud.com) Click navigation bar on the left **Elastic Compute** - **Virtual Machines** to enter the instance list page.
2. Select Regions.
3. In the instance list, select the instance that needs rebuilding and confirm that its status is "Stopped".
4. Click **Operate** - **More** - **Rebuild**, or click instance name to enter the details page and click **Operate** - **Rebuild**.
![](../../../../../image/vm/rebuild1.png) ![](../../../../../image/vm/rebuild2.png)
5. In the "Rebuild" pop-up window, select the image used when you create instance by default which means you can restore to the system status at the time of creation. If you need to change to another image, click **Change Image** in the pop-up window to switch to the select image interface. You can select the image as needed![](../../../../../image/vm/rebuild4.png)<br>![](../../../../../image/vm/rebuild5.png)
6. Set a new login password and click **OK** to trigger rebuilding.

After that, the instance will enter the "Rebuilding" status. After the reset is completed, it will be restored to the "Stopped" status. After the "Start" instance is operated, the instance can be used normally.
## Related Reference

[Make Private Image]()


[Stop Instance](Stop-Instance.md)

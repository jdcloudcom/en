# View Local Data Disk

The local data disk will provide temporary bucket for instances. The local disk is a storage area divided from the local storage area of the physical machine where the instance is located. The local data disk is suitable for temporary data subject to frequent change and frequent access, such as cache or temporary data, etc., or the data synchronizing between instances of a group, such as the serving data of the load balancer backend server.

The local data disk number and the instance type family of single-disk capacity will vary with the instance specification. For the instance of the same specification, number of local data disk and single disk capacity shall not be adjusted.

	Note: the data of local data disk will be cleared as the instance is shut down.
	
To ensure that data of different data memories are stored in suitable disks, it needs to identify and distinguish the local data disk and the Cloud Disk Service within the system. The specific steps are as shown below.

## Action Steps

### Linux System

Taking the CentOS 7.4 system for example for Linux, action steps are as follows:

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) to log in the instance list page. Or, access [JD Cloud Console](https://console.jdcloud.com) and log in the instance list page by clicking **Elastic Compute**-**Virtual Machine** on the left navigation bar.
2. Select regions.
3. Select instances for view of local data disk in the instance list, [Linux Instance Login](https://docs.jdcloud.com/cn/virtual-machines/connect-to-linux-instance).
4. Enter:
```ll /dev/disk/by-id```
	
5. virtio-Ephemeral\_Disk\_1 to virtio-Ephemeral\_Disk\_4 are the four corresponding local data disks, as shown below <br>! [](../../../../../image/vm/localdatadisklinux.png)

### Windows System

Taking the standard edition of Windows, Windows 2008, for example, the action steps are as follows:

1. Access [Virtual Machines Console](https://cns-console.jdcloud.com/host/compute/list) to log in the instance list page. Or, access [JD Cloud Console](https://console.jdcloud.com) and log in the instance list page by clicking **Elastic Compute**-**Virtual Machine** on the left navigation bar.
2. Select regions.
3. Select instances for view of local data disk in the instance list, [Windows Instance Login](https://docs.jdcloud.com/cn/virtual-machines/connect-to-windows-instance)。
4. Enter:
```wmic
diskdrive get PNPDeviceID,SerialNumber
```
	
5. Ephemeral\_Disk\_1 to Ephemeral\_Disk\_4 are the four corresponding local data disks, as shown below <br>! [](../../../../../image/vm/localdatadiskwin.png)

## Related References

[Log in Linux Instance](https://docs.jdcloud.com/cn/virtual-machines/connect-to-linux-instance)

[Log in Windows Instance](https://docs.jdcloud.com/cn/virtual-machines/connect-to-windows-instance)

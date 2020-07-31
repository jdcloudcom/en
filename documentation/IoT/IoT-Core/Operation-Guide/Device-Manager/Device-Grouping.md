# Device Group

Different groups of devices can be processed in batches via the Device Group.

## Add new group

1. Log in the IoT Management Platform
2. Select **Device Management Center** -> **Device Group** on the left navigation bar.**
3. **Create a new group page** will show by default. You can also click **Add Group** to enter the page

![新建分组](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Grouping/Create-Device-Group.png)

Select Parent Group (support at most levels), fill in group name and group description and click Create.

## Edit Group

Click the group name to be edited, and enter the group's edit page to display the basic information and the device list of the group.

### Basic Information

Display the group name, group level, creation time, total number of devices under the group, number of devices currently online in the group, group description, etc. that can be edited and saved.

![编辑分组](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Grouping/Edit-Device-Group.png)

### Device list

Add a device to the current group or delete a device.

**Add device**

Select a group, click **Add Device**, check the device to be added, and click **Add**.
![添加设备1](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Grouping/Device-Group-Add-Device.png)

![添加设备2](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Grouping/Device-Group-Add-Device2.png)

- Note: The list of devices that can be added to a device group under the second level must be a subset of the devices that have been added to the parent level. If no devices have been added to the parent level, then no devices can be added to the group.

**Device Deletion**

Devices can be deleted individually or in batches.

![删除设备](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Grouping/Device-Group-Delete-Device2.png)

**Delete devices in batches**

Check the device to be deleted and click **Delete in Batches**.

![批量删除设备](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Grouping/Device-Group-Delete-Device1.png)

## Delete group

Click the **Delete** button of the group to be deleted, and then click **Delete** on the confirmation dialog box for deletion.

![删除分组](../../../../../image/IoT/IoT-Core/Device-Manager/Device-Grouping/Delete-Device-Group.png)
# Create cloud disk snapshot

<br>

##  Operation instructions

Snapshot is a data backup method provided by JD Cloud. Snapshot reserves all the data on the cloud disk before a specified time point without occupying the user’s storage space.



- The quota for snapshots of a single user under the same region is 15 blocks;



- To ensure the completeness of data, please stop writing the cloud disk before creating snapshot, in order to guarantee the completeness of snapshot data;



- Before creating snapshot, you are suggested to detach the cloud disk and attach it to the virtual machine again after creating snapshot;



- The life cycle of manual snapshot is independent from the cloud disk, please delete unnecessary snapshots in time;



- The time required for creating snapshot depends on the size of cloud disk capacity. The larger the cloud disk capacity is, the longer the time is;

<br>

##  Operation guide

### Method 1: Create snapshot in the cloud disk list page

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Enter into the cloud disk list page of JD Cloud console, select the cloud disk requiring snapshot creation, click the [Create Snapshot] button in Actions, enter snapshot name, description, click [OK] in the snapshot creation window popped up, and start to create snapshot.

3. If snapshot creation is completed, the relevant information will be updated.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/Create-CloudDisk-SnapShot/create-snapshot-001.jpg)
<br>
### Method 2: Create snapshot on the cloud disk details


1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Find the to be cloud disk requiring snapshot creation after access to the cloud disk list page and click the corresponding name of the cloud disk to jump to its details;

3. Click the [Actions]-[Create Snapshot] button at the top right corner, and the snapshot creation window pops up;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/Create-CloudDisk-SnapShot/create-snapshot-002.jpg)

4. Enter snapshot name and description, click [OK] and start to create snapshot for the cloud disk;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/Create-CloudDisk-SnapShot/create-snapshot-003.jpg)

5. If snapshot creation is completed, the relevant information will be updated.





	

	




	
	



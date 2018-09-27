# Create Cloud Disk Snapshot

<br>

##  Operation Instructions

Snapshot is a data backup method provided by JD Cloud. Snapshot reserves all the data on the Cloud Disk Service before a specified time point without occupying the user’s storage space.



- The quota for snapshots of a single user under the same region is 15 blocks;



- To ensure the completeness of data, please stop writing the Cloud Disk Service before creating snapshot, in order to guarantee the completeness of snapshot data;



- Before creating snapshot, you are suggested to detach the cloud disk and attach it to the Virtual Machines again after creating snapshot;



- The life cycle of manual snapshot is independent from the Cloud Disk Service, please delete unnecessary snapshots in time;



- The time required for creating snapshot depends on the size of Cloud Disk Service capacity. The larger the cloud disk capacity is, the longer the time is;

<br>

##  Operation guide

### Method 1: Create snapshot in the Cloud Disk Service list page

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Enter into the Cloud Disk Service list page of JD Cloud console, select the Cloud Disk Service requiring snapshot creation, click the **Create Snapshot** button in Actions, enter snapshot name, description, click **OK** in the snapshot creation window popped up, and start to create snapshot.

3. If snapshot creation is completed, the relevant information will be updated.

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/Create-CloudDisk-SnapShot/create-snapshot-001.jpg)
<br>
### Method 2: Create snapshot on the Cloud Disk Service details


1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Find the to be Cloud Disk Service requiring snapshot creation after access to the Cloud Disk Service list page and click the corresponding name of the Cloud Disk Service to jump to its details;

3. Click the **Actions**-**Create Snapshot** button at the top right corner, and the snapshot creation window pops up;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/Create-CloudDisk-SnapShot/create-snapshot-002.jpg)

4. Enter snapshot name and description, click **OK** and start to create snapshot for the Cloud Disk Service;

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/Create-CloudDisk-SnapShot/create-snapshot-003.jpg)

5. If snapshot creation is completed, the relevant information will be updated.





	

	




	
	



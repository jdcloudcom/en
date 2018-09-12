# Create cloud disk

<br>

##  Operation instructions


- You can create cloud disk and attach it to any virtual machine in the same region or the same availability zone.



- A single virtual machine can attach 8 cloud disks at most.



- Each SSD Cloud Disk supports a maximum of 1000G capacity; each Premium Hdd Cloud Disk supports a maximum of 3000G capacity;



- If you need to retain the historical data of a cloud disk in the new hard disk, you can use snapshot of a cloud disk to create a new disk. Please refer to [Create Disk from Snapshot](https://www.jdcloud.com/help/detail/891/isCatalog/1);



- Turn on cloud disk of paying by configuration; please ensure your account balance is not less than RMB 50.

<br>

##  Operation guide

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Click [Create] button on top of the cloud disk list and begin process of cloud disk creation;

3. Select billing type of cloud disk, namely monthly package or pay by configuration;

4. Select the region and availability zone for the hard disk;

5. Select the cloud disk type and capacity;

Note: Cloud disk must be attached to a virtual machine in the same availability zone and cannot be attached in cross-regions and cross-availability zones;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-001.jpg)

<br>

6. Enter name and description of the cloud disk;

Note: you may also click [[Create Disk from Snapshot](https://www.jdcloud.com/help/detail/891/isCatalog/1)] on the cloud disk creation page to create new cloud disk from snapshot;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-002.png)

<br>

7. Monthly package users should select the purchase duration and the count; pay by configuration users only need to select the purchase duration;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-003.png)

<br>


8. After confirming the correctness of the selected configuration, click [Buy Now] to go to the order confirmation page. If the billing type of monthly package is selected, after checking the resources information on the order confirmation page, click "to Pay” to go to the payment confirmation page; resource creation will be immediately triggered upon successful payment. If the billing type of pay by configuration is selected, resource creation will be immediately triggered upon clicking "Confirm Setup” on the order confirmation page.

9. After successful payment, go to the console to view the created cloud disk.

**Notes**:



- Cloud disk can be freely attached and detached among any virtual machine in the same region or availability zone;



- A maximum of 10 cloud disks can be created in a time;


## Next



- **Linux**

For Linux system, after purchasing cloud disk, you need to see and use it in the system until you attach, partition and format it.

1. For attaching data disk, please refer to [Attach Cloud Disk](https://www.jdcloud.com/help/detail/505/isCatalog/1). <br>

2. For partition formatting and attaching new partition of attached disk, please refer to [Linux Partitioning, Formatting and Creating File System](https://www.jdcloud.com/help/detail/515/isCatalog/1).




- **Windows**

For Windows system, after purchasing cloud disk, you need to use it until you attach and format it.

1. For attaching data disk, please refer to [Attach Cloud Disk](https://www.jdcloud.com/help/detail/505/isCatalog/1). <br>

2. For formatting of attached disk, please refer to [Windows Partitioning, Formatting and Creating File System](https://www.jdcloud.com/help/detail/514/isCatalog/1).

	

	




	
	



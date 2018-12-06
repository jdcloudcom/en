# Create Cloud Disk

<br>

##  Operation Instructions


- You can createCloud Disk Service and attach it to any Virtual Machines in the same region or the same availability zone.



- A single Virtual Machines can attach 8 Cloud Disk Services at most.



- Each SSD Cloud Disk supports a maximum of 1000G capacity; each Premium Hdd Cloud Disk supports a maximum of 3000G capacity;



- If you need to retain the historical data of a Cloud Disk Service in the new hard disk, you can use snapshot of a Cloud Disk Service to create a new disk. Please refer to [Create Disk from Snapshot](https://docs.jdcloud.com/cn/cloud-disk-service/create-disk-by-snapshot);



- Turn on cloud disk of paying by configuration; please ensure your account balance is not less than RMB 50.

<br>

##  Operation guide

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Click **Create** on top of the Cloud Disk Service list and begin process of cloud disk creation;

3. Select billing type of Cloud Disk Service, namely monthly package or pay by configuration;

4. Select the region and availability zone for the hard disk;

5. Select the Cloud Disk Service type and capacity;

Note: Cloud Disk Service must be attached to a Virtual Machines in the same availability zone and cannot be attached in cross-regions and cross-availability zones;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-001.jpg)

<br>

6. Enter name and description of the Cloud Disk Service;

Note: you may also click [[Create Disk from Snapshot](https://docs.jdcloud.com/cn/cloud-disk-service/create-disk-by-snapshot)] on the Cloud Disk Service creation page to create new Cloud Disk Service from snapshot;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-002.png)

<br>

7. Monthly package users should select the purchase duration and the count; pay by configuration users only need to select the purchase duration;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-003.png)

<br>


8. After confirming the correctness of the selected configuration, click **Buy Now** to go to the order confirmation page. If the billing type of monthly package is selected, after checking the resources information on the order confirmation page, click **to Pay** to go to the payment confirmation page; resource creation will be immediately triggered upon successful payment. If the billing type of pay by configuration is selected, resource creation will be immediately triggered upon clicking **Confirm Setup** on the order confirmation page.

9. After successful payment, go to the console to view the created cloud disk.

**Notes**:



- Cloud Disk Service can be freely attached and detached among any Virtual Machines in the same region or availability zone;



- A maximum of 10 Cloud Disk Services can be created in a time;


## Next



- **Linux**

For Linux system, after purchasing Cloud Disk Service, you need to see and use it in the system until you attach, partition and format it.

1. For attaching data disk, please refer to [Attach Cloud Disk](https://docs.jdcloud.com/cn/cloud-disk-service/attach-cloud-disk). <br>

2. For partition formatting and attaching new partition of attached disk, please refer to [Linux Partitioning, Formatting and Creating File System](https://docs.jdcloud.com/cn/cloud-disk-service/linux-partition).




- **Windows**

For Windows system, after purchasing cloud disk, you need to use it until you attach and format it.

1. For attaching data disk, please refer to [Attach Cloud Disk](https://docs.jdcloud.com/cn/cloud-disk-service/attach-cloud-disk). <br>

2. For formatting of attached disk, please refer to [Windows Partitioning, Formatting and Creating File System](https://docs.jdcloud.com/cn/cloud-disk-service/windows-partition).

	

	




	
	



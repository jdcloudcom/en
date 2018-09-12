# Create disk from snapshot

<br>

##  Operation instructions

You can create cloud disk from snapshot and attach it to any of the virtual machines in the same region or the same availability zone. A cloud disk created from snapshot retains all data of the snapshot in its original status; after attaching this cloud disk created from snapshot to a virtual machine, you can perform read-write actions to all data retained by snapshot.

- To guarantee availability of data, the minimum selectable capacity of the new cloud disk is same as the snapshot capacity;



- Each SSD Cloud Disk supports a maximum of 1000G capacity; each Premium Hdd Cloud Disk supports a maximum of 3000G capacity;



- For cloud disk created based on snapshot, it requires a process where the object storage restores data to cloud disk, so it takes more time than creating a new hard disk, please wait patiently.



<br>

##  Operation guide

**Note**: You should have created snapshot for cloud disk in current region

**Method 1: You can create a cloud disk page and directly select [Create Disk from Snapshot]:**

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Click [Create] button on the cloud disk list page to jump to the cloud disk creation page and begin process of cloud disk creation;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-004.png)

<br>

3. Select billing type of cloud disk, namely monthly package or pay by configuration;

4. Click [Create Disk from Snapshot] in basic information bar;

5. On the pop-up [Create Disk from Snapshot], select the required snapshot and then click [OK];

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-005.png)

<br>

6. Select the cloud disk capacity;

**Note**:

1) Create a cloud disk with the same type and capacity size of snapshot source disk by default and the hard disk type cannot be modified;

2) The capacity size of the new hard disk can be modified and its minimum capacity is same as that of snapshot whilst its maximum capacity is limited by the type of hard disk;


<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-006.jpg)

<br>

7. Monthly package users should select the purchase duration and the count; pay by configuration users only need to select the purchase duration;

8. After confirming the correctness of the selected configuration, click [Buy Now] to go to the order confirmation page. If the billing type of monthly package is selected, after checking the resources information on the order confirmation page, click "to Pay” to go to the payment confirmation page; resource creation will be immediately triggered upon successful payment. If the billing type of pay by configuration is selected, resource creation will be immediately triggered upon clicking "Instant Account Setup” on the order confirmation page.

9. After successful payment, go to the console to view the created cloud disk.

**Method 2: You can also directly select a snapshot in the cloud disk snapshot list page to go to the create disk from snapshot page:**

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk Snapshot];

2. Click the cloud disk snapshot requiring its data in the cloud disk snapshot list and then click [create disk from snapshot] button on the right side to access the process of creating disk from snapshot;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-007.png)

<br>


3. Select the billing type, specification, quantity and other configurations for the new cloud disk; confirm the correctness and then click [Buy Now]; after payment, go to the console to view the created cloud disk;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-008.jpg)

<br>

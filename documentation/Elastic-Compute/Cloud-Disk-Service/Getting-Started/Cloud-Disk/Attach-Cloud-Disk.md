# Attach Cloud Disk Service

<br>

##  Operation Instructions

You can attach Cloud Disk Service to any Virtual Machines in the same region or the same availability zone. Before attaching cloud disk, please be aware of the below notes:



- Virtual Machines must be in running or stopping status;



- Only Cloud Disk Service in available status can be attached;



- Resources are not in arrearage status;



- A single virtual machine can attach 8 Cloud Disk Services at most;



- Cloud Disk Service can only be attached to a virtual machine in the same region or the same availability zone;



- Cloud Disk Service cannot be attached in cross-regions and cross-availability zones;



- Ordinary cloud disk service can only be attached to one virtual machine at the same time other than being supported to multiple virtual machines.

- Multi-point attached disk can be attached to 16 cloud instances at the same time.

- Directly attaching multi-point attached disk to multiple cloud instances cannot implement file sharing function, if files are needed to be shared among multiple cloud instances, sharing file system or cluster management system are needed to be set up.



<br>

##  Operation guide
<br>

**You can select to attach cloud disk on the Cloud Disk Service list page or Cloud Disk Service details, or select to attach cloud disk on the Virtual Machines details**:



- If you need to attach several disks to an assigned Virtual Machines, you can refer to **Method 1** or **Method 2** as below;



- If you need to attach Cloud Disk Service to an assignedVirtual Machines, you can refer to **Method 3**as below.

<br>

## Method 1: Attach Cloud Disk Service on the Cloud Disk Service list page

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Select the Cloud Disk Service to be attached and click **Attach** on the right side;


<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-009.png)

<br>

3. When [Attach to a Virtual Machines] list page pops up, select the Virtual Machines to be attached to with Cloud Disk Service, and click **OK** button;
<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-010.jpg)

<br>

4. If attachment succeeds, the relevant information changes; if attachment fails, the tooltip is shown. If attachment fails for several times, please contact customer service.

Note: After disk attachment succeeds, you need to log in Virtual Machines and format the attached disk as well as attach it to a new partition. See **Next** at the bottom of the page. 

## Method 2: Attach cloud disk on the Cloud Disk Service details

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Select the Cloud Disk Service to be attached on the Cloud Disk Service list page and click the corresponding name of the Cloud Disk Service in the Cloud Disk Service list to jump to its details;

3. Click the **Operation** icon at the top right corner; when the list of more operation options is shown, click **Attach**;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-011.jpg)

<br>

4. When [Attach to a Virtual Machines] list page pops up, select the Virtual Machines to be attached to with Cloud Disk Service, and click **OK** button.

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-012.jpg)

<br>

5. If attaching succeeds, the relevant information changes; if attaching fails, the tooltip is shown. If attaching fails for several times, please contact customer service personnel.

Note: After disk attachment succeeds, you need to log in Virtual Machines and format the attached disk as well as attach it to a new partition. See Next at the bottom of the page.

**Method 3: Attach Cloud Disk Service on Virtual Machines details.**

1. Open [JD Cloud Console](https://console.jdcloud.com/), select **Elastic Compute**-**Virtual Machines**-**Instance**;

2. Find the virtual machine to be attached to with Cloud Disk Service on virtual machine list page, and click the Virtual Machines name to jump to its details;

3. Select **Cloud Disk Service**-**Attach**, and **Attach to a  Virtual Machines** list page pops up; select a Cloud Disk Service, and click **OK** button to trigger cloud disk attaching process;  

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-013.jpg)

<br> 

4. If attaching succeeds, the relevant information changes; if attaching fails, the tooltip is shown. If attaching fails for several times, please contact customer service personnel.

Note: After disk attachment succeeds, you need to log in Virtual Machines and format the attached disk as well as attach it to a new partition. See **Next** at the bottom of the page.

## Next

**Linux**

After disk attaching succeeds, you need to log in the instance to partition and format the attached disk, as well as attach it to a new partitioning. For detailed operation steps, please refer to [Linux partitioning, formatting and creating file system](https://docs.jdcloud.com/cn/cloud-disk-service/linux-partition).

**Windows**

After disk attaching succeeds, you need to log in the instance to partition and format the attached disk, as well as attach it to a new partitioning. For detailed operation steps, please refer to [Windows partitioning, formatting and creating file system](https://docs.jdcloud.com/cn/cloud-disk-service/windows-partition). 

<br>

##  Operation Guide of Multi-point Attached Disk
**Attach multi-point attached disk** on Cloud Disk Service List page or Cloud Disk Service Details page:

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Cloud Disk Service]-[Hard Disk Instance];

2. Select the multi-point attached disk to be attached and click [Attach] button on the right side;

3. When [Attach to a Cloud Instance] list page pops up, select the cloud instance to be attached to with cloud disk, and click [OK] button; batch attachment is not supported currently;

4. If attachment succeeds, relevant information will be updated; if attachment fails, the tooltip is shown. If attachment fails for several times, please contact customer service.

5. Multi-point attached disk can attach 16 cloud instances at most;

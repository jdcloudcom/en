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



- Cloud Disk Service can only be attached to a virtual machine at the same time and cannot be attached multiple Virtual Machines.



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

After disk attaching succeeds, you need to log in the instance to partition and format the attached disk, as well as attach it to a new partitioning. For detailed operation steps, please refer to [Linux partitioning, formatting and creating file system](https://www.jdcloud.com/help/detail/515/isCatalog/1).

**Windows**

After disk attaching succeeds, you need to log in the instance to partition and format the attached disk, as well as attach it to a new partitioning. For detailed operation steps, please refer to [Windows partitioning, formatting and creating file system](https://www.jdcloud.com/help/detail/515/isCatalog/1). 

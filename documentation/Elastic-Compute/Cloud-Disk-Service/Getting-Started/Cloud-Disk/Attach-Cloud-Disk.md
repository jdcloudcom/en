# Attach cloud disk

<br>

##  Operation instructions

You can attach cloud disk to any virtual machine in the same region or the same availability zone. Before attaching cloud disk, please be aware of the below notes:



- Virtual machine must be in running or stopping status;



- Only cloud disk in available status can be attached;



- Resources are not in arrearage status;



- A single virtual machine can attach 8 cloud disks at most;



- Cloud disk can only be attached to a virtual machine in the same region or the same availability zone;



- Cloud disk cannot be attached in cross-regions and cross-availability zones;



- Cloud disk can only be attached to a virtual machine at the same time and cannot be attached multiple virtual machines.



<br>

##  Operation guide
<br>

**You can select to attach cloud disk on the cloud disk list page or cloud disk details, or select to attach cloud disk on the virtual machine details**:



- If you need to attach several disks to an assigned virtual machine, you can refer to **Method 1** or **Method 2** as below;



- If you need to attach cloud disk to an assigned virtual machine, you can refer to **Method 3**as below.

<br>

## Method 1: Attach cloud disk on the cloud disk list page

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Select the cloud disk to be attached and click [Attach] button on the right side;


<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-009.png)

<br>

3. When [Attach to a VM] list page pops up, select the virtual machine to be attached to with cloud disk, and click [OK] button;
<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-010.jpg)

<br>

4. If attachment succeeds, the relevant information changes; if attachment fails, the tooltip is shown. If attachment fails for several times, please contact customer service.

Note: After disk attachment succeeds, you need to log in virtual machine and format the attached disk as well as attach it to a new partition. See **Next** at the bottom of the page. 

## Method 2: Attach cloud disk on the cloud disk details

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Select the cloud disk to be attached on the cloud disk list page and click the corresponding name of the cloud disk in the cloud disk list to jump to its details;

3. Click the [Operation] icon at the top right corner; when the list of more operation options is shown, click [Attach];

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-011.jpg)

<br>

4. When [Attach to a VM] list page pops up, select the virtual machine to be attached to with cloud disk, and click [OK] button.

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-012.jpg)

<br>

5. If attaching succeeds, the relevant information changes; if attaching fails, the tooltip is shown. If attaching fails for several times, please contact customer service personnel.

Note: After disk attachment succeeds, you need to log in virtual machine and format the attached disk as well as attach it to a new partition. See Next at the bottom of the page.

**Method 3: Attach cloud disk on virtual machine details.**

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Instance];

2. Find the virtual machine to be attached to with cloud disk on virtual machine list page, and click the virtual machine name to jump to its details;

3. Select [Cloud Disk]-[Attach], and [Attach to a VM] list page pops up; select a cloud disk, and click [OK] button to trigger cloud disk attaching process;  

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-013.jpg)

<br> 

4. If attaching succeeds, the relevant information changes; if attaching fails, the tooltip is shown. If attaching fails for several times, please contact customer service personnel.

Note: After disk attachment succeeds, you need to log in virtual machine and format the attached disk as well as attach it to a new partition. See **Next** at the bottom of the page.

## Next

**Linux**

After disk attaching succeeds, you need to log in the instance to partition and format the attached disk, as well as attach it to a new partitioning. For detailed operation steps, please refer to [Linux partitioning, formatting and creating file system](https://www.jdcloud.com/help/detail/515/isCatalog/1).

**Windows**

After disk attaching succeeds, you need to log in the instance to partition and format the attached disk, as well as attach it to a new partitioning. For detailed operation steps, please refer to [Windows partitioning, formatting and creating file system](https://www.jdcloud.com/help/detail/515/isCatalog/1). 

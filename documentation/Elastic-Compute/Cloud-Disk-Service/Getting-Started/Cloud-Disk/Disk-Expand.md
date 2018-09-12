# Cloud disk capacity upgrade

Cloud disk is an extensible storage device on cloud. After the creation of cloud disk, when current capacity of cloud disk cannot meet the storage demand of current system along with the business needs growing, you can extend its size at any time to expand its storage capacity and retain original data in cloud disk at the same time. To guarantee the availability of expanded space of cloud disk, you not only need to extend the size of cloud disk capacity but also its file system to guarantee the availability of newly added cloud disk space.

<br>

##  Expansion notes:

### Before expansion



- Only cloud disk in available status supports expansion.



- It is recommended to create a cloud disk snapshot to back up the data before cloud disk expansion.



- If cloud disk is executing action of creating a snapshot, expansion is not allowed at the moment.



- Only cloud disk of billing type monthly package supports expansion currently; cloud disk of billing type pay by configuration does not support expansion temporarily.



- For cloud disk attached to instance, you need to detach it from the instance and then execute expansion.

### After expansion

- Only expansion of cloud disk capacity is done and no expansion of file system is done.

- For cloud disk that the expansion takes effect, the newly added cloud disk space can be seen only when the user manually format the newly extended storage space; see [Cloud Disk Expansion Overview](https://www.jdcloud.com/help/detail/1636/isCatalog/1) for specific operation method.

<br>

##  Operation guide


1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Find the cloud disk requiring capacity upgrade on the cloud disk list page and click the corresponding name of the cloud disk in the cloud disk list to jump to its details;

3. Click top right corner [Actions]-[Upgrade Capacity] to access [Upgrade Capacity] window;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-014.jpg)

<br>


4. Select or directly enter the capacity value after upgrade and click [OK] to complete the payment then access the console to view the cloud disk capacity after expansion;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-015.jpg)

<br>

5. If expansion succeeds, the relevant information is updated; if expansion fails, the tooltip is shown. If expansion fails for several times, please contact customer service.

# Cloud Disk Service Capacity Upgrade

Cloud Disk Service is an extensible storage device on cloud. After the creation of cloud disk, when current capacity of cloud disk cannot meet the storage demand of current system along with the business needs growing, you can extend its size at any time to expand its storage capacity and retain original data in cloud disk at the same time. To guarantee the availability of expanded space of cloud disk, you not only need to extend the size of cloud disk capacity but also its file system to guarantee the availability of newly added cloud disk space.

<br>

##  Expansion notes:

### Before expansion



- Only Cloud Disk Service in available status supports expansion.



- It is recommended to create a cloud disk snapshot to back up the data before Cloud Disk Service expansion.



- If Cloud Disk Service is executing action of creating a snapshot, expansion is not allowed at the moment.



- Only Cloud Disk Service billing type monthly package supports expansion currently; Cloud Disk Service of billing type pay by configuration does not support expansion temporarily.



- For Cloud Disk Service attached to instance, you need to detach it from the instance and then execute expansion.

### After expansion

- Only expansion of Cloud Disk Service capacity is done and no expansion of file system is done.

- For Cloud Disk Service that the expansion takes effect, the newly added Cloud Disk Service space can be seen only when the user manually format the newly extended storage space; see [Cloud Disk Service Expansion Overview](https://docs.jdcloud.com/cn/cloud-disk-service/cloud-disk-expansion-overview) for specific operation method.

<br>

##  Operation guide


1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Find the Cloud Disk Service requiring capacity upgrade on the Cloud Disk Service list page and click the corresponding name of the Cloud Disk Service in the Cloud Disk Service list to jump to its details;

3. Click top right corner **Actions**-**Upgrade Capacity** to access **Upgrade Capacity** window;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-014.jpg)

<br>


4. Select or directly enter the capacity value after upgrade and click [OK] to complete the payment then access the console to view the Cloud Disk Service capacity after expansion;

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-015.jpg)

<br>

5. If expansion succeeds, the relevant information is updated; if expansion fails, the tooltip is shown. If expansion fails for several times, please contact customer service.

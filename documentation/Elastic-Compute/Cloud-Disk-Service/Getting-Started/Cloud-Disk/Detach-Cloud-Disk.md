# Detach cloud disk

<br>

##  Operation Instructions

You can detach any Cloud Disk Service attached to a Virtual Machines.

Before detaching actions, please be aware of the below notes:



- To guarantee completeness of data, it is recommended that you should suspend the read-write actions to Cloud Disk Service, or it may lead to loss of part of the uncompleted read-write data;



- In Linux operating system, you need to log in Virtual Machines to take umount actions to Cloud Disk Service; in Windows operating system, you need to log in virtual machine to take off-line actions to cloud disk; after the command is executed successfully, log in console to detach the cloud disk;


<br>

##  Operation guide
<br>

**You can select to detach cloud disk on the Cloud Disk Service list page or Cloud Disk Service details.**

**Method 1: Detach cloud disk on the Cloud Disk Service list page**

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Access the cloud disk list page and select the cloud disk to be detached; click **Detach** ; a window asking for confirming detachment pops up; click **OK** to confirm to detach cloud disk;

3. If detachment succeeds, the relevant information is updated; if detachment fails, the tooltip is shown. If detachment fails for several times, please contact customer service.

**Method 2: Detach cloud disk on the Cloud Disk Service list page**

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machines]-[Cloud Disk Service];

2. Click the name of Cloud Disk Service needs to be detached and access the Cloud Disk Service details;

3. Click the **Actions** icon at top right corner and a list of more action options is shown; click **Detach** and a window for confirming the detach pops up; click **OK** to confirm to detach the cloud disk;

4. If detachment succeeds, the relevant information is updated; if detachment fails, the tooltip is shown. If detachment fails for several times, please contact customer service.

<br>
<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-016.jpg)

<br>

**You can select to detach cloud disk on the Virtual Machines details**.

1. Open [JD Cloud Console](https://console.jdcloud.com/), select **Elastic Compute**-**Virtual Machines**-**Instance**;

2. Find the Virtual Machines needs to detach cloud disk on Virtual Machines list page and click the Virtual Machines name to jump to its details;

3. Select **Cloud Disk Service** Tab page and click **Detach**; a window for confirming detachment pops up; click **OK** to confirm to detach cloud disk.

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-017.png)

<br>

4. If detachment succeeds, the relevant information is updated; if detachment fails, the tooltip is shown. If detachment fails for several times, please contact customer service.


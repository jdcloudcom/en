# Detach cloud disk

<br>

##  Operation instructions

You can detach any cloud disk attached to a VM.

Before detaching actions, please be aware of the below notes:



- To guarantee completeness of data, it is recommended that you should suspend the read-write actions to cloud disk, or it may lead to loss of part of the uncompleted read-write data;



- In Linux operating system, you need to log in virtual machine to take umount actions to cloud disk; in Windows operating system, you need to log in virtual machine to take off-line actions to cloud disk; after the command is executed successfully, log in console to detach the cloud disk;


<br>

##  Operation guide
<br>

**You can select to detach cloud disk on the cloud disk list page or cloud disk details.**

**Method 1: Detach cloud disk on the cloud disk list page**

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Access the cloud disk list page and select the cloud disk to be detached; click [Detach] button; a window asking for confirming detachment pops up; click [OK] to confirm to detach cloud disk;

3. If detachment succeeds, the relevant information is updated; if detachment fails, the tooltip is shown. If detachment fails for several times, please contact customer service.

**Method 2: Detach cloud disk on the cloud disk list page**

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Cloud Disk];

2. Click the name of cloud disk needs to be detached and access the cloud disk details;

3. Click the [Actions] icon at top right corner and a list of more action options is shown; click [Detach] and a window for confirming the detach pops up; click [OK] to confirm to detach the cloud disk;

4. If detachment succeeds, the relevant information is updated; if detachment fails, the tooltip is shown. If detachment fails for several times, please contact customer service.

<br>
<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-016.jpg)

<br>

**You can select to detach cloud disk on the virtual machine details**.

1. Open [JD Cloud Console](https://console.jdcloud.com/), select [Elastic Compute]-[Virtual Machine]-[Instance];

2. Find the virtual machine needs to detach cloud disk on virtual machine list page and click the virtual machine name to jump to its details;

3. Select [Cloud Disk] Tab page and click [Detach]; a window for confirming detachment pops up; click [OK] to confirm to detach cloud disk.

<br>

![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/CloudDisk/cloud-disk/cloud-disk-017.png)

<br>

4. If detachment succeeds, the relevant information is updated; if detachment fails, the tooltip is shown. If detachment fails for several times, please contact customer service.


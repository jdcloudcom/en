# Storage Overview
The instance of JD Cloud provides different types of combinable data storage devices. Storage devices of different types and capacities have different performance and price, which are applicable to different customer scenarios. According to different dimensions, they can be divided into the following categories:
<table>
   <tr>
      <td> Dimension  </td>
      <td> Classification  </td>
      <td> Description  </td>
   </tr>
   <tr>
      <td rowspan="2"> Storage Medium  </td>
      <td>  Mechanical Hard Disk </td>
      <td> The data is stored on a mechanical hard disk. The cost performance is high and the read-write speed is excellent. </td>
   </tr>
   <tr>
      <td> SSD  </td>
      <td> The data is stored on a solid state disk (SSD). Its IOPS and read-write speed are excellent, both higher than those of a mechanical hard disk, and its price is higher than that of a mechanical hard disk. </td>
   </tr>
   <tr>
      <td rowspan="2"> Customer Scenario   </td>
      <td> System Disk   </td>
      <td> The system for storage control, coordination of instances, and support of application development and operation is to be operated by using the mirror image.  </td>
   </tr>
   <tr>
      <td> Data Disk  </td>
      <td> Used to store user data. </td>
   </tr>
   <tr>
      <td rowspan="2"> Architectural Pattern   </td>
      <td> Local Disk     </td>
      <td> A local disk is a storage region divided from the local storage region of the physical machine where the instance is located. It can obtain a shorter access delay as it is in the same physical machine as the instance, but there is also a risk of data single-point fault.     </td>
   </tr>
   <tr>
      <td>Cloud Disk  </td>
      <td> The cloud disk is an elastic data block storage with high availability and high reliability. The data in the cloud disk is stored in the form of a triple real-time copy to avoid data unavailability caused by component fault. The capacity of the cloud disk can be flexibly expanded, and you can expand the data storage space at a low price in a few minutes and achieve persistent storage of data.     </td>
   </tr> 
</table>

## Classification according to Architectural Pattern

### Local Disk
The local disk is in the same physical machine as the instance. A smaller data access delay can be obtained by using the instance of the local disk. The life cycle of the local disk is the same as that of the instance, and the stored data will be lost as the instance is deleted.

### Cloud Disk
The cloud disk is a data block storage device with a triple copy architecture, which makes it highly available.

JD Cloud provides two types of cloud disks for different storage media, namely premium Hdd cloud disk and SSD cloud disk. Currently, the available cloud disk can be used as a data disk of an instance, and its life cycle is independent of the instance. It can be purchased with the instance or purchased separately after the instance is created and then attached to the instance. It also can be detached from the current instance and then attached to other instances.

In addition, it can support the creation of multi-point attaching cloud disk. For details, refer to [Multi-point Attaching Cloud Disk](#user-content-Multi-point-Attached-Cloud-Disk).

You can create a snapshot of the cloud disk to keep a backup copy of the data, and create a new cloud disk from the snapshot at any time and connect it to another instance. For more information of the cloud disk, please refer to [Cloud Disk Product Documentation of JD Cloud](../../../CloudDisk/Introduction/What-Is-CloudDisk.md).

## Classification according to Storage Purpose

### System Disk
The instance supports the use of local disk and cloud disk as its system disks.

If a local disk is used as the system disk, a less data access delay can be obtained and a capacity of 40GB is given as a present. The expansion of the system disk is unavailable.

If a cloud disk is used as the system disk, higher data reliability can be obtained. A capacity of 40GB~500GB can be configured and the expansion after detaching is available.

### Data Disk
The instance supports the use of two types of cloud disks as its data disks, namely premium Hdd cloud disk and SSD cloud disk. At most four data disks can be attached to each instance. To adjust this quota, you need to submit the [Open Ticket][1] application. For more information, please refer to [Cloud Disk Product Documentation of JD Cloud](../../../CloudDisk/Introduction/What-Is-CloudDisk.md).

## Block Storage Device Mapping
Each instance has a system disk to ensure basic operating data, and you can also attach more data disks to the instance. For details, please refer to [Attach Cloud Disk](Attach-Cloud-Disk.md). The instance uses the block storage device mapping to map these storage devices to locations that can be recognized by it.

Block storage is a storage device that is partitioned in bytes and supports random access. JD Cloud supports two types of block storage devices:

* System Disk (Local Disk or Cloud Disk)
* Data Disk (Cloud Disk)
![](../../../../../image/vm/Operation-Guide-CD-overview.png)

This figure shows how to map a block storage device onto an instance. /dev/vda is mapped onto the system disk, and the two data disks are respectively mapped onto /dev/vdb and /dev/vdc. The device names in different operating systems may be different, which is subject to the display in the instance system.
The instance automatically creates a block storage device mapping for the local disk and cloud disk attached to it.

## Multi-point Attaching Cloud Disk

Multi-point attaching cloud disk is a data block storage device that supports concurrent read-write access of multiple instances. It has multiple concurrence, high performance, high reliability and other features, and supports high-availability architectural scenarios such as Oracle RAC commonly used by government and enterprises in financial, and other industries. A single shared block can be attached to up to 16 instances at the same time.

The multi-point attaching cloud disk can only be used as a data disk, and temporarily, creation with the instance is not supported. It needs to be created separately. Please refer to [Create Cloud Disk](). If the disk cannot be set to be deleted on instance termination, when the instance to which the disk is attached is deleted, the multi-point attaching cloud disk will remain.

When it is attached onto an instance, it shares the quota for attachable cloud disks of a single instance with a non-multi-point attaching cloud disk, namely, at most 8 cloud disks can be attached onto an instance.


## Related Reference
[Cloud Disk Product Documentation of JD Cloud](../../../CloudDisk/Introduction/What-Is-CloudDisk.md)

[Create Cloud Disk]()

[Attach Cloud Disk](Attach-Cloud-Disk.md)


  [1]: https://ticket.jdcloud.com/myorder/submit
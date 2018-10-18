# Storage Overview
The instance of JD Cloud provides different types and combinable data storage devices. Storage devices of different types and capacities have different performance and price, which are applicable to different scenarios. According to different dimensions, they can be divided into the following categories:
<table>
   <tr>
      <td> Dimension  </td>
      <td> Classification  </td>
      <td> Description  </td>
   </tr>
   <tr>
      <td rowspan="2"> Storage Medium  </td>
      <td>  HDD </td>
      <td> The data is stored on a HDD. The cost performance is high and the read-write speed is excellent. </td>
   </tr>
   <tr>
      <td> SSD  </td>
      <td> The data is stored on a solid state disk (SSD). Its IOPS and read-write speed are excellent, both higher than those of a HDD, and its price is higher than that of a HDD. </td>
   </tr>
   <tr>
      <td rowspan="2"> Customer Scenario   </td>
      <td> System Disk   </td>
      <td> The system for storage control, coordination of instances, and support of application development and operation is to be operated by using the image.  </td>
   </tr>
   <tr>
      <td> Data Disk  </td>
      <td> Used to store user data. </td>
   </tr>
   <tr>
      <td rowspan="2"> Architectural Pattern   </td>
      <td> Local Disk     </td>
      <td> A local disk is a storage space divided from the local storage device of the physical machine where the instance is located. It can obtain a shorter access delay as it is in the same physical machine as the instance, but there is also a risk of data single-point fault. Data of Local data disk will be cleared as the instance is shutdown. If your application architecture cannot implement data reliability, it is recommended that you should use Cloud Disk Service to store the important data.</td>
   </tr>
   <tr>
      <td>Cloud Disk  </td>
      <td> The cloud disk is an elastic data block storage with high availability and high reliability. The data in the cloud disk is stored in the form of a triple real-time copy to avoid data unavailability caused by component fault. The capacity of the cloud disk can be flexibly expanded, and you can expand the data storage space at a low price in a few minutes and achieve persistent storage of data.     </td>
   </tr> 
</table>

## Classification according to Architectural Pattern

### Local Disk
The local disk and the instance are in the same physical machine. Instances using the local disk have shorter data access delay. The life cycle of local disk is same as that of instance. Local system disk data will be lost on instance termination while local data disk data will be lost on instance shutdown. If your application architecture cannot implement data reliability, it is recommended that you should use Cloud Disk Service to store the important data.

### Cloud Disk
The cloud disk is a data block storage device with a triple copy architecture, which makes it highly available.

JD Cloud provides two types of cloud disks according to storage media, namely Premium Hdd cloud disk and SSD cloud disk. Currently, the cloud disk can be used as a data disk of an instance, and its life cycle is independent of the instance. It can be purchased with the instance or purchased separately after the instance is created and then attached to the instance. It also can be detached from the current instance and then attached to other instances.

In addition, it can support the creation of multi-point attaching cloud disk. For details, refer to [Multi-point Attaching Cloud Disk](Strorage-Overview#user-content-1).

You can create a snapshot of the cloud disk to keep a backup of the data, and create a new cloud disk from the snapshot at any time and attach it to another instance. For more information of the cloud disk, please refer to [Cloud Disk Product Documentation of JD Cloud](http://docs.jdcloud.com/cn/cloud-disk-service/product-overview).

## Category according to Purpose

### System Disk

The instance supports the use of local disk and cloud disk as its system disks.

If a local disk is used as the system disk, a shorter data access delay can be obtained and a capacity of 40GB is given for free. The capacity expansion of the system disk is unavailable.

If a cloud disk is used as the system disk, higher data reliability can be obtained. A capacity of 40GB~500GB can be configured and the capacity expansion after detaching is available.

### Data Disk

The instances support the use of local disk and the Cloud Disk Service as the data disk. Where,

**The local disk is only provided by the GPU virtual machine at present, and the data will be cleared at the time of shutting down the virtual machine. It is not suggested to save important data here.

**Cloud Disk Service** supports Premium Hdd Cloud Disk and SSD Cloud Disk. Each instance can attach a maximum of four data disks. In case of adjustment to this quota, please go to [open ticket][1] for application. Please refer to [JD Cloud Disk Service Documentation](http://docs.jdcloud.com/cn/cloud-disk-service/product-overview) for more information.

## Block Storage Device Mapping
Each instance has a system disk for operating system, and you can also attach more data disks to the instance. For details, please refer to [Attach Cloud Disk](Attach-Cloud-Disk.md). The instance uses the block storage device mapping to map these storage devices to locations that can be recognized by itself.

Block storage is a storage device that is partitioned in bytes and supports random access. JD Cloud supports two types of block storage devices:

* System Disk (Local Disk or Cloud Disk)
* Data Disk (Cloud Disk)
![](../../../../../image/vm/Operation-Guide-CD-overview.png)

This figure shows how to map a block storage device onto an instance. /dev/vda is mapped onto the system disk, and the two data disks are respectively mapped onto /dev/vdb and /dev/vdc. The device names in different operating systems may be different, which is subject to the display in the instance system.
The instance automatically creates a block storage device mapping for the local disk and cloud disk attached to it.
<div id="user-content-1"></div>
## multi-attachment Cloud Disk

The multi-attachment cloud disk is a data block storage device that supports concurrent read-write access of multiple instances. It has multiple concurrence, high performance, high reliability and other features, and supports high-availability architectural scenarios such as Oracle RAC commonly used by government and enterprises in financial, and other industries. A single multi-attachment cloud disk can be attached to up to 16 instances at the same time.

The multi-attachment cloud disk can only be used as a data disk, and temporarily, creation with the instance is not supported. It needs to be created separately. Please refer to [Create Cloud Disk](http://docs.jdcloud.com/cn/virtual-machines/create-cloud-disk). Deletion of the attributes with the instance is not supported, when the instance to which the disk is attached is deleted, the multi-attachment cloud disk will remain.

When it is attached to an instance, it shares the quota of attachable cloud disks for a single instance with non-multi-attachment cloud disks, namely, at most 8 cloud disks can be attached onto an instance.


## Related Reference
[Cloud Disk Product Documentation of JD Cloud](http://docs.jdcloud.com/cn/cloud-disk-service/product-overview)

[Create Cloud Disk](http://docs.jdcloud.com/cn/virtual-machines/create-cloud-disk)

[Attach Cloud Disk](Attach-Cloud-Disk.md)


  [1]: https://ticket.jdcloud.com/myorder/submit

# Storage Type

## System Disk

It supports to use the local disk or cloud disk as system disk.

For local disk, you can't select the capacity and a capacity of 40GB is given for free; it is created along with the VMs and its life cycle is the same as that of the instance, that is, it starts or ends with the instance life cycle. The local disk is a storage area divided from the local storage area of the physical machine where the instance is located. If the local disk and the instance are arranged on the same physical machine, the access delay is short, but there is single point failure risk of data.

For cloud disks, general SSD Cloud Disk, performance-oriented SSD Cloud Disk and capacity-oriented HDD Cloud Disk are supported, capability can be designated among 40GB~500GB. For a Pay By Configuration billing cloud disk which is a non-multi-point attached disk, you may designate its deletion on instance termination attribute; if they are configured as deletion on instance termination, this disk will be deleted while deleting the instance. For a Monthly Package disk or a multi-point attached disk, this attribute will not take effect and the disk will be reserved while deleting the instance.

## Data Disk

The instances support the use of local disk and the Cloud Disk Service as the data disk. Where,

**The local disk** is only provided by the GPU virtual machine at present, and the data will be cleared at the time of shutting down the virtual machine. It is not suggested to save important data here.

**Cloud Disk Service** provides two storage options, SSD cloud disk and Premium Hdd cloud disk, to satisfy business scenarios with different performance requirements.

### Local Disk
The local disk is a storage area divided from the local storage area of the physical machine where the instance is located. If the local disk and the instance are arranged on the same physical machine, the access delay is short, but there is single point failure risk of data. The local data disk is suitable for temporary data in memory and cache. Data in the local data disk will be cleared as the instance is shut down. If your application architecture cannot implement data reliability, it is recommended that you should use Cloud Disk Service to store the important data. For identification of local data disk in the system, please see [View Local Data Disk](https://docs.jdcloud.com/en/virtual-machines/identify-local-data-disk).
### General Type SSD Cloud Disk

* Capacity of a Single Disk: 20-16,000GB
* Maximum IOPS of a single disk: 15,000
* Maximum throughput of a single disk: 150MBps
* Data reliability: 99.9999999%

Other Typical Application Scenarios:

* Applicable to boot volumes, small databases, large-scale development tests, web servers, and other scenarios;
* Applicable to the business scenarios that require random read-write.

### Performance-oriented SSD Cloud Disk

* Capacity of a Single Disk: 20-16,000GB
* Maximum IOPS of a single disk: 32,000, settable.
* Maximum throughput of a single disk: 150MBps
* Data reliability: 99.9999999%

Application Scenarios:

* Applicable to the deployment scenarios of MySQL, SQLServer, Oracle and other databases;
* Applicable to I/O intensive core business scenario with high requirements for data reliability.

### Capacity-oriented HDD Cloud Disk

* Capacity of a Single Disk: 20-16,000GB
* Maximum IOPS of a single disk: 500
* Maximum throughput of a single disk: 80MBps
* Data reliability: 99.9999999%

Application Scenarios:

* Applicable to the I/O scenarios that do not have high requirements for read-write rate, the best choice for high quality and low price;
* Applicable to web servers, large capacity, and applications that process fewer transactions;
* Applicable to large file sequential read-write, cold data backup and other archiving storage.



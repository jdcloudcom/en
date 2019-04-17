# Storage Type

## System Disk

It supports to use the local disk or cloud disk as system disk.

For local disk, you can't select the capacity and a capacity of 40GB is given for free; it is created along with the VMs and its life cycle is the same as that of the instance, that is, it starts or ends with the instance life cycle.

For cloud disks, general SSD Cloud Disk, performance-oriented SSD Cloud Disk, capacity-oriented HDD Cloud Disk, SSD Cloud Disk and Premium Hdd Cloud Disk (where the first three are only provided in cn-east-2 region and the latter two are only provided in cn-north-1, cn-east-1 and cn-south-1 regions) are supported; capability can be designated among 40GB~500GB. For a Pay By Configuration billing cloud disk which is a non-multi-point attached disk, you may designate its deletion on instance termination attribute; if they are configured as deletion on instance termination, this disk will be deleted while deleting the instance. For a Monthly Package disk or a multi-point attached disk, this attribute will not take effect and the disk will be reserved while deleting the instance.

## Data Disk

The instances support the use of local disk and the Cloud Disk Service as the data disk. Where,

**The local disk is only provided by the GPU virtual machine at present, and the data will be cleared at the time of shutting down the virtual machine. It is not suggested to save important data here.

**Cloud Disk Service** provides two storage options, SSD cloud disk and Premium Hdd cloud disk, to satisfy business scenarios with different performance requirements.

### Local Disk
The local disk is a storage area divided from the local storage area of the physical machine where the instance is located. If the local disk and the instance are arranged on the same physical machine, the access delay is short, but there is single point failure risk of data. The local data disk is suitable for temporary data in memory and cache. Data in the local data disk will be cleared as the instance is shut down. If your application architecture cannot implement data reliability, it is recommended that you should use Cloud Disk Service to store the important data. For identification of local data disk in the system, please see [View Local Data Disk](https://docs.jdcloud.com/en/virtual-machines/identify-local-data-disk).

### SSD Cloud Disk
The SSD cloud disk utilizes a distributed multi-copy mechanism to provide stable high-performance storage with high random I/O and high data reliability. The specific indicators are as follows:

* Single Disk Capacity: 20-1000G
* Maximum IOPS of A Single Disk: 20000
* Maximum Throughput of A Single Disk: 300MBps
* Data Reliability: 99.9999999%

SSD cloud disk, with stable high random I/O performance and high data reliability, is applicable to the following scenarios:
	
* Big data analysis, I/O intensive business, medium and large database applications
* Medium and large development and test environment with high requirements for data reliability.

### Premium Hdd Cloud Disk
The Premium Hdd cloud disk uses a mechanical disk as a storage medium and has the following features:

* Single Disk Capacity: 20-3000G
* Maximum IOPS of A Single Disk: 500
* Maximum Throughput of A Single Disk: 80MBps
* Data Reliability: 99.9999999%

Typical Application Scenarios:

* Small and medium databases, large development tests, web servers
* Medium and large development and test applications with high requirements for data reliability and medium performance requirements

### General Type SSD Cloud Disk

* Capacity of a Single Disk: 20-4,000G
* Maximum IOPS of a single disk: 15,000
* Maximum throughput of a single disk: 150MBps
* Data reliability: 99.9999999%

Other Typical Application Scenarios:

* Applicable to boot volumes, small databases, large-scale development tests, web servers, and other scenarios;
* Applicable to the business scenarios that require random read-write.

### Performance-oriented SSD Cloud Disk

* Capacity of a Single Disk: 20-4,000G
* Maximum IOPS of a single disk: 32,000
* Maximum throughput of a single disk: 150MBps
* Data reliability: 99.9999999%

Application Scenarios:

* Applicable to the deployment scenarios of MySQL, SQLServer, Oracle and other databases;
* Applicable to I/O intensive core business scenario with high requirements for data reliability.

### Capacity-oriented HDD Cloud Disk

* Capacity of a Single Disk: 20-4,000G
* Maximum IOPS of a single disk: 500
* Maximum throughput of a single disk: 180MBps
* Data reliability: 99.9999999%

Application Scenarios:

* Applicable to the I/O scenarios that do not have high requirements for read-write rate, the best choice for high quality and low price;
* Applicable to web servers, large capacity, and applications that process fewer transactions;
* Applicable to large file sequential read-write, cold data backup and other archiving storage.

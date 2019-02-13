# **Features**

**Rich product form**

The new generation cloud disks provide three types of cloud disks for your option, to meet business scenarios with different performance requirements

| Block storage type | SSD Cloud Disk (off line soon) | Premium Hdd Cloud Disk (off line soon) | General Type SSD Cloud Disk (New) | Performance Type SSD Cloud Disk (new) | Capacity Type HDD Cloud Disk (New) |
| --- | --- | --- | --- | --- | --- |
| Single disk capacity | 20-1000G | 20-3000G | 20-4000G | 20-4000G | 20-4000G |
| Maximum single disk IOPS | 20000 | 500 | 15000 | 32000 | 500 |
| Maximum single disk throughput | 100MBps (Ticket Application:300MBps) | 80MBps | 150MBps | 150MBps | 80MBps |
| Single Disk Performance Formula | None | None | Min(Max(500,10&times;size),15,000) | Min(30&times;size,32,000) | Not Applicable |
| Data Persistence | 99.9999999% | 99.9999999% | 99.9999999% | 99.9999999% | 99.9999999% |
| API Name | ssd | Premium-hdd | ssd.gp1 | ssd.io1 | hdd.std1 |
| Typical application scenarios | Big data analysis<br> I/O intensive business<br> medium and large-sized database application | Process fewer transactions<br> Cold data backup | Applicable to boot volumes, small databases, large-scale development tests, web servers, and other scenarios that require random read-write | Applicable to SQL, NoSQL, and other core business scenarios that require random read-write | Provide secure and reliable storage resources for Web applications to meet data integrity and data protection requirements, applicable to scenarios with moderate read-write rate, fewer transactions to process, cold data backup, etc. |

### Independent storage service ###

Cloud Disk Service provides high-reliability, high-availability and high-performance data storage service

1. Cloud disk data are independent from the  Virtual Machines status, support attaching and detaching at any time; a single  Virtual Machines may be attached with up to 8 Cloud Disk Services to meet higher storage demands of users;

2. You only need to pay for the current capacity and type of the Cloud Disk Service, and may expand the Cloud Disk Service capacity at any time based on business development;

3. Provide real-time monitoring on Cloud Disk Service IOPS and throughput, and master the hard disk health status at any time.

### Snapshot backup ###

Cloud Disk Service provides snapshot function to realize data backup at specified time points

1. Snapshot is a full copy of Cloud Disk Service, including the data image of the disk from creation time point to backup time point, to store it in a redundant manner;

2. If you find any data loss or inconsistency caused by misoperation, attack or tempering, etc., you may rollback the snapshot so that your business recovers the status at the snapshot time point;

3. Back up the Virtual Machines, and simultaneously create a snapshot for the cloud disk attached to the Virtual Machines; One or more virtual machines with the same configuration as the current Virtual Machines can be quickly reproduced based on Virtual Machines image and cloud disk snapshot, so as to realize quick bulk deployment of business.

### Elastic expansion ###

Elastic expansion ensures that you may expand the capacity of Cloud Disk Service based on demands at any time

1. You may expand the Cloud Disk Service capacity as needed, to meet storage demands of different business requirements;

2. When cloud disk is created based on snapshot, the Cloud Disk Service may be configured with storage space larger than or equal to the snapshot capacity, to meet your demands to run business based on snapshot data, and you may also be provided with large storage space.

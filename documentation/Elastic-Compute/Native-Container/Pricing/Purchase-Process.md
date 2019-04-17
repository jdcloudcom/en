
# Purchase Process

**Purchase Restriction for Native Container Instance and Native Container Pod**

 1. Each user may create 5 Native Container Instances and Native Container Pods in each region; if you need to enable more resources, you may apply for configuration upgrade quota by open ticket, JD Cloud will improve quota after evaluation based on your actual demands.
 2. Configuration adjustment is not supported for the Native Container Instance and Native Container Pod.
 3. It is allowed to associate 1 EIP respectively to a single Native Container Instance or a single Native Container Pod.
 4. It is allowed to mount at most 8 cloud disks (including system disks) respectively to a single Native Container Instance or a single Native Container Pod.

**Cloud Disk Service Methods and Limitations**

Purchase Method: Only support purchase with an instance

* The system disk file system supports the format of xfs or ext4. The system disk of container will be formatted depending on the file system format selected at the time of creating the Native Container Instance and the Native Container Pod.

* The mounted directory of the system disk is the root directory "/" and cannot be modified

* At present, the system disk must be deleted with the Native Container Instance and the Native Container Pod; the automatic deletion attribute can be set for the data disk; once the automatic deletion is selected, the data disk will be automatically deleted with the Native Container Instance and the Native Container Pod.

* Support only the existing cloud disk services in the xfs or ext4 format as the data disks of containers, and adding cloud disk services in other file system formats will cause creation failure

**Limitation for Purchase of Disk**

Each user may create 20 cloud disks in each region; if you need to create more cloud disks, more resources, you may apply for increasing quota by open ticket, JD Cloud will increase your quota after evaluation based on your actual demands.

* At present, the system disk of the Native Container Instance only supports the SSD disk.

* It is allowed to mount at most 8 cloud disks (including system disks) respectively to a single Native Container Instance or a single Native Container Pod.

* Only the Cloud Disk Services under monthly package support capacity expansion


**Methods and Limitations for Purchase of EIP**
**Purchase Method**

* EIP supports to purchase with or without an instance:

* Support to purchase with instance

**Separate Purchase**

Please refer to [Create EIP][1]

Limitation of Elastic IP:

Each user can apply for 10 EIPs in each region; if you need to apply for more EIPs, you may request to increase the quota limit through opening ticket, and JD Cloud will increase the quota limit for you after evaluation based on your actual needs.

A single instance is allowed to be associated with only 1 EIP.

The bandwidth of the EIP purchased is the uplink bandwidth, i.e., the outgoing bandwidth.

An instance can be associated/disassociated with EIP repeatedly. To replace the EIP of an instance already associated with a EIP, you must get disassociated with the current associated EIP before getting disassociated with a new EIP.

The EIP under monthly package supports the upward adjustment of bandwidth; the EIP based on pay-by-configuration and pay-by-consumption supports the upward or downward adjustment of bandwidth.



  [1]: https://docs.jdcloud.com/en/elastic-ip/create-elastic-ip
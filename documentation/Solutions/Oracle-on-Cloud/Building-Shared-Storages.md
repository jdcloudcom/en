# Construction of Shared Storage
The shared storage required for constructing the Oracle RAC can be realized by the multi-point mounting function of JD cloud disk. Multi-point attached cloud disk supports several cloud instances concurrently read and write the accessed data block-level storage devices, with multiple attachment points, high concurrency, high reliability and other characteristics. A single multi-point attached disk may be concurrently attached to at most 16 cloud instances, and multi-point attachment only applies to data disks and does not support system disks.

### 1. Create cloud disk
First, you need to create a cloud disk that supports multi-point atachment; refer to the Document [Create Cloud Disk] (http) for specific stepss://docs.jdcloud.com/cn/cloud-disk-service/create-cloud-disk)

### 2. Attach cloud disk
The cloud disk that supports multi-point attachment can be attached to multiple virtual machines; refer to the Document [Attach Cloud Disk] (http) for specific operation stepss://docs.jdcloud.com/cn/cloud-disk-service/attach-cloud-disk)

# Core Concepts

Name|Description
-|-
Storage Gateway|Storage Gateway is one of Cloud Storage Services, offering storage protocol conversion function. Storage Gateway does not provide storage capability by itself, which mainly plays the roles of intermediary and protocol conversion while data is persistently stored in OSS.
File Gateway|Storage Gateway that supports file protocol access is also called File Gateway, which establishes mapping relationship between object structure of OSS Bucket and directories and files of NAS file system.
Sharing File System|Storage Gateway can enable its sharing file system. One file system corresponds to one OSS Bucket. Users access sharing file system on the Storage Gateway.
Cache|Cloud Disk Service attached to the Virtual Machines provides cache for the Storage Gateway, which the data written into the Storage Gateway will be stored in the cache disks for offering low latency read-write access; the data in the cache disks will be transmitted to OSS asynchronously.
NFS|Networking file system consists of NFS Client and NFS Server, as the NFS Server, the Storage Gateway provides files storage service for each Client.

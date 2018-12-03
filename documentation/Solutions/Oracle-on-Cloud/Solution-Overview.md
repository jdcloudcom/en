# Overview of cloud solutions on Oracle
JD Cloud released the Oracle access solution to assist digital transformation of enterprise, provide stable, high-efficiency and safe platform support for cloud access of the enterprise’s Oracle business system. The users can, after obtaining Oracle authorization by themselves, deploy various architectures based on Oracle database on JD Cloud.

## Features of the Solutions
- **Support for multiple deployment architectures:** Deployment implementing multiple architectures such as Oracle disaster recovery through ADG is supported, including Oracle RAC and Oracle HA
- **Multiple mechanisms to ensure data reliability:** High-efficiency SSD cloud disk uses the three-copy mechanism, which may protect the reliability of user data to the most extent in combination with snapshot feature
- **Perfect data backup:** Data may be backed up to the cloud disks through RMAN and then uploaded to the object storage service; and may also use the snapshot feature of cloud disk to create snapshots regularly
- **Flexible network deployment:** VPC supports user customized network deployment, and the elastic network interface may support multiple IPs, to meet the network deployment demands for several complicated scenarios

## Key Points
### 1. Shared Storage
Multi-point attachment function of JD cloud disk can achieve "shared storage” of disk. A single cloud disk can be attached on multiple virtual machines at the same time, and each instance can be used for reading/writing data from/in any area of such cloud disk. About multi-point fault function of the cloud disk, you can refer to the [Cloud Disk Service Help Documentation](https://docs.jdcloud.com/cn/cloud-disk-service/multiattachdisk)
### 2. Network Multicast
Considering the stability and security of the network, JD Cloud does not support network multicast. We can use the software from a third party to achieve the multicast function required for Oracle RAC; refer to the document that follows for details.



# Price Overview

 The JCS for MongoDB supports two billing types, including monthly package and pay by configuration. The cost of an instance consists of two parts: specification (CPU and memory) and storage space.

## Specification Cost

|Specification Code | Specifications | Maximum Connections | Maximum IOPS | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| :--------------- | :------ | ---------: | -------: | --------------: | --------------: |
|mongo.s1.small	| 1 core 2G	| 500	| 1000	| 285.00	| 0.59 |
|mongo.s1.medium | 2 cores 4G | 1000 | 2000 | 570.00 | 1.19 |
|mongo.s1.large | 4 cores 8G | 2000 | 4000 | 1050.00 | 2.19 |
|mongo.s1.xlarge | 8 cores 16G | 4000 | 8000 | 2000.00 | 4.17 |
|mongo.s2.2xlarge | 8 cores 32G | 8000 | 14000 | 3800.00 | 7.92 |
|mongo.s2.4xlarge	| 16 cores 64G	| 16000	| 16000	| 7600.00	| 15.83|

## Storage Space Cost

| Storage Type    |Monthly Package (RMB/G/month) | Pay By Configuration (RMB/G/hour) |
| ----------- | -----------------: | ----------------: |
| Local Disk SSD  |               2.13 |            0.0046 |
| Local Disk NVMe |               3.20 |            0.0069 |

**Note: ** Currently, only the "cn-north-1" region provides the local disk NVMe storage type, and other regions are to provide it.

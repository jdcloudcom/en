# Price Overview

 The JCS for MongoDB supports two billing types, including monthly package and pay by configuration. The cost of an instance consists of two parts: specification (CPU and memory) and storage space.

## Specification Cost

### Replica Set Specification

|Specification Code | Specifications | Maximum Connections | Maximum IOPS | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| :--------------- | :------ | ---------: | -------: | --------------: | --------------: |
|mongo.s1.small	| 1 core 2G	| 500	| 1000	| 285.00	| 0.59 |
|mongo.s1.medium | 2 cores 4G | 1000 | 2000 | 570.00 | 1.19 |
|mongo.s1.large | 4 cores 8G | 2000 | 4000 | 1050.00 | 2.19 |
|mongo.s1.xlarge | 8 cores 16G | 4000 | 8000 | 2000.00 | 4.17 |
|mongo.s2.2xlarge | 8 cores 32G | 8000 | 14000 | 3800.00 | 7.92 |
|mongo.s2.4xlarge	| 16 cores 64G	| 16000	| 16000	| 7600.00	| 15.83|

### Sharded Cluster Specification

#### mongos

| Specification Code          | Specification    | Maximum Connections | Maximum IOPS | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| :---------------- | :------ | ---------: | -------: | --------------: | --------------: |
| mongos.m1.small   | 1 Core 2G   |       1000 |     1000 |           95.00 |            0.20 |
| mongos.m1.medium  | 2 Core 4G   |       2000 |     2000 |          190.00 |            0.40 |
| mongos.m1.large   | 4 Core 8G   |       4000 |     4000 |          350.00 |            0.73 |
| mongos.m1.xlarge  | 8 Core 16G  |       8000 |     8000 |          666.67 |            1.39 |
| mongos.m1.2xlarge | 8 Core 32G  |      16000 |    14000 |         1266.67 |            2.64 |
| mongos.m1.4xlarge | 16 Core 64G |      32000 |    16000 |         2533.33 |            5.28 |

#### configserver/shard

| Specification Code         | Specification    | Maximum Connections | Maximum IOPS | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| :--------------- | :------ | ---------: | -------: | --------------: | --------------: |
| mongo.m1.small   | 1 Core 2G   |        500 |     1000 |          285.00 |            0.59 |
| mongo.m1.medium  | 2 Core 4G   |       1000 |     2000 |          570.00 |            1.19 |
| mongo.m1.large   | 4 Core 8G   |       2000 |     4000 |         1050.00 |            2.19 |
| mongo.m1.xlarge  | 8 Core 16G  |       4000 |     8000 |         2000.00 |            4.17 |
| mongo.m1.2xlarge | 8 Core 32G  |       8000 |    14000 |         3800.00 |            7.92 |
| mongo.m1.4xlarge | 16 Core 64G |      16000 |    16000 |         7600.00 |           15.83 |

## Storage Space Cost

| Storage Type    |Monthly Package (RMB/G/month) | Pay By Configuration (RMB/G/hour) |
| ----------- | -----------------: | ----------------: |
| Local Disk SSD  |               2.13 |            0.0046 |
| Local Disk NVMe |               3.20 |            0.0069 |

**Note: ** Currently, only the "cn-north-1" region provides the local disk NVMe storage type, and other regions are to provide it.

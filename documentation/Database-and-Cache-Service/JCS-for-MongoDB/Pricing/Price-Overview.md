# Price Overview

 The JCS for MongoDB supports two billing types, including monthly package and pay by configuration. The cost of an instance consists of two parts: specification (CPU and memory) and storage space.


## Specification Cost

### Three-node Replica Set

|Specification Code | Specifications | Maximum Connections | Maximum IOPS | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| :--------------- | :------- | ---------: | -------: | --------------: | --------------: |
|mongo.s1.small	| 1 core 2G	| 500	| 1000	| 285.00	| 0.59 |
|mongo.s1.medium | 2 cores 4G | 1000 | 2000 | 570.00 | 1.19 |
|mongo.s1.large | 4 cores 8G | 2000 | 4000 | 1050.00 | 2.19 |
|mongo.s1.xlarge | 8 cores 16G | 4000 | 8000 | 2000.00 | 4.17 |
|mongo.s2.2xlarge | 8 cores 32G | 8000 | 14000 | 3800.00 | 7.92 |
|mongo.s2.4xlarge	| 16 cores 64G	| 16000	| 16000	| 7600.00	| 15.83|
| mongo.s2.8xlarge | 32 Core 128G |     32,000 |    20,000 |        15,200.00 |           31.67 |

### Five-node Replica Set

| Type and Code         | Type     | Maximum Connections | Maximum IOPS | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Month) |
| :--------------- | :------- | ---------: | -------: | --------------: | --------------: |
| mongo.s1.small   | 1-core 2G    |        500 |     1000 |          475.00 |            0.99 |
| mongo.s1.medium  | 2-core 4G    |       1000 |     2000 |          950.00 |            1.99 |
| mongo.s1.large   | 4-core 8G    |       2000 |     4000 |         1750.00 |            3.65 |
| mongo.s1.xlarge  | 8-core 16G   |       4000 |     8000 |         3333.34 |            6.95 |
| mongo.s2.2xlarge | 8-core 32G   |       8000 |    14000 |         6333.34 |           13.20 |
| mongo.s2.4xlarge | 16-core 64G  |      16000 |    16000 |        12666.67 |           26.39 |
| mongo.s2.8xlarge | 32-core 128G |      32000 |    20000 |        25333.34 |           52.79 |

### Seven-node Replica Set

| Type and Code         | Type     | Maximum Connections | Maximum IOPS | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Month) |
| :--------------- | :------- | ---------: | -------: | --------------: | --------------: |
| mongo.s1.small   | 1-core 2G    |        500 |     1000 |          665.00 |            1.38 |
| mongo.s1.medium  | 2-core 4G    |       1000 |     2000 |         1330.00 |            2.78 |
| mongo.s1.large   | 4-core 8G    |       2000 |     4000 |         2450.00 |            5.11 |
| mongo.s1.xlarge  | 8-core 16G   |       4000 |     8000 |         4666.67 |            9.73 |
| mongo.s2.2xlarge | 8-core 32G   |       8000 |    14000 |         8866.67 |           18.48 |
| mongo.s2.4xlarge | 16-core 64G  |      16000 |    16000 |        17733.33 |           36.94 |
| mongo.s2.8xlarge | 32-core 128G |      32000 |    20000 |        35466.67 |           73.90 |

### Sharded Cluster Specification

#### mongos

| Specification Code          | Specification    | Maximum Connections |  Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| :---------------- | :------- | ---------: | --------------: | --------------: |
| mongos.m1.small   | 1 Core 2G   |       1000 |           95.00 |            0.20 |
| mongos.m1.medium  | 2 Core 4G   |     2000 |          190.00 |            0.40 |
| mongos.m1.large   | 4 Core 8G   |     4000 |          350.00 |            0.73 |
| mongos.m1.xlarge  | 8 Core 16G  |     8000 |          666.67 |            1.39 |
| mongos.m1.2xlarge | 8 Core 32G  |      16000 |         1266.67 |            2.64 |
| mongos.m1.4xlarge | 16 Core 64G |      32000 |         2533.33 |            5.28 |
| mongos.m1.8xlarge | 32 Core 128G |     64,000|           5,066.67 |            10.56|

#### configserver/shard (three-node replica set)

| Specification Code         | Specification    | Maximum Connections | Maximum IOPS | Monthly Package (RMB/Month) | Pay By Configuration (RMB/Hour) |
| :--------------- | :------- | ---------: | -------: | --------------: | --------------: |
| mongo.m1.small   | 1 Core 2G   |        500 |     1000 |          285.00 |            0.59 |
| mongo.m1.medium  | 2 Core 4G   |       1000 |     2000 |          570.00 |            1.19 |
| mongo.m1.large   | 4 Core 8G   |       2000 |     4000 |         1050.00 |            2.19 |
| mongo.m1.xlarge  | 8 Core 16G  |       4000 |     8000 |         2000.00 |            4.17 |
| mongo.m1.2xlarge | 8 Core 32G  |       8000 |    14000 |         3800.00 |            7.92 |
| mongo.m1.4xlarge | 16 Core 64G |      16000 |    16000 |         7600.00 |           15.83 |
| mongo.m1.8xlarge | 32 Core 128G |     32,000 |    20,000 |        15,200.00 |           31.67 |

## Storage Space Cost

### Three-node Replica Set

| Storage Type    |Monthly Package (RMB/G/month) | Pay By Configuration (RMB/G/hour) |
| ----------- | -----------------: | ----------------: |
| Local Disk SSD  |               2.13 |            0.0046 |
| SSD Cloud Disk |               3.00 |            0.0042 |

### Five-node Replica Set

| Storage Type  | Monthly Package (RMB/G/Month) | Pay By Configuration (RMB/G/Hour) |
| ---------- | -----------------: | ----------------: |
| Local Disk SSD |               3.55 |            0.0077 |
| SSD Cloud Disk   |               5.00 |            0.0700 |

### Seven-node Replica Set

| Storage Type  | Monthly Package (RMB/G/Month) | Pay By Configuration (RMB/G/Hour) |
| ---------- | -----------------: | ----------------: |
| Local Disk SSD |               4.97 |            0.0107 |
| SSD Cloud Disk   |               7.00 |            0.0980 |


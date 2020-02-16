# Price Overview

JCS for InfluxDB supports two billing types, including Monthly Package and Pay by Configuration. The instance cost consists of specification (CPU and memory) cost and the bucket cost.

## Specification Cost

| Specification Code        | vCPU (Core) | Memory (GB) | Write-in Point per Second (Reference Value) | Monthly Package (RMB/Month) |    Pay by Configuration (RMB/Hour)|
| ---------------- | ---------- | ---------- | ---------------------- | --------------- | --------------- |
| tsds.s1.large    | 1          | 4          | 12000                  | 128             | 0.26            |
| tsds.s1.xlarge   | 2          | 8          | 25000                  | 256             | 0.53            |
| tsds.s1.2xlarge  | 4          | 16         | 50000                  | 512             | 1.05            |
| tsds.s1.4xlarge  | 8          | 32         | 100000                 | 1024            | 2.10            |
| tsds.s1.8xlarge  | 16         | 64         | 180000                 | 2048            | 4.21            |
| tsds.s1.16xlarge | 32         | 128        | 300000                 | 4096            | 8.42            |
| tsds.s1.32xlarge | 64         | 256        | 500000                 | 8192            | 16.83           |


## Bucket Cost

| Monthly Package (RMB/G/Month), Pay by Configuration (RMB/G/Hour) |
| ------------------ | ----------------- |
| 0.8                | 0.0011            |
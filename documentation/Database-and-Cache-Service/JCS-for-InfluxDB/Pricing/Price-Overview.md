# Price Overview

JCS for InfluxDB supports two billing types, including Monthly Package and Pay by Configuration. The instance cost consists of specification (CPU and memory) cost and the bucket cost.

## Specification Cost

| Specification Code        | vCPU (Core) | Memory (GB) | Write-in Point per Second (Reference Value) | Monthly Package (RMB/Month) |    Pay by Configuration (RMB/Hour)|
| --------------- | ---------- | ---------- | ---------------------- | --------------- | ---- |
| tsds.s1.large   | 1          | 4          | 10000                  | 600      | 1.23 |
| tsds.s1.xlarge  | 2          | 8          | 20000                  | 1200     | 2.47 |
| tsds.s1.2xlarge | 4          | 16         | 40000                  | 2400     | 4.93 |
| tsds.s1.4xlarge | 8          | 32         | 120000                 | 4800            | 9.86 |
| tsds.s1.8xlarge | 16         | 64         | 260000                 | 9600     | 19.73 |


## Bucket Cost

| Monthly Package (RMB/G/Month), Pay by Configuration (RMB/G/Hour) |
| ------------------ | ----------------- |
| 0.8                | 0.0011            |
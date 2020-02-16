

# Specifications

JCS for InfluxDB now supports the following specifications.

## Instance Type

| Specification code        | vCPU (core) | Memory (GB) | Write-in point per second (reference value) | Bucket (GB) |
| ---------------- | ---------- | ---------- | ---------------------- | -------------- |
| tsds.s1.large    | 1          | 4          | 12000                  | 10-12000       |
| tsds.s1.xlarge   | 2          | 8          | 25000                  | 10-12000       |
| tsds.s1.2xlarge  | 4          | 16         | 50000                  | 10-12000       |
| tsds.s1.4xlarge  | 8          | 32         | 100000                 | 10-12000       |
| tsds.s1.8xlarge  | 16         | 64         | 180000                 | 10-12000       |
| tsds.s1.16xlarge | 32         | 128        | 300000                 | 10-12000       |
| tsds.s1.32xlarge | 64         | 256        | 500000                 | 10-12000       |

**Description:**

Write point per second is related to field count included in each data point. The more the fields, the less the write-in point per second.

The testing benchmark of the abovementioned write-in point per second is based on a condition where 5 Tagkvs and 5 Fields are included in each point.


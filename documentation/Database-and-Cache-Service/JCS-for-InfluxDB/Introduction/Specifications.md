

# Specifications

JCS for InfluxDB now supports the following specifications.

## Instance Type

| Specification code        | vCPU (core) | Memory (GB) | Write-in point per second (reference value) | Bucket (GB) |
| --------------- | ---------- | ---------- | ---------------------- | -------------- |
| tsds.s1.large   | 1          | 4          | 10000                  | 10-1000        |
| tsds.s1.xlarge  | 2          | 8          | 20000                  | 10-1000        |
| tsds.s1.2xlarge | 4          | 16         | 40000                  | 10-1000        |
| tsds.s1.4xlarge | 8          | 32         | 120000                 | 10-1000        |
| tsds.s1.8xlarge | 16         | 64         | 260000                 | 10-1000        |

**Description:**

Write point per second is related to field count included in each data point. The more the fields, the less the write-in point per second.

The above-mentioned write-in point per second is the write-in speed of each data point containing 10 fields.


# SQL Server Instance Type

**Description**
- The specification code is related to CPU and the memory only. Therefore, the instances of the same CPU and memory specification shall have the same specification code
- SQL Server Enterprise Version in Beijing Region supports for both local SSD and NVME, while other regions only support local SSD Storage for the time being

**Instance Type**
- General Type: the specification of CPU memory ratio of 1:4, suitable for most database customer scenarios. General specification supports all SQL Server versions
- Memory Optimized: the specification of CPU memory ratio of 1:8, suitable for customer scenarios requiring large memory. The memory optimized specification is available only in Beijing Region for the time being, and supports SQL Server Enterprise Version only

## General

|Instance Type|Specification Code|Bucket (GB)|
|---|---|---|
|2-core 8GB|db.sqlsvr.s1.large|200|
| |db.sqlsvr.s1.large|300|
| |db.sqlsvr.s1.large|400|
| |db.sqlsvr.s1.large|500|
|4-core 16GB|db.sqlsvr.s1.xlarge|400|
| |db.sqlsvr.s1.xlarge|500|
| |db.sqlsvr.s1.xlarge|600|
| |db.sqlsvr.s1.xlarge|800|
|8-core 32GB|db.sqlsvr.s1.2xlarge|600|
| |db.sqlsvr.s1.2xlarge|800|
| |db.sqlsvr.s1.2xlarge|1000|
| |db.sqlsvr.s1.2xlarge|1200|
|16-core 64GB|db.sqlsvr.s1.4xlarge|1000|
| |db.sqlsvr.s1.4xlarge|1200|
| |db.sqlsvr.s1.4xlarge|1600|
| |db.sqlsvr.s1.4xlarge|2000|

## Memory Optimized

|Instance Type|Specification Code|Bucket (GB)|
|---|---|---|
|2-Core 16GB|db.sqlsvr.m1.xlarge|200|
| |db.sqlsvr.m1.xlarge|300|
| |db.sqlsvr.m1.xlarge|400|
| |db.sqlsvr.m1.xlarge|500|
|4-Core 32GB|db.sqlsvr.m1.2xlarge|400|
| |db.sqlsvr.m1.2xlarge|500|
| |db.sqlsvr.m1.2xlarge|600|
| |db.sqlsvr.m1.2xlarge|800|
|8-Core 64GB|db.sqlsvr.m1.4xlarge|600|
| |db.sqlsvr.m1.4xlarge|800|
| |db.sqlsvr.m1.4xlarge|1000|
| |db.sqlsvr.m1.4xlarge|1200|
|16-Core 128GB|db.sqlsvr.m1.8xlarge|1000|
| |db.sqlsvr.m1.8xlarge|1200|
| |db.sqlsvr.m1.8xlarge|1600|
| |db.sqlsvr.m1.8xlarge|2000|

# Price Overview
Price of TiDB instance = Unit price of each node * Node quantity + Unit price of bucket * Bucket size * TiKV node number

**Refer to the table below for prices of node and memory. The specific price is subject to the deduction by the Console.**

## 1. Unit Price of Node
Node price of TiDB is related to node specification only (CPU and memory) rather than node type.

|Specification Code|VCPU (Core)|Memory (GB)|Monthly Package (RMB/Month)| Pay by Configuration per GB (RMB/Month)|
|-|-|-|-|-|
|tidb.s1.xlarge|4|16|872|1.82|
|tidb.s1.2xlarge|8|32|1744|3.64|
|tidb.s1.4xlarge|16|64|3488|7.27|
|tidb.s1.6xlarge|24|96|5232|10.90|
|tidb.s1.8xlarge|32|128|6976|14.54|

## 2. Bucket
TiDB uses local SSD as the storage
|Storage Type|Monthly Package per GB (RMB/Month)| Pay by Configuration per GB (RMB/Month)|
|-|-|-|
|LOCAL_SSD|0.8|0.00167|


## Example
For example, one TiDB instance configuration and price calculation are as follows:

|Node Type|Node Specification|Node Bucket|Node Number|Node Price|
|-|-|-|-|-|
|TiDB|4-Core 16GB|0|2| 872 * 2 = 1,744|
|TiKV|8-Core 32GB|1,000 GB|6| 1744 * 6 + 0.8 * 1,000 * 6 = 15,264|
|PD|4-Core 16GB|0|3| 872 * 3 = 2,016|
|Monitor|4-Core 16GB|0|1| 872|

As result, the total price of the TiDB instance is: 1,744 + 15,264 + 2,016 + 872 = RMB 19,896/month

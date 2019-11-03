## JCS for Redis Log
### Introduction
Now, slow logs are used as the JCS for Redis logs accessing Log Service.

### Field Description
#### Slow Log
| SN | Field Name | Field Description | Field Type |
| --- | --- | --- | --- | 
| 1 | time | Log record time, example: 1324097834 | int64 | 
| 2 | space_id | Resource ID, example: "redis-95jbpnhpvk" | string |
| 3 | version | Version, example: "redis-2.8" | string |
| 4 | shard_name     | Shard name, example: "redis-95jbpnhpvk-shard-0" | string |
| 5 | command | Execution command, example: "CONFIG GET slowlog-log-slower-than" | string |
| 6 | execution_time | Execution period, example: "12 ms" | string |
| 7 | region_id | Region ID, example: "cn-north-1" | string |
| 8 | pin | User pin, example: "jcloudiaas2" | string |

# JCS for MongoDB
MongoDB provides two types, the replica set and the sharded cluster.  
The servicecode for the product line monitoring data is mongodb, providing the monitoring indicators as follows:

## Replica Set
- When monitoring data of the Primary node is getting, the role value in tags is M
- When monitoring data of the Secondary node is getting, the role value in tags is S  


metric | 中文名称 | 英文名称 | 单位 | 说明
---|--- |--- |---|---
jmiss.mongo.instance.cpu_percent|CPU使用率|CPU Usage|%|
jmiss.mongo.instance.mem_percent|内存使用率|Memory Usage|%|
jmiss.mongo.instance.disk_percent|磁盘使用率|Disk Usage|%|
jmiss.mongo.instance.iops_percent|IOPS使用率|IOPS Utilization Rate|%|
jmiss.mongo.instance.connections|connections|connections|Nr.|
jmiss.mongo.instance.network_bytesIn|network_bytesIn|network_bytesIn|Bytes|
jmiss.mongo.instance.network_bytesOut|network_bytesOut|network_bytesOut|Bytes|
jmiss.mongo.instance.network_numRequests|network_numRequests|network_numRequests|counts|
jmiss.mongo.instance.op_command|op_command|op_command|counts|
jmiss.mongo.instance.op_delete|op_delete|op_delete|counts|
jmiss.mongo.instance.op_getmore|op_getmore|op_getmore|counts|
jmiss.mongo.instance.op_insert|op_insert|op_insert|counts|
jmiss.mongo.instance.op_query|op_query|op_query|counts|
jmiss.mongo.instance.op_update|op_update|op_update|counts|
jmiss.mongo.instance.cursor_timeout|cursor_timeout|cursor_timeout|counts|
jmiss.mongo.instance.cursor_totalOpen|cursor_totalOpen|cursor_totalOpen|counts|
jmiss.mongo.instance.globalLock_cq_readers|globalLock_cq_readers|globalLock_cq_readers|counts|
jmiss.mongo.instance.globalLock_cq_total|globalLock_cq_total|globalLock_cq_total|counts|
jmiss.mongo.instance.globalLock_cq_writers|globalLock_cq_writers|globalLock_cq_writers|counts|
jmiss.mongo.instance.wt_bytes_read_into_cache|wt_bytes_read_into_cache|wt_bytes_read_into_cache|counts|
jmiss.mongo.instance.wt_bytes_written_from_cache|wt_bytes_written_from_cache|wt_bytes_written_from_cache|counts|
jmiss.mongo.instance.wt_max_bytes_config|wt_max_bytes_config|wt_max_bytes_config|counts|



## Sharded Cluster  

Provide monitoring data of dimensions Mongos and Shard.  
1. There is lots of node information under Mongos and it needs to designate specific node ID for shardId in tags.
2. There are a quantity of node information under Shard and Primary and Secondary shall be distinguished at the same time. When monitoring data are obtaining, please designate specific node ID for shardId in tags.
- When role value in tags is M, the data are obtained are those of shard and Primary nodes;
- When role value in tags is S, the data are obtained are those of shard and Secondary nodes;


metric | 中文名称 | 英文名称 | 单位 | 说明
---|--- |--- |---|---
jmiss.mongo.instance.cpu_percent|CPU使用率|CPU Usage|%|
jmiss.mongo.instance.mem_percent|内存使用率|Memory Usage|%|
jmiss.mongo.instance.disk_percent|磁盘使用率|Disk Usage|%|
jmiss.mongo.instance.iops_percent|IOPS使用率|IOPS Utilization Rate|%|
jmiss.mongo.instance.connections|connections|connections|Nr.|
jmiss.mongo.instance.network_bytesIn|network_bytesIn|network_bytesIn|Bytes|
jmiss.mongo.instance.network_bytesOut|network_bytesOut|network_bytesOut|Bytes|
jmiss.mongo.instance.network_numRequests|network_numRequests|network_numRequests|counts|
jmiss.mongo.instance.op_command|op_command|op_command|counts|
jmiss.mongo.instance.op_delete|op_delete|op_delete|counts|
jmiss.mongo.instance.op_getmore|op_getmore|op_getmore|counts|
jmiss.mongo.instance.op_insert|op_insert|op_insert|counts|
jmiss.mongo.instance.op_query|op_query|op_query|counts|
jmiss.mongo.instance.op_update|op_update|op_update|counts|
jmiss.mongo.instance.cursor_timeout|cursor_timeout|cursor_timeout|counts|
jmiss.mongo.instance.cursor_totalOpen|cursor_totalOpen|cursor_totalOpen|counts|
jmiss.mongo.instance.globalLock_cq_readers|globalLock_cq_readers|globalLock_cq_readers|counts|
jmiss.mongo.instance.globalLock_cq_total|globalLock_cq_total|globalLock_cq_total|counts|
jmiss.mongo.instance.globalLock_cq_writers|globalLock_cq_writers|globalLock_cq_writers|counts|
jmiss.mongo.instance.wt_bytes_read_into_cache|wt_bytes_read_into_cache|wt_bytes_read_into_cache|counts|
jmiss.mongo.instance.wt_bytes_written_from_cache|wt_bytes_written_from_cache|wt_bytes_written_from_cache|counts|
jmiss.mongo.instance.wt_max_bytes_config|wt_max_bytes_config|wt_max_bytes_config|counts|

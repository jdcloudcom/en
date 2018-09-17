# Cloud Product Monitoring Metric
## VM Monitoring Metric

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage | % | 1 Minute
Memory Usage | % | 1 Minute
Disk Read Throughput | kbps | 1 Minute
Disk Write Throughput | kbps | 1 Minute
Network Inbound Traffic | bps | 1 Minute
Network Outbound Traffic | bps | 1 Minute

## Cloud Disk Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Disk Read Throughput | bps | 1 Minute
Disk Write Throughput | bps | 1 Minute
Disk Read IOPS|Count/s | 1 Minute
Disk Write IOPS|Count/s | 1 Minute

## Public IP Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Public Network Inflow | byte | 1 Minute
Public Network Outflow | byte | 1 Minute
Public Network Inbound Quantity |per Second |1 Minute
Public Network Outbound Quantity | per second | 1 Minute

## CDN Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Bandwidth Peak | Mbits/s|1 Minute
Return Code 4xx%|%|1 Minute
Return Code 5xx%|%|1 Minute
Hit Ratio|%|1 Minute
Public Network Outbound Quantity|Mbytes|1 Minute
Requests per Second |Count|1 Minute

## MySQL/percona/MariaDB Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Utilization Rate	|%|	1 Minute
Memory Utilization Rate	|%|	1 Minute
Total Hard Disk Space Usage|MB|1 Minute
User Data Usage|MB|1 Minute
System Data Usage|MB|1 Minute
Log File Usage|MB|1 Minute
Network Reception Flow|bps|	1 Minute
Outgoing Network Traffic|bps|	1 Minute
Instance Inflow per Second|bps|	1 Minute
Instance Inflow per Second|bps|	1 Minute
SQL Statement Executions per Second	|Frequency|1 Minute
Business Quantity per Second	|Quantity|	1 Minute
Temporary Table Quantity	|Quantity|1 Minute
Current Total Connections	|Quantity|	1 Minute
Current Active Connections	|Quantity|	1 Minute
InnoDB Reads per Second	|B|	1 Minute
InnoDB Writes per Second	|B|	1 Minute
InnoDB Cache Pool Read Hit Ratio	|%|	1 Minute
InnoDB Cache Pool Utilization Ratio	|%|	1 Minute
InnoDB Cache Pool Dirty Block Ratio	|%|	1 Minute
InnoDB Reads to the Cache Pool per Second	|Frequency|	1 Minute
InnoDB Writes to the Cache Pool per Second	|Frequency|	1 Minute
InnoDB Log Physical Writes per Second	|Frequency|	1 Minute
Number of fsync writes per second completed by InnoDB logs	|Quantity|	1 Minute
MySQL_COMDML   Delete	|Quantity|	1 Minute
MySQL_COMDML   Insert	|Quantity|	1 Minute
MySQL_COMDML   Select	|Quantity|	1 Minute
MySQL_COMDML   Update	|Quantity|	1 Minute
MySQL_COMDML   Insert_Select	|Quantity|	1 Minute
MySQL_COMDML   Replace	|Quantity|	1 Minute
MySQL_COMDML   Replace Select	|Quantity|	1 Minute

## SQLServer Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Utilization Rate	|%|	1 Minute
Memory Utilization Rate	|%|	1 Minute
Data Disk Utilization Rate|%|	1 Minute
Data Disk Disk Uage	|MByte|	1 Minute
Data Disk Write IOPS	|Frequency/Second|	1 Minute
Data Disk Read IOPS	|Frequency/Second|	1 Minute
Input Traffic of Instance per Second	|kbps|	1 Minute
Output Traffic of Instance per Second	|kbps|	1 Minute
Current Total Connections	|Quantity|	1 Minute
Average Number of Transactions per Second	|Quantity|	1 Minute
Average Number of SQL Statement Executions per Second  |Frequency|	1 Minute
Cache Hit Rate	|%|	1 Minute
Number of Checkpoint Written to Page per Second     |Frequency|	1 Minute
Number of Login per Second	|Frequency|	1 Minute
Average Number of Full Table Scans per Second	|Frequency|	1 Minute
Number of SQL Compilations per Second	|Quantity|	1 Minute
Number of Lock Timeouts per Second	|Frequency|	1 Minute
Number of Deadlocks per Second	|Frequency|	1 Minute
Number of Lock Waits per Second	|Frequency|	1 Minute
Number of Blocked Processes|Quantity|	1 Minute
Network Inflow Rate|kbps|	1 Minute
Network Outflow Rate|kbps|	1 Minute
Disk Queue Length|Quantity| 1 Minute

## DRDS Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Utilization Rate	|%|	1 Minute
Average Network Inflow per Second	|Byte|	1 Minute
Average Network Outflow per Second	|Byte|	1 Minute
Number of Current Connections	|Quantity|	1 Minute

## LB Monitoring Metric
**Application Load Balancer**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Number of New Requests	|Quantity|	1 Minute
Number of New Connections	|Quantity|	1 Minute
Number of Active Connections	|Quantity|	1 Minute
Server Error	|Quantity|	1 Minute
Client error	|Quantity|	1 Minute
Inflow Rate|bps|	1 Minute
Outflow Rate|bps|	1 Minute
Number of Bytes Inflow|Byte|	1 Minute
Number of Bytes Outflow|Byte|	1 Minute
Total Number of Bytes|Byte|	1 Minute

**Network Load Balancer**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Number of New Connections	|Quantity|	1 Minute
Number of Active Connections	|Quantity|	1 Minute
Inflow Rate|bps|	1 Minute
Outflow Rate|Byte|	1 Minute
Incoming Packet Rate|pps|	1 Minute


## Cache Redis Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Memory Usage |MB|	1 Minute
Memory Utilization Rate	|%|	1 Minute
Intranet Inflow	|bps|	1 Minute
Intranet Outflow	|bps|	1 Minute
QPS	|Frequency|	1 Minute
Hit Ratio	|%|	1 Minute
Number of Instance Keys|Quantity|	1 Minute

## MongoDB Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Utilization Rate	|%|	1 Minute
Memory Utilization Rate	|%|	1 Minute
Disk Utilization Rate	|%|	1 Minute
IOPS Utilization Rate	|%|	1 Minute
Connections|Quantity|1 Minute 
network_bytesIn|Byte|1 Minute 
network_bytesOut|Byte|1 Minute 
network_numRequests|Byte|1 Minute 
op_command|Quantity|	1 Minute
op_delete|Quantity| 1 Minute
op_getmore|Quantity| 1 Minute
op_insert|Quantity| 1 Minute
op_query|Quantity| 1 Minute
op_update|Quantity| 1 Minute
cursor_timeoute|Quantity| 1 Minute
cursor_totalOpen|Quantity| 1 Minute
globalLock_cp_total|Quantity| 1 Minute
globalLock_cp_readers|Quantity| 1 Minute
globalLock_cp_writers|Quantity| 1 Minute
Wt_bytes_read_into_cache|byte|1 Minute
Wt_bytes_written_from_cache|byte|1 Minute
Wt_max_bytes_config|byte|1 Minute



## Native Container Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Utilization Rate	|%|	1 Minute
Memory Utilization Rate	|%|	1 Minute
Disk Read Throughput	|kbps|	1 Minute
Disk Write Throughput	|kbps|	1 Minute
Network Entry Rate	|bps|	1 Minute
Network Out Rate	|bps|	1 Minute

## OSS Monitoring 
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Public Network Inflow	|Byte|	1 Minute
Public Network Outflow	|Byte|	1 Minute
Get Total Requests	|Frequency|	1 Minute
Put Total Requests	|Frequency|	1 Minute
Total Requests	|Frequency|	1 Minute
CDN Inflow	|Byte|	1 Minute
CDN Outflow	|Byte|	1 Minute

## Auto Scaling Monitoring
**Auto Scaling Group**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Maximum Number of Instances	|Quantity|	1 Minute
Minimum Number of Instances	|Quantity|	1 Minute
Number of Service Instances	|Quantity|	1 Minute
Number of Total Instances	|Quantity|	1 Minute
Number of Added Instances |Quantity|	1 Minute
Number of Shifted Instances	|Quantity|	1 Minute

**VM Instance**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Utilization Rate	|%|	1 Minute
Memory Utilization Rate	|%|	1 Minute
Network Entry Rate	|%|	1 Minute
Network Out Rate	|%|	1 Minute

## JD MapReduce Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Non-heap Memory Usage	|mb|	1 Minute
Heap Memory Used	|mb|	1 Minute
HDFS Used	|Byte|	1 Minute
NameNode Block Total Number	|Quantity|	1 Minute
The Total Number of Files Managed by the NameNode	|Quantity|	1 Minute
datanode Node Surviving Number	|Quantity|	1 Minute
Rpc Call Average Time	|Millisecond|	1 Minute
Rpc Operation Average Time	|Millisecond|	1 Minute
Current rpc Open Number	|Quantity|	1 Minute
RPC Current Call Queue Length	|Quantity|	1 Minute

## JCQ Monitoring Metric
**Topic**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Produced TPS	|Bar/Second|	1 Minute
Number of Published Pessages	|Quantity|	1 Minute
The Number of Requests for Published Messages	|Frequency|	1 Minute
The Size of the Published Message	|Byte|	1 Minute

**ConsumerGroup**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Consumed TPS	|Bar/Second|	1 Minute
Number of Stacked Messages	|Quantity|	1 Minute
Number of Requests to Receive Messages |Quantity|	1 Minute
Number of Successfully Received Messages |Quantity|	1 Minute
Total Number of Received Messages	|Quantity|	1 Minute
Number of Successfully Received Messages |Quantity|	1 Minute
The Size of the Received Message	|Byte|	1 Minute

## BDS Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Checkpoint Writes to Page Number per Second	|Quantity|	1 Minute
Number of Login per Second	|Frequency|	1 Minute
Number of Full Table Scans per Second	|Frequency|	1 Minute
SQL Execution Times	|Frequency|	1 Minute
SQL Compiling Times	|Frequency|	1 Minute
Number of Lock Timeouts	|Frequency|	1 Minute
Number of Deadlocks	|Frequency|	1 Minute
Number of Lock Waits	|Frequency|	1 Minute
Business Quantity per Second	|Quantity|	1 Minute
Cache Hit Rate	|%|	1 Minute
Current Total Connections	|Quantity|	1 Minute
Network Entry Rate	|bps|	1 Minute
Network Out Rate	|bps|	1 Minute
Hard Disk Read I0	|kbps|	1 Minute
Hard Disk Write I0	|kbps|	1 Minute
Hard Disk Usage	|MByte|	1 Minute
Hard Disk Utilization Rate	|%|	1 Minute
Disk Queue Length	|Quantity|	1 Minute
CPU Utilization Rate	|%|	1 Minute
Number of Blocked Processes	|Quantity|	1 Minute


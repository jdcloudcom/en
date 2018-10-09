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
Network Packets In | pps | 1 Minute
Network Packets Out | pps | 1 Minute
Network In |bps |1 Minute
Network Out | bps | 1 Minute

## CDN Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Peak Bandwidth | Mbits/s|1 Minute
4XX Return Code  |%|1 Minute
5XX Return Code |%|1 Minute
Hit Rate|%|1 Minute
Internet Outbound Traffic|Mbytes|1 Minute
QPS |Count|1 Minute

## MySQL/percona/MariaDB Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Used Disk |MB|1 Minute
Used UserData |MB|1 Minute
Used SystemData |MB|1 Minute
Used LogFiles |MB|1 Minute
Network Inbound|bps|	1 Minute
Network Outbound|bps|	1 Minute
Connections|Count|	1 Minute
Curren Active Connections|Count|	1 Minute
Temporary Tables	|Count|	1 Minute
SQL Execution Per Second|Count|1 Minute
TPS	|Count|	1 Minute
Instance In Traffic |bps|	1 Minute
Instance Out Traffic|bps|	1 Minute
InnoDB BufferPool Hits	|%|	1 Minute
InnoDB BufferPool Usage |%|	1 Minute
InnoDB BufferPool-DirtyBlock |%|	1 Minute
InnoDB Read Throughput Per Second |B|	1 Minute
InnoDB Write Throughput Per Second |B|	1 Minute
InnoDB BufferPool Read |Count|	1 Minute
InnoDB BufferPool Write |Count|	1 Minute
InnoDB Log Physical Write |Count|	1 Minute
InnoDB Log fsync Write |Count|	1 Minute
MySQL_COMDML   Delete	|Count|	1 Minute
MySQL_COMDML   Insert	|Count|	1 Minute
MySQL_COMDML   Select	|Count|	1 Minute
MySQL_COMDML   Update	|Count|	1 Minute
MySQL_COMDML   Insert_Select	|Count|	1 Minute
MySQL_COMDML   Replace	|Count|	1 Minute
MySQL_COMDML   Replace Select	|Count|	1 Minute

## SQLServer Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Disk Usage|%|	1 Minute
Used Disk	|MByte|	1 Minute
DataDisk-WriteIOPS	|Count/s|	1 Minute
DataDisk-ReadIOPS	|Count/s|	1 Minute
Network Inbound  Rate	|kbps|	1 Minute
Network Outbound  Rate	|kbps|	1 Minute
Connections	|Count|	1 Minute
TPS	|Count|	1 Minute
SQL Execution Per Second |Count|	1 Minute
Buffer Hits	|%|	1 Minute
CheckPoint Write Page Per Second   | Count |	1 Minute
Log In Per Second	|Count|	1 Minute
Table Scan Per Second	|Count|	1 Minute
SQL Compilation Per Second	|Count|	1 Minute
Lock Timeout Per Second	|Count|	1 Minute
Lock Dead Per Second	|Count|	1 Minute
Lock Wait Per Second	|Count|	1 Minute
Processes Blocked|Count|	1 Minute
Disk QueueLength |Count|1 Minute

## DRDS Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Network Inbound Traffic|bps|	1 Minute
Network Outbound Traffic	|bps|	1 Minute
Current Connections	|Count|	1 Minute

## LB Monitoring Metric
**Application Load Balancer**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
New Connection Counts 	|Count|	1 Minute
Active Connection Counts	|Count|	1 Minute
Requests	|Count|	1 Minute
Server Error	|Count|	1 Minute
Client error	|Count|	1 Minute

**Network Load Balancer**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
New Connection Counts 	|Quantity|	1 Minute
Active Connection Counts|Quantity|	1 Minute
Requests	|Count|	1 Minute
ProcessedIn_bps|bps|	1 Minute
ProcessedOut_pps |byte|	1 Minute
ProcessedIn_Bytes|Bytes| 1 Minute


## Redis Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Used Memory |MB|	1 Minute
Memory Usage	|%|	1 Minute
Intranet In Traffic	|bps|	1 Minute
Intranet Out Traffic	|bps|	1 Minute
QPS	|Count|	1 Minute
Hit Rate	|%|	1 Minute
Instance Key|Count|	1 Minute

## MongoDB Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Disk Usage	|%|	1 Minute
IOPS Utilization Rate	|%|	1 Minute
Connections|Count|1 Minute 
Network Inbound|Byte|1 Minute 
Network Outbound|Byte|1 Minute 
Network Requests|Byte|1 Minute 
Op_command|Count|	1 Minute
Op_delete|Count| 1 Minute
Op_getmore|Count| 1 Minute
Op_insert|Count| 1 Minute
Op_query|Count| 1 Minute
Op_update|Count| 1 Minute
Cursor_timeoute|Count| 1 Minute
Cursor_totalOpen|Count| 1 Minute
GlobalLock_cp_total|Count| 1 Minute
GlobalLock_cp_readers|Count| 1 Minute
GlobalLock_cp_writers|Count| 1 Minute
Wt_bytes_read_into_cache|byte|1 Minute
Wt_bytes_written_from_cache|byte|1 Minute
Wt_max_bytes_config|byte|1 Minute



## Native Container Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Disk Read Throughput	|kbps|	1 Minute
Disk Write Throughput	|kbps|	1 Minute
Network Inbound Traffic	|bps|	1 Minute
Network Outbound Traffic	|bps|	1 Minute

## OSS Monitoring  Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Internet Inbound Traffic|Byte|	1 Minute
Internet Outbound Traffic	|Byte|	1 Minute
Get Requests	|Frequency|	1 Minute
Put Requests	|Frequency|	1 Minute
Requests	|Frequency|	1 Minute
CDN Inbound Traffic	|Byte|	1 Minute
CDN Outbound Traffic	|Byte|	1 Minute

## Auto Scaling Monitoring
**Auto Scaling Group**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Max Instances	| Count|	1 Minute
Min Instances	|Count|	1 Minute
Runing Instances|Count|	1 Minute
Instances	|Count|	1 Minute
Joining  Instances |Count|	1 Minute
Removing Instances	|Count|	1 Minute

**VM Instance**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Network Inbound Rate	|%|	1 Minute
Network Outbound Rate	|%|	1 Minute

## JD MapReduce Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Used Non-heap Memory	|mb|	1 Minute
Used Heap Memory	|mb|	1 Minute
Used HDFS	|Byte|	1 Minute
NameNode blocks 	|Count|	1 Minute
NameNode Managed Files |Count|	1 Minute
Survival  Datanodes	|Count|	1 Minute
RPC Invoking 	|ms |	1 Minute
RPC Operation	|ms|	1 Minute
Open RPC |Count|	1 Minute
RPC Invoking  QueueLength |Count|	1 Minute

## JCQ Monitoring Metric
**Topic**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Produced TPS	|Count/s|	1 Minute
Published Messages	|Count|	1 Minute
Published Message Requests	|Count|	1 Minute
Published Message Size	|Byte|	1 Minute

**ConsumerGroup**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Consumed TPS	|Count/s|	1 Minute
Buildup Messages	|Count|	1 Minute
Succed Received Messages  |Count|	1 Minute
Received Messages	|Count|	1 Minute
Received Message Requests |Count|	1 Minute
Succed Received Messages  |Count|	1 Minute
Received Message Size	|Byte|	1 Minute

## BDS Monitoring Metric
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CheckPoint Write Page Per Second	|Count|	1 Minute
Log In Per Second	|Count|	1 Minute
Table Scan Per Second	|Count|	1 Minute
SQL Execution Per Second	|Count|	1 Minute
SQL Compilation Per Second	|Count|	1 Minute
Lock Timeout|Count|	1 Minute
Lock Dead|Count|	1 Minute
Lock Wait	|Count|	1 Minute
TPS	|Quantity|	1 Minute
Buffer Hits	|%|	1 Minute
Connections	|Quantity|	1 Minute
Network Inbound Rate	|bps|	1 Minute
Network Outbound  Rate	|bps|	1 Minute
Disk Read Throughput	|kbps|	1 Minute
Disk Write Throughput	|kbps|	1 Minute
Used Disk	|MByte|	1 Minute
Disk Usage 	|%|	1 Minute
Disk QueueLength |Count|1 Minute
CPU Usage	|%|	1 Minute
Memory Usage |%|	1 Minute
Processes Blocked	|Count|	1 Minute


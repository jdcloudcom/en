# Cloud Product Monitoring Metrics
## VM Monitoring Metrics

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage | % | 1 Minute
Memory Usage | % | 1 Minute
Disk Read Throughput | kbps | 1 Minute
Disk Write Throughput | kbps | 1 Minute
Network Inbound Traffic | bps | 1 Minute
Network Outbound Traffic | bps | 1 Minute

## Cloud Disk Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Disk Read Bandwidth bps | 1 Minute
Disk Write Bandwidth | bps | 1 Minute
Disk Read IOPS|Count/s | 1 Minute
Disk Write IOPS|Count/s | 1 Minute

## Public IP Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Public IP Inbound Traffic | byte | 1 Minute
Public IP Outbound Traffic | byte | 1 Minute
Public IP Packets In |Count/s| 1 Minute
Public IP Outbound Traffic |Count/s| 1 Minute

## CDN Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Peak Bandwidth | Mbits/s|1 Minute
4XX Return Code Ratio |%|1 Minute
5XX Return Code Ratio |%|1 Minute
Hit Ratio|%|1 Minute
Public IP Outbound Traffic|Mbytes|1 Minute
QPS |Count|1 Minute

## MySQL/percona/MariaDB Monitoring Metrics
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
Instance Inbound Traffic Per Second|Count|	1 Minute
Instance Inbound Traffic Per Second|Count|	1 Minute
SQL Statements Execution Times Per Second|Count| 1 Minute
TPS |Quantity| 1 Minute
Temporary Table |Count| 1 Minute
Current Connections |Count| 1 Minute
Current Active Connections |Count| 1 Minute
InnoDB Read Throughput Per Second |B| 1 Minute
InnoDB Write Throughput Per Second |B|	1 Minute
InnoDB BufferPool Hit Ratio	|%|	1 Minute
InnoDB BufferPool Usage |%|	1 Minute
InnoDBBufferPool-DirtyBlock |%|	1 Minute
InnoDB BufferPool Read Throughput Per Second|Count|	1 Minute
InnoDB BufferPool Write Throughput Per Second|Count|	1 Minute
InnoDB Log Physical WriteThroughput Per Second|Count|	1 Minute
InnoDB Log fsync Write Throughput Per Second |Count| 1 Minute
MySQL_COMDML   Delete	|Count|	1 Minute
MySQL_COMDML   Insert	|Count|	1 Minute
MySQL_COMDML   Select	|Count|	1 Minute
MySQL_COMDML   Update	|Count|	1 Minute
MySQL_COMDML   Insert_Select	|Count|	1 Minute
MySQL_COMDML   Replace	|Count|	1 Minute
MySQL_COMDML   Replace Select	|Count|	1 Minute

## SQLServer Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Data Disk Usage|%|	1 Minute
Used Data Disk	|MByte|	1 Minute
Data Disk Write IOPS	|Count/s|	1 Minute
Data Disk Read IOPS	|Count/s|	1 Minute
Network Inbound Rate	|kbps|	1 Minute
Network Outbound Rate	|kbps|	1 Minute
Current Connections |Count| 1 Minute
TPS	|Count|	1 Minute
SQL Statement Execution Per Second |Count|	1 Minute
Buffer Hit Ratio	|%|	1 Minute
CheckPoint Write Page Per Second| Count |	1 Minute
Log In Per Second	|Count|	1 Minute
Table Scans Per Second	|Count|	1 Minute
SQL Compilation Per Second	|Count|	1 Minute
Lock Timeout Per Second	|Count|	1 Minute
Lock Dead Per Second	|Count|	1 Minute
Lock Wait Per Second	|Count|	1 Minute
Processes Blocked|Count|	1 Minute
Disk QueueLength |Count|1 Minute

## DRDS Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Network Inbound Traffic Per Second|byte|	1 Minute
Network Outbound Traffic Per Second	|byte|	1 Minute
Current Connections	|Count|	1 Minute

## LB Monitoring Metrics
**Application Load Balancer**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
New Connections 	|Count|	1 Minute
Active Connections|Count|	1 Minute
New Requests	|Count|	1 Minute
Server Errors	|Count|	1 Minute
Client Errors	|Count|	1 Minute

**Network Load Balancer**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
New Connections 	|Count|	1 Minute
Active Connections|Count|	1 Minute
New Requests	|Count|	1 Minute
ProcessedIn_bps|bps|	1 Minute
ProcessedOut_pps |byte|	1 Minute
ProcessedIn_Bytes|byte| 1 Minute


## JCS for Redis Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Used Memory |MB|	1 Minute
Memory Usage	|%|	1 Minute
Intranet Inbound Traffic	|bps|	1 Minute
Intranet Outbound Traffic	|bps|	1 Minute
QPS	|Count|	1 Minute
Hit Ratio	|%|	1 Minute
Instance Keys|Count|	1 Minute

## JCS for MongoDB Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Disk Usage	|%|	1 Minute
IOPS Utilization Rate	|%|	1 Minute
Connections|Count|1 Minute 
network_bytesIn|byte|1 Minute 
network_bytesOut|byte|1 Minute 
network_numRequests|byte|1 Minute 
op_command|Count|	1 Minute
op_delete|Count| 1 Minute
op_getmore|Count| 1 Minute
op_insert|Count| 1 Minute
op_query|Count| 1 Minute
op_update|Count| 1 Minute
cursor_timeoute|Count| 1 Minute
cursor_totalOpen|Count| 1 Minute
globalLock_cp_total|Count| 1 Minute
globalLock_cp_readers|Count| 1 Minute
globalLock_cp_writers|Count| 1 Minute
wt_bytes_read_into_cache|byte|1 Minute
wt_bytes_written_from_cache|byte|1 Minute
wt_max_bytes_config|byte|1 Minute



## Native Container Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Disk Read Throughput	|kbps|	1 Minute
Disk Write Throughput	|kbps|	1 Minute
Network Inbound Rate	|bps|	1 Minute
Network Outbound Rate	|bps|	1 Minute

## OSS Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
IP Inbound Traffic|byte|	1 Minute
IP Outbound Traffic	|byte|	1 Minute
Get Requests	|Frequency|	1 Minute
Put Requests	|Frequency|	1 Minute
Total Requests	|Frequency|	1 Minute
CDN Inbound Traffic	|byte|	1 Minute
CDN Outbound Traffic	|byte|	1 Minute

## Auto Scaling Monitoring
**Auto Scaling Group**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Max Instances	| Count|	1 Minute
Min Instances	|Count|	1 Minute
Runing Instances|Count|	1 Minute
Instances	|Count|	1 Minute
Joining Instances |Count|	1 Minute
Removing Instances	|Count|	1 Minute

**VM Instance**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CPU Usage	|%|	1 Minute
Memory Usage	|%|	1 Minute
Network Inbound Rate	|%|	1 Minute
Network Outbound Rate	|%|	1 Minute

## JD MapReduce Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Used Non-heap Memory	|mb|	1 Minute
Used Heap Memory	|mb|	1 Minute
Used HDFS	|Byte|	1 Minute
NameNode Blocks 	|Count|	1 Minute
NameNode Managed Files |Count|	1 Minute
Survival Datanodes	|Count|	1 Minute
Average RPC Invoking Time 	|ms|	1 Minute
Average RPC Operation Time 	|ms|	1 Minute
Open RPCs |Count|	1 Minute
RPC Invoking Queue Length |Count|	1 Minute

## JCQ Monitoring Metrics
**Topic**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Produced TPS	|Count/s|	1 Minute
Published Messages	|Count|	1 Minute
Published Message Requests	|Count|	1 Minute
Published Message Size	|byte|	1 Minute

**ConsumerGroup**

Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
Consumed TPS	|Count/s|	1 Minute
Buildup Messages	|Count|	1 Minute
Received Message Requests |Count|	1 Minute
Received Messages |Count|	1 Minute
Received Messages |Count|	1 Minute
Received Messages |Count|	1 Minute
Received Message Size	|byte|	1 Minute

## BDS Monitoring Metrics
Monitoring Metrics | Units | Minimum Monitoring Granularity
---|---|---
CheckPoint Write Page Per Second	|Count|	1 Minute
Log In Per Second	|Count|	1 Minute
Table Scan Per Second	|Count|	1 Minute
SQL Executions Per Second	|Count|	1 Minute
SQL Compilations Per Second	|Count|	1 Minute
Lock Timeout|Count|	1 Minute
Lock Dead|Count|	1 Minute
Lock Wait	|Count|	1 Minute
TPS |Quantity| 1 Minute
Buffer Hit Ratio	|%|	1 Minute
Current Connections |Count| 1 Minute
Network Inbound Rate	|bps|	1 Minute
Network Outbound Rate	|bps|	1 Minute
Disk Read IO|kbps|	1 Minute
Disk Write IO	|kbps|	1 Minute
Used Disk	|MByte|	1 Minute
Disk Usage 	|%|	1 Minute
Disk Queue Length |Count|1 Minute
CPU Usage	|%|	1 Minute
Memory Usage |%|	1 Minute
Processes Blocked	|Count|	1 Minute


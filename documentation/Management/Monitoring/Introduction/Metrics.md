# Cloud Product Monitoring Metrics
## VM Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
CPU Use Rate | Percentage of Current Non-idle CPUs | % | When the value is higher, the current instance load is higher. Windows instance can use the Task Manager to view CPU usage on the instance; when sorted by CPU, the programs that are consuming the server's CPU resources can be found. Linux instances can use the top command to view the CPU usage. Execute command top in the command line after login the instance and keyboard enter shift+p to let top rank as per CPU use rate and then the current CPU process can be viewed.
Memory Use Rate | Percentage of Current Memory Usage of Total Memory | % | When the value is higher, it means more current instance memory is used, which is the total memory of the currently used memory/the purchased instance. 
Disk Read Traffic| Average Disk Read Traffic per Second   |kbps|Read data bulk per second of current instance system disk. 
Disk Write Traffic| Average Disk Write Traffic per Second   |kbps|Write data bulk per second of current instance system disk.    
Network Input Traffic| Average Network Interface Input Traffic per Second   |bps|It indicates the average rate of instance input traffic and the traffic of instance network interface is monitored, including intranet and public network. If you need to view the input traffic and output traffic of public network separately, you may view the monitoring information of associate EIP of current instance. 
Network Output Traffic| Average Network Interface Output Traffic per Second   |bps|It indicates the average rate of instance output traffic and the traffic of instance network interface is monitored, including intranet and public network. If you need to view the input traffic and output traffic of public network separately, you may view the monitoring information of associate EIP of current instance. 

## Cloud Disk Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Disk Read Bandwidth | Read Throughput of A Single Cloud Disk |bps |Throughput means the data bulk that can be successfully transmitted in unit time
Disk Write Bandwidth | Write Throughput of A Single Cloud Disk |bps|Throughput means the data bulk that can be successfully transmitted in unit time
Disk Read IOPS| Average times of random read I/O operations per second |Nr./Second|IOPS means Input/Output Operations per Second, i.e. numbers of I/O operations that can be handled per second, which is used to indicate the read-write (input/output) capacity of block storage
Disk Write IOPS| Average times of random write I/O operations per second |Nr./Second|IOPS means Input/Output Operations per Second, i.e. numbers of I/O operations that can be handled per second, which is used to indicate the read-write (input/output) capacity of block storage

## Public IP Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Public Network Input Package Number | EIP Average Input Data Package Number per Second |byte |Data package number input from public network via this EIP to user cloud resources per second
Public Network Output Package Number | EIP Average Output Data Package Number per Second |byte |Data package number sent by user cloud resources to public network via this EIP per second
Public Network Input Rate | EIP Average Input Traffic per Second |Nr./Second |Average data stream rate input from public network via this EIP to user cloud resources per second
Public Network Output Rate | EIP Average Output Traffic per Second |Nr./Second |Average data stream rate sent by user cloud resources to Public network via this EIP per second

## CDN Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Bandwidth Peak| Average bandwidth of traffic generated within 5 minutes |Mbits/s|－
Proportion of 4xx Return Code| Proportion of the number of 4xx status code in user request in the number of all requests |%|－
Proportion of 5xx Return Code| Proportion of the number of 5xx status code in user request in the number of all requests |%|－
Hit Ratio| Proportion of edge node hits in user request in the number of all requests |%|－
Public Network Output Traffic| Total traffic of all edge nodes of CDN service in unit time |Mbytes|－
Requests per Second| Total quantity of all edge nodes requested of CDN service per second |Count|－
Origin Server Availability| Proportion of the number of successful CDN back-to-origin station request in total number of back-to-origin request |Count|－
Origin Server Latency| Direct time difference from the CDN back-to-origin server request to source station response |Count|－

## MySQL/percona/MariaDB Monitoring Metrics
Monitoring Indicator | Definition | Unit |Description
---|---|---|---
CPU Use Rate| CPU Use Rate of Instance |%|－
Memory Use Rate| Memory Use Rate of Instance	|%|－
Total Usage of Hard Disk Space| The disk space usage of instance, including disk space overall usage, data space usage, log space usage, temporary file space usage and system file space usage. |MB|－
Incoming Network Traffic| Incoming Network Traffic |bps|－
Outgoing Network Traffic| Outgoing Network Traffic |bps|－
Instance Input Traffic per Second| Instance Input Traffic Per Second|bps|－
Instance Output Traffic per Second| Instance Output Traffic Per Second|bps|－
Execution Times of SQL Statement Per Second	| Execution Times of SQL Statement Per Second for the Instance |Times|－
Transaction Number Per Second	|Number of Transaction Processed Per Second for the Instance|Nr.|－
Number of Temporary Table	| Number of temporary table automatically created on hard disk when database executes SQL statement |Nr.|－
Current Total Connection Number| Current Total Connection Number	|Nr.|－
Current Active Connection Number| Current ActiveConnectionNumber	|Nr.|－
InnoDB Read Capacity Per Second	| InnoDB Read Data Bulk Per Second |B|－
InnoDB Writing Capacity Per Second| InnoDB Data Quantity Read Per Second	|B|－
InnoDB Cache Pool Read Hit Ratio	| InnoDB Cache Pool Read Hit Ratio |%|－
InnoDB Cache Pool Usage	| InnoDB Cache Pool Usage |%|－
InnoDB Cache Pool Dirty Block Rate	| Percentage of InnoDB Cache Pool Dirty Block |%|－
Times of InnoDB Read from Cache Pool per Second	| Times of InnoDB Read from Cache Pool Per Second |Times|－
Times of InnoDB Write to Cache Pool per Second	| Times of InnoDB Write to Cache Pool Per Second |Times|－
Times of InnoDB Log Physical Write Per Second| Times of InnoDB Physical Write to Log File Per Second	|Times|－
InnoDB Log fsync Write Quantity Completed Per Second 	| InnoDB fsync Write Quantity Completed to Log File Per Second |Nr.|－
COMDML | Database Execution Times of SQL Statement Per Second, including Insert, Delete, Insert_Select, Replace, Replace_Select, Select and Update|Nr.|－

## SQLServer Monitoring Metrics
Monitoring Indicator | Definition | Unit |Description
---|---|---|---
CPU Use Rate|CPU Resources Occupied by Running Programs	|%|	The higher the value is, the higher the current instance load is
Memory Use Rate|Percentage of Current Used Memory in Total Memory	|%|	The higher the value is, the more instance memories are used by the current instance.
Data Disk Use Rate|Total Hard Disk Volume Used at Present|%|	Used for the Used Space of Data Storage Hard Disk
Data Disk Usage|Usage of Current Disk to Total Volume of Hard Disk   	|MByte|	The higher the value is, the more the current instance hard disk is used.
Data Disk Write IOPS|Times of Writing Data Disk IO Per Second	|Times/Second|	Times of Writing Data Disk IO Per Second
Data Disk Read IOPS|Number of Reading Data Disk IO Per Second	|Nr./Second|	Number of Reading Data Disk IO Per Second
Network Input Rate|Network Input Traffic Per Second of Database Instance|kbps|	Network Input Traffic Per Second of Database Instance
Network Output Rate|Network Output Traffic Per Second of Database Instance|kbps|	Network Output Traffic Per Second of Database
Current total connection number|Total Connection Number of Active SQL	|Nr.|	Used for Determining the Maximum Concurrent User Number of the System
Average Transaction Number Per Second|Number of Transaction Submitted per Second	|Nr.|	Number of Transaction Submitted Per Second
Average Execution Times of SQL Statement per Second|Execution Times of SQL Statement per Second|Times|	Execution Times of SQL Statement Per Second
Buffer Hit Ratio|Referring to as the Percentage of Pages Found from the High-speed Buffer of the Buffer Area Rather than being Read from the Disk	|%|	90% indicates that 90% or above data request can obtain the required data from data buffer zone. The value of this metric is beyond 90% to the best and it can be increased by increasing available memory of SQL Server generally.
Number of Pages wrote by checkpoint per second | Number of Pages Refreshed to Disk per Second when SQL Server Occurs Checkpoint or Other Operations Asking for Refreshing Dirty Pages are Required|Nr.|	Number of Pages Refreshed to Disk per Second when SQL Server Occurs Checkpoint or Other Operations Asking for Refreshing Dirty Pages are Required
Login Times Per Second|Average Times of Login Started Per Second	|Times|	Average Times of Login Started Per Second
Average Full Table Scan Times Per Second|Full Time Scan Times per Second	|Times|	Full table scan may be basic table scan or full index scan. As full table scan needs a lot of time, if the frequency of full table scan is too high, the performance may be affected.
SQL Compiling Times per Second|+C92SQL Compiling Times per Second	|Nr.|	SQL compiling times per second indicates the times that the compilation code path is entered, including compilation caused by recompiling of statement in SQL Server. 
Lock Time-out Times per Second|Time-out Lock Requests per Second	|Nr.|	Time-out Lock Requests per Second, including Requests to NOWAIT Lock
Deadlock Times per Second|Requests per Second for Lock leading to Deadlock	|Nr.|	Requests per Second for Lock leading to Deadlock Deadlock is very harmful to the scalability of application program, and may lead to bad user experience. The counter had better be 0.
Lock Waiting times per Second|Requests per Second for Lock requiring caller to Wait	|Times|	Requests per Second for Lock Requiring Caller to Wait
Blocking Process Number|Current Total Number of Processes Blocked due to Various Reasons|Nr.|	Current Total Number of Processes Blocked due to Various Reasons
Disk Queue Length|Average Length of Disk Read and Write Queue|Nr.|Average Length of Read Queue and Write Queue of Selected Disk

## DRDS Monitoring Metrics
Monitoring Indicator | Definition | Unit |Description
---|---|---|---
CPU Use Rate|CPU Resources Occupied by Running Programs	|%|	The higher the value is, the higher the current instance load is
Average Network Inflow per Second|Network Input Traffic per Second of Instance	|byte|	Network Input Traffic of Instance per Second
Average Network Outflow per Second|Network Output Traffic per Second of Instance	|byte|	Network Output Traffic of Instance per Second
Current Connection Number|Total Connection Number of Active SQL	|Nr.|	Used for Determining the Maximum Concurrent User Number of the System

## LB Monitoring Metrics
**Application Load Balancer**

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Created New Connections|Added New HTTP/HTTPS (limited to 7 layers) Requests from clients to load balancer during the statistical period	|Nr.|－
Active Connections|Time value of TCP connections in all ESTABLISHED status from clients to load balancer	|Nr.|－
Added New Requests|Connections created during the statistical period from clients to load balancer	|Nr.|－
Server Error|Request Failures during the statistical period due to server failure	|Nr.|－
Client Error|Request Failures during the statistical period due to client failure	|Nr.|－

**Network Load Balancer**

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Created New Connections|TCP Connections created during the statistical period from the client to the target through the load balancer	|Nr.|－
Active Connections|Total quantity of concurrent TCP traffic (or connections) from the client to the target through the load balancer. This indicator includes the TCP connections in SYN_SENT and ESTABLISHED statuses.	|Nr.|－
Added New Requests|Connections created during the statistical period from clients to load balancer	|Nr.|－
Input Traffic Rate|Input Traffic per Second during the statistical period from the client to the target through the load balancer|bps|－
Output Traffic Rate| Input Packets per Second during the statistical period from the client to the load balancer|byte|－
Input Bytes|Total Traffic during the statistical period from client to the target through the load balancer|Bytes|－


## JCS for Redis Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Memory Usage|Used Memory for Cloud Cache Instances |MB|	It refers to the total used memory, and the larger the value is, the more the memory is used
Memory Use Rate|Percentage of Currently Used Memory in the Total Memory	|%|	If this value is higher, more current instance memory is used; it is the current used memory/total purchased instance memory
Inbound and Outbound Traffic|Input and Output Traffic of Cloud Cache via Intranet per Second	|bps|	It indicates the average rate of input and output instance traffic, and the traffic of instance network interface is monitored.
QPS|Instance Query per Second	|Times|	Query Per Second refers to the number of queries on instances per second, and the more times there is, the higher the access traffic is
Hit Ratio|Probability of Requests Hitting the Cache	|%|	Efficiency of executing instance operation orders, currently being the number of orders correctly executed/total number of orders sent
Number of Instance Keys|Current Number of Cloud Cache Instance Keys|Nr.|	Total number of current keys in instance storage

## JCS for MongoDB Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
CPU Use Rate|Percentage of CPU usage in total CPU capacity	|%|－
Memory Use Rate|Percentage of memory usage in total memory  	|%|－
Disk Use Rate|Percentage of disk usage in total disk capacity	|%|－
IOPS Use Rate|Percentage of IOPS usage in total IOPS capacity	|%|－
Network Input Traffic|Average Input Traffic per Second|Nr.|－
Network Output Traffic|Average Output Traffic per Second|byte|－
Network Requests|Average Requests per Second|byte|－
Connections|Current Connections|byte|－
op_command|Total Number of Runcommand Operations|Nr.|－
op_delete|deleteTotal Number of Delete Operations|Nr.|－
op_getmore|getmoreTotal Number of Operations|Nr.|－
op_insert|insertTotal Number of Operations|Nr.|－
op_query|queryTotal Number of Operations|Nr.|－
op_update|updateTotal Number of Operations|Nr.|－
cursor_timeoute|Cursor Time-out Times|Nr.|－
cursor_totalOpen|Total Number of Current Cursors|Nr.|－
globalLock_cp_total|Total Number of Current Waiting Read Locks|Nr.|－
globalLock_cp_readers|Total Number of Current Waiting Write Locks|Nr.|－
globalLock_cp_writers|Total Number of Current Waiting Locks|Nr.|－
wt_bytes_read_into_cache|Read Size to Memory|byte|－
wt_bytes_written_from_cache|Write Size from Memory to Disk|byte|－
wt_max_bytes_config|Memory Configuration Size|byte|－



## Native Container Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
CPU Use Rate|Percentage of Current Non-idle CPU  	|%|	If this value is higher, the current instance load is higher   
Memory Use Rate|Percentage of Current Used Memory in Total Memory     	|%|	The value is higher, more current instance memory is used; it is the current used memory/total purchased instance memory.
Disk Read Throughput|Average Disk Read Traffic per Second	|kbps|	Read data bulk per second of current instance system disk. 
Disk Write Throughput| Average Disk Write Traffic per Second	|kbps|	Write data bulk per second of current instance system disk.
Network Input Rate|Average Network Interface Input Traffic per Second	|bps|	It indicates the average rate of instance input traffic and the traffic of instance network interface is monitored, including intranet and public network. If you need to view the input traffic and output traffic of public network separately, you may view the monitoring information of associate EIP of current instance.
Network Output Rate| Average Network Interface Output Traffic per Second	|bps|	It indicates the average rate of instance output traffic and the traffic of instance network interface is monitored, including intranet and public network. If you need to view the input traffic and output traffic of public network separately, you may view the monitoring information of associate EIP of current instance.

## OSS Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Public Network Input Traffic|Uplink Traffic Generated by Uploading Data from Local End to JD Cloud Object Storage Service via Public Network	|byte|－
Public Network Output Traffic|Downlink Traffic Generated by Downloading Data from JD Cloud Object Storage Service to Local End via Public Network	|byte|－
Total Get Request|All GET Requests in Calling Object Storage Service API	|Times|－
Total Put Request|All GET Requests in Calling Object Storage Service API	|Times|－
Total Request|Currently, the sum of GET and PUT Requests	|Times|－
CDN Input Traffic|Uplink Traffic Generated by Downloading Data from JD Cloud Object Storage Service to Local End via Public Network	|byte|－
CDN Output Traffic|Back-to-origin Downlink Traffic Generated by Downloading OSS Data from JD Cloud CDN Service Layer	|byte|－

## Auto Scaling Monitoring
**Auto Scaling Group**

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Maximum Number of Instances|Maximum Number of Instances in Auto Scaling Groups	|Nr.|	The user shall define the maximum number of instances in the auto scaling group, and the auto scaling instance cannot exceed this value
Minimum Number of Instances|Minimum Number of Instances in Auto Scaling Groups	|Nr.|	The user shall define the minimum number of instances in the auto scaling group, and the auto scaling instance cannot be lower than this value
Service Instance Number|Service Instance Number in Auto Scaling Groups	|	Nr.|Number of Currently Running Instances in the Auto Scaling Group
Sum of Instances|Current Instance Number of Auto Scaling Groups	|Nr.|	Sum of Number of Current Instances in All Status in the Auto Scaling Group
Number of Added Instances|Number of Instances Added in Auto Scaling Groups|Nr.|	Adding Record of Number of Instances in the Auto Scaling Group
Number of removed instances|Number of Removing Instances from Auto Scaling Groups	|Nr.|	Record of Number of Instances in the Auto Scaling Group

**VM Instance**

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
CPU Use Rate|Percentage of Current Non-idle CPU	|%|	The higher the value, the higher the current instance load. Windows instances can use the Task Manager to view CPU usage on the instance; when sorted by CPU, the programs that are consuming the server's CPU resources can be found. Linux instances can use the top command to view the CPU usage. Execute command top in the command line after login the instance and keyboard enter shift+p to let top rank as per CPU use rate and then the current CPU process can be viewed.
Memory Use Rate	|Percentage of Current Memory Usage of Total Memory|%|	The higher the value, the more current instance memories are used, which is the currently used memory/the total member of the purchased instance. 
Network Input Rate|Average Network Interface Input Traffic per Second  	|bps|	It indicates the average rate of instance input traffic and the traffic of instance network interface is monitored, including intranet and public network. If you need to view the input traffic and output traffic of public network separately, you may view the monitoring information of associate EIP of current instance. 
Network Output Rate|Average Network Interface Output Traffic per Second	|%|	It indicates the average rate of instance output traffic and the traffic of instance network interface is monitored, including intranet and public network. If you need to view the input traffic and output traffic of public network separately, you may view the monitoring information of associate EIP of current instance. 

## JD MapReduce Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Usage of Non-heap Memory|Usage Size of jvm Non-heap Memory	|mb|	The gc time of the process, how much memory is released after gc and the memory usage of the process can be viewed by modifying parameters through monitoring.
Usage of Heap Memory|Usage Size of jvm Heap Memory	|mb|	The gc time of the process, how much memory is released after gc and the memory usage of the process can be viewed by modifying parameters through monitoring.
HDFS Usage|HDFS Usage	|Byte|	Monitor hdfs usage of cluster; it is advised that the use rate shall not be too high, for the disk space needs to be reserved for task calculation. Early warnings can be set about whether machines need to be added and useless data needs to be deleted.
Total Number of NameNode Block|Total Number of NameNode Block	|Nr.|	1 Minute
Total File Number Managed by NameNode	|Total File Number Managed by NameNode|Nr.|	Monitor and set early warnings on the total file number, by which whether there is task of large amount of write files and deleting large number of files can be viewed.
Survival Number of datanode Node|Survival Number of datanode Node	|Nr.|	Too much loss of nodes may lead to block loss.
Average rpc Calling Time|－|Millisecond|－
Average rpc Running Time|－|Millisecond|Usually when hdfs meets an emergency of an exception task of large amount of access, the parameter will become very large, leading to slow running in the process of other users accessing hdfs, and thereby influence the task execution time.
Current Open Number of rpc|Current Open Number of rpc|Nr.|－
Length of queue called by PRC currently|－|Nr.|If the callqueue queue value always stays at a higher level, for example, the CallQueue length equals to handlerX100 to NN, then NN may have received a large number of requests or it takes long time for the server to process rpc request and leads to call heap, etc.

## JCQ Monitoring Metrics
**Topic**

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Produced TPS| Number of Messages Produced per Second	|Piece/Second|－
Number of Released Messages|Number of Messages Sent by Producers to the Subject	|Nr.|－
Request Number of Released Messages|API Request Number of Messages Sent by Producers to the Subject|	Times|－
Size of Published Messages|Size of Messages Sent by Producers to the Subject	|byte|－

**ConsumerGroup**

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Consumed TPS|Number of Consumed Messages Per Second	|Piece/Second|－
Number of Buildup Messages|Number of Buildup Messages in the Subscription Relation|	Nr.|－
Request Number of Received Messages|Request Number Extracted by Consumers in the Subscription Relation|Nr.|－
Number of Received Messages|Number of Messages Extracted by Consumers in the Subscription Relation|Nr.|－
Total Number of Received Messages|Total Number of Messages Extracted by Consumers in the Subscription Relation	|Nr.|－
Size of Received Messages|Size of Messages Consumed by Consumers in the Subscription Relation	|byte|－

## BDS Monitoring Metrics

Monitoring Indicator | Definition | Unit |Description
---|---|---|---
Number of Pages Written for Checkpoint per Second|	Number of Pages Written for Checkpoint per Second|Nr.|－
|Login Times per Second|	Login Times per Second|Times|－
|Full Table Scan Times per Second|Average Full Table Scan Times per Second	|Times|－
SQL Execution Times|SQL Execution Times per Second	|Times|－
SQL Compiling Times|SQL Compiling Times per Second	|Times|－
Lock Time-out Times|Instance Lock Time-out Times per Second	|Times|－
Deadlock Times|	Deadlock Times of Instance per Second|Times|－
Lock Waiting Times|Instance Lock Waiting Times per Second	|Times|－
Transaction number per second|Average Number of Transaction Processed per Second for the Instance	|Nr.|－
Buffer Hit Ratio|	Buffer Hit Ratio |%|－
Current Total Connection Number| Current Total Instance Connection Number|Nr.|－
Network in Rate|Network out Rate |bps|－
Network out Rate|Network out Rate |bps|－
Hard Disk Read IO|	IO Read Times per Second by Disk |kbps|－
Hard Disk Write IO|	IO Write Times per Second by Disk |kbps|－
Hard Disk Usage|Instance Disk Usage	|Gbyte|－
Hard Disk Use Rate|Instance Disk Use Rate |%|－
Disk Queue Length|	Disk IO Queue Length|Nr.|－
CPU Use Rate|	CPU Use Rate of Instance|%|－
Number of Blocking Processes|Number of Blocked Process	|Nr.|－


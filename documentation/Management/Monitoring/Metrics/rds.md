# JCS for SQL Server
The servicecode of product line monitoring data: sqlserver. When monitoring data acquisition, role in tags is assigned to M.

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---
database.sqlserver.kvm.cpu.util | CPU使用率 |CPU Usage | % | 
database.sqlserver.kvm.memory.usage|内存使用率| Memory Usage | % |
database.sqlserver.kvm.disk1.used | 磁盘使用量| Used  Disk | MB | 
database.sqlserver.kvm.disk1.usedpercent | 硬盘使用率 | Disk Usage | % | 
database.sqlserver.kvm.network.bytes.incoming|网络入速率|Network Inbound Rate| Kbps |
database.sqlserver.kvm.network.bytes.outgoing|网络出速率|Network Outbound Rate|Kbps |
database.sqlserver.kvm.disk1.counts.read|硬盘读IO|Disk Read Throughput| Times/second|
database.sqlserver.kvm.disk1.counts.write|硬盘写IO|Disk Read Throughput| Times/second|
database.sqlserver.CheckPoint|每秒检查点写入Page数|CheckPoint Write Page Per Second|Nr.|
database.sqlserver.Logins|每秒登录次数|Log In Per Second|Times|
database.sqlserver.FullScans|每秒全表扫描次数|Table Scan Per Second|Times|
database.sqlserver.QPS|平均每秒SQL执行次数|SQL Execution Per Second|Times|
database.sqlserver.SQLCompilations|每秒SQL编译数|SQL Compilation Per Second|Times|
database.sqlserver.LockTimeout|每秒锁超时次数|Lock Timeout Per Second|Times|
database.sqlserver.Deadlock|每秒死锁次数|Lock Dead Per Second|Times|
database.sqlserver.LockWaits|每秒锁等待次数|Lock Wait Per Second|Times|
database.sqlserver.TPS|每秒事务数|TPS|Nr.|
database.sqlserver.BufferHit|缓存命中率|Buffer Hits|%|
database.sqlserver.ConnectCount|总连接数|Connections|Nr.|
database.sqlserver.kvm.disk1.currentdiskqueuelength|磁盘队列长度|Disk QueueLength|Nr.|
database.sqlserver.BlockProcess|阻塞进程数|Processes Blocked|Nr.|

# JCS for MySQL
The servicecode of product line is database. Master and backup instances and read-only instances belong to different indicator groups (groupcode). The requirements for querying monitoring data are as follows:
- Master and backup instances: the groupcode they subordinate to is database. When monitoring data acquisition, role in tags is assigned to M.
- Read-only instances: the groupcode they subordinate to is db_ro. When monitoring data acquisition, role in tags is assigned to M.

Monitoring indicator data are as follows:   

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|---  
database.docker.cpu.util | CPU使用率 | CPU Usage | % | 
database.docker.memory.pused | 内存使用率 | Memory Usage | % | 
database.docker.disk1.used.kb|硬盘空间总使用量|Used Disk| MB | 
database.docker.network.incoming|网络接收流量|Network Inbound Traffic|Kbps|
database.docker.network.outgoing|网络发送流量|Network Outbound Traffic|Kbps|
database.DBMonitor.ByteIO.Input|实例每秒输入流量|Instance In Traffic|bps|
database.DBMonitor.ByteIO.Output|实例每秒输出流量|Instance Out Traffic|bps|
database.DBMonitor.QPSTPS.QPS|每秒SQL语句执行次数|SQL Execution Per Second|Times|
database.DBMonitor.QPSTPS.TPS|每秒事务数|TPS|Nr.|
database.DBMonitor.ConnectCount|当前总连接数| Connections|Nr.|
database.DBMonitor.ConnectCount.Running|当前活跃连接数|Current Active Connections|Nr.|
database.DBMonitor.TempTable.Count|临时表数量|Temporary Tables|Nr.| 
database.DBMonitor.InnodbBuffer.ReadHitRatio|InnoDB缓存池读命中率|InnoDB BufferPool Hits|%|
database.DBMonitor.InnodbBuffer.Usage|InnoDB缓存池利用率|InnoDB BufferPool Usage|%|
database.DBMonitor.InnodbBuffer.DirtyPagePercent|InnoDB缓存池脏块率|InnoDB BufferPool DirtyBlock|%|
database.DBMonitor.InnodbBytesRW.Read|InnoDB每秒读取量|InnoDB ReadThroughput Per Second|Bytes|
database.DBMonitor.InnodbBytesRW.Write|DB每秒写入量|IInnoDB WriteThroughput Per Second|Bytes|
database.DBMonitor.InnodbTimesRW.Read|InnoDB每秒向缓冲池的读次数|InnoDB BufferPool Read Per Second|Times|
database.DBMonitor.InnodbTimesRW.Write|InnoDB每秒向缓冲池的写次数|InnoDB BufferPool Write Per Second|Times|
database.DBMonitor.InnodbLog.Write|InnoDB日志每秒物理写次数|InnoDB Log Physical Write Per Second|Times|
database.DBMonitor.InnodbOSLog.Fsyncs|InnoDB日志每秒完成的fsync写数量|InnoDB Log Fsync Write Per Second|Nr.|
database.DBMonitor.CommitTimes.ComSelect|Select|Select|times/second|
database.DBMonitor.CommitTimes.ComInsert|Insert|Insert|times/second|
database.DBMonitor.CommitTimes.ComUpdate|Update|Update|times/second|
database.DBMonitor.CommitTimes.ComDelete|Delete|Delete|times/second|
database.DBMonitor.CommitTimes.ComReplace|Replace|Replace|times/second|
database.DBMonitor.CommitTimes.ComReplaceSelect|Replace_Select|times/second|
database.DBMonitor.CommitTimes.ComInsertSelect|Insert_Select |Insert_Select|times/second|
database.DBMonitor.Stored.Userdata|用户数据使用量|Used UserData|MB|
database.DBMonitor.Stored.Sysdata|系统数据使用量|Used SystemData|MB|
database.DBMonitor.Stored.Logdata|日志文件使用量|Used LogFiles|MB|
database.docker.disk.iops.read|读IOPS|Read IOPS|Times/second|
database.docker.disk.iops.write|写IOPS|Write IOPS|Times/second|
database.DBMonitor.Innodb.table_locks_immediate|表锁次数|Table locks immediate|Times/second|
database.DBMonitor.Innodb.table_locks_waited|等待表锁次数|Table locks waited|Times/second|
database.DBMonitor.Innodb.innodb_row_lock_waits|InnoDB等待行锁次数|InnoDB row lock waits|Times/second|
database.DBMonitor.Innodb.innodb_row_lock_time_avg|InnoDB平均获取行锁时间|InnoDB row lock time avg|ms|
database.DBMonitor.slowlog_count|慢查询|Slow query|Times|
database.DBMonitor.Seconds_Behind_Master|只读延迟|Readonly latency|s| Master and backup instances have no such indicator
database.docker.disk1.used|硬盘使用率|Disk Usage|%|
database.docker.disk1.total.kb|硬盘总大小|Disk Size|KB|

# JCS for Percona
The servicecode of product line is percona. Master and backup instances and read-only instances belong to different indicator groups (groupcode). The requirements for querying monitoring data are as follows:
- Master and backup instances: the groupcode they subordinate to is percona. When monitoring data acquisition, role in tags is assigned to M.
- Read-only instances: the groupcode they subordinate to is percona_ro. When monitoring data acquisition, role in tags is assigned to M.

Monitoring indicator data are as follows:  

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|--- 
database.docker.cpu.util | CPU使用率 | CPU Usage | % | 
database.docker.memory.pused | 内存使用率 | Memory Usage | % | 
database.docker.disk1.used.kb|硬盘空间总使用量|Used Disk| MB | 
database.docker.network.incoming|网络接收流量|Network Inbound Traffic|Kbps|
database.docker.network.outgoing|网络发送流量|Network Outbound Traffic|Kbps|
database.DBMonitor.ByteIO.Input|实例每秒输入流量|Instance In Traffic|bps|
database.DBMonitor.ByteIO.Output|实例每秒输出流量|Instance Out Traffic|bps|
database.DBMonitor.QPSTPS.QPS|每秒SQL语句执行次数|SQL Execution Per Second|Times|
database.DBMonitor.QPSTPS.TPS|每秒事务数|TPS|Nr.|
database.DBMonitor.ConnectCount|当前总连接数| Connections|Nr.|
database.DBMonitor.ConnectCount.Running|当前活跃连接数|Current Active Connections|Nr.|
database.DBMonitor.TempTable.Count|临时表数量|Temporary Tables|Nr.| 
database.DBMonitor.InnodbBuffer.ReadHitRatio|InnoDB缓存池读命中率|InnoDB BufferPool Hits|%|
database.DBMonitor.InnodbBuffer.Usage|InnoDB缓存池利用率|InnoDB BufferPool Usage|%|
database.DBMonitor.InnodbBuffer.DirtyPagePercent|InnoDB缓存池脏块率|InnoDB BufferPool DirtyBlock|%|
database.DBMonitor.InnodbBytesRW.Read|InnoDB每秒读取量|InnoDB ReadThroughput Per Second|Bytes|
database.DBMonitor.InnodbBytesRW.Write|DB每秒写入量|IInnoDB WriteThroughput Per Second|Bytes|
database.DBMonitor.InnodbTimesRW.Read|InnoDB每秒向缓冲池的读次数|InnoDB BufferPool Read Per Second|Times|
database.DBMonitor.InnodbTimesRW.Write|InnoDB每秒向缓冲池的写次数|InnoDB BufferPool Write Per Second|Times|
database.DBMonitor.InnodbLog.Write|InnoDB日志每秒物理写次数|InnoDB Log Physical Write Per Second|Times|
database.DBMonitor.InnodbOSLog.Fsyncs|InnoDB日志每秒完成的fsync写数量|InnoDB Log Fsync Write Per Second|Nr.|
database.DBMonitor.CommitTimes.ComSelect|Select|Select|times/second|
database.DBMonitor.CommitTimes.ComInsert|Insert|Insert|times/second|
database.DBMonitor.CommitTimes.ComUpdate|Update|Update|times/second|
database.DBMonitor.CommitTimes.ComDelete|Delete|Delete|times/second|
database.DBMonitor.CommitTimes.ComReplace|Replace|Replace|times/second|
database.DBMonitor.CommitTimes.ComReplaceSelect|Replace_Select|times/second|
database.DBMonitor.CommitTimes.ComInsertSelect|Insert_Select |Insert_Select|times/second|
database.DBMonitor.Stored.Userdata|用户数据使用量|Used UserData|MB|
database.DBMonitor.Stored.Sysdata|系统数据使用量|Used SystemData|MB|
database.DBMonitor.Stored.Logdata|日志文件使用量|Used LogFiles|MB|
database.docker.disk.iops.read|读IOPS|Read IOPS|Times/second|
database.docker.disk.iops.write|写IOPS|Write IOPS|Times/second|
database.DBMonitor.Innodb.table_locks_immediate|表锁次数|Table locks immediate|Times/second|
database.DBMonitor.Innodb.table_locks_waited|等待表锁次数|Table locks waited|Times/second|
database.DBMonitor.Innodb.innodb_row_lock_waits|InnoDB等待行锁次数|InnoDB row lock waits|Times/second|
database.DBMonitor.Innodb.innodb_row_lock_time_avg|InnoDB平均获取行锁时间|InnoDB row lock time avg|ms|
database.DBMonitor.slowlog_count|慢查询|Slow query|Times|
database.DBMonitor.Seconds_Behind_Master|只读延迟|Readonly latency|s| Read-only instances have no such indicator
database.docker.disk1.used|硬盘使用率|Disk Usage|%|



# JCS for MariaDB
The servicecode of product line is mariadb. Master and backup instances and read-only instances belong to different indicator groups (groupcode). The requirements for querying monitoring data are as follows:
- Master and backup instances: the groupcode they subordinate to is mariadb. When monitoring data acquisition, role in tags is assigned to M.
- Read-only instances: the groupcode they subordinate to is mariadb_ro. When monitoring data acquisition, role in tags is assigned to M.

Monitoring indicator data are as follows:  

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|--- 
database.docker.cpu.util | CPU使用率 | CPU Usage | % | 
database.docker.memory.pused | 内存使用率 | Memory Usage | % | 
database.docker.disk1.used.kb|硬盘空间总使用量|Used Disk| MB | 
database.docker.network.incoming|网络接收流量|Network Inbound Traffic|Kbps|
database.docker.network.outgoing|网络发送流量|Network Outbound Traffic|Kbps|
database.DBMonitor.ByteIO.Input|实例每秒输入流量|Instance In Traffic|bps|
database.DBMonitor.ByteIO.Output|实例每秒输出流量|Instance Out Traffic|bps|
database.DBMonitor.QPSTPS.QPS|每秒SQL语句执行次数|SQL Execution Per Second|Times|
database.DBMonitor.QPSTPS.TPS|每秒事务数|TPS|Nr.|
database.DBMonitor.ConnectCount|当前总连接数| Connections|Nr.|
database.DBMonitor.ConnectCount.Running|当前活跃连接数|Current Active Connections|Nr.|
database.DBMonitor.TempTable.Count|临时表数量|Temporary Tables|Nr.| 
database.DBMonitor.InnodbBuffer.ReadHitRatio|InnoDB缓存池读命中率|InnoDB BufferPool Hits|%|
database.DBMonitor.InnodbBuffer.Usage|InnoDB缓存池利用率|InnoDB BufferPool Usage|%|
database.DBMonitor.InnodbBuffer.DirtyPagePercent|InnoDB缓存池脏块率|InnoDB BufferPool DirtyBlock|%|
database.DBMonitor.InnodbBytesRW.Read|InnoDB每秒读取量|InnoDB ReadThroughput Per Second|Bytes|
database.DBMonitor.InnodbBytesRW.Write|DB每秒写入量|IInnoDB WriteThroughput Per Second|Bytes|
database.DBMonitor.InnodbTimesRW.Read|InnoDB每秒向缓冲池的读次数|InnoDB BufferPool Read Per Second|Times|
database.DBMonitor.InnodbTimesRW.Write|InnoDB每秒向缓冲池的写次数|InnoDB BufferPool Write Per Second|Times|
database.DBMonitor.InnodbLog.Write|InnoDB日志每秒物理写次数|InnoDB Log Physical Write Per Second|Times|
database.DBMonitor.InnodbOSLog.Fsyncs|InnoDB日志每秒完成的fsync写数量|InnoDB Log Fsync Write Per Second|Nr.|
database.DBMonitor.CommitTimes.ComSelect|Select|Select|times/second|
database.DBMonitor.CommitTimes.ComInsert|Insert|Insert|times/second|
database.DBMonitor.CommitTimes.ComUpdate|Update|Update|times/second|
database.DBMonitor.CommitTimes.ComDelete|Delete|Delete|times/second|
database.DBMonitor.CommitTimes.ComReplace|Replace|Replace|times/second|
database.DBMonitor.CommitTimes.ComReplaceSelect|Replace_Select|times/second|
database.DBMonitor.CommitTimes.ComInsertSelect|Insert_Select |Insert_Select|times/second|
database.DBMonitor.Stored.Userdata|用户数据使用量|Used UserData|MB|
database.DBMonitor.Stored.Sysdata|系统数据使用量|Used SystemData|MB|
database.DBMonitor.Stored.Logdata|日志文件使用量|Used LogFiles|MB|
database.docker.disk.iops.read|读IOPS|Read IOPS|Times/second|
database.docker.disk.iops.write|写IOPS|Write IOPS|Times/second|
database.DBMonitor.Innodb.table_locks_immediate|表锁次数|Table locks immediate|Times/second|
database.DBMonitor.Innodb.table_locks_waited|等待表锁次数|Table locks waited|Times/second|
database.DBMonitor.Innodb.innodb_row_lock_waits|InnoDB等待行锁次数|InnoDB row lock waits|Times/second|
database.DBMonitor.Innodb.innodb_row_lock_time_avg|InnoDB平均获取行锁时间|InnoDB row lock time avg|ms|
database.DBMonitor.slowlog_count|慢查询|Slow query|Times|
database.DBMonitor.Seconds_Behind_Master|只读延迟|Readonly latency|s| Read-only instances have no such indicator
database.docker.disk1.used|硬盘使用率|Disk Usage|%|
database.docker.disk1.used.kb|硬盘空间总使用量|Used Disk| MB |



# JCS for PostgreSQL
The servicecode of product line is pg. Master and backup instances and read-only instances belong to different indicator groups (groupcode). The requirements for querying monitoring data are as follows:
- Master and backup instances: the groupcode they subordinate to is pg. When monitoring data acquisition, role in tags is assigned to M.
- Read-only instances: the groupcode they subordinate to is pg_ro. When monitoring data acquisition, role in tags is assigned to M.

Monitoring indicator data are as follows:  

metric | Chinese Name | English Name | Unit | Description
---|--- |--- |---|--- 
database.DBMonitor.ConnectCount|当前总连接数| Connections|Nr.|
database.DBMonitor.ConnectCount.Running|当前活跃连接数|Current Active Connections|Nr.|
database.docker.memory.pused| 内存使用率 | Memory Usage | % |
database.docker.cpu.util | CPU使用率 | CPU Usage | % | 
database.DBMonitor.Stored.Userdata|用户数据使用量|Used UserData|KB|
database.DBMonitor.Stored.Logdata|日志文件使用量|Used LogFiles|KB|
database.docker.disk1.usage|硬盘空间使用率|Disk Usage|%|
database.docker.disk.iops.read|读IOPS|Read IOPS|Times/second|
database.docker.disk.iops.write|写IOPS|Write IOPS|Times/second|
database.docker.network.bytes.incoming|每秒输入流量|Network Inbound Traffic|bps
database.docker.network.bytes.outgoing|每秒输出流量|Network Outbound Traffic|bps
database.DBMonitor.Rows.Fetched|扫描行数|Rows Fetched|rows/second|
database.DBMonitor.Rows.Returned|返回行数|Rows Returned|rows/second|
database.DBMonitor.Lock.AccessShare|访问共享锁|ACCESS SHARE|Nr.|
database.DBMonitor.Lock.RowShare|行共享锁|ROW SHARE|Nr.|
database.DBMonitor.Lock.RowExclusive|行唯一锁|ROW EXCLUSIVE|Nr.|
database.DBMonitor.Lock.ShareUpdateExclusive|共享更新唯一锁|SHARE UPDATE EXCLUSIVE|Nr.|
database.DBMonitor.Lock.Share|共享锁|SHARE|Nr.|
database.DBMonitor.Lock.ShareRowExclusive|共享行唯一锁|SHARE ROW EXCLUSIVE| Nr.|
database.DBMonitor.Lock.Exclusive|唯一锁|EXCLUSIVE|Nr.|

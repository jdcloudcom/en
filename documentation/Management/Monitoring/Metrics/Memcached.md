## JCS for Memcached

The servicecode of the product monitoring data is memcached and the indicator information provided is as follows:

metric | Chinese Name  | English Name |Unit | Description
---|--- |--- |--- |--- 
jmiss.memcached.instance.connected_clients|当前连接数|Connections|Nr.|
jmiss.memcached.instance.used_memory|内存使用总量|Used Memory|MB|
jmiss.memcached.instance.rejected_connections|拒绝连接数|Rejected Connections|Times|
jmiss.memcached.instance.bytes_read|读取总字节数|Inbound_Bytes|Byetes|
jmiss.memcached.instance.bytes_written|发送总字节数|Outbound_Bytes|Byetes|
jmiss.memcached.instance.curr_items|存储数据总数|Stored Data|Entries|
jmiss.memcached.instance.evictions|lru淘汰的item数|Items Eliminated by LRU|Nr.|
jmiss.memcached.instance.get_hits|get命令命中次数|Get_Hit|Times|
jmiss.memcached.instance.get_misses|get命令未命中次数|Get_Miss|Times|
jmiss.memcached.instance.cmd_get|get命令使用次数|Get_Used|Times|
jmiss.memcached.instance.delete_hits|delete命令命中次数|Delete_Hit|Times|
jmiss.memcached.instance.delete_misses|delete命令未命中次数|Delete_Miss|Times|
jmiss.memcached.instance.incr_hits|incr命令命中次数|Incr_Hit|Times|
jmiss.memcached.instance.incr_misses|incr命令未命中次数|Incr_Miss|Times|
jmiss.memcached.instance.decr_hits|decr命令命中次数|Decr_Hit|Times|
jmiss.memcached.instance.decr_misses|decr命令未命中次数|Decr_Miss|Times|
jmiss.memcached.instance.cas_hits|cas命令命中次数|Cas_Hit|Times|
jmiss.memcached.instance.cas_misses|cas命令未命中次|Cas_Miss|Times|
jmiss.memcached.instance.touch_hits|touch命令命中次数|Touch_Hit|Times|
jmiss.memcached.instance.touch_misses|touch命令未命中次数|Touch_Miss|Times|
jmiss.memcached.instance.cmd_touch|touch命令使用次数|Touch_Used|Times|
jmiss.memcached.instance.cmd_set|set命令使用次数|Set_Used|Times|
jmiss.memcached.instance.cmd_flush|flush命令使用次数|Flush_Used|Times|
jmiss.memcached.instance.auth_cmds|认证命令处理次数|Authentication|Times|
jmiss.memcached.instance.auth_errors|认证失败次数|Authentication Failure|Times|
jmiss.memcached.machine.net_in|入口带宽|Entrance Bandwidth|MBps|
jmiss.memcached.machine.net_out|出口带宽|Outlet Bandwidth|MBps|
jmiss.memcached.machine.cpupercent|CPU使用率|CPU Usage|%|
jmiss.memcached.machine.mempercent|内存使用率|Memory Usage|%|

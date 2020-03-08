## JCS for Elasticsearch

The servicecode for getting the product monitoring data is es and indicator data are provided from the dimensions of cluster and node. Details are as follows:

### Cluster  

metric | Chinese Name  | English Name |Unit | Description
---|--- |--- |--- |---
jmiss.es.instance.status | 集群状态 | Cluster status | None |
jmiss.es.instance.search_qps | 集群查询QPS  | Cluster search qps | Count/s|
jmiss.es.instance.index_qps|集群写入QPS | Cluster indexing qps | Count/s| 　


### Node
When indicator data of a node is getting, a specific node ID shall be designated for nodeId in tags. The monitoring indicators provided are as follows:  

metric | Chinese Name  | English Name |Unit | Description
---|--- |--- |--- |---
miss.es.node.query_latency| 节点搜索查询延迟 | Node query latency| ms |
jmiss.es.node.index_latency | 节点index延迟 | Node index latency |ms|
jmiss.es.node.fs_used_percent_0_100| 节点磁盘使用率 | Node disk usage | % | 
jmiss.es.node.jvm_heap_used_percent | 节点HeapMemory使用率 | Node heap memory usage | % | 
jmiss.es.container.cpu.util | 节点cpu使用率 | Node os cpu usage | % |
jmiss.es.node.index_active| index线程池active线程数 |Node index thread_pool active threads |count|  
jmiss.es.node.index_queue | index线程池线程队列大小 | Node index thread_pool queue | count|  
jmiss.es.node.index_rejected | index线程池reject任务数 | Node index thread_pool reject | count| 
jmiss.es.node.search_active |search线程池active线程数| Node search thread_pool active threads | count| 
jmiss.es.node.search_queue | search线程池线程队列大小 | Node search thread_pool queue | count| 
jmiss.es.node.search_rejected |search线程池reject任务数 | Node search thread_pool reject | count| 
jmiss.es.node.write_active | write线程池active线程数 | Node write thread_pool active threads | count| 
jmiss.es.node.write_queue| write线程池线程队列大小 |Node write thread_pool | count|  | 
jmiss.es.node.write_rejected |write线程池reject任务数| Node write thread_pool reject | count| 


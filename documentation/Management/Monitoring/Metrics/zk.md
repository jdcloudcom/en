## Distributed coordination service Zookeeper
The servicecode of this product for getting monitoring data is zk.
The indicator data provided are as follows:
metric | 中文名称  | English Name |Unit | Description
---|--- |--- |--- |--- 
jmiss.zk.node.client_connections|客户端连接数|client connections|count|
jmiss.zk.node.znode_count|Znode节点数量|znode count|count|
jmiss.zk.node.outstanding_requests|请求排队数|outstanding requests|count|
jmiss.zk.node.avg_request_latency|平均请求延时|avg request latency|ms|  


```
Note: There are many nodes under a single Zookeeper instance. When the node monitoring data is searched, it needs to designate key of tags as nodeID and corresponding NodeID value shall be designated for value of tags. If no designation is made, data of different nodes will be aggregated by tags.
```



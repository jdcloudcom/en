## Distributed Transaction
The servicecode for getting the product monitoring data is jdts and indicator data are provided from the dimensions of cluster and node. Details are as follows:  

### Cluster
Metric | 中文名称 | English Name |Unit | Description
---|--- |--- |--- |--- 
dts.cluster.tps|分布式事务tps|dts TPS|times/second|

### Node
When indicator data of a node are getting, key of tags shall be designated as nodeId and specific node ID shall be designated for value of tags.

Metric | 中文名称 | English Name |Unit | Description
---|--- |--- |--- |--- 
jdts.container.cpu.util|节点CPU使用率|node cpu usage|%|
jdts.container.memory.usage|节点内存使用率|node memory usage|%|

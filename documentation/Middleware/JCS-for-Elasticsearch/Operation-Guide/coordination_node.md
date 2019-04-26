## Coordinator Node
Like Load Balancer, coordinator nodes are used for responding customers’ requests and balancing load of each node. By adding coordinator nodes, tasks of balance node load undertaken by data nodes can be released, benefiting large clusters.</br>

JCS for Elasticsearch supports setting of dedicated coordinator nodes to improve cluster performance. Coordinator nodes can be checked on the Cluster Creation Page while creating a cluster, and specification change of coordinator node is also supported via **More**-**Change Configuration** after creating a cluster.</br>

```
Note:
As the coordinator node requires the master node to synchronize cluster status information, the load of the entire cluster will be increased if excess coordinator nodes are added to the cluster. Please select reasonably.
```




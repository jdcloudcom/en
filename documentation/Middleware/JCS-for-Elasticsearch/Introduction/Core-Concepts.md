## Core Concepts
See the following for the concepts and their interpretations used in the JCS for Elasticsearch product.
### Cluster 
Represent a cluster that has multiple nodes, among which one is the master node; this is for the internal of the cluster. JCS for Elasticsearch's decentralization concept is for the external of the cluster. From the external, the JCS for Elasticsearch cluster is logically a whole.
### Node
Represent a node, and a running JCS for Elasticsearch instance is called a node. The nodes in the cluster share the data storage and query requests. When a node joins the cluster or is removed from the cluster, the cluster will re-distribute all the data evenly.
### Index
Represent indexes, equivalent to a table in the database, here the relational document is stored. Store a document into an index so that it can be retrieved and queried, and the new document will replace the old document when the document already exists.
### Shards
An index can be divided into multiple shards. Shards are containers of data. Documents are stored in shards. A shard is a bottom work unit that holds only a portion of all data. Shards are also reassigned to nodes in the cluster. As the scale of your cluster expands or shrinks, JCS for Elasticsearch automatically migrates the shards across nodes so that the data is still evenly distributed across the cluster.
### Replicas
Represent an index replica; a replica is just a copy of the primary shard, and JCS for Elasticsearch can set up replicas of multiple indexes. A replica is a redundant backup that protects data from being lost in the event of a hardware failure. When a shard of a node is damaged or lost, it can be recovered from the replica and serve for read operations such as searching and returning documents. JCS for Elasticsearch will automatically perform load balancer for search requests.
### Recovery
Represent data recovery or called as data re-distribution. JCS for Elasticsearch will reassign index shards according to the load of the machines when there are nodes adding or exiting. There will also be data recovery when the failed nodes restart.

## FAQ
### What is ELK
ELK=elasticsearch+Logstash+kibana </br>
JCS for Elasticsearch: Background distributed storage and full-text retrieval. </br>
logstash: Log processing, "porter".</br>
kibana: Data visualization display. </br>
ELK architecture creates a powerful management chain for data distributed storage, visual query and log resolution. The three cooperate with each other and complement each other to complete distributed big data processing work.
### What is Lucene
Lucene is a set of open source program library for full-text retrieval and search, supported and provided by Apache Software Foundation. Lucene provides a simple yet powerful application program API for full-text indexing and searching. Lucene's goal is to provide software developers with an easy-to-use toolkit for easy full-text retrieval in the target system, or to build a complete full-text search engine based on this.
### What is JCS for Elasticsearch
JCS for Elasticsearch is a distributed, scalable, real-time search and data analysis engine that supports multi-condition retrieval, statistics and statement of structured and unstructured text. It is based on the full-text search engine library Apache Lucene and provides a set of simple RestfulAPI, which supports a variety of structured or unstructured data storage and query. With a comprehensive monitoring system and integrated data visualization tool kibana, users can be more focused on the realization of business logic.

### The cluster has green, yellow and red statuses; what do they represent respectively
The health status is a very important monitoring item of the JCS for Elasticsearch cluster, which is used to indicate whether the cluster is working normally generally. The types of health statuses are as follows:

* Green: Indicated by 0 in the cluster status of the cloud monitoring, indicating that all the primary shards and replicas have been assigned, and the cluster is 100% available. The cluster is in the healthiest status. 
* Yellow: Indicated by 1 in the cluster status of cloud monitoring, indicating that all the primary shards have been shared; but at least one replica is missing, and high availability is weakened to some extent; but the results of data retrieval can still be returned normally. 
* Red: Indicated by 2 in the cluster status of cloud monitoring, indicating that at least one primary shards (and all its replicas) are missing. At this time, the results of the query are partially missing and there are problems with the cluster. 

### What is the difference among primary node, data node, dedicated primary node and coordinator node
 * Primary node: The primary responsibility is contents related to cluster operations, such as creating or deleting indexes, tracking which nodes are parts of the cluster, and deciding which fragments are allocated to related nodes. By default, a node in any cluster may be selected as the primary node; operations such as indexing data, searching and querying will take up a lot of cpu, memory and io resources; in order to ensure the stability of a cluster, separating the primary node from the data node is a better choice.
 * Data node: It is mainly the node to store the index data, mainly performing addition, deletion, change and check operations, aggregation operation, etc. on the document. The data node has high requirements on cpu, memory, io. The status of the data nodes needs to be monitored during optimization, and new nodes need to be added to the cluster when resources are insufficient.
 * Dedicated primary node: It is used to perform the cluster management task, including tracking all nodes in the cluster, tracking the number of indexes in the cluster, tracking the number of fragments belonging to each index, maintaining routing information of nodes in the cluster, updating cluster status after status update and others, but not retaining data and not responding to data upload requests so as to improve the cluster stability.
 * Coordinator node: It is similar to the Load Balancer, and it is used to process routing requests, process searching, distribution, indexing operations, etc.

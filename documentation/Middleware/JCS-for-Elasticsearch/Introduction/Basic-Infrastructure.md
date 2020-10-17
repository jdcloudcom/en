## Basic Architecture
JCS for Elasticsearch provides JCS for Elasticsearch + Kibana hosting service, allowing users to easily expand JCS for Elasticsearch clusters and cluster monitoring alarms.
![Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/ESEn.png)

| Concept | Interpretation |
| :- | :- |
| ES Node | A running JCS for Elasticsearch instance is called a node, and the nodes in the cluster share the data storage and query requests. |	
| Load Balancer | Provides load balancer function for cluster access, providing users with unique access within VPC and blocking the cluster nodes from users. By doing so, on one hand, Auto Scaling of cluster is fitted and its high availability is guaranteed; in case of changes of ES cluster nodes, node information will be automatically updated; on the other hand, user operation is simplified and users are not necessary to pay attention to changes of information such as cluster node IP and port. |
Kibana | Combines JCS for Elasticsearch's data visualization platform for searching and viewing data stored in JCS for Elasticsearch indexes, providing multi-dimensional presentation of data. |

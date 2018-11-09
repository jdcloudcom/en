## Basic Architecture
JCS for Elasticsearch provides JCS for Elasticsearch + kibana hosting service, allowing users to easily expand JCS for Elasticsearch clusters and cluster monitoring alarms.
! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/ES Basic Architecture-01.png)

| Concept | Interpretation |
| :- | :- |
| ES Node | A running JCS for Elasticsearch instance is called a node, and the nodes in the cluster share the data storage and query requests. |	
| Load Balancer | Provides load balancer function for cluster access, providing users with unique access within VPC and blocking the cluster nodes from users. |
Kibana | Combines JCS for Elasticsearch's data visualization platform for searching and viewing data stored in JCS for Elasticsearch indexes, providing multi-dimensional presentation of data. |

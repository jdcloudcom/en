## Function Related

**1. In the case of a sudden increase in business volume, how to change the cluster configuration and keep the business normal**</br>
In the case of a sudden increase in business volume, it is recommended to conduct node expansion first and then reduce the number of nodes for contraction. For the expansion and contraction of cluster data nodes, the cluster needs to be restarted to take effect. Prior to restarting, please note that:</br>
- You should make sure the instance status is normal (green).</br>
- The index contains at least 1 replica, and the resource utilization rate is not very high (It can be viewed on the Cluster Monitoring page. For instance, the node CPU utilization rate is about 80%, and the node HeapMemory utilization rate is about 50%).</br>

**2. Does JCS for Elasticsearch support logstash connection**</br>
It supports Logstash connection, and it is recommended that Logstash version shall be consistent with JCS for Elasticsearch version, and the user needs to apply for one Virtual Machine to install and configure Logstash.</br>

**3. What is the difference among primary node, data node, dedicated primary node and coordinator node**</br>
 - **Primary node**: The primary responsibility involves contents related to cluster operations, such as creating or deleting indexes, tracking which nodes are parts of the cluster, and deciding which fragments are allocated to related nodes. By default, a node in any cluster may be selected as the primary node; operations such as indexing data, searching and querying will take up a lot of CPU, memory and IO resources; in order to ensure the stability of a cluster, separating the primary node from the data node is a better choice.</br>
 - **Data node**: It is mainly the node to store the index data, mainly performing addition, deletion, change and check operations, aggregation operation, etc. on the document. The data node has high requirements on cpu, memory, io. The status of the data nodes needs to be monitored during optimization, and new nodes need to be added to the cluster when resources are insufficient.</br>
 - **Dedicated primary node**: It is used to perform the cluster management task, including tracking all nodes in the cluster, tracking the number of indexes in the cluster, tracking the number of fragments belonging to each index, maintaining routing information of nodes in the cluster, updating cluster status after status update, etc., but not retaining data and not responding to data upload requests so as to improve the cluster stability.</br>
 - **Coordinator node**: It is similar to the Load Balancer, and it is used to process routing requests, process searching, distribution, indexing operations, etc.</br>
 
 **4. The cluster has green, yellow and red statuses; what do they represent respectively**</br>
The health status is a very important monitoring item of the JCS for Elasticsearch cluster, which is used to indicate whether the cluster is working normally generally. The types of health statuses are as follows:</br>

* Green: Indicated by 0 in the cluster status of the cloud monitoring, indicating that all the primary shards and replicas have been assigned, and the cluster is 100% available. The cluster is in the healthiest status. </br>
* Yellow: Indicated by 1 in the cluster status of cloud monitoring, indicating that all the primary shards have been shared; but at least one replica is missing, and high availability is weakened to some extent; but the results of data retrieval can still be returned normally. </br>
* Red: Indicated by 2 in the cluster status of cloud monitoring, indicating that at least one primary shard (and all its replicas) are missing. At this time, the results of the query are partially missing and there are problems with the cluster. </br>

**5. What to do when the cluster is red or yellow**</br>
When the cluster status is RED, it means there is no primary shard assigned in the cluster. When the cluster status is yellow, it means there is no replica assigned. We recommend you to use the following API to see why shard is not assigned to a certain node.</br>
```
GET _cluster/allocation/explain
```
According to our service experience, shard may not be assigned in the following situations:</br>
- No node has enough bucket for this shard.</br>
- If shard is replica, it might be the case that the primary shard may be unassigned or in the status of initializing.</br>

**6. How to deal with the case that the CPU and load of some nodes are normal while that of the other nodes are idle**</br>
This is a result caused by uneven load of the cluster. The uneven load of ES cluster can be caused by various reasons. At present, it is caused mainly by unreasonable shard settings and uneven size of segment.</br>

**7. Will ES service be affected when the cluster configuration is changed**</br>
Any change in the cluster configuration will cause the cluster to restart. At present, ES clusters are restarted in the rolling mode. When the cluster status is normal (green) and the index contains at least 1 replica, if the resource utilization rate is not very high (It can be viewed on the Cluster Monitoring page. For instance, the node CPU utilization rate is about 80%, and the node HeapMemory utilization rate is about 50%), then the cluster can continuously provide services during restarting. But this is recommended to be operated during non-rush hours.</br>






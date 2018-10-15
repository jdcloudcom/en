## Manage Cluster
### Cluster Status
The status information of the cluster can be viewed in the basic information on the cluster list page and the cluster details page. Instances in the instance list can be filtered by "Availability Zone", "Cluster Status" and "Billing Information".</br>
 ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Cluster Status-01.png)
 ! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Cluster Status-02.png)
The cluster status is the status that reflects whether the cluster is in the process of being changed or in normal use, including: Running, error, deleting, pending and changing configuration. The specific meanings are as follows:</br>

Status | Meaning
:---: | :---:
Running | The cluster is created, and there are no actions such as configuration changes, cluster restarts, etc. It is the status where the cluster can be normally accessed and used. |
Error | An error occurred while the cluster was running. |
Deleting | Cluster deletion operation, which takes a certain amount of time to process, during which some service accesses are affected, such as Kibana, data storage, query, etc. |
Pending | Cluster pending operation, which takes a certain amount of time to process, during which some service accesses are affected, such as Kibana, data storage, query, etc. |
Changing Configuration | Operation of changing cluster configuration, which takes a certain amount of time to process, during which some service accesses are affected, such as Kibana, data storage, query, etc. |
</br>
The health status is a very important monitoring item of the JCS for Elasticsearch cluster, which is used to indicate whether the cluster is working normally generally. The types of health statuses are as follows:</br>

|Color | Health Status	|
|:--:|:--: |
| Green | All the primary shards and replicas have been assigned, and the cluster is 100% available.	|
| Yellow | All the primary shards have been shared, but at least one replica is missing. High availability is weakened to some extent.	|
| Red | At least one primary shards (and all its replicas) are missing. |
### Kibana Access Settings
Users can use Kibana to query and analyze the data stored in JCS for Elasticsearch.
! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/kibana Access Settings-01.png)

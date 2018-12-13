## View Status Information
In the cluster list page, you can use the cluster status to determine whether the cluster is running normally.</br>
 ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/集群状态-01.png)

The cluster status is the status that reflects whether the cluster is in the process of being changed or in normal use, including running, error, deleting, pending and changing configuration. The specific meanings are as follows:</br>

Status | Meaning
:---: | :---:
Running | The cluster is created, and there are no actions such as configuration changes, and cluster restarts. It is the status where the cluster can be normally accessed and used. |
Error | An error occurred while the cluster was running. |
Deleting | Cluster deletion operation, which takes a certain amount of time to process, during which some service accesses are affected, such as Kibana, data storage, and query. |
Pending | Cluster pending operation, which takes a certain amount of time to process, during which some service accesses are affected, such as Kibana, data storage, and query. |
Changing Configuration | Operation of changing cluster configuration, which takes a certain amount of time to process, during which some service accesses are affected, such as Kibana, data storage, and query.|
</br>

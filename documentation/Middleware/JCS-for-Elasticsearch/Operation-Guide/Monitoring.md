## View Monitoring Information
Upon successfully creating clusters, click the cluster name to enter the cluster detail page to view detailed monitoring information about the cluster running and assist cluster operation and maintenance supervision. You can also view it via "Monitoring-Resource Monitoring-Monitoring of JCS for Elasticsearch".</br>
### Operation Steps
1. Access [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters), and enter the cluster list page.</br>

2. Click a cluster name in the Cluster List Page to enter the Detail Page.</br>

3. Enter the Monitoring Page by click [Cluster Monitoring] in the Detail Page.</br>

4. The monitoring period can be selected from "1 hour", "6 hours" and "12 hours" based on the current time, or can be selected from the calendar time period on your own.</br>

5. Click **Set Alarm Rules** in the upper right corner, and it will jump to the Monitoring page after clicking for alarm rules settings.</br>

![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/监控ES.png)
 
Monitoring indicators include: Cluster health status, cluster query QPS, cluster write QPS, node CPU use rate, node disk use rate and node HeapMemory use rate.</br>

| Monitoring Items	| Description	|
|:--:|:--:|
| Cluster Status | 0 means green, the cluster is in the healthiest status; 1 means yellow, the high availability of the cluster is affected, but the search results are still complete; 2 means red, the cluster is abnormal, the search can only return part of the data |
| Cluster Query QPS (Count/Second) 	| Reflects how busy the cluster query operations are |
| Cluster Write QPS (Count/Second) | Reflects how busy the cluster write operations are |
| CPU Node Use Rate (%) | If the CPU use rate is too high, it will decrease the cluster node processing capacity or even cause system breakdown |
| Node Disk Use Rate (%) 	| Too high disk use rate will cause the failure of data being written normally |
| Node HeapMemory Use Rate (%) |Will affect query performance when the value is too high | 
| Cluster Data Nodes | Node Count of Current Cluster Data | 
| Cluster Indexes | Index Count of Current Cluster | 
| Cluster Disk Used |Disk Used by Current Cluster | 
| Cluster Nodes | Total Node of Current Cluster. During configuration changes, the count may be double. | 
| Cluster Documents |Total Document of Current Cluster | 
| Cluster Shards |Total Shard of Current Cluster | 
| Cluster Shards |Total Shard in Current Cluster Migration | 
| Cluster Shards |Total Primary Shard of Current Cluster | 
| Shards in Cluster Initialization |Total Shard in Current Cluster Initialization | 
| Unassigned Shards of Cluster |Total Unassigned Shard in Current Cluster | 
| Node Search Latency (ms) | Node Search Request Time Consumption | 
| Node Index Latency (ms) | Node Index Request Time Consumption | 
| Index Thread Pool Active Threads (Piece) |Index Thread Pool Active Threads in Unit Statistical Period (1min) | 
| Index Thread Pool Thread Queue Sizes (Piece) |If the queue size is always very large, please consider expanding your cluster | 
| Index Thread Pool Reject Tasks (Piece) |Index Thread Pool Reject Tasks in Unit Statistical Period (1min) | 
| Search Thread Pool Active Threads (Piece) |Search Thread Pool Active Threads in Unit Statistical Period (1min) | 
| Search Thread Pool Thread Queue Sizes (Piece) |If the queue size is always very large, please consider expanding your cluster | 
| Search Thread Pool Reject Tasks (Piece) |Search Thread Pool Reject Tasks in Unit Statistical Period (1min) | 
| Write Thread Pool Active Threads (Piece) |Write Thread Pool Active Threads in Unit Statistical Period (1min) | 
| Write Thread Pool Thread Queue Sizes (Piece) |If the queue size is always very large, please consider expanding your cluster | 
| Write Thread Pool Reject Tasks (Piece) |Write Thread Pool Reject Tasks in Unit Statistical Period (1min) | 





The health status is a very important monitoring item of the JCS for Elasticsearch cluster, which is used to indicate whether the cluster is working normally generally. The types of health statuses are as follows:</br>

|Color | Health Status	|
|:--:|:--: |
| green | All the primary shards and replicas have been assigned, and the cluster is 100% available.	|
| yellow | All the primary shards have been shared, but at least one replica is missing. High availability is weakened to some extent.	|
| red | At least one primary shards (and all its replicas) are missing. |

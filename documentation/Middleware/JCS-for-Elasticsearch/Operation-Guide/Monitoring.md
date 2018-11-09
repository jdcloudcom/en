## Monitor Cluster
Click the cluster name to enter the cluster details page to view detailed monitoring information about the cluster running and assist cluster operation and maintenance supervision. You can also enter "Monitoring-Resource Monitoring-JCS for Elasticsearch” and view it.</br>
1. Click the refresh icon to refresh the status within the page, and the image supports zooming in.</br>
2. Duration options: The monitoring period can be selected from “15 minutes”, “1 hour”, “6 hours”, “1 day”, “7 days” and “30 days” of the current time, or can be selected of the calendar time period.</br>
3. Click **Set Alarm Rules** in the upper right corner, and it will jump to the Monitoring page after clicking for alarm rules settings.</br>
! [Query 1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/Monitoring Cluster-01.png)
 
Monitoring indicators include: Cluster health status, cluster query QPS, cluster write QPS, node CPU use rate, node disk use rate and node HeapMemory use rate.</br>

| Monitoring Items 	| Description 	|
|:--:|:--:|
| Cluster Status | 0 means green, the cluster is in the healthiest status; 1 means yellow, the high availability of the cluster is affected, but the search results are still complete; 2 means red, the cluster is abnormal, the search can only return part of the data |
| Cluster Query QPS (Count/Second) 	| Reflects how busy the cluster query operations are |
| Cluster Write QPS (Count/Second) | Reflects how busy the cluster write operations are |
| CPU Node Use Rate (%) | If the CPU use rate is too high, it will decrease the cluster node processing capacity or even cause system breakdown |
| Node Disk Use Rate (%) 	| Too high disk use rate will cause the failure of data being written normally |
| Node HeapMemory Use Rate (%) | Will affect query performance when the value is too high |

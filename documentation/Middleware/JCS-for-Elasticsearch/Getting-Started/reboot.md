## Restart Cluster
Restart is divided into instance-level restart and node-level restart or restart and forced restart. It can be used to quickly resolve some cluster problems.

### Preconditions
1. The cluster is in running or error status.</br>
2. For rolling restart, users shall guarantee that the cluster status is green and the index includes at least one replica to ensure the normal read-write and constant service during restart.</br>

### Operation Steps

1. Log in [JCS for Elasticsearch Console]](https://es-console.jdcloud.com/clusters).</br>
2. Click [Operations-More-Restart] in the Instance List Page to enter the "Restart" Page.</br>
- **Node Restart**: Applicable to scenarios where a cluster is required to be restarted after its parameter is adjusted to bring the configuration into effect.</br>
- **Instance Restart**: Applicable to scenarios where the cluster is in wrong status or has a longer service response time; restart is used to quickly verify if the problematic cluster can be improved.</br>
- **Rolling Restart**: It can be used only when the cluster is in green status. The index shall include at least one replica to ensure the normal read-write and constant service during restart though longer time consumption in general.</br>
- **Forced Restart**: Not limited by cluster status. The forced restart may cause ES cluster service instability at restart stage but it takes shorter time in general.</br>

```
Please note:
In rolling restart, users can only restart another node after the current node is restarted and the cluster is in green status;
In forced restart, another node is restarted immediately after the current node is restarted so as to ignore the waiting time of status changes.
```

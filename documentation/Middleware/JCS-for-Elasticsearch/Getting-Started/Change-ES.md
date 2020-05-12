## Change Configuration
JCS for Elasticsearch supports users in following up business demands, dynamically adjusting node specifications, storage specifications, node count and dedicated primary node specifications, and coordinator node specifications and count, in which the node count supports capable shrinkage while other parameters only support capacity expansion. Only one attribute can be modified in one time. If you want to modify several configuration parameters, please separately modify them. After changing the configuration, the cluster details can be queried to see if the configuration change is successful.</br>

### Preconditions
1. The instance status is running.</br>
2. For capacity shrinkage of node count, you must also guarantee that the dedicated primary node is enabled and the cluster status is green</br>

### Operation Steps
1. Log in [JCS for Elasticsearch Console](https://es-console.jdcloud.com/clusters).</br>
2. Select clusters to be expanded in the list page of JCS for Elasticsearch. Click **Operation-More-Change Configuration** to set the cluster parameter changes.</br>

 ![查询1](https://github.com/jdcloudcom/cn/blob/Elasticsearch/image/Internet-Middleware/JCS%20for%20Elasticsearch/变配_2020.png)

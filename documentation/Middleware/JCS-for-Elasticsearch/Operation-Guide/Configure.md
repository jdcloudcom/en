##  Advanced Configuration
Users can modify certain configurations of elasticsearch.yml files on Cluster Management page. These configurations can be used by users for cluster tuning and will take effect only after the configuration-modified clusters are re-enabled. Currently, the following configurable items are supported:</br>

|Parameter| Parameter Description| Value Restrictions
:--|:---|:---
|action.destructive_requires_name | Delete indexes with specified names | true or false, false by default. If the configuration is that false supports deletion of indexes by wildcards, such wildcards can be used to delete indexes in batches. 
|indices.fielddata.cache.size| Percentage of Java Heap Memory allocated to field data | Percent, format: 1% - 100%, unlimited by default, i.e. 100%. This value is suggested to be configured as 40% of JVM Heap for starting benchmark test.
|indices.memory.index_buffer_size |Index buffer size |Percent, format: 1% - 100%, 10% by default. Adding index buffer can increase write speed.
|indices.query.bool.max_clause_count | Specify the maximum number of clauses allowable in Lucene-BooleanQuery | Positive integer, 1024 by default. If the queried clauses exceed the allowable number, TooManyClauses errors will occur. 
|thread_pool.search.queue_size| Threadpool seach queue size | Positive integer, 1000 by default.
|thread_pool.write.queue_size |Threadpool write queue size | Positive integer, 200 by default.


```
Please note:
If cluster' health status is YELLOW or RED, or there is any index without replica in the cluster, update of advanced configuration will cause service instability or data loss. Therefore, operations for modifying configurations are suggested when cluster's status is GREEN and all indexes therein have replicas
```

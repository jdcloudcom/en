## Specification Capacity Assessment
The JCS for Elasticsearch is the distributed multi-node cluster. Before use, please assess the resource capacity at first. We provide some general configuration suggestions for your reference according to our realistic experiences. In case of expanding the business scale, the cluster can be elastically expanded on line and in real time to meet the use requirements.
### Storage Capacity Assessment
Factors affecting bucket size of JCS for Elasticsearch are as follows:</br>
- Replica Count: The replica is helpful for increasing data reliability, but will increase storage cost. The default and suggested replica count is 1.</br>
- Index Expense: In addition to the original data, ES requires storage indexes and other data. Generally, the data expansion rate is 10%.</br>
- Internal mission expense: ES itself will use about 20% disk space for field merging, logs and others. Thus, 20% space shall be reserved.</br>
- Operation system reservation: The operating system will also use about 5% disk space for processing essential process and preventing disk fragmentation and other faults.</br>

Therefore, the actual space of ES can be estimated with the formula below:

```
Actual space = Source Data * (1 + Replica Count) * (1 + Index Expense) / (1-Operating System Reservation)/(1 - Internal Task Expense) 
        = Source Data * (1 + Replica Count) * 1.45
        = Source Data *2.9
```

To guarantee the stable operation of service, it is suggested that at least 50% bucket be reserved on the basis of the above evaluation. Therefore, it is suggested that the storage capacity for application be:

```	
Storage Capacity = Source Data * (1 + Replica Count) * 1.45 * (1 + 0.5)
        = Source Data * 4.35
```

### Instance Type Assessment
Make the instance type assessment from two views, i.e. the node specification and the node count. Suggestions for selection of instance type are as follows:</br>
- We suggest that you at least select 3 nodes to ensure the high node fault tolerance of the ES instance.</br>
- If you have the demand of extremely-high storage capacity, it is suggested that you select nodes of high specification rather than a quantity of low-specification nodes. In this way, the cluster performance and stability can be improved.</br>
- After selecting the instance type, it can further determine if the instance type is suitable by observing CPU utilization rate, cluster search QPS, QPS writing-in of clusters and other indexes.</br>
### Multipart Count Assessment
Each ES index can be divided into several multiparts. The index multipart count will affect cluster stability and performance. Once being determined, the multipart count cannot be changed easily, because such change requires the prior planning:</br>
- It is suggested that a single multiparts not be greater than 30GB under a small specification node and not be greater than 50GB under a high specification node. The overlarge multipart will slow down the ES fault recovery speed, while the undersize shard will cause the insufficient memory.</br>
- The multipart count shall be matched with the node number as much as possible. The multipart count can be equal to the node number or be the integral multiple of the node number, for convenience of uniform distribution of multiparts on all data nodes.</br>

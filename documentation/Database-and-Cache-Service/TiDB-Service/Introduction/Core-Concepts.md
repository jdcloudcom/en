# Core Concept


| Concept | Explaination |
| - | - |
|Instance|A distributed database service which contains multiple TiDB and TiKV nodes. Wherein, specification and quantity of the node of TiDB and TiKV will determine the service performance of the instance|
|TiDB|It is responsible for receiving SQL requests and processing SQL-related logic. Through PD, it can find the TiKV address which is used for storing the data needed for calculation, interact with TiKV to obtain the data and finally return the results|
|TiKV|It is responsible for storing data. From the outside, TiKV is a distributed Key-Value storage engine which can provide transactions|
|PD| Placement Driver (PD) s the management module for the entire cluster. It is responsible for storing the meta information of the cluster, performing scheduling and load balancer for TiKV cluster AND assigning the globally unique and incremental transaction ID|


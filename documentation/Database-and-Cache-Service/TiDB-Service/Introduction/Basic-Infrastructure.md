# Infrastructure Architecture

TiDB cluster is mainly divided into three components:
- **TiDB Server**
TiDB Server is responsible for receiving SQL requests and processing SQL-related logic. Through PD, it can find the TiKV address which is used for storing the data needed for calculation, interact with TiKV to obtain the data and finally return the results.

- **TiKV Server**
TiKV Server is responsible for storing data. From the outside, TiKV is a distributed Key-Value storage engine which can provide transactions.

- **PD Server**
Placement Driver (PD) is the management module for the entire cluster. It is responsible for storing the meta information of the cluster, performing scheduling and load balancer for TiKV cluster AND assigning the globally unique and incremental transaction ID.

**Architectural Diagram**
![Infrastructure Architecture](../../../../image/TiDB/Basic-Infrastructure.png)

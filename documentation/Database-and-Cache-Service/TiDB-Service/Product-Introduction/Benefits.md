# Features
## Horizontal Elastic Expansion
Distributed TiDB can expand seamlessly as your data grows, just by adding more devices to meet the business growth, and as for the application layer, it is not necessary to worry about the storage’s capacity and throughput. TiDB dynamically performs the adjustment of load balancer based on the factors such as storage, network and distance to ensure better read and write performance.

## High Compatibility for MySQL
TiDB's communication protocol is highly compatible with MySQL, hence you can easily replace your MySQL with TiDB to support your business just like using the stand-alone database with almost no need of modifying the code. MySQL's client-side management tools and all surrounding tools in community can be directly accessed, which can greatly reduce learning and usage costs.

## Self-recovery for Fault and Multiple Tasks in Different Places
TiDB uses multiple replicas to perform data storage and relies on the most advanced Raft majority election algorithm within the history to ensure 100% high-consistency and high availability of data. The replica can be deployed in different data centers cross-region. When the master replica fails, it can automatically perform switches without manual intervention and can automatically guarantee the continuity of the service, which can realize the real sense of performing multiple tasks in different places.

## One-Stop HTAP Solution
As a typical OLTP database, TiDB has powerful OLAP functions. One data can support OLTP & OLAP simultaneously. It does not need traditional cumbersome ETL process, which reduces the delay of data analysis and greatly improves instantaneity.

## Online DDL
Update TiDB Schema as Needed. Adding new columns and indexes will not affect the current business.
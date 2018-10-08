# Core Concepts

Terms|Descriptions
:---|:---
JCS for Redis|JCS for Redis is a high-performance Key-Value storage system (Cache and Store) that supports JCS for Redis open source and is distributed according to protocol.
Instance ID|Each instance corresponds to a user space, and the instance is the basic unit that uses JCS for Redis. JCS for Redis has different connection limits, bandwidth, CPU processing capabilities, etc. for individual instances based on different capacity specifications. Users can see a list of instance IDs they purchased in the console.
Primary and secondary Nodes Instance|Refers to JCS for Redis instance with Primary and secondary architecture. The capacity and performance that can be expanded by the Primary and secondary nodes instance are limited.
High-performance Cluster Instance|Refers to a JCS for Redis instance with cluster scalability. Clustered instances have better scalability and performance, but they also have some limits in functionality.
Connection Address|The host address used to connect to JCS for Redis, displayed as a domain, can be found in Instance Information > Connection Information.
Connection Password|The password used to connect to JCS for Redis.
The Eviction Policy|Is consistent with JCS for Redis' eviction strategy. See: http://redis.io/topics/lru-cache for details.
DB|The Database in JCS for Redis. JCS for Redis supports 256 DBs: DB 0 to DB 255. Written to the 0th DB by default.

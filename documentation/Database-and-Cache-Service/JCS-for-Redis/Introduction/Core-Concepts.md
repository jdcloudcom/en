# Core Concepts

Terms|Descriptions
:---|:---
Redis|JD Cloud Redis is a high-performance Key-Value storage system (Cache and Store) that supports Redis open source and is distributed according to protocol.
Instance ID|Each instance corresponds to a user space, and the instance is the basic unit that uses Redis. JD Cloud Redis has different connection limits, bandwidth, CPU processing capabilities, etc. for individual instances based on different capacity specifications. Users can see a list of instance IDs they purchased in the console.
Primary and secondary Nodes Instance|Refers to the JD Cloud Redis instance with Primary and secondary architecture. The capacity and performance that can be expanded by the Primary and secondary nodes instance are limited.
High-performance Cluster Instance|Refers to a Redis instance with cluster scalability. Clustered instances have better scalability and performance, but they also have some limits in functionality.
Connection Address|The host address used to connect to Redis, displayed as a domain, can be found in Instance Information > Connection Information.
Connection Password|The password used to connect to Redis.
The Eviction Policy|Is consistent with Redis's eviction strategy. See: http://redis.io/topics/lru-cache for details.
DB|The Database in Redis. JD Cloud Redis supports 256 DBs: DB 0 to DB 255. Written to the 0th DB by default.

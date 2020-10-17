# Redis Command Support

JCS for Redis of JD Cloud is based on Versions 2.8 and 4.0. For specific semantics of commands, please refer to: [http://redis.io/commands](http://redis.io/commands)

## Command Operation Supported

Instructions for identifications in the command operation table are as follows:

| Identification | Description  |  
|:--:|:--:|
| ✓ |  Indicating support  |
| x |  Indicating no support  |
| - |  Indicating that the command is unavailable   |
| Restricted |  Indicating supported but restricted |



#### Keys
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  DEL      |  ✓   | ✓  |  ✓  | ✓   | 
|  DUMP     |   ✓   | ✓  |  ✓  | ✓   | 
|  EXISTS   |  ✓   | ✓  |  ✓  | ✓   | 
|  EXPIRE   |   ✓   | ✓  |  ✓  | ✓   | 
|  EXPIREAT |   ✓   | ✓  |  ✓  | ✓   | 
|  MOVE     |   ✓   | ✓  |  ✓  | ✓   | 
|  PERSIST  |   ✓   | ✓  |  ✓  | ✓   | 
|  PEXPIRE  |   ✓   | ✓  |  ✓  | ✓   | 
|  PEXPIREAT|   ✓   | ✓  |  ✓  | ✓   | 
|  PTTL     |   ✓   | ✓  |  ✓  | ✓   | 
|  RANDOMKEY  |   ✓   |  x  |  ✓  | ✓   | 
|  RENAME   |   ✓   | x  |  ✓  | ✓   | 
|  RENAMENX |   ✓   | x  |   Restricted   |  Restricted   | 
|  RESTORE  |   ✓   | ✓  |  Restricted  | Restricted   | 
|  SORT     |   ✓   | ✓  |  ✓  | ✓   | 
|  TTL      |   ✓   | ✓  |  ✓  | ✓   | 
|  TYPE     |   ✓   | ✓  |  ✓  | ✓   | 
|  SCAN     |   ✓   | ✓  |  ✓  | ✓   | 
|  OBJECT   |   x   | x  |  ✓  | ✓   | 
|  UNLINK   |   -   | -  |  ✓  | ✓   | 
|  KEYS     |   ✓   | ✓  |  ✓  | ✓   | 
|  WAIT     |   x   | x  |  x  | x   | 
|  TOUCH    |   -   | -  |  ✓  | ✓   | 
|  MIGRATE  |   x   | x  |  x  | x   | 

**Explanation:**

* Command KEYS: Search by the command KEYS* is not recommended. You are suggested to search by the command scan. The command KEYS can be used under the VPC network only, which is dangerous and might incur performance problem. If you need to use such command, please be sure to use it only the key count is very low.

* Application method of the command SORT: SORT key [BY pattern] [LIMIT offset count] [GET pattern [GET pattern ...]] [ASC|DESC] [ALPHA] [STORE destination]

	* 1. As the command SORT supports sort by [BY pattern] according to external key, please ensure key and key matched to pattern are in the same slot. Otherwise, unexpected results will be incurred.

	* 2. The command SORT supports writing of results in destination. Therefore, be sure to keep destination and key in the same slot. Otherwise, (error) ERR CROSSSLOT Keys in request don't hash to the same slot will be returned.




#### String
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  APPEND    |   ✓   | ✓  |  ✓  | ✓   | 
|  BITCOUNT  |   ✓   | ✓  |  ✓  | ✓   | 
|  BITOP     |   ✓   | x  |  ✓  | ✓   | 
|  BITPOS    |   ✓   | ✓  |  ✓  | ✓   | 
|  DECR      |   ✓   | ✓  |  ✓  | ✓   | 
|  DECRBY    |   ✓   | ✓  |  ✓  | ✓   | 
|  GET       |   ✓   | ✓  |  ✓  | ✓   | 
|  GETBIT    |   ✓   | ✓  |  ✓  | ✓   | 
|  GETRANGE  |   ✓   | ✓  |  ✓  | ✓   | 
|  GETSET    |   ✓   | ✓  |  ✓  | ✓   | 
|  INCR      |   ✓   | ✓  |  ✓  | ✓   | 
|  INCRBY    |   ✓   | ✓  |  ✓  | ✓   | 
|  INCRBYFLOAT   |   ✓   | ✓  |  ✓  | ✓   | 
|  MGET      |   ✓   | ✓  |  ✓  | ✓   | 
|  MSET      |   ✓   | ✓  |  ✓  | ✓   | 
|  MSETNX   |   x   |  x  |  Restricted  | Restricted   | 
|  PSETEX   |   ✓   | ✓  |  ✓  | ✓   | 
|  SET      |   ✓   | ✓  |  ✓  | ✓   | 
|  SETBIT   |   ✓   | ✓  |  ✓  | ✓   | 
|  SETEX    |   ✓   | ✓  |  ✓  | ✓   | 
|  SETNX    |   ✓   | ✓  |  ✓  | ✓   | 
|  SETRANGE |   ✓   | ✓  |  ✓  | ✓   | 
|  STRLEN   |   ✓   | ✓  |  ✓  | ✓   | 
|  BITFIELD |   -   |  -  |  ✓  | ✓   | 


####  Hash 
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  HDEL      |   ✓   | ✓  |  ✓  | ✓   | 
|  HEXISTS   |   ✓   | ✓  |  ✓  | ✓   | 
|  HGET      |   ✓   | ✓  |  ✓  | ✓   | 
|  HGETALL   |   ✓   | ✓  |  ✓  | ✓   | 
|  HINCRBY   |   ✓   | ✓  |  ✓  | ✓   | 
|  HINCRBYFLOAT   |   ✓   | ✓  |  ✓  |  ✓   | 
|  HKEYS     |   ✓   | ✓  |  ✓  | ✓   | 
|  HLEN      |   ✓   | ✓  |  ✓  | ✓   | 
|  HMGET     |   ✓   | ✓  |  ✓  | ✓   | 
|  HMSET     |   ✓   | ✓  |  ✓  | ✓   | 
|  HSET      |   ✓   | ✓  |  ✓  | ✓   | 
|  HSETNX    |   ✓   | ✓  |  ✓  | ✓   | 
|  HVALS     |   ✓   | ✓  |  ✓  | ✓   | 
|  HSCAN     |   ✓   | ✓  |  ✓  | ✓   | 
|  HSTRLEN   |   -   | -  |  ✓  | ✓   | 


####  List
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  BLPOP   |   -   | -  |  Restricted  | Restricted   | 
|  BRPOP   |   -   | -  |  Restricted  | Restricted   | 
|  BRPOPLPUSH |  -   |  -  |  Restricted  | Restricted   | 
|  LINDEX   |   ✓   | ✓  |  ✓  | ✓   | 
|  LINSERT  |   ✓   | ✓  |  ✓  | ✓   | 
|  LLEN     |   ✓   | ✓  |  ✓  | ✓   | 
|  LPOP     |   ✓   | ✓  |  ✓  | ✓   | 
|  LPUSH    |   ✓   | ✓  |  ✓  | ✓   | 
|  LPUSHX   |   ✓   | ✓  |  ✓  | ✓   | 
|  LRANGE   |   ✓   | ✓  |  ✓  | ✓   | 
|  LREM     |   ✓   | ✓  |  ✓  | ✓   | 
|  LSET     |   ✓   | ✓  |  ✓  | ✓   | 
|  LTRIM    |   ✓   | ✓  |  ✓  | ✓   | 
|  RPOP     |   ✓   | ✓  |  ✓  | ✓   | 
|  RPOPLPUSH |   ✓   |  x  |  Restricted  | Restricted   | 
|  RPUSH    |   ✓   | ✓  |  ✓  | ✓   | 
|  RPUSHX   |   ✓   | ✓  |  ✓  | ✓   | 


####  Set
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  SADD    |   ✓   | ✓  |  ✓  | ✓   | 
|  SCARD   |   ✓   | ✓  |  ✓  | ✓   | 
|  SDIFF   |   ✓   |  x  |  Restricted  | Restricted    | 
|  SDIFFSTORE   |   ✓   | x  |  Restricted  | Restricted      | 
|  SINTER  |   ✓   | x  |  Restricted  | Restricted    | 
|  SINTERSTORE    |   ✓   | x  |  Restricted  | Restricted    | 
|  SISMEMBER      |   ✓   | ✓  |  ✓  | ✓   | 
|  SMEMBERS   |   ✓   | ✓  |  ✓  | ✓   | 
|  SMOVE      |   ✓   | x  |  Restricted  | Restricted    | 
|  SPOP       |   ✓   | ✓  |  ✓  | ✓   | 
|  SRANDMEMBER    |   ✓   | ✓  |  ✓  | ✓   | 
|  SREM       |   ✓   | ✓  |  ✓  | ✓   | 
|  SUNION     |   ✓   | x  |  Restricted  | Restricted    | 
|  SUNIONSTORE   |   ✓   | x  |  Restricted  | Restricted    | 
|  SSCAN      |   ✓   | ✓  |  ✓  | ✓   | 


####  Sorted Set
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  ZADD     |   ✓   | ✓  |  ✓  | ✓   | 
|  ZCARD    |   ✓   | ✓  |  ✓  | ✓   | 
|  ZCOUNT   |   ✓   | ✓  |  ✓  | ✓   | 
|  ZINCRBY  |   ✓   | ✓  |  ✓  | ✓   | 
|  ZRANGE   |   ✓   | ✓  |  ✓  | ✓   | 
|  ZRANGEBYSCORE   |   ✓   | ✓  |  ✓  | ✓   | 
|  ZRANK    |   ✓   | ✓  |  ✓  | ✓   | 
|  ZREM     |   ✓   | ✓  |  ✓  | ✓   | 
|  ZREMRANGEBYRANK  |   ✓   | ✓  |  ✓  | ✓   | 
|  ZREMRANGEBYSCORE |   ✓   | ✓  |  ✓  | ✓   | 
|  ZREVRANGE        |   ✓   | ✓  |  ✓  | ✓   | 
|  ZREVRANGEBYLEX   |   -   | -  |  ✓  | ✓   | 
|  ZREVRANGEBYSCORE |   ✓   | ✓  |  ✓  | ✓   | 
|  ZREVRANK      |   ✓   | ✓  |  ✓  | ✓   | 
|  ZSCORE        |   ✓   | ✓  |  ✓  | ✓   | 
|  ZUNIONSTORE   |   ✓   | x  |  Restricted  | Restricted    | 
|  ZINTERSTORE   |   ✓   | x  |  Restricted  | Restricted    | 
|  ZSCAN         |   ✓   | ✓  |  ✓  | ✓   | 
|  ZRANGEBYLEX      |   ✓   | ✓  |  ✓  | ✓   | 
|  ZLEXCOUNT        |   ✓   | ✓  |  ✓  | ✓   | 
|  ZREMRANGEBYLEX   |   ✓   | ✓  |  ✓  | ✓   | 
|  ZPOPMAX   |   -   | -  |  -  | -   | 
|  ZPOPMIN   |   -   | -  |  -  | -   | 
|  BZPOPMIN  |   -   | -  |  -  | -   | 
|  BZPOPMAX  |   -   | -  |  -  | -   | 


####  hyperloglog 
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
| PFADD    | ✓ | x  | ✓ |  ✓  | 
| PFCOUNT  | ✓ | x  | ✓ |  ✓  | 
| PFMERGE  | ✓ | x  | ✓ |  ✓  | 


####  Pub/Sub
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  PSUBSCRIBE   |   x   | x  |  ✓  | ✓   | 
|  PUBLISH      |   x   | x  |  ✓  | ✓   | 
|  PUBSUB       |   x   | x  |  ✓  | ✓   | 
|  PUNSUBSCRIBE |   x   | x  |  ✓  | ✓   | 
|  SUBSCRIBE    |   x   | x  |  ✓  | ✓   | 
|  UNSUBSCRIBE  |   x   | x  |  ✓  | ✓   | 


#### Transaction
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  DISCARD   |   ✓   | x  |  ✓  | ✓   | 
|  EXEC      |   ✓   | x  |  ✓  | ✓   | 
|  MULTI     |   ✓   | x  |  ✓  | ✓   | 
|  UNWATCH   |   ✓   | x  |  ✓  | ✓   | 
|  WATCH     |   ✓   | x  |  ✓  | ✓   | 


#### Connection
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  AUTH   |   ✓   | ✓  |  ✓  | ✓   | 
|  ECHO   |   ✓   | ✓  |  ✓  | ✓   | 
|  PING   |   ✓   | ✓  |  ✓  | ✓   | 
|  QUIT   |   ✓   | ✓  |  ✓  | ✓   | 
|  SELECT |   ✓   | ✓  |  ✓  | ✓   | 
|  SWAPDB |   x   | x   |  x  | x   | 


#### Server
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  FLUSHALL  |   ✓   | ✓  |  ✓  | ✓   | 
|  FLUSHDB   |   ✓   | ✓  |  ✓  | ✓   | 
|  DBSIZE    |   x   |  x  |  ✓  | ✓   | 
|  TIME      |   x   |  x  |  x  | x   | 
|  INFO      |   ✓   | ✓  |  ✓  | ✓   | 
|  KEYS      |   ✓   | ✓  |  ✓  | ✓   | 
|  CLIENT KILL   |   x   | x  |  x     | x     | 
|  CLIENT LIST   |   x   | x  |  Restricted  | Restricted  | 
|  CLIENT GETNAME   |   x   | x  |  ✓  | ✓   | 
|  CLIENT SETNAME   |   x   | x  |  ✓  | ✓   | 
|  CONFIG GET       |   x   | x  |  ✓  | ✓   | 
|  MEMORY           |   -  | - |  ✓  | ✓   | 
|  LATENCY          |   x   |  x  |  ✓  | ✓   | 

**Explanation:**

* INFO commands support: server, clients, memory, persistence, stats, replication, cpu, commandstats, cluster and keyspace

	* 1. In case of the cluster version, replication and server are only used for displaying information of one shard, while other sub-commands are used for displaying information after statistics.

	* 2. Special instruction: The sub-command cluster is used for displaying db_count which indicates count of database, while shard_count indicates shard count of existing redis version.

* The command CONFIG supports the sub-command CONFIG GET [parameter] only. Moreover, for Redis of cluster version, information of one shard is returned.

* LATENCY: Under the mode of cluster version, shardId can be designated. It is used for obtaining data of a designated shard and data of the shard 0 are returned by default.

	* 1. Sub-commands supported by LATENCY include: [LATEST] [DOCTOR] [ HISTORY event-name] [RESET [event-name … event-name]] [GRAPH event-name]

	* 2. Under the cluster version mode, for example, LATENCY latest 1, the latest delay time information of 1# shard can be viewed. If no shardId is designated, the 0# shard is the default shard.

* The command MEMORY supports sub-commands such as help, doctor, stats，purge and malloc-stats and designated shardId

	* MEMORY stats 1 indicates viewing memory statistical information of 1# shard. If it is not designated, information of 0# shard is viewed by default



#### Scripting
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  EVAL      |   ✓   | ✓  |  ✓  | ✓   | 
|  EVALSHA   |   ✓   | x  |  ✓  | ✓   | 
|  SCRIPT EXISTS   |   ✓   | x  |  ✓  | ✓   | 
|  SCRIPT FLUSH    |   ✓   | x  |  ✓  | ✓   | 
|  SCRIPT KILL     |   ✓   | x  |  ✓  | ✓   | 
|  SCRIPT LOAD     |   ✓   | x  |  ✓  | ✓   | 
|  SCRIPT DEBUG    |   ✓   | x  |  ✓  | ✓   | 


#### Geo
| Command | 2.8 Standard Version  |  2.8 Cluster Version  |  4.0 Standard Version  |  4.0 Cluster Version  | 
|:--:|:--:|:--:|:--:|:--:| 
|  GEOADD   |   x   |  x  |  ✓  | ✓   | 
|  GEOHASH  |   x   |  x  |  ✓  | ✓   | 
|  GEOPOS   |   x   |  x  |  ✓  | ✓   | 
|  GEODIST  |   x   |  x  |  ✓  | ✓   | 
|  GEORADIUS   |   x   |  x  |  ✓  | ✓   | 
|  GEORADIUSBYMEMBER   |   x   |  x  |  ✓  | ✓   | 




###  Other Description 

* If you need to carry out the restricted commands in the cluster instance, you need to use hash tag to ensure keys to be operated by the command are distributed in one hash slot.

* Description for commands unsupported in the lua scripting:

	* 1. Commands unsupported in the redis2.8 lua scripting include: bgsave, bgrewriteaof, shutdown and config

	* 2. Commands unsupported in the redis4.0 lua scripting include: swapdb, rename, renamenx, bgsave, bgrewriteaof, shutdown, config, cluster, post and host

* Commands unsupported in transactions: SCRIPT *, INFO, SLOWLOG, LATENCY, EVAL, FLUSHALL, SCAN, AUTH, EVALSHA, DBSIZE, CONFIG, FLUSHDB, RANDOMKEY and PING

* For the command ZUNIONSTORE/ZINTERSTORE, the parameters are destination numkeys key [key ...] [WEIGHTS weight] [SUM|MIN|MAX]

	* Be sure to keep all designated keys and destinations in the same slot. Otherwise, (error) ERR CROSSSLOT Keys in request don't hash to the same slot will be returned


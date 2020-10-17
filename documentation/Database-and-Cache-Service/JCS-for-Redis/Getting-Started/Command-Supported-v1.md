# Redis Command Support

JCS for Redis of JD Cloud is based on Versions 2.8 and 4.0. For commands, please refer to: [http://redis.io/commands](http://redis.io/commands)

## Command Operation Supported


|Key|String|Hash|List|Set|SortedSet| 
|:--:|:--:|:--:|:--:|:--:|:--:|
|DEL|APPEND|HDEL|LINDEX|SADD|ZADD|            
|DUMP|BITCOUNT|HEXISTS|LINSERT|SCARD|ZCARD|            
|EXISTS|BITPOS|HGET|LLEN|SISMEMBER|ZCOUNT|            
|EXPIRE| DECR |HGETALL| LPOP|SMEMBERS|ZINCRBY|            
|EXPIREAT|DECRBY|HINCRBY|LPUSH|SPOP| ZRANGE|            
|KEYS*|GET|HINCRBYFLOAT|LPUSHX|SRANDMEMBER|ZRANGEBYSCORE|           
|PERSIST|GETBIT|HKEYS|LRANGE       |     	SREM     |ZRANK  |          
|PEXPIRE|GETRANGE|HLEN|    	LREM        |    	SSCAN      | ZREM|            
|PEXPIREAT|GETSET|HMGET|     	LSET         |   	|ZREMRANGEBYRANK|            
|PTTL|INCR|HMSET|LTRIM | |        	ZREMRANGEBYSCORE |           
|RESTORE|INCRBY|HSET|RPOP      | |      	ZREVRANGE |           
|SORT|INCRBYFLOAT|HSETNX|RPUSH  | |          	ZREVRANGEBYSCORE |           
|TTL|MGET|HVALS|RPUSHX     | |       	ZREVRANK|            
|TYPE|MSET|HSCAN| | |       	       	ZSCORE|            
|SCAN|PSETEX| | | |ZSCAN            
| |SET   | |  |       	|ZRANGEBYLEX  |          
| |SETBIT      | | |   |   	ZLEXCOUNT|            
| |SETEX       | | |    | 	ZREMRANGEBYLEX   |         
| |SETNX| | | | |             	
| |SETRANGE   | | | | |        	
| |STRLEN    | | | |  |      	

and

| Connection | Server |
|--------------------|------------------|
| AUTH               | INFO*            |
| PING               | CONFIG GET*      |
| QUIT               | FLUSHDB          |
| ECHO               | FLUSHALL         |
| SELECT             |                  |         

Explanation:

- The command KEYS can be used under the VPC network only, which is dangerous and might incur performance problem. Please ensure that key is used in a few cases only. If you need to find specific key from a big data set, you are recommended to use the Redis cluster structure (set)

- INFO commands support server, clients, memory, persistence, stats, replication, cpu, commandstats, cluster and keyspace

1. In case of the cluster version, replication and server are only used for displaying information of one shard, while other sub-commands are used for displaying information after statistics.

2. Special instruction: The sub-command cluster is used for displaying db_count which indicates count of database, while shard_count indicates shard count of existing redis version.

- The command CONFIG supports the sub-command CONFIG GET [parameter] only. Moreover, for Redis of cluster version, information of one shard is returned.
- Application method of the command SORT: SORT key [BY pattern] [LIMIT offset count] [GET pattern [GET pattern ...]] [ASC|DESC] [ALPHA] [STORE destination]

1. As the command SORT supports sort by [BY pattern] according to external key, please ensure key and key matched to pattern are in the same slot. Otherwise, unexpected results will be incurred.

2. The command SORT supports writing of results in destination. Therefore, be sure to keep destination and key in the same slot. Otherwise, (error) ERR CROSSSLOT Keys in request don't hash to the same slot will be returned

- Commands unsupported in the redis2.8 lua scripting include: bgsave, bgrewriteaof, shutdown and config

- Commands unsupported in the redis4.0 lua scripting include: swapdb, rename, renamenx, bgsave, bgrewriteaof, shutdown, config, cluster, post and host:

## Additional Commands Supported in 4.0

| Key | Hash | SortedSet | Server | Scripting | HyperLogLog (HLL) |   Geo   | Pub/Sub |
| :-----: | :----------: | :-------------------: | :--------------: | :-------------: | :----------------: | :---------------: | :------------------: |
| OBJECT  |   HSTRLEN    |    ZREVRANGEBYLEX     |      DBSIZE      |      EVAL       |       PFADD        |      GEOADD       |      PSUBSCRIBE      |
|  TOUCH  |              |                       |    RANDOMKEY     |     EVALSHA     |      PFCOUNT       |     GEORADIUS     |       PUBLISH        |
| UNLINK  |              |                       |      MEMORY      |  SCRIPT EXISTS  |      PFMERGE       | GEORADIUSBYMEMBER |        PUBSUB        |
|  BITOP  |              |                       |     LATENCY      |  SCRIPT FLUSH   |                    |      GEOHASH      |     PUNSUBSCRIBE     |
|  MOVE   |              |                       |                  |   SCRIPT KILL   |                    |      GEOPOS       |      SUBSCRIBE       |
|         |              |                       |                  |   SCRIPT LOAD   |                    |      GEODIST      |     UNSUBSCRIBE      |


- LATENCY: Under the mode of cluster version, shardId can be designated. It is used for obtaining data of a designated shard and data of the shard 0 are returned by default.

1. Sub-commands supported by LATENCY include: [LATEST] [DOCTOR] [ HISTORY event-name] [RESET [event-name … event-name]] [GRAPH event-name] 

2. Under the cluster version mode, for example, LATENCY latest 1, the latest delay time information of 1# shard can be viewed. If no shardId is designated, the 0# shard is the default shard.

- The command MEMORY supports sub-commands such as help, doctor, stats，purge and malloc-stats and designated shardId

MEMORY stats 1 indicates viewing memory statistical information of 1# shard. If it is not designated, information of 0# shard is viewed by default

## Commands Unsupported by Instance Cluster

| Key | String | List | Set  | SortedSet  | Server  | Transaction |
| :-------: | :--------------: | -----------: | ------------ | ---------------------- | ----------------- | ------------------- |
|  RENAME   |      BITOP       |    RPOPLPUSH | SDIFF        | ZUNIONSTORE            | SLOWLOG           | DISCARD             |
| RENAMENX  |      MSETNX      |              | SDIFFSTORE   | ZINTERSTORE            | CONFIG REWRITE    | EXEC                |
|  OBJECT   |                  |              | SINTER       |                        | CONFIG RESETSTAT  | MULTI               |
|           |                  |              | SINTERSTORE  |                        | COMMAND COUNT     | UNWATCH             |
|           |                  |              | SMOVE        |                        | COMMAND GETKEYS   | WATCH               |
|           |                  |              | SUNION       |                        | COMMAND INFO      |                     |
|           |                  |              | SUNIONSTORE  |                        |                   |                     |


	
- The master and slave Redis2.8 version supports transactions rather than clusters; Master and slave Redis4.0 clusters are supported both. Commands unsupported in transactions: SCRIPT *, INFO, SLOWLOG, LATENCY, EVAL, FLUSHALL, SCAN, AUTH, EVALSHA, DBSIZE, CONFIG, FLUSHDB, RANDOMKEY and PING

- For the command ZUNIONSTORE/ZINTERSTORE, the parameters are destination numkeys key [key ...] [WEIGHTS weight] [SUM|MIN|MAX]

Be sure to keep all designated keys and destinations in the same slot. Otherwise, (error) ERR CROSSSLOT Keys in request don't hash to the same slot will be returned

   
## Commands not opened now

|  Key  | List | Server |  Cluster | Connection |
|:---------:|:------------:|:----------------:|:-------------:|:----------------:|
|  MIGRATE  |     BLPOP    |       TIME       |  READWRITE   |      SWAPDB      |
|    WAIT   |     BRPOP    |      MONITOR     |      READONLY   |                  |
|           |  BRPOPLPUSH  |   BGREWRITEAOF   |      CLUSTER *   |                  |
|           |              |      BGSAVE      |                |                  |
|           |              |    CONFIG SET    |               |                  |
|           |              |      COMMAND     |                 |                  |
|           |              |   DEBUG OBJECT   |                      |              |                  |
|           |              |       DEBUG      |                      |              |                  |
|           |              |  DEBUG SEGFAULT  |                      |              |                  |
|           |              |       SAVE       |                      |              |                  |
|           |              |     LASTSAVE     |                      |              |                  |
|           |              |     SHUTDOWN     |                      |              |                  |
|           |              |      SLAVEOF     |                      |              |                  |
|           |              |       SYNC       |                      |              |                  |
|           |              |       PSYNC      |                      |              |                  |
|           |              |       ROLE       |                      |              |                  |		




# JCS for Redis Command Support

JCS for Redis is based Versions 2.8 and 4.0. For commands, please see: [http://redis.io/commands](http://redis.io/commands)

## Supported Command Operations

Key|String|Hash|List|Set|SortedSet 
:--:|:--:|:--:|:--:|:--:|:--:
DEL|APPEND|HDEL|LINDEX|SADD|ZADD            
DUMP|BITCOUNT|HEXISTS|LINSERT|SCARD|ZCARD            
EXISTS|BITPOS|HGET|LLEN|SISMEMBER|ZCOUNT            
EXPIRE| DECR |HGETALL| LPOP|SMEMBERS|ZINCRBY            
EXPIREAT|DECRBY|HINCRBY|LPUSH|SPOP| ZRANGE            
KEYS*|GET|HINCRBYFLOAT|LPUSHX|SRANDMEMBER|ZRANGEBYSCORE           
PERSIST|GETBIT|HKEYS|LRANGE       |     	SREM     |ZRANK            
PEXPIRE|GETRANGE|HLEN|    	LREM        |    	SSCAN      | ZREM            
PEXPIREAT|GETSET|HMGET|     	LSET         |   	|ZREMRANGEBYRANK            
PTTL|INCR|HMSET|LTRIM | |        	ZREMRANGEBYSCORE            
RESTORE|INCRBY|HSET|RPOP      | |      	ZREVRANGE            
SORT|INCRBYFLOAT|HSETNX|RPUSH  | |          	ZREVRANGEBYSCORE            
TTL|MGET|HVALS|RPUSHX     | |       	ZREVRANK            
TYPE|MSET|HSCAN| | |       	       	ZSCORE            
SCAN|PSETEX| | | |ZSCAN            
| |SET   | |  |       	|ZRANGEBYLEX            
| |SETBIT      | | |   |   	ZLEXCOUNT            
| |SETEX       | | |    | 	ZREMRANGEBYLEX            
| |SETNX| | | | |             	
| |SETRANGE   | | | |         	
| |STRLEN    | | | |        	

and

Connection|Server     
:--:|:--:
AUTH|INFO*            
PING|CONFIG GET*           
QUIT|FLUSHDB         
ECHO|FLUSHALL             
SELECT|              

Description:

- KEYS command can only be used under the VPC network. It is a dangerous command which may lead to performance problems. Please ensure that it is used under the circumstance with few keys. If it is required to query a specific key from a large data set, it is recommended to use the collection structure (set) of Redis

- INFO command supports server, clients, memory, persistence, stats, replication, cpu, commandstats, cluster and keyspace
•	 In case of cluster version, replication and server display the information of a shard, while other subcommands display the information after the statistics.
•	 It is specially noted that cluster subcommand displays that db_count indicates the number of databases, and shard_count indicates the number of shards of the current redis version.

- CONFIG command only supports CONFIG GET [parameter] subcommand, and in case of cluster version of Redis, the information of a shard will be returned.
- Use method of SORT command: SORT key [BY pattern] [LIMIT offset count] [GET pattern [GET pattern ...]] [ASC|DESC] [ALPHA] [STORE destination]
1.	 As SORT command supports [BY pattern] to be sorted based on the external key, the key shall be ensured to be in the same slot as the key matched with the pattern, or a result inconsistent with expectation will occur.
2.	 SORT command supports writing results in destination, so the destination shall be ensured to be in the same slot as the key. Otherwise, (error) ERR CROSSSLOT Keys in request don't hash to the same slot error occurs





## Commands not Supported by Cluster Instance

Key|String|List|Set|SortedSet|Server|Transaction
:--:|:--:|:--:|:--:|:--:|:--:|:--:
RENAME|BITOP|RPOPLPUSH|SDIFF|ZUNIONSTORE|SLOWLOG|DISCARD
RENAMENX|MSETNX	||SDIFFSTORE|ZINTERSTORE|CONFIG REWRITE|EXEC
OBJECT|||SINTER||CONFIG RESETSTAT|MULTI
|			|||SINTERSTORE||COMMAND COUNT|UNWATCH
|			|||SMOVE||COMMAND GETKEYS|WATCH
|			|||SUNION||COMMAND INFO	|
|			|||SUNIONSTORE||		|	
	
- Redis2.8 version primary-secondary supports transactions, while the cluster does not; Redis4.0 primary-secondary and cluster support transaction. Commands not supported in transactions: SCRIPT *, INFO, SLOWLOG, LATENCY, EVAL, FLUSHALL, SCAN, AUTH, EVALSHA, DBSIZE, CONFIG, FLUSHDB, RANDOMKEY and PING

- ZUNIONSTORE/ZINTERSTORE command, parameters are destination numkeys key [key ...] [WEIGHTS weight] [SUM|MIN|MAX]

All keys and destinations specified must be in the same slot. Otherwise, (error) ERR CROSSSLOT Keys in request don't hash to the same slot error occurs

## Increased Commands Supported by 4.0

Key|Hash|SortedSet|Server|Scripting|HyperLogLog|Geo
:--:|:--:|:--:|:--:|:--:|:--:|:--:
OBJECT|	HSTRLEN	|ZREVRANGEBYLEX	|DBSIZE|	EVAL|	PFADD|	GEOADD
TOUCH|		|	|RANDOMKEY|	EVALSHA|	PFCOUNT	|GEORADIUS
UNLINK|		|	|MEMORY|	SCRIPT EXISTS|	PFMERGE	|GEORADIUSBYMEMBER
BITOP|		|	|LATENCY|	SCRIPT FLUSH|	|	GEOHASH
MOVE|		|	|	|SCRIPT KILL	|	|GEOPOS
|	|	|	|	|SCRIPT LOAD|		|GEODIST

- LATENCY:  In the cluster version mode, shardId can be specified. It is used to obtain the data of the specified shard, and the data with shard 0 are returned by default.
1.	 Subcommands supported by LATENCY are: [LATEST] [DOCTOR] [ HISTORY event-name] [RESET [event-name … event-name]] [GRAPH event-name] 
2.	 In the cluster version mode, for example: LATENCY latest 1, the latest delay time information of Shard 1 is viewed. If shardId is not specified, it shall be Shard 0 by default

- MEMORY command supports subcommands such as help, doctor, stats, purge and malloc-stats, and supports specifying shardId

MEMORY stats 1 indicates viewing the memory statistic information of Shard 1, and if it is not specified, it is Shard 0 by default


   
## Unavailable Commands

Key|List|Server|Pub/Sub|Geo|Cluster|Connection
:--:|:--:|:--:|:--:|:--:|:--:|:--:
RANDOMKEY|BLPOP|TIME|PSUBSCRIBE|GEOADD|READWRITE|SWAPDB
MIGRATE|BRPOP|MONITOR|PUBLISH	|GEOHASH|READONLY|
WAIT|BRPOPLPUSH|BGREWRITEAOF|PUBSUB|GEOPOS|CLUSTER *|
| ||BGSAVE|PUNSUBSCRIBE|GEODIST		|
| ||CONFIG SET|SUBSCRIBE|GEORADIUS		
| ||COMMAND|UNSUBSCRIBE|GEORADIUSBYMEMBER		
|	||DEBUG OBJECT|		|		
|	||DBSIZE| 				|
|	||DEBUG	|			|
|	||DEBUG SEGFAULT|	|			
|	||SAVE|				
|	||LASTSAVE|				
|	||SHUTDOWN|				
|	||SLAVEOF	|			
|	||SYNC	|			
|	||PSYNC	|			
|	||ROLE	|			




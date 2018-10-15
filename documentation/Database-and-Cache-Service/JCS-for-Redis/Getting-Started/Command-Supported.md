# JCS for Redis Command Support



JCS for Redis is based on the Version 2.8.19 and the command can be found in: http://redis.io/commands



## Command Actions Available

Key (Key)|String|Hash|List|Set|SortedSet 
---|:--:|:--:|:--:|:--:|---:
DEL|APPEND|HDEL|LINDEX|SADD|ZADD            
DUMP|BITCOUNT|HEXISTS|LINSERT|SCARD|ZCARD            
EXISTS|BITPOS|HGET|LLEN|SISMEMBER|ZCOUNT            
EXPIRE| DECR |HGETALL  | LPOP  |      	SMEMBERS     |ZINCRBY            
EXPIREAT   |         	DECRBY       |     	HINCRBY       |     	LPUSH       |     	SPOP      | ZRANGE            
KEYS*   |               	GET      |      	HINCRBYFLOAT   |         	LPUSHX   |         	SRANDMEMBER          |ZRANGEBYSCORE            
PERSIST    |        	GETBIT        |    	HKEYS         |   	LRANGE       |     	SREM     |ZRANK            
PEXPIRE   |         	GETRANGE      |      	HLEN        |    	LREM        |    	SSCAN      | ZREM            
PEXPIREAT         |   	GETSET        |    	HMGET       |     	LSET         |   	|ZREMRANGEBYRANK            
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

Connection (Connection) |Server (Server) |Scripting (Scripting)     
---|:--:|---:
AUTH|INFO*|EVAL            
PING|CONFIG GET*|SCRIPT EXISTS            
QUIT|FLUSHDB|EVALSHA            
ECHO| |SCRIPT FLUSH            
| | |SCRIPT KILL            
| | |SCRIPT LOAD  

Description:

- KEYS command can only be used under the VPC network. It is a dangerous command and may cause performance problems. Please ensure that it is used under the condition of few keys. If it is required to query a specific key from a big data set, it is recommended to use the collection structure (set) of JCS for Redis.

- INFO command is restricted from using in cluster version: info cpu/replication/persistence is not supported

- CONFIG GET command, parameters returned in cluster version are temporarily not superimposed

Command Unavailable

Key (Key)|String (Character String)|List (List) |Set (Set) |SortedSet (SortedSet) |Connection (Connection) |Server (Server)
---|:--:|:--:|:--:|:--:|:--:|---:
RANDOMKEY|BITOP|BLPOP|SDIFF|ZUNIONSTORE|SELECT|FLUSHALL            
RENAME|MSETNX|BRPOP|SDIFFSTORE|ZINTERSTORE| |DBSIZE
RENAMENX| |BRPOPLPUSH  |SINTER| | |TIME            
OBJECT| | RPOPLPUSH|SINTERSTORE| | |MONITOR            
MIGRATE | | | SMOVE | | | SLOWLOG            
| | | |SUNION | | |BGREWRITEAOF            
| | | |SUNIONSTORE| | |BGSAVE            
| | | | | | |CONFIG REWRITE            
| | | | | | |CONFIG SET            
| | | | | | |CONFIG RESETSTAT            
| | | | | | |COMMAND            
| | | | | | |COMMAND COUNT            
| | | | | | |COMMAND GETKEYS            
| | | | | | |COMMAND INFO            
| | | | | | |DEBUG OBJECT            
| | | | | | |DEBUG SEGFAULT            
| | | | | | |LASTSAVE            
| | | | | | |ROLE            
| | | | | | |SAVE            
| | | | | | |SHUTDOWN            
| | | | | | |SLAVEOF            
| | | | | | |SYNC            
| | | | | | |PSYNC  

and

HyperLog|LogPub/Sub (Release/Subscribe) |Transaction| Geo      
---|:--:|:--:|---:
PFADD|PSUBSCRIBE|DISCARD|GEOADD            
PFCOUNT|PUBLISH|EXEC|GEOHASH            
PFMERGE|PUBSUB|MULTI|GEOPOS            
| |PUNSUBSCRIBE|UNWATCH|GEODIST            
| |SUBSCRIBE|WATCH|GEORADIUS            
| |UNSUBSCRIBE| |GEORADIUSBYMEMBER  

Command not supported by cluster instance

Connection (Connection) |Server (Server) |Scripting (Scripting)
---|:--:|---:
ECHO|CLIENT KILL|EVALSHA            
| |CLIENT LIST|SCRIPT EXISTS            
| |CLIENT GETNAME|SCRIPT FLUSH            
| |CLIENT SETNAME|SCRIPT KILL
| | |SCRIPT LOAD            

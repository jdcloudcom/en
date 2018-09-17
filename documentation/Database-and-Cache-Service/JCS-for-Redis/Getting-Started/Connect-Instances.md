# Connection Instance

Since the database service provided by Jmiss Redis is completely compatible with the native database service, the way to connect to the database is basically similar. Any clients compatible with Redis protocol can access to Jmiss Redis service, and users can choose any Redis clients according to its application characteristics.


# JD Cloud Virtual Machine Redis-cli Connection

The JD Cloud cache Redis can only be accessed with JD Cloud VPC, that is, only when Redis is installed on a virtual machine in the same VPC can it use Redis-cli to establish a connection with Redis and perform data operations.

Note: please refer to the Redis official website for the command to install Redis on the JD Cloud Virtual Machine.

## Command for Redis-cli’s connection to Redis is as follows:

redis-cli -h [host] -p [port] -a [token]

Note: redis-cli -h access to the domain -p default port -a connection password

Example: redis-cli -h jredis-cn-north-1-prod-redis-a90ng7vk5t.jdcloud.com -p 6379 -a redis-a90ng7vk5t:password

Reference link: https://redis.io/topics/rediscli


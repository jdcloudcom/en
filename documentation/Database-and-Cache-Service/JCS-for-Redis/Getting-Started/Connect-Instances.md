# Connection Instance

Since the database service provided by Jmiss Redis is completely compatible with the native database service, the way to connect to the database is basically similar. Any clients compatible with JCS for Redis protocol can access to Jmiss Redis service, and users can choose any JCS for Redis clients according to its application characteristics.


# JD Cloud Virtual Machine Redis-cli Connection

The JCS for Redis can only be accessed with JD Cloud VPC, that is, only when JCS for Redis is installed on a virtual machine in the same VPC can it use Redis-cli to establish a connection with JCS for Redis and perform data operations.

Note: please refer to the JCS for Redis official website for the command to install JCS for Redis on the JD Cloud Virtual Machine.

## Command for Redis-cli’s connection to JCS for Redis is as follows:

redis-cli -h [host] -p [port] -a [token]

Note: redis-cli -h access to the domain -p default port -a connection password

Example: redis-cli -h jredis-cn-north-1-prod-redis-a90ng7vk5t.jdcloud.com -p 6379 -a redis-a90ng7vk5t:password

Reference Link: https://redis.io/topics/rediscli


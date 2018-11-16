# Data Migration Guidelines

1. Data Migration Overview
- The migration tool redis-migrate-tool currently supports migration of public network self-creation, virtual machine self-creation, Direct connect, VPN connect, JCS for Redis instance.
- The migration tool redis-migrate-tool temporarily only supports data migration of instances with source instance version of Redis2.8, Redis3.2; the instance version of migration target is Redis2.8; we will update to support more versions later.

2. Migration Terminology

Terminology|Interpretation
:--|:--
Source Instance Source	|Source Instance of Migration
Target instance target	|Target instance of migration, namely, JD Cloud Redis purchased by the user
Virtual Machine self-creation	|Redis services deployed on the JD Cloud Server by the user are migrated to JD Cloud Redis
Public Network self-creation	|Redis services deployed in the Internet environment by the user are migrated to JD Cloud Redis

3. Data Migration Description

JCS for Redis provides a data importing tool (linux version) redis-migration-tool; the tool supports migration of AOF data in Redis 2.8 version and Redis3.2 version; the data migration description is as follows:
- Clear the target instance first, if the target instance is not cleared, data importing will replace the original data;
- redis-migration-tool configuration file rmt.conf parameter description

[source]: Source instance/[target]: Target instance

type: Type, including two types of single and aof file

redis_auth: redis instance access password

servers: Server address and port or AOF storage path
 
## Real-time Migration Data Configuration Instance:
```
[source]
type: single
# redis_auth: Be commented out when no password is available
servers:
 - 127.0.0.1:6379
[target]
type: single
redis_auth: password
servers:
 - jredis-cn-north-1-prod-redis-i02bbe91or.jdcloud.com:6379
```

## AOF Migration Configuration Instance:
```
[source]
type: aof file
servers:
  -  /root/redis-2.8.3/src/appendonly.aof
[target]
type: single
redis_auth: password
servers:
 - jredis-cn-north-1-prod-redis-i02bbe91or.jdcloud.com:6379
```

Use Method:

1.     Download and decompress redis-migrate-tool.tar.gz, the content is the migration tool redis-migrate-tool and configuration file rmt.conf

2.     Modify the configuration file, configure redis information on source and target end (it is recommended to configure slave node synchronization data)

3.     Run the tool to migrate data, ”./redis-migrate-tool -c rmt.conf” (server is configured to support synchronization data in real time at the server address and the port, and configured to synchronize data in single time at the AOF storage path)

 Note: If the user key is big, failover will occur

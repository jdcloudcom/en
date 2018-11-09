# Basic Architecture

JCS for Redis automatically sets up the primary and secondary nodes for users．



![JCS for Redis Architecture](https://github.com/jdcloudcom/cn/tree/edit/image/Redis/redis-basicInfras.png)


 - Control Service: processing request tasks from users and backend, mainly including creation, deletion, query, configuration changes, failover, capacity expansion and capacity reduction, configuration change, etc.

 - Monitoring Service: Collect JCS for Redis instance information (information of resource usage and key statistics of database, etc.) and information about physical machines (information and ratings of resource usage, etc.), the former is used by users and consoles, and the latter is used for system management.

 - Sentinel: The sentinel monitors whether the JCS for Redis instance is alive. Multiple sentinels work at the same time. When the instance is down, the failover task is sent, a new instance is automatically created, and the data is synchronized.

 - Backup Service: Automatic scheduled backup, support Customized backup (coming soon).

 - Log Collection: Collect JCS for Redis log information.

 - Data Migration: When neither the Primary nor the secondary Instance is available for the user, or need to clone an instance running online, an instance can be generated from the backup file.

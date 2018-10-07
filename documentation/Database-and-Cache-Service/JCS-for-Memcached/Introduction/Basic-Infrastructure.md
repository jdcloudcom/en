# Basic Architecture

   ![](https://github.com/jdcloudcom/cn/blob/JCS-for-Memcached/image/Memcached/1.png)
- Control service: Mainly used for processing request tasks from users and backend, including creation, deletion, query, configuration change, failover, capacity expansion and capacity reduction, configuration change, switch without password, etc.

- Monitoring services: Collect Memcached instance information (information of resource usage, key statistics of database, usage of command, connection verification etc.) and information about host machines (information of resource usage, network traffic, etc.), and provide users with frontend console display.

- Sentinel: The sentinel monitors whether the Memcached instance is alive. When the instance is down, the failover task is sent, and a new instance is automatically created.

- Log collection: Collection log information about operation of Memcached instances and other service modules.

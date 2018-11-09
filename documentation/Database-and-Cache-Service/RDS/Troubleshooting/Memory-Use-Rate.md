# Memory Usage Rate
JD Cloud provides instance-level memory usage rate monitoring and alarming for JCS for MySQL/Percona service. See details in [Alarm Rules Setting](to be added).

## Memory Usage
The memory usage of JCS for MySQL/Percona service is mainly divided into the following two parts:
* Shared Memory
* Session Memory

## Shared Memory
Shared memory is the pre-allocated memory space when the JCS for MySQL/Percona service instance is created; in which, innodb_buffer_pool occupies the largest space, and its size is specified by the parameter innodb_buffer_pool_size of the Percona service.

Innodb_buffer_pool caches data and index information of the JCS for MySQL/Percona service instance.

## Session Memory
When the client and the JCS for MySQL/Percona service instance are connected, the JCS for MySQL/Percona service instance allocates a session memory for each connection.

The size of the session memory is specified by the following parameters of the JCS for MySQL/Percona service:
* sort_buffer_size
* read_buffer_size
* read_nd_buffer_size
* join_buffer_size
* thread_stack
* binlog_cache_size
* tmp_table_size

## Why is the Memory Usage Rate 100%?
Through the above analysis of memory usage rate, it can  be seen that the more frequently the JCS for MySQL/Percona service instance accesses, the more connections, the memory usage rate is likely to reach 100%, which is normal in most cases, indicating the JCS for MySQL/Percona service is working at full capacity.

## Reduce Memory Usage Rate
However, if theJCS for MySQL/Percona service is not used correctly, the memory usage rate of the instance will reach 100% as well. Following steps can be taken to confirm the causes:
1. If you are not using the connection pool, make sure that the application releases the connection after using the database access, otherwise the useless connection will cause the memory usage rate increase.
2. Confirm that the parameter setting of the JCS for MySQL/Percona related cloud database is reasonable. (It is recommended to use the default value of the JCS for MySQL/Percona service instance, without any changes).
3. Verify that there are too many active connections (it is recommended that the number of active connections does not exceed the cpu core of the JCS for MySQL/Percona service instance).
4. Optimize JCS for MySQL statements (avoid using temporary tables as far as possible, which may lead to a rapid increase in memory usage rate; other commands such as join, union and distinct will cause temporary tables to be generated).
5. Make sure that the data results of the JCS for MySQL query are as needed, and useless data cannot be returned, resulting in additional instance memory.

# Slow Log Search

Slow log is a mechanism used for recording requests with excessive command execution time by Redis. With the function of searching slow logs, users can find out why performance becomes slow, and then optimize performance.

## Two configuration parameters are involved:

•	slowlog-log-slower-than: If one command is executed in the data node of Redis instance and the execution time exceeds threshold set (unit: microsecond) for the parameter slowlog-log-slower-than, the command will be recorded in a slow log. The default value of this parameter is 10000, i.e., 10ms. When execution time of the command Redis is greater than 10ms, a slow log will be produced. It can be modified with the parameter modification function.

•	slowlog-max-len: Slow log count of Redis records is determined by value of the parameter slowlog-max-len and is 128 by default. When the slow log count exceeds 128, former slow logs will be deleted and new logs will be recorded. Modification to the parameter is not supported.

For details of instance configuration parameter modification and parameter explanation, please refer to [Parameter Modification](https://docs.jdcloud.com/en/jcs-for-redis/parameter-modification).

## Slow Log Search of Console

1.	 Log in [Redis Console](https://redis-console.jdcloud.com/redis), and select a target instance;
2.	 Click the name of the instance to enter the instance resource information page;
3.	 Select the **Slog Log Search** tag in the tag bar;
4.	 Set search time to view slow logs.

The followings will be displayed:
![慢日志查询](https://github.com/jdcloudcom/cn/blob/master/image/Redis/slowlog.jpg)

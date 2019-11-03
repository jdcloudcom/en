# 慢日志查询

慢日志是Redis用来记录命令执行时间过长请求的机制。通过慢日志查询功能，用户可查找性能变慢原因，并优化性能。

## 涉及两个配置参数：

•	slowlog-log-slower-than：如果在Redis实例的数据节点中执行一个命令，执行时间超过了slowlog-log-slower-than参数设置的阈值（单位为微秒），则会被记录到慢日志中。该参数的默认值为10000，即10ms，当Redis命令执行时间超过10ms，则生成慢日志。可通过参数修改功能修改。

•	slowlog-max-len：Redis记录的慢日志个数由slowlog-max-len参数的值决定，默认值为128个。当慢日志个数超过128时，会将旧的慢日志删除，记录新的慢日志。该参数不支持修改。

实例配置参数的修改以及参数解释，请参考[参数修改](https://docs.jdcloud.com/cn/jcs-for-redis/parameter-modification)。

## 控制台慢日志查询

1.	登录Redis管理控制台，选择目标实例；
2.	单击实例名称进入实例资源信息页面;
3.	在标签栏中选择"慢日志查询"页签;
4.	设置查询时间，查看慢日志记录。

展示如下所示：
![慢日志查询](https://github.com/jdcloudcom/cn/blob/master/image/Redis/slowlog.jpg)

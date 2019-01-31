# HTTP监听相关命令
## 创建HTTP监听
根据JSON格式的配置文件，创建HTTP监听
命令格式：
```bash
# create listener [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
JSON格式样例：
```json
{
  "httpListener": {
    "loadBalancerId": "string",
    "listenerPort": 0,
    "backendServerPort": 0,
    "vserverGroupId": "string",
    "bandwidth": 0,
    "healthCheckConnectPort": 0,
    "healthyThreshold": 0,
    "unhealthyThreshold": 0,
    "healthCheckTimeout": 0,
    "healthCheckInterval": 0,
    "healthCheckHttpCode": "string"
  }
}
```
示例：
```bash
create listener -f /data/json/listener.json --cloud cloud-123
```

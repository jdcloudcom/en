# 服务器组相关命令
## 服务器组列表
用于展示用户指定云上的所有服务器组信息列表
命令格式：
```bash
# list vservergroups --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list vservergroups --cloud cloud-123
```
## 创建服务器组
根据JSON格式的配置文件，创建虚拟服务器组，并添加后端服务器
命令格式：
```bash
# create vsg [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
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
```
json
{
  "vserverGroup": {
    "loadBalancerId": "string",
    "vserverGroupName": "string",
    "backendServers": [
      {
        "serverId": "string",
        "port": 0,
        "weight": 0
      }
    ]
  }
}
```
示例：
```bash
create vsg -f /data/json/vsg.json --cloud cloud-123
```

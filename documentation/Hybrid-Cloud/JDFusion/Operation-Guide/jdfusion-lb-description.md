# 负载均衡相关命令
## 负载均衡列表
用于展示用户指定云上的所有负载均衡信息列表
命令格式：
```bash
# list slbs --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list slbs --cloud cloud-123
```
## 负载均衡详细信息
用于展示用户指定负载均衡的详细信息
命令格式：
```bash
# describe slb <负载均衡实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe slb slb-123
```
## 创建负载均衡
用于根据JSON格式的配置文件，在指定的云上创建负载均衡
命令格式：
```bash
# create slb [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
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
  "slb": {
    "name": "string",
    "subnetId": "string",
    "loadBalancerSpec": "string"
  }
}
```
示例：
```bash
create slb -f /data/json/slb.json --cloud cloud-123
```
## 删除指定的负载均衡
用于删除用户指定的负载均衡
命令格式：
```bash
# del slb <负载均衡实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del slb slb-123 --cloud cloud-123
```

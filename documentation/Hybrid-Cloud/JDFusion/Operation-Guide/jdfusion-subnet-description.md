# 子网相关命令
## 子网列表
用于展示用户指定云上的所有子网信息列表
命令格式：
```bash
# list subnets --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list subnets --cloud cloud-123
```
## 子网详细信息
用于展示用户指定子网的详细信息
命令格式：
```bash
# describe subnet <子网实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe subnet subnet-123
```
## 创建子网
用于根据JSON格式的配置文件，在指定的云上创建子网
命令格式：
```bash
# create subnet [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
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
  "subnet": {
    "name": "string",
    "vpcId": "string",
    "cidrBlock": "string",
    "description": "string",
    "zoneId": "string"
  }
}
```
示例：
```bash
create subnet -f /data/json/subnet.json --cloud cloud-123
```
## 删除指定的子网
用于删除用户指定的子网
命令格式：
```bash
# del subnet <子网实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del subnet subnet-123 --cloud cloud-123
```

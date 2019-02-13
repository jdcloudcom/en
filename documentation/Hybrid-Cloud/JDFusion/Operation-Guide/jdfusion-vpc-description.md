# 专有网络相关命令
## 专有网络列表
用于展示用户指定云上的所有专有网络信息列表
命令格式：
```bash
# list vpcs --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list vpcs --cloud cloud-123
```
## 专有网络详细信息
用于展示用户指定专有网络的详细信息
命令格式：
```bash
# describe vpc <专有网络实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe vpc vpc-123
```
## 创建专有网络
用于根据JSON格式的配置文件，在指定的云上创建专有网络
命令格式：
```bash
# create vpc [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
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
  "vpc": {
    "name": "string",
    "addressPrefix": "string",
    "description": "string",
    "cidrBlock": "string",
    "userCidr": "string"
  }
}
```
示例：
```bash
create vpc -f /data/json/vpc.json --cloud cloud-123
```
## 删除指定的专有网络
用于删除用户指定的专有网络
命令格式：
```bash
# del vpc <专有网络实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del vpc vpc-123 --cloud cloud-123
```

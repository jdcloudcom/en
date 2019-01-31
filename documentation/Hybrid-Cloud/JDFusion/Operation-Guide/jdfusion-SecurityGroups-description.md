# 安全组相关命令
## 安全组列表
用于展示用户指定云上的所有安全组信息列表
命令格式：
```bash
# list sgs --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list sgs --cloud cloud-123
```
## 安全组详细信息
用于展示用户指定安全组的详细信息
命令格式：
```bash
# describe sg <安全组ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe sg sg-123
```
## 创建安全组
用于根据JSON格式的配置文件，在指定的云上创建安全组
命令格式：
```bash
# create sgs [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
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
  "securityGroup": {
    "name": "string",
    "description": "string",
    "vpcId": "string"
  }
}
```
示例：
```bash
create sgs -f /data/json/sgs.json --cloud cloud-123
```
## 删除指定的安全组
用于删除用户指定的安全组
命令格式：
```bash
# del sg <安全组实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del sg sg-123 --cloud cloud-123
```

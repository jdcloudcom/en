# 密钥对相关命令
## 密钥对列表
用于展示用户指定云上的所有密钥对信息列表
命令格式：
```bash
# list kps --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list kps --cloud cloud-123
```
## 密钥对详细信息
用于展示用户指定name的详细信息
命令格式：
```bash
# describe keypair <密钥对的name> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe keypair kp-name
```
### **创建密钥对**
用于根据JSON格式的配置文件，在指定的云上创建密钥对
命令格式：
```bash
# create keypair [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
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
  "keypair": {
    "name": "string",
    "publicKey": "string"
  }
}
```
示例：
```bash
create keypair -f /data/json/keypair.json --cloud cloud-123
```
## 删除指定的密钥对
用于删除用户指定的name
命令格式：
```bash
# del keypair <密钥对的name> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del keypair kp-name --cloud cloud-123
```

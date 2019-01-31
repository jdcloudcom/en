# 网卡相关命令
## 网卡列表
用于展示用户指定云上的所有网卡信息列表
命令格式：
```bash
# list nis --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list nis --cloud cloud-123
```
## 网卡详细信息
用于展示用户指定网卡的详细信息
命令格式：
```bash
# describe ni <网卡实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe ni ni-123
```
## 创建网卡
用于根据JSON格式的配置文件，在指定的云上创建网卡
命令格式：
```bash
# create ni [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
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
  "netInterface": {
    "name": "string",
    "description": "string",
    "subnetId": "string",
    "zoneId": "string",
    "privateIpAddress": "string",
    "securityGroupId": "string"
  }
}
```
示例：
```bash
create ni -f /data/json/ni.json --cloud cloud-123
```
## 删除指定的网卡
用于删除用户指定的网卡
命令格式：
```bash
# del ni <网卡实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del ni ni-123 --cloud cloud-123
```
## 绑定网卡到虚拟机
用于将用户指定的网卡，绑定到用户指定的虚拟机上
命令格式：
```bash
# attach ni --from <网卡实例ID> --to <虚拟机ID> --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要绑定的网卡ID |
| --to | 必填，指定网卡要绑定到的虚拟机ID |

| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
示例：
```bash
attach ni --from ni-123 --to vm-123 --cloud cloud-123
```
## 将网卡从虚拟机上解绑
用于将用户指定的网卡，从用户指定的虚拟机上解绑
命令格式：
```bash
# detach ni --from <网卡实例ID> --to <虚拟机ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要解绑的网卡ID |
| --to | 必填，指定的网卡要从哪台虚拟机上解绑 |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
detach ni --from ni-123 --to vm-123 --cloud cloud-123
```

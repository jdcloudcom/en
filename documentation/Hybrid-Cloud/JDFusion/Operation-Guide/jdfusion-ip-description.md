# 公网IP相关命令 
## 公网IP列表
用于展示用户指定云上的所有公网IP信息列表
命令格式：
```bash
# list eips --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list eips --cloud cloud-123
```
## 公网IP详细信息
用于展示用户指定公网IP的详细信息
命令格式：
```bash
# describe eip <弹性公网IP实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |

| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe eip eip-123
```
## 分配公网IP
用于根据JSON格式的配置文件，在指定的云上分配公网IP
命令格式：
```bash
# create eip [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]

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
  "allocate": {
    "name": "string",
    "bandwidth": "string",
    "provider": "string"
  }
}
```
示例：
```bash
create eip -f /data/json/eip.json --cloud cloud-123
```
## 删除指定的公网IP
用于删除用户指定的公网IP
命令格式：
```bash
# del eip <弹性公网IP实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del eip eip-123 --cloud cloud-123
```
## 绑定公网IP到虚拟机
用于将用户指定的公网IP，绑定到用户指定的虚拟机上
命令格式：
```bash
# attach eip --from <公网IP实例ID> --to <虚拟机ID> --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要绑定的公网IP的ID |
| --to | 必填，指定公网IP的ID要绑定到的虚拟机ID |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
示例：
```bash
attach eip --from eip-123 --to vm-123 --cloud cloud-123
```
## 将公网IP从虚拟机上解绑
用于将用户指定的公网IP，从用户指定的虚拟机上解绑
命令格式：
```bash
# detach eip --from <公网IP实例ID> --to <虚拟机ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要解绑的公网IP的ID |
| --to | 必填，指定的公网IP要从哪台虚拟机上解绑 |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
detach eip --from eip-123 --to vm-123 --cloud cloud-123

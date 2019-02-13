# 云硬盘相关命令
## 云硬盘列表
用于展示用户指定云上的所有云硬盘信息列表
命令格式：
```bash
# list disks --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
list disks --cloud cloud-123
```
## 云硬盘详细信息
用于展示用户指定云硬盘的详细信息
命令格式：
```bash
# describe disk <云硬盘实例ID> [ --cloud <云实例ID> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 云实例ID（list clouds中的id） |
示例：
```bash
describe disk disk-123
```
## 创建云硬盘
用于根据JSON格式的配置文件，在指定的云上创建云硬盘
命令格式：
```bash
# create disk [ -f <文件名> | -i <JSON格式数据> ] --cloud <云实例ID> [ --tail ] [ --no-table ]
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
  "disk": {
    "name": "string",
    "description": "string",
    "diskSizeGB": 0,
    "az": "string",
    "diskType": "string",
    "snapshotId": "string",
    "tags": [
      {
        "tagKey": "string",
        "tagValue": "string"
      }
    ]
  }
}
```
示例：
```bash
create disk -f /data/json/disk.json --cloud cloud-123
```
## 删除指定的云硬盘
用于删除用户指定的云硬盘
命令格式：
```bash
# del disk <云硬盘实例ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
del disk disk-123 --cloud cloud-123
```
## 绑定云硬盘到虚拟机
用于将用户指定的云硬盘，绑定到用户指定的虚拟机上
命令格式：
```bash
# attach disk --from <云硬盘实例ID> --to <虚拟机ID> --cloud <云实例ID> [ --tail ] [ --no-table ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要绑定的云硬盘ID |
| --to | 必填，指定云硬盘要绑定到的虚拟机ID |
| --cloud | 必填，云实例ID（list clouds中的id） |
| --tail | 跟踪任务执行过程，不可与--no-table同时出现 |
| --no-table | 只展示结果的ID，不可与--tail同时出现 |
示例：
```bash
attach disk --from disk-123 --to vm-123 --cloud cloud-123
```
## 将云硬盘从虚拟机上解绑
用于将用户指定的云硬盘，从用户指定的虚拟机上解绑
命令格式：
```bash
# detach disk --from <云硬盘实例ID> --to <虚拟机ID> --cloud <云实例ID>
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --from | 必填，指定要解绑的云硬盘ID |
| --to | 必填，指定的云硬盘要从哪台虚拟机上解绑 |
| --cloud | 必填，云实例ID（list clouds中的id） |
示例：
```bash
detach disk --from disk-123 --to vm-123 --cloud cloud-123

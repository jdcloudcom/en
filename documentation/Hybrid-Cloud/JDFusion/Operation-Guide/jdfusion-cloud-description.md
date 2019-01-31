# 云信息相关命令
## 云信息列表
用于展示用户注册的所有云信息列表
命令格式：
```bash
# list clouds [--vendor <云厂家>]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| --vendor | 云厂家 |
示例：
```bash
list clouds --vendor jdcloud
```
## 云信息详情
用于展示用户指定云的详细信息
命令格式：
```bash
# describe cloud <云实例id>
```
参数：
无
示例：
```bash
describe cloud cloud-123
```
## 注册云信息
用于根据JSON格式的配置文件，将指定的云注册到JD Fusion平台
命令格式：
```bash
# register cloud [ -f <文件名> | -i <JSON格式的数据> ]
```
参数：
| 参数名称 | 参数说明 |
| ---- | ---- |
| -f/--file | -f、-i必须要有一个，文件名，内容为JSON格式的数据 |
| -i/--input | -f、-i必须要有一个，JSON格式的数据 |
JSON格式样例：
```json
{
  "cloud": {
    "name": "string",
    "vendor": "string",
    "info": {},
    "metadata": {}
  }
}
```
示例：
```bash
register cloud -i '{"cloud":{"name":"mycloud111","vendor":"jdcloud","info":{"access_key":"my_access_key","secret_key":"my_secret_key","region":"cn-north-1"},"metadata":{}}}'
```
-i 参数的内容为标准JSON格式，在Linux环境下可以使用''(单引号)括起来，而在Windows环境下则需要对JSON字符串中的""(双引号)进行转义，并且外层不加''（单引号）
## 注销云信息
将用户指定的云信息从JD Fusion平台上注销
命令格式：
```bash
# unregister cloud <云实例ID>
```
参数：
无
示例：
```bash
unregister cloud cloud-123
```

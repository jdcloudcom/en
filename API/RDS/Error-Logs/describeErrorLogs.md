# describeErrorLogs


## 描述
Obtain error logs of SQL Server and download information<br>- only support SQL Server

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/0.2.9/regions/{regionId}/instances/{instanceId}/errorLogs

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True| |RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True| |Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**errorLogs**|ErrorLog[]|Collection of Error Log Files|
### ErrorLog
|名称|类型|描述|
|---|---|---|
|**internalURL**|String|Download Link of Intranet|
|**lastUpdateTime**|String|Last Update Time of the Error Log, Format: YYYY-MM-DD HH:mm:ss|
|**name**|String|Error Log File Name|
|**publicURL**|String|Download Link of Public Network|
|**sizeByte**|Integer|Error Log File Size in Bytes|
|**uploadTime**|String|Error Log Upload Time, Format: YYYY-MM-DD HH:mm:ss|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|

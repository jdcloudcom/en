# getAuditFiles


## 描述
Obtain the list of all audit result files under current instance<br>- Support SQL Server Only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:getAuditFiles

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**auditFiles**|[AuditFile[]](##AuditFile)||
### <a name="AuditFile">AuditFile</a>
|名称|类型|描述|
|---|---|---|
|**lastUpdateTime**|String|Audit Log File Last Update Time|
|**name**|String|Audit Log File Name|
|**sizeByte**|Integer|Audit Log File Size, in Bytes|
|**uploadTime**|String|Audit Log File Update Time|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|

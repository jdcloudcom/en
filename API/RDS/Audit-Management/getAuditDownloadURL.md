# getAuditDownloadURL


## 描述
Obtain the download link of a certain audit file, support both the internal and external links which are valid for 24 hours <br>- Support SQL Server Only

## 请求方式
POST

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/audit:getAuditDownloadURL

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**instanceId**|String|True||RDS instance ID, which uniquely identifies an RDS instance|
|**regionId**|String|True||Region code, with range detailed in [Regions and Availability Zone Comparison Table](../Enum-Definitions/Regions-AZ.md)|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**fileName**|String|True||Audit File Name|


## 返回参数
|名称|类型|描述|
|---|---|---|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**internalURL**|String|Intranet download link, if download is not available currently, it is an empty string|
|**publicURL**|String|Public network download link, if download is not available currently, it is an empty string|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|

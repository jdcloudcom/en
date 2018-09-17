# describeWhiteList


## 描述
View the current whitelist of RDS instances. The whitelist is a list of IP/IP segments that are allowed to access the current instance. By default, the whitelist is open to the VPC. If the user has enabled the internet access, you need to configure a whitelist for the IP of the internet.

## 请求方式
GET

## 请求地址
https://rds.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/whiteList

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
|**whiteLists**|[WhiteList[]](##WhiteList)|Whitelist|
### <a name="WhiteList">WhiteList</a>
|名称|类型|描述|
|---|---|---|
|**ips**|String|For IP or IP segment, different IP/IP segments shall be separated by commas, for example 0.0.0.0/0,192.168.0.10|
|**name**|String|Whitelist Name|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|

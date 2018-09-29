# describeRegiones


## 描述
Cloud Physical Server Region List Query

## 请求方式
GET

## 请求地址
https://cps.jdcloud-api.com/v1/regions

无

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**regions**|Region[]| |
### Region
|名称|类型|描述|
|---|---|---|
|**azs**|Az[]|Availability Zone List|
|**region**|String|Region Code, such as cn-east-1|
|**regionName**|String|Region Name, such as East China Region 1|
### Az
|名称|类型|描述|
|---|---|---|
|**az**|String|Availability Zone Code, such as cn-east-1a|
|**azName**|String|Availability Zone Name|
|**region**|String|Region Code, such as cn-east-1|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

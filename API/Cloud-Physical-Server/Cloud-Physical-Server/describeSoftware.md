# describeSoftware


## 描述
Query the list of software to be pre-installed on the physical server<br/>
The APIs (describeOS) may be called to obtain the operating system list supported by the Cloud Physical Server, and acquire the software list that supports to be pre-installed by different operating system types<br/>


## 请求方式
GET

## 请求地址
https://cps.jdcloud-api.com/v1/regions/{regionId}/os/{osTypeId}/softwares

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**osTypeId**|String|True| |Operating System Type ID, the operating systems supported by the Cloud Physical Server can be obtained by calling APIs (describeOS)|
|**regionId**|String|True| |Region ID, the Region and Availability Zone Supported by the Cloud Physical Servers can be Called by Calling APIs (describeRegions)|

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
|**softwares**|Software[]| |
### Software
|名称|类型|描述|
|---|---|---|
|**description**|String|Software Package Description|
|**name**|String|Software Package Name|
|**osTypeId**|String|Operating System Type ID|
|**version**|String|Software Package Version|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

# listInstanceInfo


## 描述
Search the instance information of the user

## 请求方式
GET

## 请求地址
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwInstance

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

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
|**data**|DwInstance[]| |
|**message**|String| |
|**status**|Boolean| |
### DwInstance
|名称|类型|描述|
|---|---|---|
|**area**|String|Instance Zone|
|**comments**|String|Instance Description|
|**createTime**|String|Instance Creation Time|
|**instanceName**|String|Instance Name|
|**instanceOwnerName**|String|Instance Owner|
|**uname**|String|Instance Alias (shown on the page)|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|

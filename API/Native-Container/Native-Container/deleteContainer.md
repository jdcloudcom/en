# deleteContainer


## 描述
The container must have the status of stopped, running or error. <br>
The instance paid by volume will keep running until it is deleted. The instance not used anymore can be passively stopped through this interface. <br>
Only the instance with the type of billing by volume can be passively deleted. The container with monthly package expired can also be deleted. Please report to the ticket system for other situations. The container with billing status exception can’t be deleted.


## 请求方式
DELETE

## 请求地址
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**containerId**|String|True||Container ID|
|**regionId**|String|True||Region ID|

## 请求参数
无


## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String||



## 返回码
|返回码|描述|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|

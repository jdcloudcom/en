# setForbiddenStream


## Description
Set forbidden stream

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/stream:forbidden

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**streams**|String[]|False| |Forbidden Stream Name|
|**app**|String|False| |Blocked pushing streaming app|
|**publishIps**|String[]|False| |Forbidden Stream IP|
|**forbiddenType**|String|True| |Forbidden stream type: forever: forever, limit: block in prescribed time, stop: kickoff streams|
|**ttl**|Long|False| |The unit of forbidden stream duration is s, and when the limit block is required, please be sure to make the transmission|
|**startTime**|String|False| |Start time of forbidden stream shall adopt the UTC time format: yyyy-MM-dd'T'HH:mm:ss'Z', e.g., 2018-10-21T10:00:00Z, which is subject to ttl when the transmission is made with ttl|
|**endTime**|String|False| |End time of forbidden stream shall adopt the UTC time format: yyyy-MM-dd'T'HH:mm:ss'Z', e.g., 2018-10-21T10:00:00Z, which is subject to ttl when the transmission is made with ttl|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

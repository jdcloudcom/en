# createForbiddenInfo


## Description
Set block. This configuration is not supported in the acceleration outside China/on a global scale

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/forbiddenInfo:create


## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**forbiddenType**|String|True| |Block type, i.e. domain block and url block|
|**forbiddenDomain**|String|True| |Blocked domain(s)|
|**forbiddenUrl**|String|False| |Blocked url(s), separated with ; for more than one urls|
|**reason**|String|True| |Block reasons|
|**linkOther**|String|True| |y,n  y represents yes and n represents no|
|**shareCacheDomainFlag**|String|False| |Whether domains sharing the same cache are synchronously operated or not, 0: only this domain is operated, 1: domains sharing the same cache are synchronously operated. It is 0 by default|
|**token**|String|False| |The URL used for block prefix identification, which shall be a single special character, e.g. ~|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

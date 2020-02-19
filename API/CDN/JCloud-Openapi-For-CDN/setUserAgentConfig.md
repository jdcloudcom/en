# setUserAgentConfig


## Description
Set userAgent information

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/userAgentConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**userAgentType**|String|True| |userAgent type, value: block (black list), allow (white list), block by default|
|**userAgentList**|String[]|True| |UA List, if userAgentList is null, all shall be deleted|


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

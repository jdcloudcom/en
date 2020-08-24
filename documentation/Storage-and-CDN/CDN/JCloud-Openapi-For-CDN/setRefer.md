# setRefer


## Description
Set domain refer

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/domain/{domain}/refer

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User domain|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**referType**|String|True| |refer type, value: block (blacklist), allow (whitelist). It is block by default|
|**referList**|String[]|True| |List of domains separated with comma, which is deleted if referList transfers null|
|**allowNoReferHeader**|String|True| |Whether null refer access is allowed, "on" by default;  This configuration cannot be modified in the acceleration outside China/on a global scale. It shall be "on" when the blacklist and whitelist are not set, "on" when only the blacklist is set, and off when the whitelist is set|
|**allowNullReferHeader**|String|True| |Whether access without refer is allowed, "on" by default|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

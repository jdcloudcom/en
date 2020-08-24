# setAccesskeyConfig


## Description
Set url authentication. This configuration is not supported in the acceleration outside China/on a global scale

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/domain/{domain}/accesskeyConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User domain|

## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accesskeyType**|Integer|True| |Authentication type, 0 represents no authentication, 1 represents parameter authentication, 2 represents path authentication|
|**accesskeyKey**|String|True| |Password, with a length of 8 to 32|
|**accesskeyKeep**|Integer|True| |Whether it is back-to-origin authentication  0 represents yes 1 represents no|


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

# setAccesskeyConfig


## Description
Set url authentication

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/accesskeyConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accesskeyType**|Integer|True| |Authentication type, where 0 represents without authentication, 1 represents parameter authentication, 2 represents path authentication|
|**accesskeyKey**|String|True| |Password, the length is from 8 to 32|
|**accesskeyKeep**|Integer|True| |Whether it is back-to-origin authentication, 0 represents Yes, 1 represents No|


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

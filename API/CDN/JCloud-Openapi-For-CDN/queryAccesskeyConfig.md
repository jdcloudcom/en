# queryAccesskeyConfig


## Description
Search url authentication

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/accesskeyConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**accesskeyType**|Integer|Authentication type, where 0 represents without authentication, 1 represents parameter authentication, 2 represents path authentication|
|**accesskeyKey**|String|Password, the length is from 8 to 32|
|**accesskeyKeep**|Integer|Whether it is back-to-origin authentication, 0 represents Yes, 1 represents No|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

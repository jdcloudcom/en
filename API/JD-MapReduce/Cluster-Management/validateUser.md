# validateUser


## Description
Verify the login user name

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/userName:validate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

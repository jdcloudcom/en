# invokeThingService


## Description
Device Service Call

## Request Method
POST

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products/{productKey}/devices/{identifier}/services

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Instance Region of Device|
|**identifier**|String|True| |Unique Device Identifier|
|**productKey**|String|True| |Product Key|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Service Name|
|**input**|Object|False| |Enter parameter, object key refers to parameter Name, and value refers to parameter value|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**msgId**|String|Unique Message Identifier|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

# getSensitiveOpSetting


## Description
Obtain the settings information of Operation Protection

## Request method
GET

## Request address
https://sop.jdcloud-api.com/v1/regions/{regionId}/sensitiveOpSetting

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**action**|String|True| |Operate action serviceName:actionName|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**extInfo**|String|Expansion information is the mobile number after the mask when type=1, and is the email address after the mask when type=2|
|**status**|Integer|Enabling status of Operation Protection: 0-not enabled, 1-enabled|
|**type**|Integer|Verification methods of Operation Protection: 0-none, 1-SMS, 2-email, 3-MFA|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

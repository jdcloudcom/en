# updateThingShadow


## Description
Update expected value of device shadow

## Request Method
PATCH

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products/{productKey}/devices/{identifier}/shadow

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Instance Region of Device|
|**identifier**|String|True| |Unique Device Identifier|
|**productKey**|String|True| |Product Key|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**state**|Object|False| |Running Status|
|**version**|Integer|False| |The current device shadow version is the current version plus 1, and the default current version is -1 actually<br>When a user actively updates the version number, the device shadow will check if the actively updated version number in the request is greater than the current version number. <br>If the actively updated version number is greater than the current version number, update the device shadow and update the shadow version value to the requested version. Otherwise, the update of device shadow will be rejected. <br>The shadow version parameter is of the Integer type<br>Value range: 0-2147483647 (the 31st power of 2 minus 1)<br>when the value reaches the maximum value 2147483647(the 31st power of 2 minus 1), the active update version number in requests shall be -1<br>|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

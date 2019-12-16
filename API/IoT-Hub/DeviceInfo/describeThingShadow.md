# describeThingShadow


## Description
View device shadow

## Request Method
GET

## Request Address
https://iothub.jdcloud-api.com/v2/regions/{regionId}/products/{productKey}/devices/{identifier}/shadow

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Instance Region of Device|
|**identifier**|String|True| |Unique Device Identifier|
|**productKey**|String|True| |Product Key|

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
|**state**|Object|Device Status|
|**metadata**|Object|After a user updates the device status document, the device shadow service will automatically update the metadata value. Device status metadata information comprises the time stamp of each attribute represented in the Epoch time form, used for getting accurate update time.|
|**version**|Integer|Device Shadow Version|
|**timestamp**|Long|Device Shadow Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

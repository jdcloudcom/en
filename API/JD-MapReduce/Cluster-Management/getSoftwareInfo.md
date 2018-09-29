# getSoftwareInfo


## Description
Obtain software list information of the corresponding Version

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareInfo

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ver**|String|True| |JMR Software Version Number|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|String|Corresponding Software List Information|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

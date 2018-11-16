# getSoftwareAndVersionInfo


## Description
Obtain the software list corresponding to the assigned JD MapReduce Version and the Version information

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareInfo/v2

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
|**data**|SoftwareInfoAndVersion[]| |
|**message**|String| |
|**status**|String| |
### SoftwareInfoAndVersion
|Name|Type|Description|
|---|---|---|
|**flag**|Boolean|It means whether the obtained information is normal|
|**name**|String|Adopted Software Name, such as hadoop/spark|
|**version**|String|Software Current Version|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

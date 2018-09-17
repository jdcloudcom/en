# getSoftwareAndVersionInfo


## Description
Obtain the software list corresponding to the assigned JMR revision and the revision information

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/softwareInfo/v2

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ver**|String|True||JMR software revision number|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[SoftwareInfoAndVersion[]](##SoftwareInfoAndVersion)||
|**message**|String||
|**status**|String||
### <a name="SoftwareInfoAndVersion">SoftwareInfoAndVersion</a>
|Name|Type|Description|
|---|---|---|
|**flag**|Boolean|It means whether the obtained information is normal|
|**name**|String|Adopted software name, such as hadoop/spark|
|**version**|String|Software current revision|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

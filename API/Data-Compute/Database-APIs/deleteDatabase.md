# deleteDatabase


## Description
Delete a specified database of user instance

## Request method
DELETE

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwDatabase/{databaseName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**databaseName**|String|True||Database name|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceName**|String|True||Instance name|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**message**|String||
|**status**|Boolean||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

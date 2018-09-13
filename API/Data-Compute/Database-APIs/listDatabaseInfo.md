# listDatabaseInfo


## Description
Search all the database information of user instance

## Request method
GET

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwDatabase

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceName**|String|True||Instance name|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[DwDatabaseInfo[]](##DwDatabaseInfo)||
|**message**|String||
|**status**|Boolean||
### <a name="DwDatabaseInfo">DwDatabaseInfo</a>
|Name|Type|Description|
|---|---|---|
|**comments**|String|Description information|
|**databaseName**|String|Database name|
|**owner**|String|Owner|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

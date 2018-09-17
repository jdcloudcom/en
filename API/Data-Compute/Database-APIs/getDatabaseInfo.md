# getDatabaseInfo


## Description
Search the specified database information of user instance

## Request method
GET

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
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[DwDatabase](##DwDatabase)||
|**message**|String||
|**status**|Boolean||
### <a name="DwDatabase">DwDatabase</a>
|Name|Type|Description|
|---|---|---|
|**category**|String|Category|
|**comments**|String|Description information|
|**createTime**|String|Creation time|
|**databaseName**|String|Database name|
|**id**|Integer|Database id|
|**lastUpdateTime**|String|Last update time|
|**location**|String|Location|
|**owner**|String|Owner|
|**physicalStorageCapacity**|String|Last update time|
|**source**|String|Source|
|**totalTableQuantity**|Integer|Number of summary lists|
|**userName**|String|User name|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

# getDatabaseInfo


## Description
Search the specified database information of user instance

## Request method
GET

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwDatabase/{databaseName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**databaseName**|String|True| |Database Name|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceName**|String|True| |Instance Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|DwDatabase| |
|**message**|String| |
|**status**|Boolean| |
### DwDatabase
|Name|Type|Description|
|---|---|---|
|**category**|String|Category|
|**comments**|String|Description Information|
|**createTime**|String|Creation Time|
|**databaseName**|String|Database Name|
|**id**|Integer|Database ID|
|**lastUpdateTime**|String|Last Update Time|
|**location**|String|Location|
|**owner**|String|Owner|
|**physicalStorageCapacity**|String|Last Update Time|
|**source**|String|Source|
|**totalTableQuantity**|Integer|Number of Summary Lists|
|**userName**|String|User Name|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

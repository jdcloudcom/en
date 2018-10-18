# listDatabaseInfo


## Description
Search all the database information of user instance

## Request method
GET

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwDatabase

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
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
|**data**|DwDatabaseInfo[]| |
|**message**|String| |
|**status**|Boolean| |
### DwDatabaseInfo
|Name|Type|Description|
|---|---|---|
|**comments**|String|Description Information|
|**databaseName**|String|Database Name|
|**owner**|String|Owner|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

# deleteTable


## Description
Delete a specified datasheet of user instance

## Request method
DELETE

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwTable/{tableName}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**tableName**|String|True| |Datasheet Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**databaseName**|String|True| |Database Name|
|**instanceName**|String|True| |Instance Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Object| |
|**message**|String| |
|**status**|Boolean| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

# executeRasQuery


## Description
Execute the Spark SQL script written by the user

## Request method
POST

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwQuery:executeRasQuery

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**callBackURL**|String|False| |Callback Address Name|
|**databaseName**|String|False| |Database Name|
|**instanceName**|String|True| |Instance Name|
|**instanceOwnerName**|String|False| |Instance Owner Name|
|**isExplain**|String|False| |Is interpretation required or not|
|**queueName**|String|False| |Queue Name|
|**source**|String|False| |Resource Name|
|**sql**|String|True| |Sql Script|
|**userName**|String|True| |User Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Integer| |
|**message**|String| |
|**status**|Boolean| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

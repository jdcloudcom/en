# executeRasQuery


## Description
Execute the Spark SQL script written by the user

## Request method
POST

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwQuery:executeRasQuery

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**callBackURL**|String|False||Callback address name|
|**databaseName**|String|False||Database name|
|**instanceName**|String|True||Instance name|
|**instanceOwnerName**|String|False||Instance owner name|
|**isExplain**|String|False||Is interpretation required or not|
|**queueName**|String|False||Queue name|
|**source**|String|False||Resource name|
|**sql**|String|True||sql script|
|**userName**|String|True||User name|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|Integer||
|**message**|String||
|**status**|Boolean||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

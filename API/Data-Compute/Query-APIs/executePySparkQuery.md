# executePySparkQuery


## Description
Execute the PySpark script written by the user

## Request method
POST

## Request address
https://xdata.jdcloud-api.com/v1/regions/{regionId}/dwQuery:executePySparkQuery

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceName**|String|True||Instance name|
|**instanceOwnerName**|String|False||Instance owner name|
|**script**|String|True||PySpark script|
|**scriptType**|String|False||Script type name|
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

# describeJob


## Description
Query the details of assigned job

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/job

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|Integer|True|||
|**namespaceId**|Integer|True|||


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**jobStr**|JobStr||
### <a name="JobStr">JobStr</a>
|Name|Type|Description|
|---|---|---|
|**appName**|String||
|**createTime**|String||
|**deleted**|String||
|**description**|String||
|**duration**|Integer||
|**id**|Integer||
|**jobType**|String||
|**name**|String||
|**namespaceId**|String||
|**resourceConsume**|Integer||
|**sqlStatement**|String||
|**status**|String||
|**uid**|String||
|**updateTime**|String||
|**userName**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|

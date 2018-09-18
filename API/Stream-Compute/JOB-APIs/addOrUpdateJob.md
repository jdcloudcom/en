# addOrUpdateJob


## Description
Add or update job

## Request method
POST

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/job

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobStr**|JobStr|True||Details of creating job|

### <a name="JobStr">JobStr</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**appName**|String|False|||
|**createTime**|String|False|||
|**deleted**|String|False|||
|**description**|String|False|||
|**duration**|Integer|False|||
|**id**|Integer|False|||
|**jobType**|String|False|||
|**name**|String|False|||
|**namespaceId**|String|False|||
|**resourceConsume**|Integer|False|||
|**sqlStatement**|String|False|||
|**status**|String|False|||
|**uid**|String|False|||
|**updateTime**|String|False|||
|**userName**|String|False|||

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**okInfo**|OkInfo|Successful result object|
### <a name="OkInfo">OkInfo</a>
|Name|Type|Description|
|---|---|---|
|**message**|String|Status information|
|**status**|Boolean||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|

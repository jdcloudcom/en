# getKey


## Description
Obtain user appkey and SecretKey

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/key

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
无


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|[AppModel](##AppModel)|AK/SK queried|
|**message**|String||
|**status**|String||
### <a name="AppModel">AppModel</a>
|Name|Type|Description|
|---|---|---|
|**appKey**|String|AK|
|**appSecret**|String|SK|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

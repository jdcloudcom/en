# describeIpResources


## Description
Search the EIP resource list under the zone

## Request method
GET

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|False||IP fuzzy matching|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**dataList**|[IpResource[]](##IpResource)||
|**totalCount**|Integer||
### <a name="IpResource">IpResource</a>
|Name|Type|Description|
|---|---|---|
|**bandwidth**|Integer|Bandwidth cap, unit: Mbps|
|**ip**|String|EIP address|
|**safeStatus**|Integer|Security status, 0->safe  1->clean  2->black hole|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|

# describeIpResourceProtectInfo


## Description
Search EIP protection details

## Request method
GET

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/protectInfo

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True||EIP address|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**limit**|Integer|False||Records of limited search|
|**start**|Integer|False||Start range of limited search|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**dataList**|IpResourceProtectInfo[]||
### <a name="IpResourceProtectInfo">IpResourceProtectInfo</a>
|Name|Type|Description|
|---|---|---|
|**cause**|Integer|Trigger cause, 0->unknown  1->four-layer  2->seven-layer  3->four-layer and seven-layer|
|**endTime**|String|End time of attack|
|**startTime**|String|Start time of attack|
|**status**|Integer|Status, 0->completed  1->clean  2->black hole|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

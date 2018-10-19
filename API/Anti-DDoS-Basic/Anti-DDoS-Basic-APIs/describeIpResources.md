# describeIpResources


## Description
Search the EIP resource list under the zone

## Request method
GET

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|False| |IP Fuzzy Matching|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|IpResource[]| |
|**totalCount**|Integer| |
### IpResource
|Name|Type|Description|
|---|---|---|
|**bandwidth**|Integer|Bandwidth Cap, Unit: Mbps|
|**ip**|String|EIP Address|
|**safeStatus**|Integer|Security Status, 0->Safe  1->Clean  2-Black Hole|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

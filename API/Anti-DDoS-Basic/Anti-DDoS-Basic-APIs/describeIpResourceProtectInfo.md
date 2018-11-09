# describeIpResourceProtectInfo


## Description
Search EIP protection details

## Request method
GET

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/protectInfo

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True| |EIP Address|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**limit**|Integer|False| |Records of Limited Search|
|**start**|Integer|False| |Start range of limited search|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|IpResourceProtectInfo[]| |
### IpResourceProtectInfo
|Name|Type|Description|
|---|---|---|
|**cause**|Integer|Trigger Cause, 0->Unknown  1->Four-layer  2->Seven-layer  3->Four-layer and Seven-Layer|
|**endTime**|String|End Time of Attack|
|**startTime**|String|Start Time of Attack|
|**status**|Integer|Status, 0->Completed  1->Clean  2->Black Hole|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

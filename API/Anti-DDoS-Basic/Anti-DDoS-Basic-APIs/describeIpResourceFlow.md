# describeIpResourceFlow


## Description
Search the EIP monitoring traffic

## Request method
GET

## Request address
https://baseanti.jdcloud-api.com/v1/regions/{regionId}/ipResources/{ip}/monitorFlow

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ip**|String|True| |EIP Address|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|False| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|IpResourceFlow| |
### IpResourceFlow
|Name|Type|Description|
|---|---|---|
|**bps**|IpResourceFlowDetail| |
|**pps**|IpResourceFlowDetail| |
### IpResourceFlowDetail
|Name|Type|Description|
|---|---|---|
|**times**|String[]|Time Point|
|**used**|Integer[]|Use Value of Corresponding Time Point|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

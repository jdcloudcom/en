# getVserverGroupsById


## Description
Obtain information of the server group according to the filter conditions

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/vpc_vserverGroups/{id}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|True| |ID of Server Group|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-cloudid**|String|False| |Cloud Registration Information ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**vserverGroup**|VserverGroupDetail| |
### VserverGroupDetail
|Name|Type|Description|
|---|---|---|
|**cloudID**|String|ID of Cloud|
|**vserverGroupId**|String|ID of Server Group|
|**vserverGroupName**|String|Name of Server Group|
|**backendServers**|VserverGroupBackendServer[]| |
### VserverGroupBackendServer
|Name|Type|Description|
|---|---|---|
|**serverId**|String|ID of Load Balancer Instance.|
|**port**|Integer|Port of Backend Server.|
|**weight**|Integer|Weight of Backend Server.|

## Return Code
|Return Code|Description|
|---|---|
|**200**|ok|

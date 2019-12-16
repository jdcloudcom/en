# updateCollectResources


## Description
Incrementally update collection instance list. Updated action supports add and remove

## Request Method
POST

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/collectinfos/{collectInfoUID}:updateResources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**collectInfoUID**|String|True| |Collection Configuration UID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**action**|String|True| |action|
|**resources**|Resource[]|False| |Collection Instance List (the cap for system logs is 20)|

### Resource
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**region**|String|True| |Resource Region|
|**resourceId**|String|True| |Resource ID|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested Identifier id|


## Return Code
|Return Code|Description|
|---|---|
|**200**|Update collection configuration resource results|

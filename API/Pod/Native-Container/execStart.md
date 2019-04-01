# execStart


## Description
Execute exec. This interface requires upgrading Http protocol to WebSocket

## Request Method
GET

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}/containers/{containerName}:execStart

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|
|**containerName**|String|True| |container name|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**execId**|String|False| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

# setFollowSourceProtocol


## Description
Set protocol following back-to-origin

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/followSourceProtocol

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**status**|String|True| |Switch Value [on,off]|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](setfollowsourceprotocol#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String|Task id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
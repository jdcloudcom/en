# deleteListener


## Description
Delete the listener

## Request Method
DELETE

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/listeners/{listenerId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|
|**listenerId**|String|True| |Listener ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**success**|Boolean|Whether the deletion operation succeeded|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

# updateKeyDescription


## Description
Modify the key configuration, including key name, use, automatic rotation or not, rotation cycle, etc.

## Request Method
PATCH

## Request Address
https://kms.jdcloud-api.com/v1/key/{keyId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |Key ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyCfg**|KeyCfg|True| | |

### KeyCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyDescCfg**|KeyDescCfg|True| |key Description Configuration|
|**keyRotateCfg**|KeyRotateCfg|True| |key Rotation Configuration|
### KeyDescCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyDesc**|String|True| |Description of key, "" by Default|
|**keyName**|String|True| |Name of key, "" by Default|
### KeyRotateCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**autoRotate**|Boolean|True| |Automatically rotate or not, fals by defaulte|
|**rotationCycle**|Integer|True| |The automatic rotation cycle is counted on the basis of day and 0 by default (no rotation).|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|

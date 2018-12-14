# updateSecret


## Description
Modify confidentiality description

## Request Method
PATCH

## Request Address
https://kms.jdcloud-api.com/v1/secret/{secretId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretId**|String|True| |Confidentiality ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretDescCfg**|SecretDescCfg|True| | |

### SecretDescCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretDesc**|String|True| |Description of secret, "" by Default|
|**secretName**|String|True| |Name of secret, "" by Default|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|Not found|

# updateSecretVersion


## Description
Modify configuration of confidentiality with specified version

## Request Method
PATCH

## Request Address
https://kms.jdcloud-api.com/v1/secret/{secretId}/version/{version}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretId**|String|True| |Confidentiality ID|
|**version**|String|True| |Confidential version|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretTimeCfg**|SecretTimeCfg|True| | |

### SecretTimeCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**expireTime**|String|True| |The expiration time, no expiration by default, follows the ISO8601 standard and is in the format of YYYY-MM-DDTHH:mm.:ssZ|
|**startTime**|String|True| |The activation time, current time by default, follows the ISO8601 standard and is in the format of YYYY-MM-DDTHH:mm.:ssZ|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

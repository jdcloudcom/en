# createSecretVersion


## Description
Create a new version of confidentiality in enabled status by default

## Request Method
POST

## Request Address
https://kms.jdcloud-api.com/v1/secret/{secretId}:createSecretVersion

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretId**|String|True| |Confidentiality ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretVersionCfg**|SecretVersionCfg|True| | |

### SecretVersionCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretData**|String|True| |Content of Secret|
|**secretTimeCfg**|SecretTimeCfg|True| |Validity Period Configuration of Confidential Data|
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
|**404**|Not found|

# createSecret


## Description
Create Confidentiality

## Request Method
POST

## Request Address
https://kms.jdcloud-api.com/v1/secret:create


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretCfg**|SecretCfg|True| | |

### SecretCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretData**|String|True| |Content of Secret|
|**secretDescCfg**|SecretDescCfg|True| |Information Configuration of Confidential Data Description|
|**secretTimeCfg**|SecretTimeCfg|True| |Validity Period Configuration of Confidential Data|
### SecretDescCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretDesc**|String|True| |Description of secret, "" by Default|
|**secretName**|String|True| |Name of secret, "" by Default|
### SecretTimeCfg
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**expireTime**|String|True| |The expiration time, no expiration by default, follows the ISO8601 standard and is in the format of YYYY-MM-DDTHH:mm.:ssZ|
|**startTime**|String|True| |The activation time, current time by default, follows the ISO8601 standard and is in the format of YYYY-MM-DDTHH:mm.:ssZ|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

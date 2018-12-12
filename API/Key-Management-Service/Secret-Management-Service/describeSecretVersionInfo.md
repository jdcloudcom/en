# describeSecretVersionInfo


## Description
Obtain details of specified confidentiality version

## Request Method
GET

## Request Address
https://kms.jdcloud-api.com/v1/secret/{secretId}/version/{version}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**secretId**|String|True| |Confidentiality ID|
|**version**|String|True| |Confidential version|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**secretVersionItem**|SecretVersionItem| |
### SecretVersionItem
|Name|Type|Description|
|---|---|---|
|**expireTime**|String|The expiration time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|
|**secretData**|String|Content of key|
|**secretStatus**|Integer|Current Status of Secret: 0: Enabled; 1: Disabled|
|**secretVersion**|String|Version Identifier|
|**startTime**|String|SThe secret activation time in the format of YYYY-MM-DDTHH:mm follows the ISO8601 standard.:ssZ|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

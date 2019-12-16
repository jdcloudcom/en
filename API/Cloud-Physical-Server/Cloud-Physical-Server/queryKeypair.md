# queryKeypair


## Description
Search key pair details

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/keypairs/{keypairId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|
|**keypairId**|String|True| |Key Pair ID|

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
|**server**|Keypair|Details About Key Pairs|
### Keypair
|Name|Type|Description|
|---|---|---|
|**keypairId**|String|Key Pair id|
|**region**|String|Region|
|**name**|String|Key Pair Name|
|**publicKey**|String|Public Key|
|**fingerPrint**|String|Fingerprint|
|**createTime**|String|Creation Time|
|**updateTime**|String|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

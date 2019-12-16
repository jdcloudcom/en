# queryKeypairs


## Description
Search key pair list

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/keypairs

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[20, 100]|
|**name**|String|False| |Key Pair Name|
|**filters**|Filter[]|False| |keypairId  - key pair ID, exact matching, supporting multiple IDs<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**servers**|Keypair[]| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Page size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
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

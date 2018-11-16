# describeKeypairs


## Description
Query secret key pairs in batches.<br>
This interface supports query in pages, with 20 entries per page by default.


## Request Method
GET

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/keypairs

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |keyNames - key pair name, exact match, support many<br>|
|**pageNumber**|Integer|False|1|Page Number; 1 by Default|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[10, 100]|

### Filter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**keypairs**|Keypair[]| |
|**totalCount**|Number|Total Data Entries|
### Keypair
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Creation Time|
|**keyFingerprint**|String|Fingerprint of key pairs, based on the public key fingerprint format defined by RFC4716, with the MD5 information digest algorithm applied.|
|**keyName**|String|Key Pair Name|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|

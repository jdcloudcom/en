# updateDomain


## Description
Modify Main Domain Name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainUpdate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Domain Name to be Modified|
|**id**|Integer|True| |Domain Name ID to be Modified|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**updateDomain**|Domain|Domain Name Structure after Modification|
### Domain
|Name|Type|Description|
|---|---|---|
|**createTime**|Integer|Creation Time, Format Unix Timestamp |
|**domainName**|String|Domain Name String|
|**expirationDate**|Integer|Expiration Time, Format Unix Timestamp|
|**id**|Integer|Unique ID of the Domain Name|
|**packId**|Integer|Package Type, 0->Free 1->Enterprise Edition 2->Advanced Edition|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

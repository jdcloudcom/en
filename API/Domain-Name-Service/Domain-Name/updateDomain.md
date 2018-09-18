# updateDomain


## Description
Modify Main Domain Name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainUpdate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainName**|String|True||Domain name to be modified|
|**id**|Integer|True||Domain name ID to be modified|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**updateDomain**|Domain|Domain name structure after modification|
### <a name="Domain">Domain</a>
|Name|Type|Description|
|---|---|---|
|**createTime**|Integer|Creation time, format Unix timestamp|
|**domainName**|String|Domain Name String|
|**expirationDate**|Integer|Expiration time, format Unix timestamp|
|**id**|Integer|Unique ID of the domain name|
|**packId**|Integer|Package type, 0->free 1->Enterprise Edition 2->Advanced Edition|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

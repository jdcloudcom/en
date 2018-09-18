# addDomain


## Description
Add Main Domain Name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainAdd

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**billingType**|Integer|False||Billing type, domain name of the paid package is required|
|**buyType**|Integer|False||1->new purchase, 2->upgrade, domain name of the paid package is required|
|**domainId**|Integer|False||Domain name ID, required for upgraded and advanced version|
|**domainName**|String|True||Domain name to be added|
|**packId**|Integer|True||Type of the domain name package,  0->free, 1->Enterprise Edition, 2->Advanced Edition|
|**timeSpan**|Integer|False||1,2,3 , duration, domain name of the paid package is required|
|**timeUnit**|Integer|False||Time unit, domain name of the paid package is required|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**data**|Domain|Newly added domain name structure|
|**order**|String|Add the order number of the paid domain name|
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

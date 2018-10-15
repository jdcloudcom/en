# addDomain


## Description
Add Main Domain Name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainAdd

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**billingType**|Integer|False| |Billing Type, domain name of the paid package is required|
|**buyType**|Integer|False| |1->New Purchase, 2->Upgrade, domain name of the paid package is required|
|**domainId**|Integer|False| |Domain Name ID, required for upgraded and advanced version       |
|**domainName**|String|True| |Domain Name to be Added|
|**packId**|Integer|True| |Type of the Domain Name Package,  0->Free, 1->Enterprise Edition, 2->Advanced Edition|
|**timeSpan**|Integer|False| |1, 2, 3, Duration, domain name of the paid package is required|
|**timeUnit**|Integer|False| |Time Unit, domain name of the paid package is required|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Domain|Newly Added Domain Name Structure|
|**order**|String|Add the order number of the paid domain name|
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

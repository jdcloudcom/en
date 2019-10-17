# createDomain


## Description
Add a primary domain  
For details about how to add a free domain, please see the<a href="https://docs.jdcloud.com/en/jd-cloud-dns/domainadd">document</a>
For details about how to add a charged domain, please see the<a href="https://docs.jdcloud.com/en/jd-cloud-dns/purchase-process">document</a>,
Before adding a charged domain, please ensure that the user’s JD Cloud account has sufficient funds. Openapi API returns the order number, with which details can be reviewed in a charging system.


## Request Method
POST

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**packId**|Integer|True| |Package Type of Primary Domain, Free:0 Enterprise Version: 1 Advanced Enterprise Version: 2|
|**domainName**|String|True| |Primary Domain to Be Added|
|**domainId**|Integer|False| |Primary domain ID is required for package upgrade. Please obtain it with describeDomains|
|**buyType**|Integer|False| |Purchase: 1, Upgrade: 3, the domain of a charged domain is required|
|**timeSpan**|Integer|False| |Values: 1, 2, 3, Meaning: duration, the domain of a charged package is required|
|**timeUnit**|Integer|False| |Time unit, required for domain of charging package, 1: Hour, 2: Day, 3: Month, 4: Year|
|**billingType**|Integer|False| |Billing type, this parameter is not required for transmission.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|DomainAdded|Structure of Added Domain|
|**order**|String|Add the order number of the charged domain|
### DomainAdded
|Name|Type|Description|
|---|---|---|
|**id**|Integer|Unique Domain ID|
|**domainName**|String|Domain Character String|
|**createTime**|Long|Creation time, format: Unix timestamp, time unit: millisecond|
|**expirationDate**|Long|Expiration time, format: Unix timestamp, time unit: millisecond|
|**packId**|Integer|Package Type, Free:0 Enterprise Version: 1 Advanced Enterprise Version: 2|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

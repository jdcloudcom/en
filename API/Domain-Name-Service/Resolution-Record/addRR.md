# addRR


## Description
Add a resolution record of the domain name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RRAdd

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**req**|AddRR|True||RR Parameter|

### <a name="AddRR">AddRR</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**hostRecord**|String|False||Machine Record|
|**hostValue**|String|False||Value of the resolution record|
|**jcloudRes**|Boolean|False||JD Cloud Resource?|
|**mxPriority**|Integer|False||Priority, only exists in some resolution record types|
|**port**|Integer|False||port, only exists in some resolution record types|
|**ttl**|Integer|False||Life time of the resolution record|
|**type**|String|False||Resolution Type|
|**viewValue**|Integer|False||ID of the resolution line|
|**weight**|Integer|False||Weight of the resolution record|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**dataList**|RR|Resolution record result after successful addition|
### <a name="RR">RR</a>
|Name|Type|Description|
|---|---|---|
|**hostRecord**|String|Machine Record|
|**hostValue**|String|Value of the resolution record|
|**id**|Integer|Unique ID of the domain name resolution|
|**jcloudRes**|Boolean|JD Cloud Resource?|
|**mxPriority**|Integer|Priority, only exists in some resolution record types|
|**port**|Integer|port, only exists in some resolution record types|
|**ttl**|Integer|Life time of the resolution record|
|**type**|String|Type of the resolution record|
|**viewValue**|Integer[]|ID of the resolution line|
|**weight**|Integer|Weight of the resolution record|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

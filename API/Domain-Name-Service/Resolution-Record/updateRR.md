# updateRR


## Description
Modify a resolution record of the main domain name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RRUpdate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**req**|[UpdateRR](##UpdateRR)|True||UpdateRR Parameter|

### <a name="UpdateRR">UpdateRR</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainName**|String|False||Main Domain Name|
|**hostRecord**|String|False||Machine Record|
|**hostValue**|String|False||Value of the resolution record|
|**id**|Integer|False||Unique ID of the domain name resolution|
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



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

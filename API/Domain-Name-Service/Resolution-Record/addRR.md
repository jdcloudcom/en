# addRR


## Description
Add a Resolution Record of the Domain Name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RRAdd

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**req**|AddRR|True| |RR Parameter|

### AddRR
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**hostRecord**|String|False| |Machine Record|
|**hostValue**|String|False| |Value of Resolution Record|
|**jcloudRes**|Boolean|False| |JD Cloud Resource?|
|**mxPriority**|Integer|False| |Priority, only exists in some resolution record types|
|**port**|Integer|False| |Port, only exists in some resolution record types|
|**ttl**|Integer|False| |Life Time of Resolution Record|
|**type**|String|False| |Resolution Type|
|**viewValue**|Integer|False| |ID of Resolution Line|
|**weight**|Integer|False| |Weight of Resolution Record|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|RR|Resolution Record Result after Successful Addition|
### RR
|Name|Type|Description|
|---|---|---|
|**hostRecord**|String|Machine Record|
|**hostValue**|String|Value of Resolution Record|
|**id**|Integer|Unique ID of the Domain Name Resolution|
|**jcloudRes**|Boolean|JD Cloud Resource?|
|**mxPriority**|Integer|Priority, only exists in some resolution record types|
|**port**|Integer|Port, only exists in some resolution record types|
|**ttl**|Integer|Life Time of Resolution Record|
|**type**|String|Type of Resolution Record|
|**viewValue**|Integer[]|ID of Resolution Line|
|**weight**|Integer|Weight of Resolution Record|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

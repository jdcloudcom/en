# updateRR


## Description
Modify a Resolution Record of the Main Domain Name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RRUpdate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**req**|UpdateRR|True| |UpdateRR Parameter|

### UpdateRR
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainName**|String|False| |Main Domain Name|
|**hostRecord**|String|False| |Machine Record|
|**hostValue**|String|False| |Value of Resolution Record|
|**id**|Integer|False| |Unique ID of the Domain Name Resolution|
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



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

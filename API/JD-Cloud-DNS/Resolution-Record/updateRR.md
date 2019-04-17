# updateRR


## Description
Modify a Resolution Record of the Main Domain Name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RRUpdate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID, please get it by using getDomains interface.|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**req**|UpdateRR|True| |UpdateRR Parameter|

### UpdateRR
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Main Domain Name|
|**hostRecord**|String|True| |Machine Record|
|**hostValue**|String|True| |Value of Resolution Record|
|**id**|Integer|True| |Unique ID of the Domain Name Resolution|
|**jcloudRes**|Boolean|False| |JD Cloud Resource?|
|**mxPriority**|Integer|False| |Priority, only exists in some resolution record types|
|**port**|Integer|False| |Port, only exists in some resolution record types|
|**ttl**|Integer|True| |Life Time of Resolution Record|
|**type**|String|True| |Resolution Type|
|**viewValue**|Integer|True| |ID of Resolution Line|
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

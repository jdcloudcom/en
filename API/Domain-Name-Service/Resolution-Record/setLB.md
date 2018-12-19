# setLB


## Description
Load Balancer for Setting Domain Resolution Record

## Request Method
POST

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/SetLB

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain ID, please get it by using getDomains interface.|
|**regionId**|String|True| |Region ID of Instances|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idWeights**|Setlb[]|True| |Weight Parameters List to Be Set with Resolution Record|
|**type**|String|True| |Type of These Resolution Records. Type available for setting weight: A, AAAA, CNAME, JNAME|

### Setlb
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|Integer|True| |ID of Resolution Record. Get from getLB interface|
|**weight**|Integer|True| |Weight of the Resolution Record|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at This Time|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

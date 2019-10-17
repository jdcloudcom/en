# createMonitor


## Description
Add sub-domain monitoring item, with monitoring added to all sub-domain monitoring items by default

## Request Method
POST

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/monitor

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID of Instances|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**subDomainName**|String|True| |Subdomain|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request at this time|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

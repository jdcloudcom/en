# addMonitorTarget


## Description
Add certain monitoring objects as the monitoring items for the subdomains

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitorAddTarget

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**subDomainName**|String|True||Subdomain|
|**targets**|String[]|True||Array of available monitoring objects of subdomain|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

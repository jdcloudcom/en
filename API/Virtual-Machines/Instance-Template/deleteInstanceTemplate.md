# deleteInstanceTemplate


## Description
Delete an enabling template


## Request Method
DELETE

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceTemplates/{instanceTemplateId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceTemplateId**|String|True| |Enable the template ID|

## Request Parameter
None


## Return Parameter
None


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

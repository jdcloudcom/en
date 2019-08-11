# updateInstanceTemplate


## Description
Modify the information of an enabling template, including names and descriptions


## Request Method
PATCH

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instanceTemplates/{instanceTemplateId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceTemplateId**|String|True| |Enable the template ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |For the template description, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">refer to the public parameter specification</a>.|
|**name**|String|False| |For the template name, <a href="http://docs.jdcloud.com/virtual-machines/api/general_parameters">refer to the public parameter specification</a>.|


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

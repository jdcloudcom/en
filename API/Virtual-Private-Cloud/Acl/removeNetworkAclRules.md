# removeNetworkAclRules


## Description
Remove NetworkAcl rule

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/{networkAclId}:removeNetworkAclRules

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**networkAclId**|String|True| |networkAclId ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**ruleIds**|String[]|True| |Modify NetworkAcl attribute|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Invalid parameter|
|**404**|Not found|
|**500**|Internal error|

# createNetworkAcl


## Description
Create NetworkAcl API

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, not exceeding 256 characters|
|**networkAclName**|String|True| |NetworkAcl Name|
|**vpcId**|String|True| |VPC ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned Results|


### Result
|Name|Type|Description|
|---|---|---|
|**networkAclId**|String|networkAcl ID|

## Response code
|Return code|Description|
|---|---|
|**200**|Successful Operation|
|**400**|Invalid parameter|
|**404**|Not found|
|**500**|Internal error|
|**429**|Quota exceeded|

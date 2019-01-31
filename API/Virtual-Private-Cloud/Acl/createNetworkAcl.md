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
|**vpcId**|String|True| |VPC ID|
|**networkAclName**|String|True| |NetworkAcl Name|
|**description**|String|False| |Description, allow all characters under UTF-8 coding, not exceeding 256 characters|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**networkAclId**|String|networkAcl ID|

## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Invalid parameter|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal error|

# disassociateNetworkAcl


## Description
Disassociate NetworkAcl API from subnet

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/networkAcls/{networkAclId}:disassociateNetworkAcl

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**networkAclId**|String|True| |networkAclId ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**subnetId**|String|True| |Subnet ID Disassociated from NetworkAcl|


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

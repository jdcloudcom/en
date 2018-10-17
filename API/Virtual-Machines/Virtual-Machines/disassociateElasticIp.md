# disassociateElasticIp


## Description
Disassociate EIP from VM.

The EIP which will be disassociated is the EIP corresponding to primary intranet IP of primary network interface.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:disassociateElasticIp

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |VM ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True| |ID of Elastic IP|


## Response parameter
None


## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|


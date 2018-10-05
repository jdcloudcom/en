# associateElasticIp


## Description
Associate Elastic IP for the primary intranet IP of primary network interface under virtual machine.<br>
A virtual machine can only be associated with one Elastic IP for primary network interface, and error will occur if the primary network interfac already associated with Elastic IP.


## Request Method
POST

## Request Address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:associateElasticIp

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Virtual Machine ID|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True| |Elastic IP ID|


## Response Parameter
None


## Response Code
|Response Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|

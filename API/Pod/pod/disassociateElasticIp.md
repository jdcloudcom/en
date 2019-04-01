# disassociateElasticIp


## Description
The EIP disassociated with the pod is the elastic IP corresponding to the primary network interface and primary private IP.


## Request Method
POST

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}:disassociateElasticIp

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**podId**|String|True| |Pod ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True| |Elastic IP ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

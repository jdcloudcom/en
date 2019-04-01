# associateElasticIp


## Description
The elastic IP associated with pod is the elastic IP corresponding to the primary network interface and primary private IP. <br>
One pod only can be associated with one elastic IP (primary network interface). If the primary network interface has the elastic IP, the error will be returned.<br>
If the user is in the blacklist, the error will be returned.


## Request Method
POST

## Request Address
https://pod.jdcloud-api.com/v1/regions/{regionId}/pods/{podId}:associateElasticIp

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

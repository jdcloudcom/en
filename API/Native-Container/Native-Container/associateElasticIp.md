# associateElasticIp


## Description
The elastic IP associated with the container is the elastic IP corresponding to the primary network interface and primary private IP.
One virtual machine only can be associated with one elastic IP (primary network interface). If the primary network interface has the elastic IP, the error will be returned. <br>
If the user is in the blacklist, the error will be returned.


## Request method
POST

## Request address
https://nc.jdcloud-api.com/v1/regions/{regionId}/containers/{containerId}:associateElasticIp

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**containerId**|String|True| |Container ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True| |Elastic IP ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |



## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|

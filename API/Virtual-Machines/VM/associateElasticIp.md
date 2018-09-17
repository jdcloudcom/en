# associateElasticIp


## Description
The virtual machine associates the elastic public IP,  and the associating is the IP of the elastic public network corresponding to the primary IP and the intranet primary IP. 
A virtual machine can only associate with an EIP (master network card). If the main network card already exists EIP,  the error will be returned. 
If the user is on the blacklist, an error will occur.


## Request method
POST

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:associateElasticIp

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||VM ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**elasticIpId**|String|True||ID of EIP|


## Return parameter
|Name|Type|Description|
|---|---|---|



## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|

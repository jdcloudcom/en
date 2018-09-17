# modifySecurityIps


## Description
Modify Instance Access Whitelist

## Request method
POST

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/securityIps

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**modifyMode**|String|True||Modification method, Add adds whitelist, Delete deletes whitelist.|
|**securityIps**|String|True||IP list under the IP whitelist group, up to 45 separated by commas, in the following format: 0.0.0.0/0, 10.23.12.24 (IP), or 10.23.12.24/24 (CIDR mode, classless inter-domain routing, /24 indicates the length of the prefix in the address; range [1, 32]).|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|

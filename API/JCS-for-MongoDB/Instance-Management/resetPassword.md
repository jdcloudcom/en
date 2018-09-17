# resetPassword


## Description


## Request method
POST

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:resetPassword

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**accountPassword**|String|True||The new password must contain and only support letters and numbers with length no less than 8 characters and no more than 16 characters.|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|

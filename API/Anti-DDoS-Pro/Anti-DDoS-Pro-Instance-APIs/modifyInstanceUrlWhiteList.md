# modifyInstanceUrlWhiteList


## Description
Set the instance url white list

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}:setUrlWhiteList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Belonging region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**urlWhiteList**|String[]|True||Web service rule parameter|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

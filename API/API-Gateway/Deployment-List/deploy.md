# deploy


## Description
Release Version

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/deployments

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**revision**|String|True| |Released Revision Number|
|**environment**|String|True| |Environment: test, preview and online|
|**backendServiceType**|String|False| |Backend service types: mock, unique and vpc|
|**backendUrl**|String|False| |Backend Address|
|**description**|String|False| |Description|
|**jdsfName**|String|False| |The name of JD Distributed Service Gateway|
|**jdsfRegistryName**|String|False| |JD Distributed Service Registration Center ID|
|**jdsfId**|String|False| |JD Distributed Service ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

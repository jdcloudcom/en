# modifyApiGroupAttribute


## Description
Modify API group information

## Request Method
PUT

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**groupName**|String|False| |Name|
|**description**|String|False| |Description|
|**prefix**|String|False| |Group Path Prefix|
|**keyCheck**|String|False| |Key pair verification mode: check_exist (Key pair must be configured in the access authorization) and no_check_exist (No need to configure in advance)|
|**authType**|String|False| |Access authorization mode: None (No authentication), jd_cloud (Enable Access Authorization and must use the signature verification of AK and SK for JD Cloud) and hufu (hufu user)|
|**prefixStrip**|Integer|False| |Whether to forward the group path to the backend service: 0 (not forward) and 1 (forward). The default is 1|
|**groupType**|String|False| |Group type: api_group (api group) and jdsf_group (JD Distributed Service group). The default is api_group|
|**jdsfName**|String|False| |The name of JD Distributed Service Gateway|
|**jdsfRegistryName**|String|False| |JD Distributed Service Registration Center ID|
|**jdsfId**|String|False| |JD Distributed Service Gateway ID|


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

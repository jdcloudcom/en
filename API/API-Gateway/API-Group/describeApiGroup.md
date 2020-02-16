# describeApiGroup


## Description
Search the details of API group

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeapigroup#result)|Search the details of API group|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**apiGroup**|[ApiGroup](describeapigroup#apigroup)| |
### <div id="apigroup">ApiGroup</div>
|Name|Type|Description|
|---|---|---|
|**apiGroupId**|String|Group ID|
|**groupName**|String|Name|
|**description**|String|Description|
|**prefix**|String|Group Path Prefix|
|**version**|String|Version Number|
|**regionId**|String|Zone|
|**domain**|String|Domain|
|**environment**|String|Release environment information. In case of null, it is not released|
|**keyCheck**|String|Key pair verification mode: check_exist (Key pair must be configured in the access authorization) and no_check_exist (No need to configure in advance)|
|**authType**|String|Access authorization mode: None (No authentication), jd_cloud (Enable Access Authorization and must use the signature verification of AK and SK for JD Cloud) and hufu (hufu user)|
|**prefixStrip**|Integer|Whether to forward the group path to the backend service: 0 (not forward) and 1 (forward)|
|**groupType**|String|Group type: api_group (api group) and jdsf_group (JD Distributed Service group)|
|**jdsfName**|String|The name of JD Distributed Service Gateway|
|**jdsfRegistryName**|String|JD Distributed Service Registration Center ID|
|**jdsfId**|String|JD Distributed Service Gateway ID|
|**deploy**|Integer|Whether group is released: 0 (not released) and 1 (released)|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

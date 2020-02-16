# describeDeployment


## Description
Search deployment details of this version

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/deployments/{deploymentId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|
|**deploymentId**|String|True| |Deploy ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describedeployment#result)|Search the details of API group|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**deploymentId**|String|Deploy ID|
|**revision**|String|Released Revision Number|
|**path**|String|Path|
|**environment**|String|Environment: test, preview and online|
|**backendServiceType**|String|Backend service types: mock, unique and vpc|
|**backendUrl**|String|Backend Address|
|**description**|String|Description|
|**createTime**|Long|Release date in the format of millisecond time stamp|
|**jdsfName**|String|The name of JD Distributed Service Gateway|
|**jdsfRegistryName**|String|JD Distributed Service Registration Center ID|
|**jdsfId**|String|JD Distributed Service ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

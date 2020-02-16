# describeDeployments


## Description
Search deployment list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/deployments

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](describedeployments#filter)|False| |isApiProduct - If it is an API product, exact matching, with 1 for yes<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describedeployments#result)|Search Result Set|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**deployments**|[Deployment[]](describedeployments#deployment)|Deployment List|
### <div id="deployment">Deployment</div>
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
|**500**|Internal server error|
|**503**|Service unavailable|

# bindGroupKey


## Description
Associate Group

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessKeys/{accessKeyId}:bindGroup

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**accessKeyId**|String|True| |access key id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deploymentIds**|String|True| |Separate deployed ids to be associated by comma|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](bindgroupkey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**bindGroups**|[BindGroups[]](bindgroupkey#bindgroups)|Associate ID deployed and its name|
### <div id="bindgroups">BindGroups</div>
|Name|Type|Description|
|---|---|---|
|**deploymentId**|String|Deploy ID|
|**groupName**|String|Group Name|
|**environment**|String|Environment: test, preview and online|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

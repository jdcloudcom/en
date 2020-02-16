# queryAccessKey


## Description
Search a single key pair

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessKeys/{accessKeyId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**accessKeyId**|String|True| |access key id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryaccesskey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessKey**|[AccessKey](queryaccesskey#accesskey)| |
### <div id="accesskey">AccessKey</div>
|Name|Type|Description|
|---|---|---|
|**accessKeyId**|String|Access Key id|
|**description**|String|Description|
|**accessKeyType**|String|Key Pair Type|
|**accessKey**|String|Access Key|
|**bindGroups**|[BindGroups[]](queryaccesskey#bindgroups)|Associate Group|
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

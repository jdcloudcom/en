# modifyRevision


## Description
Modify a single revision

## Request Method
PATCH

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/revision/{revisionId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|
|**revisionId**|String|True| |Version ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**revisionNote**|String|False| |Revise note|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](modifyrevision#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**updateRevision**|Boolean|If the revision is successfully modified|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

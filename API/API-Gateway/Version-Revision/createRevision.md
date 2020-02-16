# createRevision


## Description
Create revision

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/revision

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**revision**|String|False| |For revision number, this is required if a revision is returned when creating a version|
|**baseRevision**|String|False| |Based on this revision, this is required if a revision is returned when creating a version|
|**revisionNote**|String|False| |Revise note|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createrevision#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**revision**|String|Newly created revision number|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

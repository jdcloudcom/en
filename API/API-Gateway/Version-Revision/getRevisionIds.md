# getRevisionIds


## Description
Search all revision numbers in a group

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/revisions

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getrevisionids#result)|Search Result Set|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**revisions**|[RevisionList[]](getrevisionids#revisionlist)|Search the revision details list|
### <div id="revisionlist">RevisionList</div>
|Name|Type|Description|
|---|---|---|
|**revisionId**|String|Version Id|
|**revision**|String|Revision Number|
|**baseRevision**|String|Based on this revision|
|**environment**|String|Release Environment|
|**createdAt**|String|Revise date|
|**revisionNote**|String|Revise note|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|

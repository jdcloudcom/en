# describeRevisions


## Description
Search revision list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/apiGroups/{apiGroupId}/revision

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**apiGroupId**|String|True| |Group ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**filters**|[Filter[]](describerevisions#filter)|False| |revision - revision number, exact matching<br>environment - release environment, fuzzy matching<br>revisionNote - revise note, exact matching<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describerevisions#result)|Search Result Set|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**revisions**|[RevisionList[]](describerevisions#revisionlist)|Search the revision details list|
|**totalCount**|Integer|Searched Version Counts|
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

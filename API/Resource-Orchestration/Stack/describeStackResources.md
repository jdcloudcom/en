# describeStackResources


## Description
Search resource lists in resource stack

## Request Method
GET

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/stacks/{stackId}/resources

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**stackId**|String|True| |Resource Stack ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range[1, 100]|
|**search**|String|False| |Conduct fuzzy search in accordance with JD Cloud product line name or resource logic ID|
|**product**|String|False| |Conduct fuzzy search only in accordance with JD Cloud product line name, such as VM and Disk etc.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**list**|ResourceOut[]| |
|**totalCount**|Long| |
### ResourceOut
|Name|Type|Description|
|---|---|---|
|**action**|String|Resource Running Operation|
|**createTime**|String|Creation Time|
|**deletePolicy**|String|Delete policies|
|**deleteTime**|String|Deletion Time|
|**logicId**|String|Resource LogicalID|
|**physicalId**|String|ResourceID|
|**region**|String|Region Information|
|**snapshot**|String|Snapshot information, only for disk resource type|
|**stackId**|String|Resource StackID|
|**status**|String|Resource Running Status|
|**statusReason**|String|Resource Running Status Reasons|
|**type**|String|Resource Type|
|**updateTime**|String|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search resource lists in resource stack|

# describeProgress


## Description
Search progress of cluster operation

## Request Method
GET

## Request Address
https://kubernetes.jdcloud-api.com/v1/regions/{regionId}/clusters/{clusterId}/progress

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**clusterId**|String|True| |Cluster ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**nodeGroupIds**|String[]|False| |ID of Node Group|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeprogress#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**masterProgress**|[MasterProgress](describeprogress#masterprogress)| |
|**nodeGroupProgresses**|[NodeGroupProgress[]](describeprogress#nodegroupprogress)| |
### <div id="nodegroupprogress">NodeGroupProgress</div>
|Name|Type|Description|
|---|---|---|
|**nodeGroupId**|String|Working Node Group id|
|**action**|String|Operation types include upgrade, downgrade and rollback|
|**totalCount**|Integer|Total Working Node Quantity|
|**updatedCount**|Integer|Upgrade-completed Working Node Quantity|
### <div id="masterprogress">MasterProgress</div>
|Name|Type|Description|
|---|---|---|
|**action**|String|Operation types include upgrade, rollback and downgrade|
|**progress**|String|upgrade Range, only three values, 0, 50, 100, are available|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|

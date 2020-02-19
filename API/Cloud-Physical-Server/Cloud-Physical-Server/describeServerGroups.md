# describeServerGroups


## Description
Search Virtual Server Group list

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/serverGroups

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call the API (describeCPSLBRegions) to get regions supported by Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Segmentation size; it is 20 by default; value range[20, 100]|
|**name**|String|False| |Name|
|**loadBalancerId**|String|False| |Load Balancer ID|
|**filters**|[Filter[]](describeservergroups#filter)|False| |serverGroupId   - Virtual Server Group ID, exact matching, supporting multiple IDs<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeservergroups#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**serverGroups**|[ServerGroup[]](describeservergroups#servergroup)| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Segmentation size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### <div id="servergroup">ServerGroup</div>
|Name|Type|Description|
|---|---|---|
|**loadBalancerId**|String|Load Balancer ID|
|**serverGroupId**|String|Virtual Server Group ID|
|**name**|String|Virtual Server Group Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

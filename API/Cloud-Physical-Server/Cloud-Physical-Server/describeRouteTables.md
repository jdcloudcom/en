# describeRouteTables


## Description
Query route table list

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/routeTables

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Segmentation size; it is 20 by default; value range[20, 100]|
|**name**|String|False| |Name|
|**vpcId**|String|False| |VPC ID, Exact Match|
|**filters**|[Filter[]](describeroutetables#filter)|False| |routeTableId - Route Table ID, exact matching, supporting multiple IDs<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeroutetables#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**routeTables**|[RouteTable[]](describeroutetables#routetable)| |
|**pageNumber**|Integer|Page Number; 1 by Default|
|**pageSize**|Integer|Segmentation size; it is 20 by default; value range[20, 100]|
|**totalCount**|Integer|Search result amount|
### <div id="routetable">RouteTable</div>
|Name|Type|Description|
|---|---|---|
|**routeTableId**|String|Route table ID|
|**region**|String|Region|
|**vpcId**|String|VPC ID|
|**name**|String|Name|
|**createTime**|String|Creation Time|
|**routes**|[Route[]](describeroutetables#route)|Routing Rules|
### <div id="route">Route</div>
|Name|Type|Description|
|---|---|---|
|**destinationCidr**|String|Target Segment|
|**nextHopType**|String|Type of Next Hop|
|**nextHop**|String|Next Hop|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

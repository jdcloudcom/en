# describeRouteTable


## Description
Search route table details

## Request Method
GET

## Request Address
https://cps.jdcloud-api.com/v1/regions/{regionId}/routeTables/{routeTableId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, call API (describeRegiones) to get regions supported by Cloud Physical Server|
|**routeTableId**|String|True| |Route table ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describeroutetable#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**routeTable**|[RouteTable](describeroutetable#routetable)|Route Table Details|
### <div id="routetable">RouteTable</div>
|Name|Type|Description|
|---|---|---|
|**routeTableId**|String|Route table ID|
|**region**|String|Region|
|**vpcId**|String|VPC ID|
|**name**|String|Name|
|**createTime**|String|Creation Time|
|**routes**|[Route[]](describeroutetable#route)|Routing Rules|
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

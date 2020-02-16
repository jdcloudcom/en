# selectDetailList


## Description
Search resources and associated resources

## Request Method
GET

## Request Address
https://edgesecurity.jdcloud-api.com/v1/regions/{regionId}/instances:selectDetailList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resourceList**|String|True| |In the resource list separated by English comma, no duplication shall be allowed|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**data**|[ResourceInfo[]](#resourceinfo)| |
### <div id="resourceinfo">ResourceInfo</div>
|Name|Type|Description|
|---|---|---|
|**resourceId**|String|Instance id|
|**resourceName**|String|Instance Name|
|**remark**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

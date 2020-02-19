# queryAreaIspList


## Description
Search region operator list

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/console:areaIspList


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryareaisplist#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**mainLand**|[AreaIspItem[]](queryareaisplist#areaispitem)|Mainland City|
|**overseas**|[AreaIspItem[]](queryareaisplist#areaispitem)|Overseas Country|
|**isp**|[AreaIspItem[]](queryareaisplist#areaispitem)|Domestic Operator|
|**gangaotai**|[AreaIspItem[]](queryareaisplist#areaispitem)|Hong Kong, Macao and Taiwan|
|**oceanica**|[AreaIspItem[]](queryareaisplist#areaispitem)|Oceania Countries|
|**southAmerica**|[AreaIspItem[]](queryareaisplist#areaispitem)|South American Countries|
|**northAmerica**|[AreaIspItem[]](queryareaisplist#areaispitem)|North American Countries|
|**asia**|[AreaIspItem[]](queryareaisplist#areaispitem)| |
|**europe**|[AreaIspItem[]](queryareaisplist#areaispitem)|European Counties|
### <div id="areaispitem">AreaIspItem</div>
|Name|Type|Description|
|---|---|---|
|**description**|String| |
|**code**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
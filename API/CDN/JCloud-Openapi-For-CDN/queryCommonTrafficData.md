# queryCommonTrafficData


## Description
Search statistical data in the public bar

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:common


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| |area|
|**isp**|String|False| |isp|
|**fields**|String|False| |Searched Field|
|**period**|String|False| |Search Cycle|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**avgbandwidth**|Double| |
|**bandUnit**|String| |
|**flow**|Double| |
|**flowUnit**|String| |
|**oriflow**|Double| |
|**oriflowUnit**|String| |
|**pv**|Double| |
|**pvUnit**|String| |
|**oripv**|Double| |
|**oripvUnit**|String| |
|**topTimeStamp**|Long| |
|**oriFlowPercent**|String| |
|**oriPvPercent**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

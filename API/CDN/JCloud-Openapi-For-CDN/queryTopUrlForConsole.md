# queryTopUrlForConsole


## Description
Console Hot-spot Analysis topUrl

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:topUrl


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**sortField**|String|False| |Sorting field, pvPercent is oripv, flowPercent is flow|
|**sortRule**|String|False| |Sorting Rule, desc by default|
|**pageSize**|Integer|False|10| |
|**pageNumber**|Integer|False|1| |
|**withParam**|Boolean|False| |With parameter or not|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer| |
|**data**|[TopUrlItem[]](#topurlitem)| |
### <div id="TopUrlItem">TopUrlItem</div>
|Name|Type|Description|
|---|---|---|
|**url**|String| |
|**rank**|Integer| |
|**flow**|Double| |
|**flowUnit**|String| |
|**flowPercent**|String| |
|**pv**|Long| |
|**pvUnit**|String| |
|**pvPercent**|String| |
|**uv**|Long| |
|**uvUnit**|String| |
|**uvPercent**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

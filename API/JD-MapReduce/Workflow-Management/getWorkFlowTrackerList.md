# getWorkFlowTrackerList


## Description
Obtain the workflow operation record list

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/workFlowTracker:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**selectParams**|SelectParams|False| | |

### SelectParams
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**orderBy**|String|False| |Ranking Condition, optional|
|**pageNum**|Integer|False| |Search Paging Number, optional condition|
|**pageSize**|Integer|False| |Search Paging Size, optional condition|
|**status**|String|False| | |

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|Object|"Include workflow list - workFlowTrackerList"<br>"And list size - totalNum"<br>|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

# getTaskList


## Description
Obtain the operation record of a job

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/{jobId}/task:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**jobId**|String|True| |Job Id to be Searched|
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
|**data**|Object|"Include the searched JmrTaskViewModel list - taskList"<br>"And returned list size - totalNum"<br>|
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

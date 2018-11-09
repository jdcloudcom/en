# getWorkFlowList


## Description
Obtain the workflow list

## Request method
POST

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/{workflowName}:list

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**workflowName**|String|True| |Workflow Name|

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
|**data**|Object| |
|**message**|String| |
|**status**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|

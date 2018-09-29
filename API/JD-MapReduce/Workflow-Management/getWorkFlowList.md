# getWorkFlowList


## 描述
Obtain the workflow list

## 请求方式
POST

## 请求地址
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/{workflowName}:list

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**workflowName**|String|True| |Workflow Name|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**selectParams**|SelectParams|False| | |

### SelectParams
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**orderBy**|String|False| |Ranking Condition, optional|
|**pageNum**|Integer|False| |Search Paging Number, optional condition|
|**pageSize**|Integer|False| |Search Paging Size, optional condition|
|**status**|String|False| | |

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|名称|类型|描述|
|---|---|---|
|**data**|Object| |
|**message**|String| |
|**status**|String| |

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**500**|Internal server error|

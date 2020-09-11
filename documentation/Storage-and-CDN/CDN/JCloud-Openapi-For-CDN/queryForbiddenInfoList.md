# queryForbiddenInfoList


## Description
Search forbidden messages

## Request mode
POST

## Request address
https://cdn.jdcloud-api.com/v1/forbiddenInfo:query


## Request parameters
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**queryDomain**|String|False| |Forbidden domain, fuzzy search|
|**forbiddenUrl**|String|False| |Forbidden url, precise search|
|**pageNumber**|Integer|True| |Page number|
|**pageSize**|Integer|True| |size of each page|


## Return parameters
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryforbiddeninfolist#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer|Total number|
|**list**|[ForbiddenInfo[]](queryforbiddeninfolist#forbiddeninfo)| |
### <div id="ForbiddenInfo">ForbiddenInfo</div>
|Name|Type|Description|
|---|---|---|
|**forbiddenType**|String|Forbidden type(s)|
|**id**|long|Forbidden id|
|**forbiddenDomain**|String|Forbidden domain(s)|
|**forbiddenUrl**|String|Forbidden url|
|**reason**|String|Reason|
|**forbiddenPreson**|String|Forbidden person|
|**linkOther**|String|y or n|
|**createTime**|Date|Created at|
|**updateTime**|Date|Updated at|
|**updateBy**|long|Modifier id|
|**token**|String|The URL used for the forbidden prefix identification shall be a single special character, e.g.: ~|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

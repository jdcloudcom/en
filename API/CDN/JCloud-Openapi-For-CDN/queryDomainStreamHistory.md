# queryDomainStreamHistory


## Description
Search historical information list of domain forbidden stream

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/stream:forbiddenHistory

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|pageNumber|
|**pageSize**|Integer|False|20|pageSize|
|**forbiddenType**|String|False| |Forbidden stream type, null transmission means all forbidden stream types|
|**app**|String|False| |app name, null transmission means to search all|
|**stream**|String|False| |stream name, null transmission means to search all|
|**publishIp**|String|False| |Pushing streaming IP, empty transmission means to search all|
|**forbiddenObjType**|String|False|stream|Block Object Type|
|**startTime**|String|True| |Start time of forbidden stream, format: yyyy-MM-dd HH:mm|
|**endTime**|String|True| |End time of forbidden stream, format: yyyy-MM-dd HH:mm|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer| |
|**streamList**|[ForbiddenStreamHistoryItem[]](#forbiddenstreamhistoryitem)| |
### <div id="ForbiddenStreamHistoryItem">ForbiddenStreamHistoryItem</div>
|Name|Type|Description|
|---|---|---|
|**stream**|String|Forbidden Stream|
|**app**|String|Blocked pushing streaming app|
|**publishIp**|String|Block IP|
|**forbiddenType**|String|Forbidden stream type: forever: no forbidden stream  limit: forbidden stream in prescribed time|
|**ttl**|Long|Forbidden Stream Duration|
|**startTime**|String|Start Time of Forbidden Stream|
|**endTime**|String|End Time of Forbidden Stream|
|**forbiddenTypeDesc**|String|Forbidden Stream Type Description|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

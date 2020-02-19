# queryDomainStream


## Description
Search forbidden streaming information list of domain

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/stream:forbiddenInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|pageNumber|
|**pageSize**|Integer|False|20|pageSize|
|**forbiddenObjType**|String|False|stream|Block Object Type|
|**isStop**|String|False| |Whether kickoff stream removing list or not|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer| |
|**streamList**|[ForbiddenStream[]](#forbiddenstream)| |
### <div id="ForbiddenStream">ForbiddenStream</div>
|Name|Type|Description|
|---|---|---|
|**stream**|String|Forbidden Stream|
|**app**|String|Blocked pushing streaming app|
|**publishIp**|String|Forbidden Stream IP|
|**forbiddenType**|String|Forbidden stream type: forever: no forbidden stream  limit: forbidden stream in prescribed time  stop: kickoff stream|
|**ttl**|Long|Forbidden Stream Duration|
|**forbiddenTypeDesc**|String|Forbidden Stream Type Description|
|**startTime**|String|Start Time of Forbidden Stream|
|**endTime**|String|End Time of Forbidden Stream|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

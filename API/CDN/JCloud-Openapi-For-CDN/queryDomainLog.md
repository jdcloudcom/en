# queryDomainLog


## Description
Search log

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/log

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**interval**|String|False| |Time interval, value (hour, day, fiveMin), hour by default when not uploaded.|
|**logType**|String|False| |Log Type, value (log，zip,gz), gz by default when not uploaded.|
|**pageSize**|Integer|False| |Page Size, default value 10|
|**pageNumber**|Integer|False| |Page Number, default value 1|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querydomainlog#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer|Total Count|
|**pageSize**|Integer|Page Size|
|**pageNumber**|Integer|Page Number|
|**urls**|[DomainLog[]](querydomainlog#domainlog)| |
### <div id="domainlog">DomainLog</div>
|Name|Type|Description|
|---|---|---|
|**url**|String|Download Link|
|**md5**|String|md5 value|
|**fileName**|String|File Name|
|**logType**|String|Log Format|
|**interval**|String|Log Granularity|
|**size**|Long|File Size|
|**startTime**|String|Log Start Time, UTC time|
|**endTime**|String|Log End Time, UTC time|
|**lastModified**|String|Log modification time, UTC time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
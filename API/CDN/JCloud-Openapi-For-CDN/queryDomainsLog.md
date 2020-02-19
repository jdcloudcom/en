# queryDomainsLog


## Description
Batch search domain log

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/logs


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domains**|String[]|False| | |
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**interval**|String|False| |Time interval, value (hour, day, fiveMin), hour by default when not uploaded.|
|**logType**|String|False| |Log Type, value (log，zip,gz), gz by default when not uploaded.|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querydomainslog#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**logs**|[DomainsLog[]](querydomainslog#domainslog)| |
### <div id="domainslog">DomainsLog</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String|Domain|
|**domainLogs**|[DomainLog[]](querydomainslog#domainlog)| |
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
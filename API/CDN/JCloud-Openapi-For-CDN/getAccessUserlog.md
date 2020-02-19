# getAccessUserlog


## Description
Get log download link url data

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/accessUserlog:download


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |Log upload domain, e.g., www.a.com|
|**interval**|String|False| |Log granularity: fiveMin (five minute granularity), hour (one hour granularity), day (one day granularity)|
|**logType**|String|False| |Log type: gz, log and zip|
|**startTime**|String|False| |Log start time, format: yyyy-MM-dd HH:ss, e.g., 2019-04-12 00:00|
|**endTime**|String|False| |Log end time, format: yyyy-MM-dd HH:ss, e.g., 2019-04-12 00:05|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**logs**|[AccessUserlogModel[]](#accessuserlogmodel)| |
### <div id="AccessUserlogModel">AccessUserlogModel</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String|Domain|
|**urls**|[DomainlogModel[]](#domainlogmodel)|Log Object|
### <div id="DomainlogModel">DomainlogModel</div>
|Name|Type|Description|
|---|---|---|
|**logUrl**|String|Log Download url|
|**logSize**|Long|Log size, unit: Byte|
|**startTime**|String|Log start time, format: yyyy-MM-dd HH:ss, e.g., 2019-04-12 00:00|
|**endTime**|String|Log end time, format: yyyy-MM-dd HH:ss, e.g., 2019-04-12 00:05|
|**lastModified**|String|Log modification time, UTC time|
|**md5**|String|MD5 Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

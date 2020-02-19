# deleteAccessUserlog


## Description
Delete the log data

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/accessUserlog:delete


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |Log upload domain, e.g., www.a.com|
|**interval**|String|True| |Log granularity: fiveMin (five minute granularity), hour (one hour granularity), day (one day granularity)|
|**logType**|String|True| |Log type: gz, log and zip|
|**startTime**|String|True| |Log start time, format: yyyy-MM-dd HH:ss, e.g., 2019-04-12 00:00|
|**endTime**|String|True| |Log end time, format: yyyy-MM-dd HH:ss, e.g., 2019-04-12 00:05|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

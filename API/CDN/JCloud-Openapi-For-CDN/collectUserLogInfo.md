# collectUserLogInfo


## Description
Log Collection Data

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/accessUserlog


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |Log upload domain, e.g., www.a.com|
|**logFileFullPath**|String|True| |Log upload full path, e.g., cdnuserlog/www.a.com/20190412/2019041200-01.gz|
|**interval**|String|True| |Log granularity: fiveMin (five minute granularity), hour (one hour granularity), day (one day granularity)|
|**logType**|String|True| |Log type: gz, log and zip|
|**logSize**|Long|True| |Log size, unit: Byte|
|**logMD5**|String|False| |MD5 Value|
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

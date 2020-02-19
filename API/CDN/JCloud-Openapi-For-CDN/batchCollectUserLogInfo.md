# batchCollectUserLogInfo


## Description
Log Collection Data in Batches

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/accessUserlog:batchCollectUserLogInfo


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**userLogInfos**|[UserLogInfoModel[]](#userloginfomodel)|True| | |

### <div id="UserLogInfoModel">UserLogInfoModel</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|False| |Log upload domain, e.g., www.a.com|
|**logFileFullPath**|String|False| |Log upload full path, e.g., cdnuserlog/www.a.com/20190412/2019041200-01.gz|
|**interval**|String|False| |Log granularity: fiveMin (five minute granularity), hour (one hour granularity), day (one day granularity)|
|**logType**|String|False| |Log type: gz, log and zip|
|**logSize**|Long|True| |Log size, unit: Byte|
|**logMD5**|String|False| |MD5 Value|
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
|**result**|[UserLogInfoModel[]](#userloginfomodel)| |
### <div id="UserLogInfoModel">UserLogInfoModel</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String|Log upload domain, e.g., www.a.com|
|**logFileFullPath**|String|Log upload full path, e.g., cdnuserlog/www.a.com/20190412/2019041200-01.gz|
|**interval**|String|Log granularity: fiveMin (five minute granularity), hour (one hour granularity), day (one day granularity)|
|**logType**|String|Log type: gz, log and zip|
|**logSize**|Long|Log size, unit: Byte|
|**logMD5**|String|MD5 Value|
|**startTime**|String|Log start time, format: yyyy-MM-dd HH:ss, e.g., 2019-04-12 00:00|
|**endTime**|String|Log end time, format: yyyy-MM-dd HH:ss, e.g., 2019-04-12 00:05|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

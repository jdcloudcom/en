# createCollectInfo


## Description
Create collection configuration, supporting generation of collection template based on cloud product template and customized collection configuration.

## Request Method
POST

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logtopics/{logtopicUID}/collectinfos

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logtopicUID**|String|True| |Log Subject UID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**enabled**|Boolean|True| |Collection status, 0-disabled, 1-enabled|
|**appCode**|String|True| |Log source can only be custom/jdcloud|
|**serviceCode**|String|True| |Product line, which is required when the log source is jdcloud|
|**resourceType**|String|True| |The collection instance type family can only be all/part. If all is selected, the uploaded instance list is invalid; the collection configuration of custom type only supports the part method now, i.e. users designate instance lists;|
|**resources**|Resource[]|False| |Collection instance list: At most 20 resources can be added to the jdcloud type; but the custom type supports infinite resource count;|
|**templateUID**|String|False| |Log Type. Required when appcode is jdcloud|
|**logPath**|String|False| |Log Path. Required when appcode is custom. Now, only logs on Linux Virtual Machines are supported to be collected and the path supports the wildcards "*" and "？ ". The file path shall conform to Linux file path rules|
|**logFile**|String|False| |Log File Name. Required when appcode is custom. Log file names support regular expression.|
|**logFilters**|String[]|False| |Filter. After the filter is set, some logs can be collected by key words set by users. For example, only Error logs are collected. Now, at most 5 logs are allowed.|
|**filterEnabled**|Boolean|False| |Enable filter or not. Required when appcode is custom|

### Resource
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**region**|String|True| |Resource Region|
|**resourceId**|String|True| |Resource ID|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested Identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**uID**|String|UID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Create collection configuration result|

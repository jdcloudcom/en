# updateCollectInfo


## Description
Update collection configuration. If the uploaded instance list is not null, all previous instances will be replaced rather than being added.

## Request Method
PUT

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/collectinfos/{collectInfoUID}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**collectInfoUID**|String|True| |Collection Configuration UID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-pin**|String|True| |User (primary and secondary) account. base64 code. The format is base64(subuser-pin) @ base64(owner-pin). A space is respectively left in front and behind @. If primary and sub-account are not supported, @ is not required and the format is base64(owner-pin)|
|**x-jdcloud-erp**|String|False| |x-jdcloud-erp   base64(username)|
|**x-jdcloud-request-id**|String|True| |Request ID|
|**enabled**|Boolean|True| |Collection status, 0-disabled, 1-enabled|
|**resourceType**|String|True| |The collection instance type family can only be all/part. If all is selected, the uploaded instance list is invalid|
|**resources**|Resource[]|False| |Collection Instance List (with the cap of 20)|
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
None


## Return Code
|Return Code|Description|
|---|---|
|**200**||
|**400**||
|**500**||

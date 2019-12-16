# describeCollectInfo


## Description
Collect basic configuration information.

## Request Method
GET

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/collectinfos/{collectInfoUID}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**collectInfoUID**|String|True| |Collection Configuration UID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested Identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**uID**|String|UID|
|**appCode**|String|Log Source|
|**detail**|CollectTempalteEnd| |
|**enabled**|Long| |
|**hasResource**|Boolean|Is there any resource|
|**logsetUID**|String|Log Set UID|
|**logtopicUID**|String|Log Subject UID|
|**resourceType**|String|Collection instance type family can only be all/part|
|**serviceCode**|String|Product Line|
|**templateName**|String|Log Type Name|
|**templateUID**|String|Log Type|
### CollectTempalteEnd
|Name|Type|Description|
|---|---|---|
|**filterEnabled**|Boolean|Enable filter or not|
|**logFile**|String|Log File|
|**logFilters**|String[]|Filter|
|**logPath**|String|Log Path|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search collection configuration result|

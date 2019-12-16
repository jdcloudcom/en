# describeLogtopics


## Description
Search log subject list, with fuzzing search by names supported.

## Request Method
GET

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets/{logsetUID}/logtopics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logsetUID**|String|True| |Log Set UID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range [1, 100]|
|**name**|String|False| |Log Subject Name|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested Identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|LogtopicDetailEnd[]|Log Subject List|
|**numberPages**|Long|Total Number of Pages|
|**numberRecords**|Long|Number of Total Records|
|**pageNumber**|Long|Current Page Number|
|**pageSize**|Long|Paging Size|
### LogtopicDetailEnd
|Name|Type|Description|
|---|---|---|
|**collectInfo**|CollectInfoDetailEnd| |
|**uID**|String|UID|
|**collectInfoUID**|String|Collection Configuration UID|
|**createTime**|String|Creation Time|
|**description**|String|Description Information|
|**lastRecordTime**|String|Latest Log Report Time|
|**logsetName**|String|Log Set Name|
|**logsetUID**|String|Log Set|
|**name**|String|Log Subject Name|
|**region**|String|Region Information|
### CollectInfoDetailEnd
|Name|Type|Description|
|---|---|---|
|**uID**|String|UID|
|**appCode**|String|Log source can only be custom|
|**detail**|CollectTempalteEnd| |
|**enabled**|Long| |
|**resourceType**|String|Collection instance type family can only be all/part|
|**resourcesCount**|Long|Collection Instance Count|
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
|**200**|Search log subject list results|

# describeLogtopic


## Description
Search basic information of log subject. If collection configuration is configured, the collection configuration UID will be returned

## Request Method
GET

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logtopics/{logtopicUID}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logtopicUID**|String|True| |Log Subject UID|

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
|**appCode**|String|Log source, returning value only when a single log subject is searched and collection configuration is created|
|**collectInfoUID**|String|Collection Configuration UID|
|**createTime**|String|Creation Time|
|**description**|String|Description Information|
|**logsetName**|String|Log Set Name|
|**logsetUID**|String|Log Set|
|**name**|String|Log Subject Name|
|**region**|String|Region Information|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search log subject results|

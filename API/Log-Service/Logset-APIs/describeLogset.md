# describeLogset


## Description
Search log set details.

## Request Method
GET

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets/{logsetUID}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logsetUID**|String|True| |Log Set UID|

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
|**createTime**|String|Creation Time|
|**description**|String|Description Information|
|**hasTopic**|Boolean|Is there a log subject|
|**lifeCycle**|Long|Saving Period|
|**name**|String|Log Set Name|
|**region**|String|Region Information|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search log set results|

# createLogtopic


## Description
Create log subjects in such a way that the name of any created log subject shall not be identical to any existing log subject under the log set.

## Request Method
POST

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets/{logsetUID}/logtopics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logsetUID**|String|True| |Log Set UID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Log Subject Name|
|**description**|String|False| |Log Set Description|


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
|**200**|Create log subject results|

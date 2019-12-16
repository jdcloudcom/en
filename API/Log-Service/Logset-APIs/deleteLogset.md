# deleteLogset


## Description
Delete log sets. When there are multiple log sets to be deleted, any log set with a log subject will invalidate deletion of all logs sets.

## Request Method
DELETE

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets/{logsetUIDs}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logsetUIDs**|String|True| |Log set ID, separating log set IDs with commas|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested Identifier id|


## Return Code
|Return Code|Description|
|---|---|
|**200**|Delete log set results|

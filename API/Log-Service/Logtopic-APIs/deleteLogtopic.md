# deleteLogtopic


## Description
Delete log subjects. Its collection configuration and collection instance configuration will be deleted together.

## Request Method
DELETE

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets/{logsetUID}/logtopics/{logtopicUIDs}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logsetUID**|String|True| |Log Set UID|
|**logtopicUIDs**|String|True| |Log subject ID, separating log subject IDs with commas|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested Identifier id|


## Return Code
|Return Code|Description|
|---|---|
|**200**|Delete log subject results|

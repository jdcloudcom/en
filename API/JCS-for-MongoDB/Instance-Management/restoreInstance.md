# restoreInstance


## Description
Data Recovery

## Request method
POST

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/restoreInstance

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True||Instance ID|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupId**|String|True||Backup ID|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||



## Return code
|Return code|Description|
|---|---|
|**200**|OK|

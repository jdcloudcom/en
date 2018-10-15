# modifyBackupPolicy


## Description
Modify backup policy

## Request method
POST

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/backupPolicy

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**preferredBackupTime**|String|True| |Backup Time, Format: HH:mmZ- HH:mmZ, only integral point allowed with interval of 1 hour.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**backupRetentionPeriod**|String| |
|**preferredBackupPeriod**|String| |
|**preferredBackupWindow**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

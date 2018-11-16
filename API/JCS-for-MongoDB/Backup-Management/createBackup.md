# createBackup


## Description
Create Backup

## Request method
POST

## Request address
https://mongodb.jdcloud-api.com/v1/regions/{regionId}/backups

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**backupName**|String|False| |Backup Name|
|**instanceId**|String|True| |Instance ID|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**backupId**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

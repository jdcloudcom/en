# getChannels


## Description
Search information of data synchronization channel

## Request Method
GET

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/migration_mysqlChannels

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-userid**|String|True| |User ID|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**channels**|ChannelInfo[]| |
### ChannelInfo
|Name|Type|Description|
|---|---|---|
|**info**|ChannelBaseInfo| |
|**source**|DataMediaInfo| |
|**target**|DataMediaInfo| |
### ChannelBaseInfo
|Name|Type|Description|
|---|---|---|
|**description**|String|Name|
|**id**|String|ID|
|**name**|String|Name|
|**status**|String|Status|
### DataMediaInfo
|Name|Type|Description|
|---|---|---|
|**cloud**|CloudInfo| |
|**datasource**|DatasourceInfo| |
|**schema**|String|schema|
|**tables**|String[]|table|
### CloudInfo
|Name|Type|Description|
|---|---|---|
|**cloudId**|String|ID of Cloud|
|**password**|String|Database Password|
|**rdsId**|String|Database ID|
|**username**|String|Database Account|
### DatasourceInfo
|Name|Type|Description|
|---|---|---|
|**address**|String|Server Address|
|**id**|String|ID|
|**password**|String|Database Password|
|**port**|Integer|Port|
|**username**|String|Database Account|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

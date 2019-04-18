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
|**result**|Result| |
|**requestId**|String|Request ID|

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
### DataMediaInfo
|Name|Type|Description|
|---|---|---|
|**cloud**|CloudInfo| |
|**datasource**|DatasourceInfo| |
|**schema**|String|schema|
|**tables**|String[]|table|
### DatasourceInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|ID|
|**address**|String|Server Address|
|**port**|Integer|Port|
|**username**|String|Database Account|
|**password**|String|Database Password|
### CloudInfo
|Name|Type|Description|
|---|---|---|
|**cloudId**|String|ID of Cloud|
|**rdsId**|String|Database ID|
|**username**|String|Database Account|
|**password**|String|Database Password|
### ChannelBaseInfo
|Name|Type|Description|
|---|---|---|
|**id**|String|ID|
|**name**|String|Name|
|**description**|String|Name|
|**status**|String|Status|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

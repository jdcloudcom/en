# createChannel


## Description
Create data synchronization channel

## Request Method
POST

## Request Address
https://jdfusion.jdcloud-api.com/v1/regions/{regionId}/migration_mysqlChannels

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**x-jdcloud-fusion-userid**|String|True| |User ID|
|**channel**|ChannelInfo|True| |Create channel|

### ChannelInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**info**|ChannelBaseInfo|False| | |
|**source**|DataMediaInfo|False| | |
|**target**|DataMediaInfo|False| | |
### DataMediaInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloud**|CloudInfo|False| | |
|**datasource**|DatasourceInfo|False| | |
|**schema**|String|False| |schema|
|**tables**|String[]|False| |table|
### DatasourceInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |ID|
|**address**|String|False| |Server Address|
|**port**|Integer|False| |Port|
|**username**|String|False| |Database Account|
|**password**|String|False| |Database Password|
### CloudInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudId**|String|False| |ID of Cloud|
|**rdsId**|String|False| |Database ID|
|**username**|String|False| |Database Account|
|**password**|String|False| |Database Password|
### ChannelBaseInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |ID|
|**name**|String|False| |Name|
|**description**|String|False| |Name|
|**status**|String|False| |Status|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**channel**|ChannelInfo| |
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
|**201**|CREATED|

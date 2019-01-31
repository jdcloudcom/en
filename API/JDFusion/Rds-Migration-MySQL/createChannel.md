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
|**channel**|ChannelInfo|True| |Create channel|
|**x-jdcloud-fusion-userid**|String|True| |User ID|

### ChannelInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**info**|ChannelBaseInfo|False| | |
|**source**|DataMediaInfo|False| | |
|**target**|DataMediaInfo|False| | |
### ChannelBaseInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |Name|
|**id**|String|False| |ID|
|**name**|String|False| |Name|
|**status**|String|False| |Status|
### DataMediaInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloud**|CloudInfo|False| | |
|**datasource**|DatasourceInfo|False| | |
|**schema**|String|False| |schema|
|**tables**|String[]|False| |table|
### CloudInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**cloudId**|String|False| |ID of Cloud|
|**password**|String|False| |Database Password|
|**rdsId**|String|False| |Database ID|
|**username**|String|False| |Database Account|
### DatasourceInfo
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**address**|String|False| |Server Address|
|**id**|String|False| |ID|
|**password**|String|False| |Database Password|
|**port**|Integer|False| |Port|
|**username**|String|False| |Database Account|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |

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
|**201**|CREATED|

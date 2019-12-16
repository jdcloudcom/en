# createLogset


## Description
Create Log Collection. Name cannot be duplicated.

## Request Method
POST

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Log Set Name|
|**description**|String|False| |Log Set Description|
|**lifeCycle**|Long|True| |Saving period can only be 7, 15 or 30|


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
|**200**|Create log set results|

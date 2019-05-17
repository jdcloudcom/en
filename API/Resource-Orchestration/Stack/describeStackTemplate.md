# describeStackTemplate


## Description
Search templates used in resource stack

## Request Method
GET

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/stacks/{stackId}/template

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**stackId**|String|True| |Resource Stack ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**template**|String|Template Information|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search template information in resource stack|

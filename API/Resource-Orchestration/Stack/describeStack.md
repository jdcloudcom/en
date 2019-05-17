# describeStack


## Description
Search resource stack details

## Request Method
GET

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/stacks/{stackId}

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
|**stack**|StackOut| |
### StackOut
|Name|Type|Description|
|---|---|---|
|**action**|String|Resource Stack Running Operation|
|**canUpdate**|Boolean|Can resource stack be updated|
|**createTime**|String|Resource Stack Creation Time|
|**disableRollback**|Boolean|Is the resource stack rolled back for setting|
|**id**|String|Resource StackID|
|**input**|Object|Resource stack input information, in JSON format, only with a value in the field upon searching resource stack details describeStack|
|**name**|String|Resource Stack Name|
|**output**|Object|Resource stack output information, in JSON format, only with a value in the field upon searching resource stack details describeStack|
|**region**|String|Region Where Resource Stack Is Located|
|**stackVersion**|Long|Resource Stack Version|
|**status**|String|Resource Stack Running Status|
|**statusReason**|String|Resource Stack Running Status Reasons|
|**templateId**|String|template ID Used in Resource Stack|
|**timeout**|Long|Resource Stack Time-out Period|
|**updateTime**|String|Resource Stack Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Obtain resource stack details|

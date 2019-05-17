# describeStacks


## Description
Search resource stack lists

## Request Method
GET

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/stacks

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range[1, 100]|
|**stackName**|String|False| |Resource Stack Name|
|**action**|String|False| |Actions Being Executed by Resource Stack|
|**status**|String|False| |Status of Actions Being Executed by Resource Stack|
|**createStartTime**|String|False| |Creation Start Time|
|**createEndTime**|String|False| |Creation End Time|
|**updateStartTime**|String|False| |Update Start Time|
|**updateEndTime**|String|False| |Update End Time|
|**sortField**|String|False| |Sorting field, createtime, updatetime|
|**sortBy**|String|False| |Sorting method, asc, desc|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**list**|StackOut[]| |
|**totalCount**|Long| |
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
|**200**|Obtain resource stack lists|

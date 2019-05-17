# describeStackEvents


## Description
Search resource stack event lists

## Request Method
GET

## Request Address
https://jdro.jdcloud-api.com/v1/regions/{regionId}/stacks/{stackId}/events

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**stackId**|String|True| |Resource Stack ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Long|False| |Current page, 1 by default|
|**pageSize**|Long|False| |Page size, 20 by default; value range[1, 100]|
|**startTime**|String|False| |Event Start Time|
|**endTime**|String|False| |Event End Time|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifier id|

### Result
|Name|Type|Description|
|---|---|---|
|**list**|EventOut[]| |
|**totalCount**|Long| |
### EventOut
|Name|Type|Description|
|---|---|---|
|**createTime**|String|Creation Time|
|**physicalId**|String|ResourceID|
|**resourceAction**|String|Resource Running Operation|
|**resourceName**|String|Resource Name|
|**resourceStatus**|String|Resource Running Status|
|**resourceStatusReason**|String|Resource Running Status Reasons|
|**resourceType**|String|Resource Type|
|**stackId**|String|Resource StackID|
|**uuid**|String|Unique Identifier|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search resource stack event lists|

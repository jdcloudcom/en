# searchLogContext


## Description
Search context of log

## Request Method
POST

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets/{logsetUID}/logtopics/{logtopicUID}/logcontext

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logsetUID**|String|True| |Log Set UID|
|**logtopicUID**|String|True| |Log Subject UID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**anchor**|Object[]|True| |Search anchor, and conduct context retrieval based on offset of the value|
|**direction**|String|False| |Search direction, default both and available values are up, down and both|
|**filters**|[Filter[]](searchlogcontext#filter)|False| |Specify return field, which is only valid for system logs. If not set by default, the field will be returned to in accordance with product line configuration. Name supports filling returned field by virtue of key and Values|
|**id**|String|True| |Log Record ID|
|**lineSize**|Long|True| |View size of context rows, and support 200 at most|
|**time**|Long|True| |The time stamp to be returned when searching log|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Filter Requirements|
|**operator**|String|False| |Operators of Filter Requirements with eq (Optional) being set by default|
|**values**|String[]|False| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](searchlogcontext#result)|Search Results|
|**requestId**|String|Requested Identifier id|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**data**|Object[]|Data|
|**total**|Long|Total Amount|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search results of context|

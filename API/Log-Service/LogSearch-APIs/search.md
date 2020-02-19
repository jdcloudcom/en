# search


## Description
Search log

## Request Method
GET

## Request Address
https://logs.jcloud.com/v1/regions/{regionId}/logsets/{logsetUID}/logtopics/{logtopicUID}/search

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|
|**logsetUID**|String|True| |Log Set ID|
|**logtopicUID**|String|True| |Log Subject ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**action**|String|True| |"preview" means preview, "fulltext" means fulltext retrieval, "advance" means retrieval in accordance with searching sentences|
|**expr**|String|False| |Search expression of Base64 Code,|
|**caseSensitive**|Boolean|False| |Search keyword case sensitivity, and false has been set by default|
|**startTime**|String|False| |Start Time. Format "YYYY-MM-DDThh:mm:ssTZD", i.e. "2018-11-09T15:34:46+0800" refers to action! When =preview, it is required to fill|
|**endTime**|String|False| |End Time. Format "YYYY-MM-DDThh:mm:ssTZD", i.e. "2018-11-09T15:34:46+0800" refers to action! When =preview, it is required to fill|
|**pageNumber**|Long|False| |Number of Pages. The minimum value is 1 and the maximum value is 99|
|**pageSize**|Long|False| |Nr. in each page. The default value is 10 and the maximum value is 100|
|**sort**|String|False| |Return to ranking, do not fill or let it null, and set desc by default, "asc" means to return to results in positive time, and "desc" means to return to results in inverted time sequence|
|**filters**|[Filter[]](search#filter)|False| |Specify return field, which is only valid for system logs. If not set by default, the field will be returned to in accordance with product line configuration. Name supports filling returned field by virtue of key and Values|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Filter Requirements|
|**operator**|String|False| |Operators of Filter Requirements with eq (Optional) being set by default|
|**values**|String[]|False| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](search#result)|Search Results|
|**requestId**|String|Requested Identifier id|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**data**|Object[]|Data|
|**total**|Long|Total Amount|

## Return Code
|Return Code|Description|
|---|---|
|**200**|Search Results|

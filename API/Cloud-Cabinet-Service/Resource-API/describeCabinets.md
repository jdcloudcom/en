# describeCabinets


## Description
Search Cabinet List

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/cabinets

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number, xxx by default1|
|**pageSize**|Integer|False|20|Paging size, default value is20|
|**filters**|[Filter[]](describecabinets#filter)|False| |roomNo - Room number, exact match, supporting multiple numbers<br>cabinetId - Cabinet ID, exact match, supporting multiple IDs<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describecabinets#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**cabinets**|[DescribeCabinet[]](describecabinets#describecabinet)|Cabinet List|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### <div id="describecabinet">DescribeCabinet</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**cabinetId**|String|Cabinet Id|
|**cabinetNo**|String|Cabinet Code|
|**roomNo**|String|Room Number|
|**cabinetSpace**|Integer|Cabinet space (U)|
|**cabinetPower**|Integer|Rated current (A)|
|**cabinetType**|String|Cabinet type  formal: Formal  cabinet reserved: Reserved cabinet|
|**cabinetOpenStatus**|String|Cabinet subscription status  disabled: disabled  enabling: enabling  enabled: enabled  disabling: disabling|
|**cabinetOpenTime**|String|The subscription time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**expireTime**|String|The expiration time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**reserveStartTime**|String|The reservation start time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|
|**reserveEndTime**|String|The reservation end time is subject to the standard ISO8601 and adopts the UTC time in the format of yyyy-MM-ddTHH:mm:ssZ|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

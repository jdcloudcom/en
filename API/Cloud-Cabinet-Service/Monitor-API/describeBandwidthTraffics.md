# describeBandwidthTraffics


## Description
Search bandwidth (exit) traffic list

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/bandwidthTraffics

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number, xxx by default1|
|**pageSize**|Integer|False|20|Paging size, default value is20|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebandwidthtraffics#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**bandwidthTraffics**|[DescribeBandwidthTraffic[]](describebandwidthtraffics#describebandwidthtraffic)|Bandwidth (Exit) Traffic List|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### <div id="describebandwidthtraffic">DescribeBandwidthTraffic</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**bandwidthId**|String|Bandwidth Instance ID|
|**bandwidthName**|String|Bandwidth Name|
|**totalTrafficIn**|Double|Total Uplink Real-time Traffic|
|**totalTrafficOut**|Double|Total Downlink Real-time Traffic|
|**bandwidth**|Integer|Total Bandwidth|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

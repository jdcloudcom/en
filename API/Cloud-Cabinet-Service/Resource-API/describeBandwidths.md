# describeBandwidths


## Description
Search bandwidth (exit) list

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/bandwidths

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number, xxx by default1|
|**pageSize**|Integer|False|20|Paging size, default value is20|
|**filters**|[Filter[]](describebandwidths#filter)|False| |bandwidthId - Bandwidth instance IID, exact matching, supporting IDs<br>|

### <div id="filter">Filter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebandwidths#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**bandwidths**|[DescribeBandwidth[]](describebandwidths#describebandwidth)|Bandwidth (Exit) List|
|**pageNumber**|Integer|Page|
|**pageSize**|Integer|Paging Size|
|**totalCount**|Integer|Total Count|
### <div id="describebandwidth">DescribeBandwidth</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**bandwidthId**|String|Bandwidth Instance ID|
|**bandwidthName**|String|Bandwidth Name|
|**status**|String|Status  normal: normal  abnormal: abnormal|
|**lineType**|String|ISP Line type  bgp:BGP telecom: single line of Telecom  unicom: single line of Unicom  mobile: single line of mobile|
|**bandwidth**|Integer|Contract Bandwidth (Mbps)|
|**relatedIp**|[RelatedIp[]](describebandwidths#relatedip)|Associated public IP|
### <div id="relatedip">RelatedIp</div>
|Name|Type|Description|
|---|---|---|
|**cidrAddr**|String|IP address field|
|**lineType**|String|ISP Line type  bgp:BGP telecom: single line of Telecom  unicom: single line of Unicom  mobile: single line of mobile|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

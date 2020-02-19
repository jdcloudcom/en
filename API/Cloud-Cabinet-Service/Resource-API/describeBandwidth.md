# describeBandwidth


## Description
Search bandwidth (exit) detail

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/bandwidths/{bandwidthId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|
|**bandwidthId**|String|True| |Bandwidth (Exit) Instance ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebandwidth#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**bandwidth**|[Bandwidth](describebandwidth#bandwidth)| |
### <div id="bandwidth">Bandwidth</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**bandwidthId**|String|Bandwidth Instance ID|
|**bandwidthName**|String|Bandwidth Name|
|**status**|String|Status  normal: normal  abnormal: abnormal|
|**lineType**|String|ISP Line type  bgp:BGP telecom: single line of Telecom  unicom: single line of Unicom  mobile: single line of mobile|
|**bandwidth**|Integer|Contract Bandwidth (Mbps)|
|**relatedIp**|[RelatedIp[]](describebandwidth#relatedip)|Associated public IP|
|**switchboard**|[Switchboard[]](describebandwidth#switchboard)|Interchanger Information|
### <div id="switchboard">Switchboard</div>
|Name|Type|Description|
|---|---|---|
|**ip**|String|IP|
|**port**|String|Port|
### <div id="relatedip">RelatedIp</div>
|Name|Type|Description|
|---|---|---|
|**cidrAddr**|String|IP address field|
|**lineType**|String|ISP Line type  bgp:BGP telecom: single line of Telecom  unicom: single line of Unicom  mobile: single line of mobile|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

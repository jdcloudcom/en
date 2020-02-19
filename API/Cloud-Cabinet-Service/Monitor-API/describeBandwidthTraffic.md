# describeBandwidthTraffic


## Description
Search bandwidth (exit) traffic (resource) detail

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/bandwidthTraffics/{bandwidthId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|
|**bandwidthId**|String|True| |Bandwidth (Exit) Instance ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](describebandwidthtraffic#result)| |
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**bandwidthTraffic**|[BandwidthTraffic](describebandwidthtraffic#bandwidthtraffic)|Bandwidth (Exit) Traffic (Resource) Detail|
### <div id="bandwidthtraffic">BandwidthTraffic</div>
|Name|Type|Description|
|---|---|---|
|**idc**|String|English Identifier of Data Center|
|**idcName**|String|Data Center Name|
|**bandwidthId**|String|Bandwidth Instance ID|
|**bandwidthName**|String|Bandwidth Name|
|**totalTrafficIn**|Double|Total Uplink Real-time Traffic|
|**totalTrafficOut**|Double|Total Downlink Real-time Traffic|
|**bandwidth**|Integer|Total Bandwidth|
|**lineType**|String|ISP Line type  bgp:BGP telecom: single line of Telecom  unicom: single line of Unicom  mobile: single line of mobile|
|**relatedIp**|[RelatedIp[]](describebandwidthtraffic#relatedip)|Associated public IP|
|**switchboard**|[DescribeSwitchboard[]](describebandwidthtraffic#describeswitchboard)|Interchanger Information|
### <div id="describeswitchboard">DescribeSwitchboard</div>
|Name|Type|Description|
|---|---|---|
|**ip**|String|IP|
|**port**|String|Port|
|**trafficIn**|Double|Uplink Real-time Traffic|
|**trafficOut**|Double|Downlink Real-time Traffic|
|**alarmStatus**|String|Alarm status  normal: normal  alarm: alarm|
### <div id="relatedip">RelatedIp</div>
|Name|Type|Description|
|---|---|---|
|**cidrAddr**|String|IP address field|
|**lineType**|String|ISP Line type  bgp:BGP telecom: single line of Telecom  unicom: single line of Unicom  mobile: single line of mobile|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

# queryOverviewTraffic


## Description
Statistical Data of Overview Page

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:overview


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**fields**|String|False| |avgbandwidth can be searched, pv is avgbandwidth by default|
|**period**|String|False| |Time granularity, value: [oneMin,fiveMin,followTime], followTime only can return the summarized data|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**download**|[OverviewTrafficItem](#overviewtrafficitem)| |
|**vod**|[OverviewTrafficItem](#overviewtrafficitem)| |
|**web**|[OverviewTrafficItem](#overviewtrafficitem)| |
|**dynamic**|[OverviewTrafficItem](#overviewtrafficitem)| |
|**live**|[OverviewTrafficItem](#overviewtrafficitem)| |
|**oriData**|[OverviewTrafficItem](#overviewtrafficitem)| |
|**total**|[OverviewTrafficTotal](#overviewtraffictotal)| |
### <div id="OverviewTrafficTotal">OverviewTrafficTotal</div>
|Name|Type|Description|
|---|---|---|
|**avgbandwidth**|Double| |
|**flow**|Double| |
|**pv**|Long| |
|**topTimeStamp**|Long| |
### <div id="OverviewTrafficItem">OverviewTrafficItem</div>
|Name|Type|Description|
|---|---|---|
|**avgbandwidth**|Long| |
|**flow**|Long| |
|**pv**|Long| |
|**maxavgbandwidthtime**|String| |
|**details**|[OverviewTrafficDetailItem[]](#overviewtrafficdetailitem)| |
### <div id="OverviewTrafficDetailItem">OverviewTrafficDetailItem</div>
|Name|Type|Description|
|---|---|---|
|**data**|Long| |
|**timeStamp**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

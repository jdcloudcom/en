# queryOriflowTopNData


## Description
topN Data of Back-to-origin Bandwidth

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:oribdwtopN


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**groupBy**|String|True| |Grouping field, domainType means grouping by business type|
|**topCount**|Integer|False| |topN|
|**period**|String|False| |Time granularity, value: [oneMin,fiveMin,followTime], followTime only can return the summarized data|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**oribandwidthTopN**|[OribandwidthTopItem[]](#oribandwidthtopitem)| |
|**oriflowTopN**|[OriflowTopItem[]](#oriflowtopitem)| |
|**oripvTopN**|[OripvTopItem[]](#oripvtopitem)| |
### <div id="OripvTopItem">OripvTopItem</div>
|Name|Type|Description|
|---|---|---|
|**name**|String| |
|**hitpv**|Long| |
|**pv**|Long| |
|**oripv**|Long| |
|**oripvPercent**|String| |
### <div id="OriflowTopItem">OriflowTopItem</div>
|Name|Type|Description|
|---|---|---|
|**name**|String| |
|**oriflow**|Double| |
|**hitflow**|Double| |
|**flow**|Double| |
|**flowPercent**|String| |
### <div id="OribandwidthTopItem">OribandwidthTopItem</div>
|Name|Type|Description|
|---|---|---|
|**name**|String| |
|**total**|Double| |
|**details**|[OriBandwithDetailItem[]](#oribandwithdetailitem)| |
### <div id="OriBandwithDetailItem">OriBandwithDetailItem</div>
|Name|Type|Description|
|---|---|---|
|**timeStamp**|Long| |
|**avgoribandwidth**|Double| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

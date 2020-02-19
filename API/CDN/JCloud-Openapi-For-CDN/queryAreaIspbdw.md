# queryAreaIspbdw


## Description
Data of Regional Operator Bandwidth Table

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:areaIspTable


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**scheme**|String|False| |Search protocol, optional value: [http,https,all], null transmission means to return data from all protocols summarized by default|
|**sortField**|String|False| |The default sorting field is avgbandwidth, flowPercent is flow, and pvPercent is pv|
|**sortRule**|String|False| |Sorting Rule, desc by default|
|**groupBy**|String|False| |Grouping field, area by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**data**|[AreaIspbdwItem[]](#areaispbdwitem)| |
### <div id="AreaIspbdwItem">AreaIspbdwItem</div>
|Name|Type|Description|
|---|---|---|
|**area**|String| |
|**isp**|String| |
|**name**|String| |
|**flowPercent**|String| |
|**pvPercent**|String| |
|**avgbandwidth**|Double| |
|**flow**|Double| |
|**pv**|Long| |
|**topTimeStamp**|Long| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

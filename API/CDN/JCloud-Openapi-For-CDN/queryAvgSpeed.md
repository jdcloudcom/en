# queryAvgSpeed


## Description
Download Speed Page

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:avgspeed


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**sortField**|String|False| |The sorting field is avgbandwidth by default|
|**sortRule**|String|False| |Sorting Rule, desc by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer| |
|**data**|[AvgspeedItem[]](#avgspeeditem)| |
### <div id="AvgspeedItem">AvgspeedItem</div>
|Name|Type|Description|
|---|---|---|
|**area**|String| |
|**avgspeed**|Double| |
|**avgspeedUnit**|String| |
|**firstpkgtime**|Double| |
|**firstpkgtimeUnit**|String| |
|**errorRatio**|Double| |
|**flow**|Double| |
|**flowUnit**|String| |
|**flowPercent**|Double| |
|**pv**|Long| |
|**hitRatio**|Double| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

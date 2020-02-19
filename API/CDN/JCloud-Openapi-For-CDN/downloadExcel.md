# downloadExcel


## Description
Download statistical formats

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:download


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**sortField**|String|False| |Sorting field, oripvPercent is oripv, oriflowPercent is oriflow|
|**sortRule**|String|False| |Sorting Rule, desc by default|
|**downLoadType**|String|False| |Download Type|
|**domainType**|String|False| |Business type|
|**appName**|String|False| | |
|**streamName**|String|False| | |
|**groupBy**|String|False| |Grouping field, domainType means grouping by business type|
|**topField**|String|False| |Identifier Page|
|**withParam**|Boolean|False| |With parameter or not|
|**scheme**|String|False| |Search protocol, optional value: [http,https,all], null transmission means to return data from all protocols summarized by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**url**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

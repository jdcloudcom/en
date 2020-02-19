# queryDirBandwidth


## Description
Search directory bandwidth, and this function is supported by some users only

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/statistics:queryDirBandwidth


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|True| |Domains required to be searched must be those with permission under user pin. This API only supports search by a single domain|
|**dirs**|String|False| |Directory Requiring Filtering|
|**regions**|String|False| |Region Requiring Filtering|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String| |
|**datas**|[DirBandwidthItem[]](#dirbandwidthitem)| |
### <div id="DirBandwidthItem">DirBandwidthItem</div>
|Name|Type|Description|
|---|---|---|
|**startTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**dirs**|[DirData[]](#dirdata)| |
### <div id="DirData">DirData</div>
|Name|Type|Description|
|---|---|---|
|**dir**|String|Directory Name|
|**bandwidth**|Long|Summarized Directory Bandwidth|
|**regions**|[DirRegionData[]](#dirregiondata)| |
### <div id="DirRegionData">DirRegionData</div>
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Name|
|**bandwidth**|Long|Directory Bandwidth of Each Region|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

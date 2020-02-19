# queryCodeStatTrafficDetail


## Description
Statistical Data of Status Code Details

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:codestatDetail


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**period**|String|False| |Time granularity, value: [oneMin,fiveMin,followTime], followTime only can return the summarized data|
|**scheme**|String|False| |Search protocol, optional value: [http,https,all], null transmission means to return data from all protocols summarized by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**codeMap**|Object|The status code corresponds to map and the type is LinkedHashMap<String,String>|
|**details**|[CodeDetailItem[]](#codedetailitem)| |
### <div id="CodeDetailItem">CodeDetailItem</div>
|Name|Type|Description|
|---|---|---|
|**timeStamp**|Long| |
|**ok**|Double| |
|**badGateway**|Double| |
|**badRequest**|Double| |
|**forbidden**|Double| |
|**found**|Double| |
|**gatewayTimeout**|Double| |
|**internalServerError**|Double| |
|**movedPermanently**|Double| |
|**notFound**|Double| |
|**notModified**|Double| |
|**partialContent**|Double| |
|**requestedRangeNotSuitable**|Double| |
|**other**|Double| |
|**serviceUnavailable**|Double| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

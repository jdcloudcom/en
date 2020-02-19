# queryCodeStatTrafficTable


## Description
Statistical Data of Status Code

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/console:codestatTable


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**startTime**|String|True| |Search start time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**endTime**|String|True| |Search end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ss’Z’, example: 2018-10-21T10:00:00Z|
|**domain**|String|False| |Domain required to be searched must be domain with permission under user pin|
|**area**|String|False| | |
|**isp**|String|False| | |
|**scheme**|String|False| |Search protocol, optional value: [http,https,all], null transmission means to return data from all protocols summarized by default|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**data**|[CodeTypeItem[]](#codetypeitem)| |
|**successCount**|Double| |
|**successCountUnit**|String| |
|**failCount**|Double| |
|**failCountUnit**|String| |
|**totalCount**|Double| |
|**totalCountUnit**|String| |
|**successPercent**|String| |
### <div id="CodeTypeItem">CodeTypeItem</div>
|Name|Type|Description|
|---|---|---|
|**code**|String| |
|**count**|Long| |
|**rank**|Integer| |
|**percent**|String| |
|**details**|[CodeTypeDetailItem[]](#codetypedetailitem)| |
### <div id="CodeTypeDetailItem">CodeTypeDetailItem</div>
|Name|Type|Description|
|---|---|---|
|**code**|String| |
|**count**|Long| |
|**rank**|Integer| |
|**percent**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

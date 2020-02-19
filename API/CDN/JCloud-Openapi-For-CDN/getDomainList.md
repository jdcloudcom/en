# getDomainList


## Description
Search accelerated domain APIs

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyWord**|String|False| |Fuzzy Matching by Keywords|
|**x-jdcloud-channel**|String|False|cdn|Domain source cdn/cdn, video cloud|
|**pageNumber**|Integer|False|1|pageNumber, default value1|
|**pageSize**|Integer|False|20|pageSize, maximum value 50, default value20|
|**status**|String|False| |Search by domain status, value: [offline, online, configuring, auditing, audit_reject]|
|**type**|String|False| |Domain type, (web: static small file, download: large file acceleration, vod: video acceleration, live: live acceleration), do not upload all|
|**accelerateRegion**|String|False| |Acceleration Region (mainLand: Mainland China, nonMainLand: overseas regions, Hong Kong, Macao and Taiwan, all: the World) null transmission means the world|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getdomainlist#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**totalCount**|Integer| |
|**pageSize**|Integer| |
|**pageNumber**|Integer| |
|**domains**|[ListDomainItem[]](getdomainlist#listdomainitem)|Domain List|
### <div id="listdomainitem">ListDomainItem</div>
|Name|Type|Description|
|---|---|---|
|**cname**|String| |
|**description**|String| |
|**domain**|String| |
|**created**|String| |
|**modified**|String| |
|**status**|String| |
|**wafStatus**|String| |
|**type**|String| |
|**auditStatus**|String| |
|**accelerateRegion**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
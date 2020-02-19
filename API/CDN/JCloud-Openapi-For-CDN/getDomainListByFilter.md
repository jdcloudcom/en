# getDomainListByFilter


## Description
Search accelerated domain APIs by tag

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain:query


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyWord**|String|False| |Fuzzy Matching by Keywords|
|**x-jdcloud-channel**|String|False|cdn|Domain source cdn/cdn, video cloud|
|**pageNumber**|Integer|False|1|pageNumber, the default value is1|
|**pageSize**|Integer|False|20|pageSize, the default value is 20, the maximum value is 50|
|**status**|String|False| |Search by domain status, value: [offline, online, configuring, auditing, audit_reject]|
|**type**|String|False| |Domain type, (web: static small file, download: large file acceleration, vod: video acceleration, live: live acceleration), do not upload all|
|**accelerateRegion**|String|False| |Acceleration Region (mainLand: Mainland China, nonMainLand: overseas regions, Hong Kong, Macao and Taiwan, all: the World) null transmission means the world|
|**tagFilters**|[TagFilter[]](getdomainlistbyfilter#tagfilter)|False| |Tag Filter Requirements|

### <div id="tagfilter">TagFilter</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| | |
|**values**|String[]|False| | |

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getdomainlistbyfilter#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**totalCount**|Integer| |
|**pageSize**|Integer| |
|**pageNumber**|Integer| |
|**domains**|[ListDomainItemByFilter[]](getdomainlistbyfilter#listdomainitembyfilter)| |
### <div id="listdomainitembyfilter">ListDomainItemByFilter</div>
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
|**tags**|[Tag[]](getdomainlistbyfilter#tag)| |
### <div id="tag">Tag</div>
|Name|Type|Description|
|---|---|---|
|**key**|String| |
|**value**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
# getDomainDetail


## Description
Search details of accelerated domain

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](getdomaindetail#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**allStatus**|String| |
|**allowNoReferHeader**|String| |
|**allowNullReferHeader**|String| |
|**dailyBandWidth**|Integer| |
|**forbiddenType**|String| |
|**maxFileSize**|Long| |
|**minFileSize**|Long| |
|**sumFileSize**|Long| |
|**avgFileSize**|Long| |
|**referList**|String[]| |
|**referType**|String| |
|**domain**|String| |
|**cname**|String| |
|**archiveNo**|String| |
|**type**|String| |
|**created**|String| |
|**modified**|String| |
|**status**|String| |
|**auditStatus**|String| |
|**source**|[BackSourceInfo](getdomaindetail#backsourceinfo)| |
|**sourceType**|String| |
|**defaultSourceHost**|String|Default Back-to-origin Host|
|**backSourceType**|String| |
|**httpType**|String| |
|**certificate**|String| |
|**rsaKey**|String| |
|**jumpType**|String| |
|**certFrom**|String| |
|**sslCertId**|String| |
|**certName**|String| |
|**certType**|String| |
|**sslCertStartTime**|String| |
|**sslCertEndTime**|String| |
|**accelerateRegion**|String|Acceleration Region|
### <div id="backsourceinfo">BackSourceInfo</div>
|Name|Type|Description|
|---|---|---|
|**ips**|[IpSourceInfo[]](getdomaindetail#ipsourceinfo)| |
|**domain**|[DomainSourceInfo[]](getdomaindetail#domainsourceinfo)| |
|**ossSource**|String| |
### <div id="domainsourceinfo">DomainSourceInfo</div>
|Name|Type|Description|
|---|---|---|
|**priority**|Integer|Priority Level (1-10)|
|**sourceHost**|String|Back-to-origin host|
|**domain**|String|Back-to-origin Domain|
### <div id="ipsourceinfo">IpSourceInfo</div>
|Name|Type|Description|
|---|---|---|
|**master**|Integer|1: Host; 2: Backup|
|**ip**|String|Back-to-origin IP|
|**ratio**|Double|Proportion|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
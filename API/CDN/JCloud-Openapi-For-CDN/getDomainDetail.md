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
|**result**|Result| |
|**requestId**|String| |

### Result
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
|**source**|BackSourceInfo| |
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
### BackSourceInfo
|Name|Type|Description|
|---|---|---|
|**ips**|IpSourceInfo[]| |
|**domain**|DomainSourceInfo[]| |
|**ossSource**|String| |
### DomainSourceInfo
|Name|Type|Description|
|---|---|---|
|**priority**|Integer| |
|**sourceHost**|String| |
|**domain**|String| |
### IpSourceInfo
|Name|Type|Description|
|---|---|---|
|**master**|Integer| |
|**ip**|String| |
|**ratio**|Double| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

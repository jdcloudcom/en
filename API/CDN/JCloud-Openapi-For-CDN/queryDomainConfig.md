# queryDomainConfig


## Description
Search domain configuration information

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/config

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
|**ignoreQueryString**|String|Ignore Parameter [on,off]|
|**range**|String|range Parameter [on,off]|
|**httpType**|String|httpType Parameter [on,off]|
|**httpsCertificate**|String|https Certificate|
|**httpsRsaKey**|String|rsa Secret Key|
|**httpsJumpType**|String|Redirect Type [default,http,https]|
|**videoDraft**|String|Support Video Drag or Not [on,off]|
|**groupName**|String|group|
|**shareId**|Long| |
|**shareName**|String| |
|**jcdnTimeAnti**|String| |
|**shareCache**|String| |
|**isShareOpen**|String| |
|**cacheRules**|CacheRule[]| |
### CacheRule
|Name|Type|Description|
|---|---|---|
|**weight**|Integer| |
|**ttl**|Long| |
|**contents**|String| |
|**createTime**|String| |
|**updateTime**|String| |
|**cacheType**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

# queryUserAgent


## Description
Set userAgent information

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/userAgentConfig

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
|**domain**|String| |
|**userAgentType**|String| |
|**userAgentList**|String[]| |
|**allowNoUserAgentHeader**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

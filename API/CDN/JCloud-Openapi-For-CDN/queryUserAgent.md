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
|**result**|[Result](queryuseragent#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String| |
|**userAgentType**|String|userAgent type, value: block (blacklist), allow (whitelist), block by default|
|**userAgentList**|String[]|UA List|
|**allowNoUserAgentHeader**|String|Allow null userAgent access or not, "on" by default|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
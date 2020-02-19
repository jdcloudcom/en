# queryHttpHeader


## Description
Search http header

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/httpHeader

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryhttpheader#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String| |
|**headers**|[QueryHttpHeaderResp[]](queryhttpheader#queryhttpheaderresp)| |
### <div id="queryhttpheaderresp">QueryHttpHeaderResp</div>
|Name|Type|Description|
|---|---|---|
|**headerType**|String| |
|**headerName**|String| |
|**headerValue**|String| |
|**headerOp**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
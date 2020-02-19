# queryFollowRedirect


## Description
Search back-to-origin 302 redirect information

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/followRedirect

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](queryfollowredirect#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String| |
|**followRedirect**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
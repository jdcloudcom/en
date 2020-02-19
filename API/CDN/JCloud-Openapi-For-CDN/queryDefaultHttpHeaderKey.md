# queryDefaultHttpHeaderKey


## Description
Search default http header parameter list

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/defaultHttpHeaderKey


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querydefaulthttpheaderkey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**reqDefaultHttpHeaderKey**|String[]|Default http Request Head|
|**respDefaultHttpHeaderKey**|String[]|Default http Response Head|

## Return Code
|Return Code|Description|
|---|---|
|**200**||
|**404**|NOT_FOUND|
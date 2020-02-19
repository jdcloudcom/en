# queryLiveDomainApps


## Description
Search live domain app List

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/app

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querylivedomainapps#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**apps**|String[]|app List|
|**domain**|String|Domain|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
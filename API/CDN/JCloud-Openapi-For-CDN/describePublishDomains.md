# describePublishDomains


## Description
Search all pushing streaming domains

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain:publishDomains


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**publishDomainList**|String[]|Pushing Streaming Domain List|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

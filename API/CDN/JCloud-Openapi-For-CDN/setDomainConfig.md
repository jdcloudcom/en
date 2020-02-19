# setDomainConfig


## Description
Update domain configuration

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/config

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**httpType**|String|True| |http type, can only be http or https|
|**backSourceType**|String|False| |Back-to-origin Type|
|**jumpType**|String|True| |Three Types: default, http, https|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String|Task taskId|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

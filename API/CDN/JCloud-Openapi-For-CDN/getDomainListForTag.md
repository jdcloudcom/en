# getDomainListForTag


## Description
Domain List

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain:queryForTag


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domains**|String[]|True| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String| |

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**domains**|[Domain[]](#domain)| |
|**total**|Integer| |
### <div id="Domain">Domain</div>
|Name|Type|Description|
|---|---|---|
|**domain**|String| |
|**status**|String| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

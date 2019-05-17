# queryMonitor


## Description
Search monitoring information of origin server

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/monitor

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
|**cycle**|Integer| |
|**monitorPath**|String| |
|**httpRequestHeader**|Object|Search result, the type is HashMap<String, Object>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

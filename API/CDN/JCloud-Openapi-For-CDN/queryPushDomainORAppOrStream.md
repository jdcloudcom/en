# queryPushDomainORAppOrStream


## Description
Search user pushing streaming domain app name/stream name

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/stream:fuzzyQuery

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**app**|String|False| |app Name, upload appName to search stream name list|
|**stream**|String|False| |Stream Name Fuzzy Search|
|**limit**|Long|False|50|Appoint app/stream name list size, by default50|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**streams**|String[]| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

# describeLiveApp


## Description
Search APP list under the domain

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/apps


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |The filter requirements of app list under the domain; return 10 by default when no paging parameters are passed on|
|**pageNum**|Integer|False|1|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|10|Segmentation size; it is 10 by default; value range[10, 100]|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**apps**|App[]|app List|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Number|Search Total Amount|
### App
|Name|Type|Description|
|---|---|---|
|**appName**|String|Application Name|
|**appStatus**|String|Application Status|
|**createTime**|String|Creation Time|
|**updateTime**|String|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|

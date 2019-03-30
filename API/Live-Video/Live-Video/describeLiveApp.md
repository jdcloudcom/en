# describeLiveApp


## Description
Search APP list under the domain

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/apps


## Request Parameter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**pageNum**|Integer|False|page; it is 1 by default; value range [1, 100000]|
|**pageSize**|Integer|False|Segmentation size; it is 10 by default; value range[10, 100]|
|**filters**|Filter[]|False|Filter Conditions of app List under Domain:<br>  - name:   publishDomain Live Pushing Streaming Domain<br>  - value:  If the parameter is null, search all<br>|

### Filter
|Name|Type|If Compulsory|Description|
|---|---|---|---|
|**name**|String|True|Name of Filter Requirements|
|**operator**|String|False|Operator of filter requirements is eq by default|
|**values**|String[]|True|Value of Filter Requirements|

## Examples
    {
        "pageNum": 1,
        "pageSize": 10,
        "filters": [{
           "name":"publishDomain",
           "value":"push.yourdomain.com"}]
    }

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|requestId|

### Result
|Name|Type|Description|
|---|---|---|
|**pageNumber**|Integer|Current Page Number|
|**pageSize**|Integer|Number on Each Page|
|**totalCount**|Integer|Search Total Amount|
|**apps**|App[]|app List|
### App
|Name|Type|Description|
|---|---|---|
|**appName**|String|Application Name|
|**appStatus**|String|Application status: <br > - online    Start<br > - offline   Close <br>|
|**createTime**|String|Creation Time|
|**updateTime**|String|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

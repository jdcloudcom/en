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
|**pageNum**|Integer|False|1|Page<br>-  Value Range: [1, 100000]<br>|
|**pageSize**|Integer|False|10|Paging Size<br>-  Value Range: [10, 100]<br>|
|**filters**|Filter[]|False| |Filter Conditions of app List under Domain:<br>  - name:   publishDomain Live Pushing Streaming Domain<br>  - values:  If the parameter is null, search all<br>  - If the filter condition is null, it means to search all application names under this user<br>|

### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

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
|**appStatus**|String|Application status<br>  online: Start<br>  offline: Close<br>|
|**createTime**|String|Application Creation Time<br>- UTC Time<br>  Format: yyyy-MM-dd'T'HH:mm:ss'Z'<br>|
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

## Request Example
GET
```
https://live.jdcloud-api.com/v1/apps?pageNumber=1&pageSize=10&filters.1.name=publishDomain&filters.1.values.1=push.yourdomain.com
```

## Return Example
```
{
    "requestId": "bgvmivir54gddpgi764se9f4kfr7ge41", 
    "result": {
        "apps": [
            {
                "appName": "yourapp1", 
                "appStatus": "online", 
                "createTime": "2017-11-27T06:51:25Z", 
                "publishDomain": "push.yourdomain.com", 
                "updateTime": "2017-11-27T06:51:26Z"
            }, 
            {
                "appName": "yourapp2", 
                "appStatus": "online", 
                "createTime": "2017-11-27T06:51:25Z", 
                "publishDomain": "push.yourdomain.com", 
                "updateTime": "2017-11-27T06:51:26Z"
            }
        ], 
        "pageNumber": 1, 
        "pageSize": 10, 
        "totalCount": 2
    }
}
```

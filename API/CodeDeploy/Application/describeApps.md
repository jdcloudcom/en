# describeApps


## Description
Search the information of applications in batches. This interface supports query in pages, with 20 entries per page by default.

## Request Method
GET

## Request Address
https://deploy.jdcloud-api.com/v1/regions/{regionId}/apps

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|Page number; xxx by default1|
|**pageSize**|Integer|False|20|Page size; it is 20 by default; value range[10, 100]|
|**filters**|Filter[]|False| |appId - Application ID, Exact Matching<br>appName - Application Name, Exact Matching <br>platform - Deployment Platform, Exact Matching<br>|
|**sorts**|Sort[]|False| |createTime - Creation Time, asc (Ascending), desc (Descending)<br>|

### Sort
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|False| |Name of Sorting Conditions|
|**direction**|String|False| |Direction of Sorting Conditions|
### Filter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**apps**|App[]| |
|**totalCount**|Number| |
### App
|Name|Type|Description|
|---|---|---|
|**appId**|String|Application ID|
|**appName**|String|Application Name|
|**regionId**|String|Region|
|**platform**|Integer|Deployment Platform: 1Virtual Machines,2Native Containers|
|**jdsfEnabled**|Integer|Use JD Distributed Service Framework: 0not used,1used|
|**desc**|String|Description|
|**lastDeployTime**|Integer|Last Deployment Time|
|**createTime**|Integer|Creation Time|
|**updateTime**|Integer|Update Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

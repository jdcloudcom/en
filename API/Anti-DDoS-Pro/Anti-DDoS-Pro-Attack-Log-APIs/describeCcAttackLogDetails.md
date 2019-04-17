# describeCCAttackLogDetails


## Description
Search the cc attack log details

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/attacklog:CCDetail

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size: 10 by default; value range [10, 100]|
|**startTime**|String|True| |Start time, only data within the latest 60 days can be queried, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**endTime**|String|True| |Query end time, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ|
|**instanceId**|Long|True| |Anti-DDoS Pro instance ID|
|**subDomain**|String[]|False| |Subdomain Name|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|CCAttackLogDetail[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### CCAttackLogDetail
|Name|Type|Description|
|---|---|---|
|**key**|String|Feature Key|
|**num**|Integer|Attack Counts|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

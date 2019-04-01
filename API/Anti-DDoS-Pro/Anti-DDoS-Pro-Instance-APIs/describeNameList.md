# describeNameList


## Description
Query the List of Anti-DDoS Pro Instance Names

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeNameList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|Long|False| |Anti-DDoS Pro Instance ID; if null, query all the instance names|
|**name**|String|False| |Instance Name, Fuzzy Matching Available|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging size; it is 10 by default; value range: [10, 100]|


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
|**dataList**|InstanceIdName[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### InstanceIdName
|Name|Type|Description|
|---|---|---|
|**id**|Long|Instance ID|
|**name**|String|Instance Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

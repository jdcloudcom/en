# describeNameList


## Description
Query the List of Anti-DDoS Pro Instance Names

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeNameList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**id**|String|False| |Anti-DDoS Pro Instance ID; if null, query all the instance names|
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
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
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
|**id**|String|Instance id|
|**name**|String|Instance Name|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

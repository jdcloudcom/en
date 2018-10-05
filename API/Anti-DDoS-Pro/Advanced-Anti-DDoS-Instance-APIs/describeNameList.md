# describeNameList


## Description
Query the List of Advanced Anti-DDoS Instance Names

## Request method
GET

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instance/describeNameList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Belonging Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**id**|String|False| |Advanced Anti-DDoS Instance ID; If Blank, Query All the Instance Names|
|**name**|String|False| |Instance Name, Fuzzy Matching Available|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size, 10 by Default; Value Range [0, 100]|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Current Page Counts|
|**dataList**|InstanceIdName[]| |
|**totalCount**|Integer|Total Number of Instances|
|**totalPage**|Integer|Total Number of Pages|
### InstanceIdName
|Name|Type|Description|
|---|---|---|
|**id**|String|Instance ID|
|**name**|String|Instance Name|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

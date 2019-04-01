# describeVpcIpList


## Description
Query the JD Cloud IP Resources of Users

## Request Method
GET

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/describeVpcIpList

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page Number: 1 by default|
|**pageSize**|Integer|False| |Paging Size, 10 by Default; Value Range [0, 100], 0 Means Full|


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
|**dataList**|VpcIpResource[]| |
|**currentCount**|Integer|Current Page Counts|
|**totalCount**|Integer|Total Amount|
|**totalPage**|Integer|Total Number of Pages|
### VpcIpResource
|Name|Type|Description|
|---|---|---|
|**ip**|String|In-cloud IP Address|
|**binded**|Boolean|Associate or Not|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

# getUserViewIP


## Description
Query IP segment of customized resolution ISP line of domain name

## Request Method
GET

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/userview/getUserViewIP

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Integer|True| |Primary Domain Name ID|
|**pageNumber**|Integer|True| |Paging parameter, SN of page, the default value is 1|
|**pageSize**|Integer|True| |Paging parameter, number of results in each page, the default value is 10|
|**viewId**|Integer|True| |Customized ISP Line ID|
|**viewName**|Integer|False| |Customized ISP Line Name with 64 Characters at most|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of Request in this time|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**currentCount**|Integer|Number in IP List of Current Page|
|**dataList**|String[]|IP Segment List included in Customized ISP Line|
|**totalCount**|Integer|INumber of IP Segments in P List|
|**totalPage**|Integer|ITotal Pages based on Paging Parameter in P List|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

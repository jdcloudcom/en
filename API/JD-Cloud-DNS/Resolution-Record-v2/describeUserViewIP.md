# describeUserViewIP


## Description
Search customized resolution ISP Line IP segments of primary domain

## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/UserViewIP

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**viewId**|Integer|True| |Customized ISP Line ID|
|**viewName**|String|False| |Customized ISP Line names contain 64 bytes at most, with numbers, English letters, underline, - and Chinese characters supported|
|**pageNumber**|Integer|True| |Paging parameter, SN of page, the default value is 1|
|**pageSize**|Integer|True| |Paging parameter, number of results in each page, the default value is 10|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|String[]|IP Segment List included in Customized ISP Line|
|**currentCount**|Integer|Number in IP List of Current Page|
|**totalCount**|Integer|Number of IP Segments in IP List|
|**totalPage**|Integer|Total Pages Based on Paging Parameter in IP List|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

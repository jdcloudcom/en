# describeUserView


## Description
Search customized resolution ISP Line of primary domain

## Request Method
GET

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/UserView

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**viewId**|Integer|True| |Customized ISP Line ID|
|**viewName**|String|False| |Customized ISP Line names contain 64 bytes at most, with numbers, English letters, underline, - and Chinese characters supported|
|**pageNumber**|Integer|True| |Paging parameter, SN of page|
|**pageSize**|Integer|True| |Paging parameter, number of results in each page|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|ID of Request at this time|

### Result
|Name|Type|Description|
|---|---|---|
|**dataList**|UserViewInput[]|Customized ISP Line List|
|**currentCount**|Integer|Number in Customized ISP Line List of Current Page|
|**totalCount**|Integer|Number of all Customized ISP Line Lists|
|**totalPage**|Integer|Total Pages Based on Paging Parameters of all Customized ISP Line Lists|
### UserViewInput
|Name|Type|Description|
|---|---|---|
|**viewId**|Integer|Customized ISP Line ID|
|**viewName**|String|Customized ISP Line names contain 64 bytes at most, with numbers, English letters, underline, - and Chinese characters supported|
|**domainId**|Integer|Primary Domain Name ID|
|**ipRanges**|String[]|IP segment entered by user, IPV4 supports formats of 1.1.1.1-2.2.2.2 and CIDR, and IPV6 supports the CIDR format only|
|**isDelete**|Integer|Deleted or not, 0: not deleted, 1: deleted|
|**creator**|String|Creator|
|**createTime**|Integer|Creation time, format: Unix timestamp, time unit: second|
|**updator**|String|Updater|
|**updateTime**|Integer|Update time, format: Unix timestamp, time unit: second|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

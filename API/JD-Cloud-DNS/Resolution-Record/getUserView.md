# getUserView


## Description
Query customized resolution ISP line of domain name

## Request Method
GET

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/userview/getUserView

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Integer|True| |Primary Domain Name ID|
|**pageNumber**|Integer|True| |Paging Parameter, SN of page|
|**pageSize**|Integer|True| |Paging parameter, number of results in each page|
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
|**currentCount**|Integer|Number in Customized ISP Line List of Current Page|
|**dataList**|UserViewInput[]|Customized ISP Line List|
|**totalCount**|Integer|Number of all Customized ISP Line Lists|
|**totalPage**|Integer|Total Pages Based on Paging Parameters of all Customized ISP Line Lists|
### UserViewInput
|Name|Type|Description|
|---|---|---|
|**createTime**|Integer|Creation Time, Unix timestamp format, time unit: second|
|**creator**|String|Creator|
|**domainId**|Integer|Domain Name ID|
|**ipRanges**|String[]|IP Segment Entered by User|
|**isDelete**|Integer|Deleted or not, 0: not deleted, 1: deleted|
|**updateTime**|Integer|Updated on, Unix timestamp format, time unit: second|
|**updator**|String|Updater|
|**viewId**|Integer|Customized ISP Line ID|
|**viewName**|String|Customized ISP Line Name with 64 Characters at most|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

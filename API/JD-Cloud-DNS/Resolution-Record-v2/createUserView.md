# createUserView


## Description
Add customized resolution ISP Line of primary domain

## Request Method
POST

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/UserView

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**req**|AddView|True| |Add parameters of customized ISP line|

### AddView
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Primary Domain|
|**viewName**|String|True| |Customized ISP Line names contain 64 bytes at most, with numbers, English letters, underline, - and Chinese characters supported|
|**ipRanges**|String[]|True| |IP segment of the ISP line that the user enters.  <br>IPv4 segment supports two formats, i.e., 1.2.3.4-5.6.7.8 and 1.2.3.4/16.    <br>IPv6 segment supports the CIDR format, e.g., 11:22:33:44:55::99/64<br>|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Userview|It returns the structure of customized ISP line after adding successfully|
### Userview
|Name|Type|Description|
|---|---|---|
|**viewId**|Integer|Customized ISP Line ID|
|**viewName**|String|Customized ISP Line names contain 64 bytes at most, with numbers, English letters, underline, - and Chinese characters supported|
|**domainId**|Integer|Primary Domain Name ID|
|**domainName**|String|Domain|
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

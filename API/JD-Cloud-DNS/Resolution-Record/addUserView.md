# addUserView


## Description
Add customized resolution ISP line of domain name

## Request Method
POST

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/userview/addUserView

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**req**|AddView|True| |Add parameters of customized ISP line|

### AddView
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Integer|True| |Domain Name ID|
|**domainName**|String|True| |Primary Domain Name|
|**ipRanges**|String[]|True| |IP segment of the ISP line that the user enters. <br><br> IP segment supports two formats of 1.2.3.4-5.6.7.8 and 1.2.3.4/16 <br>|
|**viewName**|String|True| |Customized ISP Line Name with 64 Characters at most|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|Userview|It returns the structure of customized ISP line after added|
### Userview
|Name|Type|Description|
|---|---|---|
|**createTime**|Integer|Creation Time, Unix timestamp format, time unit: second|
|**creator**|String|Creator|
|**domainId**|Integer|Domain Name ID|
|**domainName**|String|Domain Name|
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

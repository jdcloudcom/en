# deleteUserViewIP


## Description
Delete customized resolution ISP Line IP segments of primary domain

## Request Method
POST

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/DeleteUserViewIP

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**req**|DelViewIP|True| |Delete IP segment's parameters of customized resolution ISP line of domain name|

### DelViewIP
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**viewId**|Integer|True| |Customized ISP Line ID|
|**viewName**|String|True| |Customized ISP Line names contain 64 bytes at most, with numbers, English letters, underline, - and Chinese characters supported|
|**ipRanges**|String[]|True| |IP segment of the ISP line needs to be deleted  <br>IPv4 segment supports two formats, i.e., 1.2.3.4-5.6.7.8 and 1.2.3.4/16.    <br>IPv6 segment supports the CIDR format, e.g., 11:22:33:44:55::99/64<br>|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

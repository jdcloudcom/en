# delUserViewIP


## Description
Delete IP segment of customized resolution ISP line of domain name

## Request Method
POST

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/userview/delUserViewIP

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**req**|DelViewIP|True| |Delete IP segment's parameters of customized resolution ISP line of domain name|

### DelViewIP
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Integer|True| |Domain Name ID|
|**ipRanges**|String[]|True| |IP segment of the ISP line needs to be deleted <br><br> IP segment supports two formats of 1.2.3.4-5.6.7.8 and 1.2.3.4/16    <br>|
|**viewId**|Integer|True| |Customized ISP Line ID|
|**viewName**|String|True| |Customized ISP Line Name with 64 Characters at most|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

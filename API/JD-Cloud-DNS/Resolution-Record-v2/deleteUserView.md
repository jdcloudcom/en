# deleteUserView


## Description
Delete customized resolution ISP Line of primary domain

## Request Method
POST

## Request Address
https://domainservice.jdcloud-api.com/v2/regions/{regionId}/domain/{domainId}/DeleteUserView

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**domainId**|String|True| |Domain ID, please get it by using the describeDomains API.|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**req**|DelView|True| |Delete parameters of customized ISP line|

### DelView
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainName**|String|True| |Primary Domain|
|**viewName**|String|True| |Customized ISP Line names contain 64 bytes at most, with numbers, English letters, underline, - and Chinese characters supported|
|**viewId**|Integer|True| |Customized ISP Line ID|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|

# delUserView


## Description
Delete customized resolution ISP line of domain name

## Request Method
POST

## Request Address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/userview/delUserView

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**req**|DelView|True| |Delete parameters of customized ISP line|

### DelView
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domainId**|Integer|True| |Domain Name ID|
|**domainName**|String|True| |Primary Domain Name|
|**viewId**|String|True| |Customized ISP Line ID|
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

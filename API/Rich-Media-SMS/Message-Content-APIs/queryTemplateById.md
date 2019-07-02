# queryOneTemplate


## Description
Search APIs of one Rich Media SMS

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v1/regions/{regionId}/queryOneTemplate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**templateId**|String|False| |SMS Id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RespQueryOneTemplateResourceList[]| |
|**description**|String|SMS Description|
|**mediaLength**|String|SMS Size|
|**type**|String|SMS Type|
|**title**|String|SMS Title|
|**isTuiding**|String|Subscription cancellation is supported or not:0 means that it is not supported;1 means that it is supported|
|**message**|String|Response Message|
|**status**|String|Request Status|
### RespQueryOneTemplateResourceList
|Name|Type|Description|
|---|---|---|
|**size**|String|Byte Length of This Item|
|**name**|String|Name of This Item|
|**type**|String|Type of the item can be in the format of txt/jpg/png/gif/mp3/mp4 only|
|**url**|String|Access Link for Non-txt Type|
|**content**|String|Specific Contents for txt Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|

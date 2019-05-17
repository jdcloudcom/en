# addTemplate


## Description
Add content APIs for Rich Media SMS

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v1/regions/{regionId}/addTemplate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appId**|String|False| |Application Id|
|**signType**|String|False| |Signature type:0 Company;1 app;2 Website;3 Official Account;4 Trademark;5 Governmental agency|
|**purpose**|String|False| |Use: 0 means for use of one’s own;1 means for use by others|
|**signCardType**|String|False| |Qualification proof type: 0 means three-in-one certificate;1 means the Enterprise Business License;2 means the Organization Code Certificate;3 means the Social Credit Code Certificate|
|**aptitudes**|String|False| |Qualification proof images must contain base64 codes of jpg images and support jpg images only|
|**title**|String|False| |SMS Title|
|**description**|String|False| |Description Information|
|**isTuiding**|String|False| |Subscription cancellation is supported or not:0 means that it is not supported;1 means that it is supported|
|**content**|QueryAddTemplateContent[]|False| |Template Content|

### QueryAddTemplateContent
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**type**|String|False| |Type can be txt/jpg/png/gif/mp3/mp4 only|
|**txt**|String|False| |Please fill in specific contents here if the type is txt|
|**file**|String|False| |Please fill in file-related base64 code here if the type is non-txt|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Request Id|

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RespAddTemplateData[]| |
|**message**|String|Response Message|
|**status**|String|Request Status|
### RespAddTemplateData
|Name|Type|Description|
|---|---|---|
|**templateId**|String|SMS Id|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|

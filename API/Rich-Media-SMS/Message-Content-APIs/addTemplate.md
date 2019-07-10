# addTemplate


## Description
Add content APIs for Rich Media SMS

## Request Method
POST

## Request Address
https://rms.jdcloud-api.com/v2/regions/{regionId}/addTemplate

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True|cn-north-1|Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**appId**|String|True| |Application ID|
|**signType**|String|True| |Signature Type  0: Company  1: app  2: Website  3: Official Account  4: Trademark  5: Governmental Agency|
|**purpose**|String|True| |Use  0: For Use of One’s Own  1: For Use by Others|
|**signCardType**|String|True| |Qualification Proof Type  0: Three-in-one certificate  1: Enterprise Business License  2: Organization Code Certificate  3: Social Credit Code Certificate|
|**aptitudes**|String|True| |Qualification proof images must contain base64 codes of jpg images and support jpg images only|
|**title**|String|True| |Multi-media Content Title|
|**description**|String|True| |Multi-media Content Description|
|**unsubscribe**|String|True| |Support subscription cancellation or not  0: Not Supported  1: Supported|
|**content**|TemplateContent[]|True| |SMS Content|

### TemplateContent
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**fileType**|String|True| |Type can be txt/jpg/png/gif/mp3/mp4 only|
|**value**|String|True| |When the type is txt, it contains the text information; please fill in file-related base64 codes here if the non-txt type is adopted|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**data**|RespTemplateData|SMS ID|
|**status**|Boolean|Request Status|
|**code**|String|Error Code|
|**message**|String|Error Message|
### RespTemplateData
|Name|Type|Description|
|---|---|---|
|**templateId**|String|SMS ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|INVALID_ARGUMENT|
|**500**|INTERNAL|

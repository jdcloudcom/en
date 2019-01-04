# putBackSourceConfiguration


## Description
Add and Modify Back-to-origin Configuration

## Request Method
PUT

## Request Address
https://ossopenapi.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/backSource

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**backSourceRules**|BackSourceRule[]|False| |Back-to-origin Configuration Rules|

### BackSourceRule
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**address**|BackSourceAddress|False| | |
|**allowQueryString**|Boolean|False| |Is query String allowed or not|
|**backSourceType**|String|False| |Back-to-origin Type|
|**condition**|BackSourceRuleCondition|False| | |
|**followRedirects**|Boolean|False| |Follow Re-direction or not|
|**headerRule**|BackSourceHeaderRule|False| | |
### BackSourceAddress
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**hostName**|String|False| |Domain|
|**protocol**|String|False| |Address Protocol, such as http|
|**replaceKeyPrefixWith**|String|False| |Replace Prefix with Specified Contents|
|**replaceKeySuffixWith**|String|False| |Replace Suffix with Specified Contents|
|**replaceKeyWith**|String|False| |Replace key with Specified Contents|
### BackSourceRuleCondition
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**httpErrorCodeReturnedEquals**|Integer|False| |Enable back-to-origin when http error code is the specified one|
|**keyPrefixEquals**|String|False| |Enable back-to-origin when the prefix is the one specified|
### BackSourceHeaderRule
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**allowAllHeaders**|Boolean|False| |Is Http header allowed or not|
|**allowHeaders**|String[]|False| |List of Permitted http headers|
|**notAllowHeaders**|String[]|False| |List of Forbidden http headers|
|**setHeaders**|Object|False| |Set designated http header parameters, with type of Map\<String, String>|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|success|

# getBackSourceConfiguration


## Description
Obtain Back-to-origin Configuration

## Request Method
GET

## Request Address
https://ossopenapi.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketName}/backSource

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**bucketName**|String|True| |Bucket Name|
|**regionId**|String|True| |Region ID|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**bucketBackSourceConfiguration**|BucketBackSourceConfiguration| |
### BucketBackSourceConfiguration
|Name|Type|Description|
|---|---|---|
|**backSourceRules**|BackSourceRule[]|Back-to-origin Configuration Rules|
### BackSourceRule
|Name|Type|Description|
|---|---|---|
|**address**|BackSourceAddress| |
|**allowQueryString**|Boolean|Is query String allowed or not|
|**backSourceType**|String|Back-to-origin Type|
|**condition**|BackSourceRuleCondition| |
|**followRedirects**|Boolean|Follow Re-direction or not|
|**headerRule**|BackSourceHeaderRule| |
### BackSourceAddress
|Name|Type|Description|
|---|---|---|
|**hostName**|String|Domain|
|**protocol**|String|Address Protocol, such as http|
|**replaceKeyPrefixWith**|String|Replace Prefix with Specified Contents|
|**replaceKeySuffixWith**|String|Replace Suffix with Specified Contents|
|**replaceKeyWith**|String|Replace key with Specified Contents|
### BackSourceRuleCondition
|Name|Type|Description|
|---|---|---|
|**httpErrorCodeReturnedEquals**|Integer|Enable back-to-origin when http error code is the specified one|
|**keyPrefixEquals**|String|Enable back-to-origin when the prefix is the one specified|
### BackSourceHeaderRule
|Name|Type|Description|
|---|---|---|
|**allowAllHeaders**|Boolean|Is Http header allowed or not|
|**allowHeaders**|String[]|List of Permitted http headers|
|**notAllowHeaders**|String[]|List of Forbidden http headers|
|**setHeaders**|Object|Set designated http header parameters, with type of Map\<String, String>|

## Return Code
|Return Code|Description|
|---|---|
|**200**|success|

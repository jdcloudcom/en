# modifyCertInfo


## Description
Edit web service rule certificate information

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:modifyCertInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, Anti-DDoS Pro dose not differentiate regions, upload to cn-north-1 directly|
|**instanceId**|String|True| |Anti-DDoS Pro instance Id|
|**webRuleId**|String|True| |Web Rule Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**certInfoModifySpec**|CertInfoModifySpec|True| |Edit request parameters of web service rule certificate information|

### CertInfoModifySpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**certId**|String|False| |Certificate Id<br>  - If certId is uploaded, please confirm if corresponding certificates are uploaded<br>  - If certId is the default, certificates corresponding to httpsCertContent, httpsRsaKey will be used as the website rule|
|**httpsCertContent**|String|False| |Certificate Content|
|**httpsRsaKey**|String|False| |Private Key|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**err**|Err| |
### Err
|Name|Type|Description|
|---|---|---|
|**code**|Long|Same as http code|
|**details**|Object| |
|**message**|String| |
|**status**|String|Specific Error|
### Result
|Name|Type|Description|
|---|---|---|
|**code**|Integer|SSL certificate uploading results, 0: Certificate deletion failed, 1: Certificate deletion succeeded|
|**message**|String|The certificate Id will be provided when the uploading succeeded. If failed, please specify reasons|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

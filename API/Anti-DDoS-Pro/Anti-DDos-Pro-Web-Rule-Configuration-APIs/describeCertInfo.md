# describeCertInfo


## Description
Query the Certificate Preview Information

## Request Method
POST

## Request Address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}:describeCertInfo

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**instanceId**|Long|True| |Anti-DDoS Pro Instance Id|
|**webRuleId**|Long|True| |Web Service Rule ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**certInfoDescribeSpec**|CertInfoDescribeSpec|True| |Query the Request Parameter of Certificate Preview|

### CertInfoDescribeSpec
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|False| |Domain Name|
|**httpsCertContent**|String|False| |Certificate Content|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |
|**error**|Error| |

### Error
|Name|Type|Description|
|---|---|---|
|**code**|Integer|Request Error Status Code|
|**status**|String|Request Error Status Code|
|**message**|String|Request Error Notification|
### Result
|Name|Type|Description|
|---|---|---|
|**data**|CertInfo| |
### CertInfo
|Name|Type|Description|
|---|---|---|
|**domain**|String|General Name|
|**from**|String|Certificate Effective Time|
|**to**|String|Certificate Expiration Time|
|**user**|String|Certificate Organization|
|**sigAlgName**|String|Encryption Algorithm|
|**issuer**|String|Issued By|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|

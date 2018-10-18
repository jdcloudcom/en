# describeCertInfo


## Description
Query the Certificate Preview Information

## Request method
POST

## Request address
https://ipanti.jdcloud-api.com/v1/regions/{regionId}/instances/{instanceId}/webRule:describeCertInfo

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**instanceId**|String|True| |Instance ID|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**certInfoDescribeSpec**|CertInfoDescribeSpec|True| |Query the Request Parameter of Certificate Preview|

### CertInfoDescribeSpec
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domain**|String|False| |Domain Name|
|**httpsCertContent**|String|False| |Certificate Content|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|CertInfo| |
### CertInfo
|Name|Type|Description|
|---|---|---|
|**domain**|String|General Name|
|**from**|String|Certificate Effective Time|
|**issuer**|String|Issued By|
|**sigAlgName**|String|Encryption Algorithm|
|**to**|String|Certificate Expiration Time|
|**user**|String|Certificate Organization|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|

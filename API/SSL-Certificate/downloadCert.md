# downloadCert


## Description
Certificate Download<br>Sensitive operation, <a href="https://docs.jdcloud.com/en/security-operation-protection/operation-protection">MFA Operation Protection can be enabled</a>

## Request Method
GET

## Request Address
https://ssl.jdcloud-api.com/v1/sslCert/{certId}:download

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**certId**|String|True| |Certificate Id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested IdentifierId|

### Result
|Name|Type|Description|
|---|---|---|
|**certDesc**|DownloadCertDesc[]| |
### DownloadCertDesc
|Name|Type|Description|
|---|---|---|
|**certId**|String|CertificateId|
|**certName**|String|Certificate Name|
|**keyFile**|String|Private Key|
|**certFile**|String|Certificate|
|**digest**|String|Abstract information of private key file calculated with sha256 algorithm|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

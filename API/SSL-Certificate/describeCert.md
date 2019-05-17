# describeCert


## Description
View certificate details

## Request Method
GET

## Request Address
https://ssl.jdcloud-api.com/v1/sslCert/{certId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**certId**|String|True| |Certificate Id|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**certDescDetail**|CertDescDetail| |
### CertDescDetail
|Name|Type|Description|
|---|---|---|
|**certId**|String|CertificateId|
|**certName**|String|Certificate Name|
|**commonName**|String|Associate Domain|
|**certType**|String|Certificate Type|
|**issuer**|String|Issued by|
|**startTime**|String|Start Time|
|**endTime**|String|End Time|
|**dnsNames**|String[]|Domain|
|**digest**|String|Abstract information of private key file calculated with sha256 algorithm|
|**usedBy**|CertBindInfo[]|Certificate-associated Information|
### CertBindInfo
|Name|Type|Description|
|---|---|---|
|**bindFrom**|String|Associated Name|
|**bindId**|String|AssociateId|
|**bindRegion**|String|Associate resource Region|
|**bindZone**|String|Associate resource availability zone|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

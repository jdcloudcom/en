# getSslCertDetail


## Description
View certificate details

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/sslCert/{sslCertId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sslCertId**|String|True| |Certificate Id|

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
|**sslCertModel**|SslCertModel| |
### SslCertModel
|Name|Type|Description|
|---|---|---|
|**certId**|String|Certificate Id|
|**certName**|String|Certificate Name|
|**commonName**|String|Associate Domain|
|**certType**|String|Certificate Type|
|**startTime**|String|Start Time|
|**endTime**|String|End Time|
|**deletable**|Integer|Deletion allowed or not, 1 Allowed, 0 Not Allowed|
|**digest**|String|Abstract information of private key file calculated with sha256 algorithm|
|**aliasName**|String|Certificate Alias|
|**dnsNames**|String[]|Domain|
|**downloadable**|Integer|Download allowed or not, 0->Not allowed, 1->Allowed|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

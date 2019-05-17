# describeCerts


## Description
View certificate list

## Request Method
GET

## Request Address
https://ssl.jdcloud-api.com/v1/sslCert


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page XX, counting from 1|
|**pageSize**|Integer|False| |Count displayed per page|
|**domainName**|String|False| |Domain, with domain-based certificate retrieval supported|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|RequestId|

### Result
|Name|Type|Description|
|---|---|---|
|**certListDetails**|CertListDetail[]|Details of Certificate List|
|**totalCount**|Integer|Total number|
### CertListDetail
|Name|Type|Description|
|---|---|---|
|**certId**|String|CertificateId|
|**certName**|String|Certificate Name|
|**commonName**|String|Associate Domain|
|**certType**|String|Certificate Type|
|**startTime**|String|Start Time|
|**endTime**|String|End Time|
|**deletable**|Integer|Deletion allowed or not,1Allowed,0Not Allowed|
|**digest**|String|Abstract information of private key file calculated with sha256 algorithm|
|**aliasName**|String|Certificate Alias|
|**dnsNames**|String[]|Domain|
|**downloadable**|Integer|Download allowed or not,0->Not allowed,1->Allowed|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

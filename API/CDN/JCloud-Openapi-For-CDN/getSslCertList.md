# getSslCertList


## Description
View certificate list

## Request Method
GET

## Request Address
https://cdn.jdcloud-api.com/v1/sslCert


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False| |Page XX, counting from 1|
|**pageSize**|Integer|False| |Count displayed per page|
|**domain**|String|False| |Domain, with domain-based certificate retrieval supported|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String|Request Id|

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**certList**|[SslCertModel[]](#sslcertmodel)|Details of Certificate List|
|**totalCount**|Integer|Total Count|
### <div id="SslCertModel">SslCertModel</div>
|Name|Type|Description|
|---|---|---|
|**sslCertId**|String|Certificate Id|
|**certName**|String|Certificate Name|
|**commonName**|String|Associate Domain|
|**certType**|String|Certificate Type|
|**sslCertStartTime**|String|Start Time|
|**sslCertEndTime**|String|End Time|
|**deletable**|Integer|Deletion allowed or not, 1 Allowed, 0 Not Allowed|
|**digest**|String|Abstract information of private key file calculated with sha256 algorithm|
|**relatedDomains**|String[]|Associated Domain|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|

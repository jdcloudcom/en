# uploadCert


## Description
Upload certificate

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/sslCert:upload


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**certName**|String|True| |Certificate Name|
|**keyFile**|String|True| |Private Key|
|**certFile**|String|True| |Certificate|
|**aliasName**|String|False| |Certificate Alias|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](#result)| |
|**requestId**|String|Requested Identifier Id|

### <div id="Result">Result</div>
|Name|Type|Description|
|---|---|---|
|**certId**|String| |
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

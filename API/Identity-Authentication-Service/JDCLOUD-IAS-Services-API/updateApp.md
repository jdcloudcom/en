# updateApp


## Description
Update App

## Request Method
PUT

## Request Address
https://ias.jdcloud-api.com/v1/regions/{regionId}/app/{clientId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**clientId**|String|True| | |
|**regionId**|String|True| | |

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accessTokenValiditySeconds**|Integer|False| |accessTokenValiditySeconds|
|**clientName**|String|False| |Application Name|
|**clientUri**|String|False| |clientUri|
|**contacts**|String|False| |contacts|
|**extension**|String|False| |extension|
|**grantTypes**|String|False| |grantTypes|
|**jwks**|String|False| |jwks|
|**jwksUri**|String|False| |jwksUri|
|**logoUri**|String|False| |logoUri|
|**multiTenant**|Boolean|False| |multiTenant|
|**policyUri**|String|False| |policyUri|
|**redirectUris**|String|False| |redirectUris|
|**refreshTokenValiditySeconds**|Integer|False| |refreshTokenValiditySeconds|
|**scope**|String|False| |scope|
|**secret**|String|False| |secret|
|**tokenEndpointAuthMethod**|String|False| |tokenEndpointAuthMethod|
|**tosUri**|String|False| |tosUri|
|**userType**|String|False| |userType|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Return App after update|

### Result
|Name|Type|Description|
|---|---|---|
|**accessTokenValiditySeconds**|Integer|accessTokenValiditySeconds|
|**account**|String|account|
|**clientId**|String|Application ID|
|**clientName**|String|Application Name|
|**clientUri**|String|clientUri|
|**contacts**|String|contacts|
|**createTime**|Integer|createTime|
|**extension**|String|extension|
|**grantTypes**|String|grantTypes|
|**jwks**|String|jwks|
|**jwksUri**|String|jwksUri|
|**logoUri**|String|logoUri|
|**multiTenant**|Boolean|multiTenant|
|**policyUri**|String|policyUri|
|**redirectUris**|String|redirectUris|
|**refreshTokenValiditySeconds**|Integer|refreshTokenValiditySeconds|
|**responseTypes**|String|responseTypes|
|**scope**|String|scope|
|**secretUpdateTime**|Integer|secretUpdateTime|
|**tokenEndpointAuthMethod**|String|tokenEndpointAuthMethod|
|**tosUri**|String|tosUri|
|**updateTime**|Integer|updateTime|
|**userType**|String|userType|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

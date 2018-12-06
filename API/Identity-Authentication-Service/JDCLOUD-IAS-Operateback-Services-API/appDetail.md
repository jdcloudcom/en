# appDetail


## Description
Get application details through running the background

## Request Method
GET

## Request Address
https://ias.jdcloud-api.com/v1/regions/{regionId}/operate_backend/app/{clientId}

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**clientId**|String|True| | |
|**regionId**|String|True| | |

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**accessTokenValiditySeconds**|Integer|accessTokenValiditySeconds|
|**account**|String|account|
|**clientId**|String|Application|
|**clientName**|String|Application Name|
|**clientUri**|String|clientUri|
|**contacts**|String|contacts|
|**createTime**|Long|createTime|
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
|**secretUpdateTime**|Long|secretUpdateTime|
|**state**|String|state|
|**tokenEndpointAuthMethod**|String|tokenEndpointAuthMethod|
|**tosUri**|String|tosUri|
|**updateTime**|Long|updateTime|
|**userType**|String|userType|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|

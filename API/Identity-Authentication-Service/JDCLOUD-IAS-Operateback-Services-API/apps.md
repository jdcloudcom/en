# apps


## Description
Search app through running the background

## Request Method
GET

## Request Address
https://ias.jdcloud-api.com/v1/regions/{regionId}/operate_backend/apps

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| | |

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accountType**|String|True| |accountType|
|**appName**|String|True| |appName|
|**clientId**|String|True| |clientId|
|**endTime**|Long|True| |endTime|
|**multiTenant**|Boolean|True| |multiTenant|
|**offset**|Integer|True| |offset|
|**pageIndex**|Integer|True| |pageIndex|
|**pageSize**|Integer|True| |pageSize|
|**pin**|String|True| |pin|
|**scope**|String|True| |scope|
|**startTime**|Long|True| |startTime|
|**state**|String|True| |state|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**pagination**|Pagination| |
|**result**|AppQueryResultItem[]| |
### Pagination
|Name|Type|Description|
|---|---|---|
|**currPageNo**|Integer|currPageNo|
|**numberPages**|Integer|numberPages|
|**numberRecords**|Integer|numberRecords|
|**pageSize**|Integer|pageSize|
|**startIndex**|Integer|startIndex|
### AppQueryResultItem
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
